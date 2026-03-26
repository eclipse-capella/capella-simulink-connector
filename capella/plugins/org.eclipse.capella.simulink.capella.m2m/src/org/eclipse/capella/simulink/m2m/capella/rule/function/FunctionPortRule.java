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
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionTransformationHelper;
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionTransformationHelper.PortNamingStrategy;
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionalExchangeHelper;

public class FunctionPortRule extends AbstractCapellaToPivotRule<FunctionPort>{

	@Override
	public boolean isApplicableOn(FunctionPort element) {
		return element instanceof FunctionPort;
	}
	
	@Override
	public List<IPremise> getPremises(FunctionPort element) {
		List<IPremise> result = new ArrayList<>();
		EObject parent = element.eContainer();
		result.add(createContainmentPremise(parent));
		parent = parent.eContainer();
		while (parent instanceof AbstractFunction) {
			result.add(createContainmentPremise(parent));
			parent = parent.eContainer();
		}
		if (element instanceof FunctionInputPort) {
			FunctionInputPort input = (FunctionInputPort)element;
			addPremises(result, input.getIncomingFunctionalExchanges());
		}
		else if (element instanceof FunctionOutputPort ) {
			FunctionOutputPort output = (FunctionOutputPort)element;
			addPremises(result, output.getOutgoingFunctionalExchanges());
		}

		return result;
	}

	private void addPremises(List<IPremise> result, EList<FunctionalExchange> fes) {
		fes.stream().forEach(fe -> {
			fe.getExchangedItems().forEach(ei -> result.add(createPrecedencePremise(ei, "ei")));
		});
	}

	private Port createPort(FunctionPort element, FunctionalExchange fe, PortKind kind, FunctionPort otherPort, IContext context) {
		// 1. Transform the Port
		Object parentTarget = ContextHelper.getMainTarget(context, element.eContainer());
		if (!(parentTarget instanceof PortHolder)) {
			throw new RuntimeException("Port Transformation Exception: Invalid target for: "+element.eContainer());
		}
		PortHolder portHolder = (PortHolder) parentTarget;
		Port mlPort = MLCoreFactory.eINSTANCE.createPort();
		mlPort.setKind(kind);
		mlPort.setOriginatorId(element.getId());
		if (fe != null) {
			Datatype datatype = getType(fe, context);
			mlPort.setDatatype( datatype);
		}
		mlPort.setName(PortNamingStrategy.getCurrent(context).computePortName(portHolder, element)); 
		portHolder.getPorts().add(mlPort);
		mlPort.setIndex(FunctionTransformationHelper.getPortIndex(mlPort));
		ContextHelper.createMainTarget(context,  FunctionalExchangeHelper.getKey(fe, element), mlPort);

		// 2. Propagate the Port
		if (otherPort == null || !getSelection(context).contains(otherPort) || ( fe != null && FunctionalExchangeHelper.getTargetDiagram(context, fe) == null))
			FunctionTransformationHelper.propagatePortToParent(mlPort, element.eContainer(), context, getSelection(context));
		return mlPort;
	}

	@Override
	protected Object doCreate(FunctionPort element, IContext context) throws Exception {
		List<Port> results = new ArrayList<>();
		PortKind kind = null;
		if (element instanceof FunctionInputPort) {
			FunctionInputPort input = (FunctionInputPort)element;
			kind = PortKind.INPORT;
			input.getIncomingFunctionalExchanges().forEach(fe -> {
				results.add(createPort(element, fe, PortKind.INPORT, fe.getSourceFunctionOutputPort(), context));
			});
		}
		else if (element instanceof FunctionOutputPort ) {
			FunctionOutputPort output = (FunctionOutputPort)element;
			kind = PortKind.OUTPORT;
			output.getOutgoingFunctionalExchanges().forEach(fe -> {
				results.add(createPort(element, fe, PortKind.OUTPORT, fe.getTargetFunctionInputPort(), context));
			});
		}
		if (results.isEmpty()) {
			//the port is not connected and has not been transformed
			results.add(createPort(element, null, kind, null, context));
		}

		return results;
	}

	private Datatype getType(FunctionalExchange fe, IContext context) {
		Datatype type = (Datatype)ContextHelper.getMainTarget(context, getFEType(fe));
		 if (type == null) {
			 type = FunctionalExchangeHelper.createType(fe, context);
			 ContextHelper.createMainTarget(context, getFEType(fe), type);
		 }
		 return type;
	}

	private String getFEType(FunctionalExchange fe) {
		return "type:"+fe.getId();
	}
	

}
