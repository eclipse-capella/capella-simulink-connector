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
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DictionaryHelper;

/**
 * @author 
 */
public class StateMachineRule extends AbstractCapellaSMToPivot<StateMachine>  {

	@Override
	public boolean isApplicableOn(StateMachine element) {
		return true;
	}

	@Override
	public List<IPremise> getPremises(StateMachine element_p) {
		return new ArrayList<>();
	}

	@Override
	protected Object create(StateMachine element, IContext context) throws Exception {
		Chart pElement = MLCoreFactory.eINSTANCE.createChart();
		pElement.setOriginatorId(element.getId());
		pElement.setName(element.getName());
		Object target = ContextHelper.getMainTarget(context, element.getId());
		if (target instanceof System) {
			System system = (System)target;
			DictionaryHelper.createDefaultDictionaries(context, element, system);
			system.getBlocks().add(pElement);
			return pElement;
		}
		throw new RuntimeException(Messages.bind(Messages.Transformation_Wrong_Element_Type, element.getName()));
	}
	
	@Override
	protected void update(Object object, StateMachine element, IContext context) throws Exception {
		if (object instanceof Chart) {
			Chart chart = (Chart) object;
			chart.setOriginatorId(element.getId());
			chart.setName(element.getName());
		}
	}

	/**
	 * Compute bound not got from diagrams for Chart element.
	 */
/*	@SuppressWarnings("unchecked")
	@Override
	protected void addGraphicalParameters(EObject pElement, EObject cElement, IContext context) {
		int x1 = 50;
		int y1 = 10;
		int width = 30;
		int height = 30;
		Collection<Object> selection = (Collection<Object>) context.get(ITransposerWorkflow.TRANSPOSER_SELECTION);
		Type cElementLayer = CapellaModelHelper.getElementLayer(cElement);
		List<Object> sMachines = selection.stream()
										  .filter(element -> element instanceof StateMachine)
										  .filter(element -> cElementLayer.equals(CapellaModelHelper.getElementLayer((EObject) element)))
										  .collect(Collectors.toList());
		int position = 0;
		for (Object sMachine : sMachines) {
			if (sMachine.equals(cElement)) {
				break;
			} else {
				position += 1;
			}
		}
		y1 = 20 + (position * 50);
		PropertyHelper.setBounds((ParameterizedElement) pElement, x1, y1, x1+width, y1+height);
	}*/
}
