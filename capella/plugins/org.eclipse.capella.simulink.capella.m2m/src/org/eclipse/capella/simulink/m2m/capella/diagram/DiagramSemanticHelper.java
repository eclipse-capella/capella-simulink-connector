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
package org.eclipse.capella.simulink.m2m.capella.diagram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.InitialPseudoState;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

import org.eclipse.capella.simulink.m2m.capella.diagram.ViewGraphicalInfomation.EdgeLocationKind;

public class DiagramSemanticHelper {

	
	/**
	 * Return twins
	 * @param cElement a Capella Element
	 * @return  {@link Collection} of Capelal elements
	 */
	public static List<EObject> getTwins(EObject cElement) {
		return getTwins(cElement, null);
	}
	
	/**
	 * Return twins
	 * @param cElement a Capella Element
	 * @return  {@link Collection} of Capelal elements
	 */
	public static List<EObject> getTwins(EObject cElement, IContext context) {
		if (cElement instanceof Region) {
			return getRegionTwins(cElement, context);
		}
		return Collections.emptyList();
	}
	
	/**
	 * 
	 * @param cElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<EObject> getRegionTwins(EObject cElement, IContext context) {
		EObject parent = cElement.eContainer();
		List<EObject> result = new ArrayList<>();
		EList<Region> regions = null;
		if (parent instanceof State) {
			regions = ((State)parent).getOwnedRegions();
		} else if (parent instanceof StateMachine) {
			regions = ((StateMachine)parent).getOwnedRegions();
		}
		if (regions!= null && regions.size() > 1) {
			if (context != null) {
				Collection<Object> selection = (Collection<Object>) context.get(ITransposerWorkflow.TRANSPOSER_SELECTION);
				regions.stream().filter(region -> selection.contains(region)).forEach(region -> result.add(region));
			} else {
				regions.stream().forEach(region -> result.add(region));
			}
			return result;
		}
		return Collections.emptyList();
	}
	
	public static EdgeLocationKind exportEdgeLocation(Edge edge) {
		EObject element = edge.getElement();
		if (element instanceof DSemanticDecorator) {
			DSemanticDecorator edgeSpec = (DSemanticDecorator) element;
			EObject target = edgeSpec.getTarget();
			if (target instanceof StateTransition) {
				AbstractState source = ((StateTransition) target).getSource();
				return source instanceof InitialPseudoState ? EdgeLocationKind.Point : EdgeLocationKind.OClock;
			}
		}
		return EdgeLocationKind.Point;
	}
}
