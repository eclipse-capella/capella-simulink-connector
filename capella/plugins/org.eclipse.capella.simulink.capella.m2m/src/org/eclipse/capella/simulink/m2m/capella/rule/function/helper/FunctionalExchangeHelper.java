/*******************************************************************************
 * Copyright (c) 2020, 2026 THALES GLOBAL SERVICES.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EcoreUtil2;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlinfra.ElementReference;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DataNameHelper;

/**
 * @author 
 *
 */
public class FunctionalExchangeHelper {

	public static SLDiagram getTargetDiagram(IContext context, FunctionalExchange fe) {
		FunctionOutputPort sfop = fe.getSourceFunctionOutputPort();
		FunctionInputPort sfip = fe.getTargetFunctionInputPort();
		EObject commonAncestor = EcoreUtil2.getCommonAncestor(sfip, sfop);
		SLDiagram diagram = (SLDiagram)ContextHelper.getMainTarget(context, commonAncestor);
		while (diagram == null && commonAncestor != null) {
			commonAncestor = commonAncestor.eContainer();
			Object mainTarget = ContextHelper.getMainTarget(context, commonAncestor);
			if (mainTarget instanceof SLDiagram)
				diagram = (SLDiagram)mainTarget;
		}
		return diagram;
	}
 
	public static Line createLine(FunctionalExchange fe, SLDiagram system, IContext context) {
		FunctionOutputPort sfop = fe.getSourceFunctionOutputPort();
		FunctionInputPort sfip = fe.getTargetFunctionInputPort();
		EObject commonAncestor = EcoreUtil2.getCommonAncestor(sfip, sfop);
		Line mlLine = MLCoreFactory.eINSTANCE.createLine();
		mlLine.setOriginatorId(fe.getId());
		mlLine.setName(fe.getName());
		Port oPort = getPort(system, commonAncestor, fe, sfop, context);
		mlLine.setSource(oPort);
		Port iPort = getPort(system, commonAncestor, fe, sfip, context);
		mlLine.setTarget(iPort);
		return mlLine;
	}
	
	public static Datatype createType(FunctionalExchange fe, IContext context) {
		Bus bus = MLCoreFactory.eINSTANCE.createBus();
		bus.setName(DataNameHelper.getName(fe));
		bus.setOriginatorId(fe.getId());
		addToDictionary(fe, context, bus);
		fe.getExchangedItems().forEach(ei -> {
			Bus subbus = (Bus)ContextHelper.getMainTarget(context, ei);
			BusElement elt = MLCoreFactory.eINSTANCE.createBusElement();
			elt.setName(ei.getName());
			elt.setOriginatorId(ei.getId());
			elt.setDatatype(subbus);
			bus.getBusElements().add(elt);
		});
		return bus;
	}
	
	private static void addToDictionary(FunctionalExchange element, IContext context, Bus bus) {
		BlockArchitecture blockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(element);
		Dictionary layerDict = (Dictionary)ContextHelper.getMainTarget(context, blockArchitecture);
		layerDict.getDatatypes().add(bus);
	}


	private static Port getPort(SLDiagram diagram, EObject commonAncestor,FunctionalExchange fe, FunctionPort port, IContext context) {
		Port mlPort = (Port) ContextHelper.getMainTarget(context, getKey(fe, port));
		FunctionTransformationHelper.propagatePortToParent(mlPort, port.eContainer(), context, computeContainment(port, commonAncestor));
		Port referencingPort = getReferencingPort(mlPort, diagram, context);
		return referencingPort;
	}
	
	public static Object getKey(FunctionalExchange fe, FunctionPort port) {
		return "Port:"+(fe == null ? "no":fe.getId())+":"+port.getId();
	}
	
	private static Collection<Object> computeContainment(FunctionPort port, EObject target) {
		List<Object> result = new ArrayList<>();
		EObject parent = port.eContainer().eContainer();
		while (!parent.equals(target)) {
			if (parent instanceof AbstractFunction)
				result.add(parent);
			parent = parent.eContainer();
		}
		return result;
	}

	protected static Port getReferencingPort(Port port, SLDiagram system, IContext context) {
		for (Block blk : system.getBlocks()) {
			if (blk instanceof SystemReference) {
				SystemReference sysRef = (SystemReference)blk;
				Port referencedPort = sysRef.getReferencedPort(port);
				if (referencedPort != null)
					return referencedPort;
			} else if (blk instanceof PortHolder) {
				PortHolder holder = (PortHolder)blk;
				for (Port p : holder.getPorts()) {
					
					if (areConnected(port, p))
						return p;
				}
			}
		}
		return null;
//		throw new RuntimeException("Cannot found propagated Port of " + port.getName());
	}
	private static boolean areConnected(Port base, Port candidate) {
		ElementReference ref = candidate.getReference();
		if (base.equals(candidate) || (ref != null && base.equals(ref.getElement())))
			return true;
		if (ref != null)
			return areConnected(base, (Port) ref.getElement());
		return false;
	}


}
