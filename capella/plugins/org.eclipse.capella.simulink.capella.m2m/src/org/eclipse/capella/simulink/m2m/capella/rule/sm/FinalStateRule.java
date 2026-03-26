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

import org.polarsys.capella.core.data.capellacommon.FinalState;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;

/**
 * @author 
 */
public class FinalStateRule extends AbstractStateRule<State>  {

	@Override
	public boolean isApplicableOn(State element) {
		return element instanceof FinalState;
	}

	@Override
	protected Object create(State element, IContext context) throws Exception {
		// 1. Create the Pivot Junction Element
		Junction pElement =  MLCoreFactory.eINSTANCE.createJunction();
		
		// 2. Set the properties of the created Pivot Junction Element
		FinalState cElement = (FinalState) element;
		pElement.setOriginatorId(element.getId());
		pElement.setName(cElement.getName());
		
		// 3. Add the created Pivot Junction Element in the created Pivot Parent
		addToParent(context, pElement, cElement);
		addGraphicalParameters(pElement, cElement, context);
		return pElement;
	}
}
