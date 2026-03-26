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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;

/**
 * @author 
 */
public class RegionRule extends AbstractCapellaSMToPivot<Region>  {

	/**
	 * Applicable only on parallel regions
	 */
	@Override
	public boolean isApplicableOn(Region element) {
		EObject parent = element.eContainer();
		if (parent instanceof State) {
			return ((State)parent).getOwnedRegions().size() > 1;
		}
		if (parent instanceof StateMachine) {
			return ((StateMachine)parent).getOwnedRegions().size() > 1;
		}
		return false;
	}

	@Override
	protected Object create(Region element, IContext context) throws Exception {
		Region cElement = (Region) element;
		org.eclipse.capella.simulink.core.model.mlcore.State pElement = MLCoreFactory.eINSTANCE.createState();
		pElement.setOriginatorId(element.getId());
		pElement.setName(cElement.getName());
		Object mParent = ContextHelper.getMainTarget(context, element.eContainer());
		if (mParent instanceof org.eclipse.capella.simulink.core.model.mlcore.State) {
			((org.eclipse.capella.simulink.core.model.mlcore.State) mParent).getSubStates().add(pElement);
		} else if (mParent instanceof Chart) {
			((Chart) mParent).getStates().add(pElement);
		}
		addGraphicalParameters(pElement, cElement, context);
		return pElement;
	}
}
