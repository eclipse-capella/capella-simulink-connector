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
package org.eclipse.capella.simulink.m2m.capella.rule.function.helper;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.impl.ReferencedPort;
import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlinfra.ElementReference;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;

public class FunctionTransformationHelper {
	
	public static enum LeafFunctionStrategy {
		Model, SubSystem;
	}
		
	public static enum PortNamingStrategy {
		ExchangeItem, CapellaElement;
		
		public static PortNamingStrategy getCurrent(IContext context) {
			PrimitiveValue value = getOption(context, PORT_NAMING);

			return ExchangeItem.name().equals(value.getSpecification()) ? ExchangeItem: CapellaElement;
		}

		public String computePortName(PortHolder portHolder, FunctionPort port) {
			return computePortName(portHolder, computePortName(port));
		}

		public String computeLineName(String candidate) {
			return this.equals(ExchangeItem) ? candidate : null;
		}

		public String computePortName(PortHolder portHolder, String radix) {
			Set<String> names = portHolder.getPorts().stream().map(e -> e.getName()).collect(Collectors.toSet());
			String name = radix;
			int index = 1;
			while (names.contains(name))
				name = radix + "_" + index++;
			return name;
		}

		public String computePortName(FunctionPort port) {
			if (this.equals(ExchangeItem)) {
				if (port instanceof FunctionInputPort) {
					FunctionInputPort iport = (FunctionInputPort) port;
					EList<FunctionalExchange> incomingFunctionalExchanges = iport.getIncomingFunctionalExchanges();
					if (!incomingFunctionalExchanges.isEmpty())
						return incomingFunctionalExchanges.get(0).getName();
				}
				if (port instanceof FunctionOutputPort) {
					FunctionOutputPort oport = (FunctionOutputPort) port;
					EList<FunctionalExchange> outgoingFunctionalExchanges = oport.getOutgoingFunctionalExchanges();
					if (!outgoingFunctionalExchanges.isEmpty())
						return outgoingFunctionalExchanges.get(0).getName();
				}
			}
			return port.getName(); // for CapellaElement and default case
		}
	}
		
	private static final String LEAF_FUNCTION_EXPORT = "leaf.functions.export.option";
	private static final String PORT_NAMING = "port.naming.option";
	
	public static boolean exportLeafFunctionAsModel(IContext context) {
		PrimitiveValue value = getOption(context, LEAF_FUNCTION_EXPORT);
		return LeafFunctionStrategy.Model.name().equalsIgnoreCase(value.getSpecification());
	}

	public static boolean exportLeafFunctionAsSubSystem(IContext context) {
		PrimitiveValue value = getOption(context, LEAF_FUNCTION_EXPORT);
		return LeafFunctionStrategy.SubSystem.name().equalsIgnoreCase(value.getSpecification());
	}
	
	private static PrimitiveValue getOption(IContext context, String key) {
		Operation op = (Operation)context.get(IConstants.CURRENT_OPERATION);
		PrimitiveValue value = (PrimitiveValue) op.getMainConfiguration().getParameters().get(key);
		if (value == null)
			throw new IllegalStateException("Cannot get option value for '"+key+"'");
		return value;
	}
	
	
	public static void propagatePortToParent(Port mlPort, EObject capellaPortContainer,IContext context, Collection<Object> selection) {
		EObject parent = capellaPortContainer;
		Port originePort = mlPort instanceof ReferencedPort ? ((ReferencedPort)mlPort).getSourcePort() : mlPort;
		// Propagate port and create lines list
		while (parent instanceof AbstractFunction && selection.contains(parent.eContainer())) {
			AbstractFunction function = (AbstractFunction) parent.eContainer();
			Object target = ContextHelper.getMainTarget(context, function);
			if (target == null)
				return ;
			if (!(target instanceof PortHolder)) {
				throw new RuntimeException("Port Propagation Exception: Invalid target for: "+function.getName());
			}
			PortHolder portHolder = (PortHolder) target;
			if (hasAlreadyBeenPropagated(portHolder, mlPort))
				return ;
			// Port creation
			Port cPort = MLCoreFactory.eINSTANCE.createPort();//EcoreUtil.copy(originePort);
			cPort.setName(PortNamingStrategy.getCurrent(context).computePortName(portHolder, mlPort.getName()));
			cPort.setId("propagated_"+cPort.getId());
			cPort.setKind(PortKind.ENABLE.equals(originePort.getKind()) ? PortKind.INPORT : originePort.getKind());
			cPort.setDatatype(originePort.getDatatype());
			cPort.setOriginatorId(originePort.getOriginatorId());
			ElementReference ref = MLInfraFactory.eINSTANCE.createElementReference();
			ref.setElement(originePort);
			cPort.setReference(ref);
			portHolder.getPorts().add(cPort);
			// TODO: Check the port index
			cPort.setIndex(getPortIndex(cPort));
			
			
			// Line creation
			target = ContextHelper.getMainTarget(context, function);
			if (!(target instanceof SLDiagram)) {
				throw new RuntimeException("Invalid parent target");
			}
			Line line = createLine(originePort, cPort, PortNamingStrategy.getCurrent(context).computeLineName(cPort.getName()));
			line.setId("propagated_"+EcoreUtil.generateUUID());
			line.setOriginatorId(originePort.getOriginatorId());
			((SLDiagram) target).getLines().add(line);
			
			originePort = cPort;
			parent = parent.eContainer();
		}
	}
	
	private static boolean hasAlreadyBeenPropagated(PortHolder holder, Port port) {
		for (Port p : holder.getPorts()) {
			ElementReference reference = p.getReference();
			if (reference != null && port.equals(reference.getElement()))
				return true;
		}
		return false;
	}

	public static int getPortIndex(Port mlPort) {
		PortHolder portHolder = (PortHolder) mlPort.eContainer();
		return portHolder.getPorts().stream()
							 .filter(port -> port.getKind().equals(mlPort.getKind()))
							 .collect(Collectors.toList()).indexOf(mlPort) + 1;
	}

	public static Line createLine(Port originePort, Port targetPort, String name) {
		Line line = MLCoreFactory.eINSTANCE.createLine();
		line.setName(name);
		switch (originePort.getKind()) {
		case INPORT:
			line.setTarget(getConcretPort(targetPort, originePort));
			line.setSource(targetPort);
			break;
		case OUTPORT:
			line.setSource(getConcretPort(targetPort, originePort));
			line.setTarget(targetPort);
			break;
		default:
			line.setSource(targetPort);
			line.setTarget(getConcretPort(targetPort, originePort));
			break;
		}
		
		
		
		return line;
	}
	
	public static Port getConcretPort(Port cPort, Port originPort) {
		EObject cPortContainer = cPort.eContainer();
		if (cPortContainer instanceof SLDiagram) {
			SLDiagram slDiagram = (SLDiagram) cPortContainer;
			Optional<Block> sysRefOptional = slDiagram.getBlocks().stream()
								 .filter(b -> b instanceof SystemReference)
								 .filter(b -> ((SystemReference)b).getSystem() != null)
								 .filter(b -> ((SystemReference)b).getSystem().equals(originPort.eContainer()))
								 .findFirst();
			if (sysRefOptional.isPresent()) {
				SystemReference block = (SystemReference) sysRefOptional.get();
				return block.getReferencedPort(originPort);
			}
		}
		return originPort;
	}
}
