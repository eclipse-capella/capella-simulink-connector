/*******************************************************************************
 * Copyright (c) 2014, 2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.m2m.capella.activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.diagram.CoordinatesCalculator;
import org.eclipse.capella.simulink.m2m.capella.diagram.ViewGraphicalInfomation;

/**
 * @author 
 */
public class CollectGraphicalDataForTransformation extends AbstractTransformationActivity {

	/** 
	 * Default constructor
	 */
	public CollectGraphicalDataForTransformation(){
		// Nothing to do.
	}

	@SuppressWarnings("unchecked")
	@Override
	public IStatus run(ActivityParameters activityParams_p){
		//1. Get the diagrams from the selection
		Collection<DSemanticDiagram> reps = new ArrayList<>();
		Collection<Object> selection = (Collection<Object>)activityParams_p.getParameter(TRANSPOSER_SELECTION).getValue();
		selection.forEach((element) -> {
			if (element instanceof DSemanticDiagram ) {
				reps.add((DSemanticDiagram) element);
			}
			if (element instanceof DRepresentationDescriptor) {
				DRepresentation rep = ((DRepresentationDescriptor) element).getRepresentation();
				if (rep instanceof DSemanticDiagram ) {
					reps.add((DSemanticDiagram)rep);
				}
			}
		});
		//2. Initialize the data structure that will host the graphical information
		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		Object object = context.get(IConstants.TRANSFORMATION_GRAPHICAL_INFORMATIONS);
		Map<EObject, ViewGraphicalInfomation> graphicalInformations;
		if (object == null) {
			graphicalInformations = new HashMap<>();
			context.put(IConstants.TRANSFORMATION_GRAPHICAL_INFORMATIONS, graphicalInformations);
		} else {
			graphicalInformations = (Map<EObject, ViewGraphicalInfomation>) object;
		}
		
		// 3. Compute the graphical information
		if (!reps.isEmpty()) {
			reps.forEach(rep -> {
				if (! graphicalInformations.containsKey(((DSemanticDiagram)rep).getTarget())) {
					CoordinatesCalculator coordinatesCalculator = new CoordinatesCalculator((DSemanticDiagram)rep);
					ViewGraphicalInfomation diagramVGI = coordinatesCalculator.getResultMap();
					if (diagramVGI != null) {
						graphicalInformations.put(((DSemanticDiagram)rep).getTarget(), diagramVGI);
					}
				}
			});
		}
		
		return Status.OK_STATUS;
	}
}
