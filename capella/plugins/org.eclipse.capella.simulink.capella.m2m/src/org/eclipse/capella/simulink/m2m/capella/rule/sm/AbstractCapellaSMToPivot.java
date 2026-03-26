/*******************************************************************************
 * Copyright (c) 2021-2026 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.capella.simulink.m2m.capella.rule.sm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.diagram.DiagramSemanticHelper;
import org.eclipse.capella.simulink.m2m.capella.diagram.ViewGraphicalInfomation;

public abstract class AbstractCapellaSMToPivot<T extends EObject> extends AbstractTransformationRule<T> {
	
	private static final int DEFAULT_TRANSLATE_DELTA = 2;
	private static final int DEFAULT_JUNCTION_SIZE = 16;

	@Override
	public List<IPremise> getPremises(T element) {
		List<IPremise> result = new ArrayList<>();
		result.add(createContainmentPremise(element.eContainer()));
		return result;
	}

	@Override
	protected void update(Object object, EObject element, IContext context) throws Exception {
		// subclasses must implement this method if needed
	}
	
	protected EObject identifyRootParentRegion(EObject element, IContext context) {
		if (element == null) {
			return null;
		}
		if (element instanceof Region) {
			if (element.eContainer() instanceof StateMachine) {
				return element;
			} else {
				return identifyRootParentRegion(element.eContainer(), context);
			}
		} else {
			return identifyRootParentRegion(element.eContainer(), context);
		}
	}
	/**
	 * Identify if a region must be transformed to a Pivot {@link org.eclipse.capella.simulink.core.model.mlcore.State} or not.
	 * 
	 * @param region A Capella {@link Region}
	 * @param context The transformation {@link IContext}
	 * @return <code>True</code> if the Capella {@link State} contains many regions and if at least two regions are added to the context, 
	 * <code>False</code> otherwise.
	 */
	@SuppressWarnings("unchecked")
	protected boolean shouldTransformRegion(Region region, IContext context) {
		Collection<Object> selection = (Collection<Object>) context.get(ITransposerWorkflow.TRANSPOSER_SELECTION);
		EObject regionParent = region.eContainer();
		Collection<Region> regions = new ArrayList<>();
		if (regionParent instanceof StateMachine) {
			regions = ((StateMachine) regionParent).getOwnedRegions();
		} else if (regionParent instanceof State) {
			regions = ((State) regionParent).getOwnedRegions();
		}

		return regions.stream().filter(r -> selection.contains(r))
							   .filter(r -> ! r.equals(region))
							   .findFirst().isPresent();
	}
	
	protected void addGraphicalParameters(EObject pElement, EObject cElement, IContext context) {
		addGraphicalParameters(pElement, cElement, context, false);
	}
	
	@SuppressWarnings("unchecked")
	protected void addGraphicalParameters(EObject pElement, EObject cElement, IContext context, boolean edgeOClock) {
		Object object = context.get(IConstants.TRANSFORMATION_GRAPHICAL_INFORMATIONS);
		if (object != null) {
			EObject rootParentRegion = identifyRootParentRegion(cElement, context);
			if (rootParentRegion != null) {
				Map<EObject, ViewGraphicalInfomation> graphicalInformations = (Map<EObject, ViewGraphicalInfomation>) object;
				ViewGraphicalInfomation diagramVGI = graphicalInformations.get(rootParentRegion);
				Map<EObject, ViewGraphicalInfomation> children = diagramVGI.getChildren();
				Map<EObject, ViewGraphicalInfomation> map = new HashMap<>();
				map.put(rootParentRegion, diagramVGI);
				map.putAll(children);
				if (map != null && map.containsKey(cElement)) {
					ViewGraphicalInfomation vgi = map.get(cElement);
					if (pElement instanceof ParameterizedElement && vgi != null) {
						// Case of region who is the target of the diagram
						/** Overlay diagrams of // Regions:
						 * 1- The origin of the first diagram is: (10,10)
						 * 2- The origin of the other diagram is: the sum of height of all previous diagrams + number of previous diagrams * 10 px
						*/
						if (rootParentRegion.equals(cElement)) {
							int y = computeYFromTwinsSet(cElement, graphicalInformations);
							if (y != -1) {
								vgi.performOriginTranslate(0, y);
							}
						}
						
						if (cElement instanceof Region && cElement.eContainer() instanceof State
								&& DiagramSemanticHelper.getTwins(cElement, context).size() > 1) {
							vgi.performEndTranslate(0, - DEFAULT_TRANSLATE_DELTA);
						}
						
						// Case of state with many region, all added in the context
						if (cElement instanceof State) {
							State state = (State) cElement;
							if (state.getOwnedRegions().stream().filter(region -> shouldTransformRegion(region, context)).findFirst().isPresent()) {
								vgi.performOriginTranslate(-DEFAULT_TRANSLATE_DELTA, -DEFAULT_TRANSLATE_DELTA);
								vgi.performEndTranslate(DEFAULT_TRANSLATE_DELTA,  DEFAULT_TRANSLATE_DELTA);
							}
						}
						
						int x1 = vgi.getOriginPoint().x();
						int y1 = vgi.getOriginPoint().y();
						int x2 = vgi.getEndPoint().x();
						int y2 = vgi.getEndPoint().y();
						switch (vgi.getKind()) {
						case Diagram:
							PropertyHelper.setBounds((ParameterizedElement) pElement, x1, y1, x2, y2);
							break;
						case Node:
							// If the node is a Junction then width=height=16px
							//int y = computeYFromTwinsSet(rootParentRegion, graphicalInformations);
							//y1 += y;
							x2 = pElement instanceof Junction ? DEFAULT_JUNCTION_SIZE : x2;
							y2 = pElement instanceof Junction ? DEFAULT_JUNCTION_SIZE : y2;
							PropertyHelper.setBounds((ParameterizedElement) pElement, x1, y1, x2, y2);
							break;
						case Edge:
							if (edgeOClock) {
								double clock = ((PrecisionPoint)vgi.getOriginPoint()).preciseX();
								PropertyHelper.setSourceLocation((ParameterizedElement) pElement, clock);
							} else {
								PropertyHelper.setSourceLocation((ParameterizedElement) pElement, x1, y1);
							}
							double clock = ((PrecisionPoint)vgi.getEndPoint()).preciseX();
							PropertyHelper.setDestinationLocation((ParameterizedElement) pElement, clock);
							break;
						default:
							break;
						}
					}
				}
			}
		}
	}
	
	/**
	 * 
	 * @param cElement
	 * @param graphicalInformations
	 * @return
	 */
	private int computeYFromTwinsSet(EObject cElement, Map<EObject, ViewGraphicalInfomation> graphicalInformations) {
		// Update the Y of the region
		List<EObject> twins = DiagramSemanticHelper.getTwins(cElement);
		int y = -1;
		for (EObject eObject : twins) {
			if (eObject != cElement) {
				ViewGraphicalInfomation twinVGI = graphicalInformations.get(eObject);
				if (twinVGI != null) {
					y+= twinVGI.getEndPoint().y() + 11;
				}
			} else {
				// Stop when the current element is the cElement, it position is only impacted by
				// the previous twins.
				break;
			}
		}
		return y;
	}

}
