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
package org.eclipse.capella.simulink.m2m.capella.rule.function;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.Subsystem;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DictionaryHelper;
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionTransformationHelper;

public class FunctionRule extends AbstractCapellaToPivotRule<AbstractFunction>{

	@Override
	public boolean isApplicableOn(AbstractFunction element) {
		// TODO Auto-generated method stub
		return element instanceof AbstractFunction;
	}
	
	@Override
	public List<IPremise> getPremises(AbstractFunction element, IContext context) {
		List<IPremise> result = new ArrayList<>();
		if (! transformToSystem(element, context)) {
			result.add(createContainmentPremise(element.eContainer()));
		}
		if (FunctionTransformationHelper.exportLeafFunctionAsModel(context)) {
			element.getSubFunctions()
					.stream().filter(af -> af.getOwnedFunctions().isEmpty())
					.forEach( af -> result.add(createPrecedencePremise(af, "System.To.Reference")));	
		}

		return result;
	}
	
	@Override
	protected Object doCreate(AbstractFunction element, IContext context) throws Exception {
		// 1. Transform function
		Object element_c = transformeFunction(element, context);
		if (element_c == null) {
			throw new RuntimeException("Problem occured when transforming the Function "+ element.getName());
		}
		SLDiagram result = (SLDiagram) element_c;
		
		// 2. Create system references is needed
		
		if (FunctionTransformationHelper.exportLeafFunctionAsModel(context)) {
			createSystemReferences(element, context, result);
		}
		
		// 3. Handle mode and state references
		if (generateEnableBlock(element, context)) {
			// Create the Enable block
			/*Block block = transformAvailabeInModeAndState(element, context);
			  result.getBlocks().add(block);*/

			// Enable port creation
			Port enablePort = MLCoreFactory.eINSTANCE.createPort();
			enablePort.setId("enable_"+element.getId());
			enablePort.setName("EN_"+element.getName());
			enablePort.setKind(PortKind.ENABLE);
			enablePort.setDescription(computeEnableBlockDescription(element));
			result.getPorts().add(enablePort);
			if (FunctionTransformationHelper.exportLeafFunctionAsSubSystem(context) && getSelection(context).contains(element.eContainer())) {
				FunctionTransformationHelper.propagatePortToParent(enablePort, element, context, getSelection(context));
			}
			// add parameters to the port AFTER the port is propagated
			PrimitiveValue formatParameter = MLInfraFactory.eINSTANCE.createPrimitiveValue();
			formatParameter.setSpecification("Available in Modes & States: %<Description>");
			enablePort.getParameters().put("AttributesFormatString", formatParameter);
			PrimitiveValue showParameter = MLInfraFactory.eINSTANCE.createPrimitiveValue();
			showParameter.setSpecification("off");
			enablePort.getParameters().put("ShowName", showParameter);
		}
		return result;
	}
	
	private boolean generateEnableBlock(AbstractFunction element, IContext context) {
		if (element != null) {
			return (!element.getAvailableInStates().isEmpty()) && 
				   (element.getOwnedFunctions().isEmpty() || ! getSelection(context).contains(element.eContainer()));
		}
		return false;
	}
	
	/**
	 * Compute the name of the enable block. It contains the names of the referenced modes and states
	 * @param availableInStates
	 * @return
	 */
	private String computeEnableBlockDescription(AbstractFunction element) {
		EList<State> availableInStates = element.getAvailableInStates();
		String blockDescription = availableInStates.get(0).getName();
		if (availableInStates.size() > 1) {
			for (int i = 1; i < availableInStates.size(); i++) {
				blockDescription += ", " + availableInStates.get(i).getName();
			}
		}
		return blockDescription;
	}

	private void createSystemReferences(AbstractFunction element, IContext context, final SLDiagram slDiagram) {
		element.getSubFunctions().stream()
		 						   .filter(af -> af.getOwnedFunctions().isEmpty())
		 						   .filter(af -> ContextHelper.getMainTarget(context, af) != null)
								   .forEach( af -> {
										SystemReference sysReference = MLCoreFactory.eINSTANCE.createSystemReference();
										Object mainTarget = ContextHelper.getMainTarget(context, af);
										sysReference.setSystem((System) mainTarget);
										sysReference.setSource("CapellaElements/ModelRef/Model_Function");
										sysReference.setName("Reference to " + sysReference.getSystem().getName());
										slDiagram.getBlocks().add(sysReference);
										sysReference.getReferencedPorts().stream()
													.filter(port -> PortKind.ENABLE.equals(port.getKind()))
													.forEach(port -> {
														FunctionTransformationHelper.propagatePortToParent(port, af, context, getSelection(context));
													});
									});
	}
	
	/**
	 * 
	 * @param element
	 * @param context
	 * @return
	 */
	protected SLDiagram transformeFunction(AbstractFunction element, IContext context) {
		SLDiagram result = null;
		if (transformToSystem(element, context)) {
			Object parent = context.get(IConstants.PIVOT_ROOT_CONTAINER);
			if (parent == null) {
				throw new RuntimeException("Target parent for Function "+ element.getName()+" can not be found");
			}
			Project project = (Project) parent;
			result = MLCoreFactory.eINSTANCE.createSystem();
			Type layer = CapellaModelHelper.getElementLayer(element);
			if (layer != null) {
				PropertyHelper.setLayer(result, layer.name());
			}
			System systemFunction = (System) result;
			project.getSystems().add(systemFunction);
		} else {
			Object parent = ContextHelper.getMainTarget(context, element.eContainer());
			if (parent == null) {
				throw new RuntimeException("Target parent for Function "+ element.getName()+" can not be found");
			}
			if (parent instanceof SLDiagram) {
				SLDiagram slDiagram = (SLDiagram) parent;
				result = MLCoreFactory.eINSTANCE.createSubsystem();
				((Subsystem)result).setSource("CapellaElements/Subsystem/Function");
				slDiagram.getBlocks().add((Subsystem) result);
			}
		}
		if (result != null) {
			result.setOriginatorId(element.getId());
			result.setName(element.getName());
			ContextHelper.createMainTarget(context, element, result);	
			if (result instanceof System)
				DictionaryHelper.createDefaultDictionaries(context, element, (System) result);
		}

		return result;
	}
	
	protected boolean transformToSystem(AbstractFunction element, IContext context) {
		if (context != null && !getSelection(context).contains(element.eContainer()) )
			return true;
		return FunctionTransformationHelper.exportLeafFunctionAsModel(context) && element.getOwnedFunctions().isEmpty();
	}

}
