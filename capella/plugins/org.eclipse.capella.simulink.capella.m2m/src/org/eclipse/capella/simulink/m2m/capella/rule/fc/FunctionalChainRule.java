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
package org.eclipse.capella.simulink.m2m.capella.rule.fc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.polarsys.capella.common.data.activity.Pin;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.core.model.helpers.FunctionalChainExt;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DictionaryHelper;
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionalExchangeHelper;

public class FunctionalChainRule extends AbstractCapellaToPivotRule<FunctionalChain> {

	@Override
	public boolean isApplicableOn(FunctionalChain element) {
		return element instanceof FunctionalChain;
	}
	
	@Override
	public List<IPremise> getPremises(FunctionalChain element, IContext context) {
		List<IPremise> result = super.getPremises(element, context);
		FunctionalChainExt.getFlatFunctions(element).forEach(fct -> {
			
			result.add(createPrecedencePremise(fct, "fcts"));
			Consumer<? super Pin> consumer = pin -> result.add(createPrecedencePremise(pin, "Function.To.Port"));
			fct.getOutputs().forEach(consumer);
			fct.getInputs().forEach(consumer);
		});
		return result;
	}

	@Override
	protected Object doCreate(FunctionalChain element, IContext context) throws Exception {
		Object parent = context.get(IConstants.PIVOT_ROOT_CONTAINER);
		if (parent == null) {
			throw new RuntimeException("Target parent for Function "+ element.getName()+" can not be found");
		}
		Project project = (Project) parent;
		
		// 1. Transform the FunctionalChain
		System system = transformFunctionalChain(element, context);
		ContextHelper.createMainTarget(context, element, system);
		project.getSystems().add(system);
		
		// 2. Transform its Functions. Performed by another rule.
		
		// 3. Transform Ports and add them to the their owning systems. Performed by another rule.
		
		// 4. Create system references
		Collection<SystemReference> systemReferences = createSystemReferences(getAllSystemOfFunctions(element, context));
		system.getBlocks().addAll(systemReferences);
		
		// 5. Transform FunctionalExchanges
		Collection<Line> lines = transformFunctionalExchanges(element, system, context);
		system.getLines().addAll(lines);
		
		return system;
	}
	
	protected System transformFunctionalChain(FunctionalChain element, IContext context) {
		return createSystemFor(element, context);
	}
	
	protected Collection<System> getAllSystemOfFunctions(FunctionalChain element, IContext context){
		Collection<System> result = new ArrayList<>();
		FunctionalChainExt.getFlatFunctions(element)
						.stream()
						.filter (fct -> getSelection(context).contains(fct))
						.forEach(fct -> result.add((System) ContextHelper.getMainTarget(context, fct)));
		return result;
	}
	
	protected Collection<SystemReference> createSystemReferences(Collection<System> systemsToReference){
		Collection<SystemReference> result = new ArrayList<>();
		systemsToReference.forEach(system -> {
			SystemReference sysReference = MLCoreFactory.eINSTANCE.createSystemReference();
			sysReference.setSystem(system);
			sysReference.setSource("CapellaElements/ModelRef/Model_Function");
			sysReference.setName("Reference to " + sysReference.getSystem().getName());
			result.add(sysReference);
		});
		return result;
	}
	
	protected Collection<Line> transformFunctionalExchanges(FunctionalChain element, System system, IContext context){
		Collection<Line> result = new ArrayList<>();
		List<Object> selection = getSelection(context);
		// this function returns an unsorted set :(
		FunctionalChainExt.getFlatFunctionalExchanges(element)
						.stream()
						.filter (fe -> selection.contains(fe) && selection.contains(fe.getSource()) && selection.contains(fe.getTarget()))
						.sorted((a,b) -> selection.indexOf(a) - selection.indexOf(b))
						.forEach(fe -> {
							Line line = FunctionalExchangeHelper.createLine(fe, system, context);
							result.add(line);
						});
		return result;
	}
	
	
	protected System createSystemFor(NamedElement element, IContext context) {
		System system = MLCoreFactory.eINSTANCE.createSystem();
		system.setOriginatorId(element.getId());
		system.setName(element.getName());
		Type layer = CapellaModelHelper.getElementLayer(element);
		if (layer != null) {
			PropertyHelper.setLayer(system, layer.name());
		}
		ContextHelper.createMainTarget(context, element, system);
		DictionaryHelper.createDefaultDictionaries(context, element, system);
		return system;
	}
}
