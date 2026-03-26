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

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.ChangeEvent;
import org.polarsys.capella.core.data.capellacommon.InitialPseudoState;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.data.capellacommon.TimeEvent;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.linkedtext.ui.CapellaEmbeddedLinkedTextEditorInput;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.NameHelper;
import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.AState;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.Data;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Message;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.Scope;
import org.eclipse.capella.simulink.core.model.mlcore.Symbol;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.Transition;

/**
 * @author 
 */
public class StateTransitionRule extends AbstractCapellaSMToPivot<StateTransition> {

	@Override
	public boolean isApplicableOn(StateTransition element) {
		return true;
	}

	@Override
	public List<IPremise> getPremises(StateTransition element) {
		List<IPremise> premises = super.getPremises(element);
		premises.add(createPrecedencePremise(element.getSource(), "transition.source"));
		premises.add(createPrecedencePremise(element.getTarget(), "transition.target"));
		element.getTriggers().forEach(evt -> {
			premises.add(createPrecedencePremise(evt, "transition.trigger"));
		});
		return premises;
	}

	@Override
	protected Object create(StateTransition element, IContext context) throws Exception {
		StateMachine machine = getStateMachine(element, context);
		Chart chart = getChart(element, context);
		if (chart != null) {
			Transition pElement = MLCoreFactory.eINSTANCE.createTransition();
			chart.getTransitions().add(pElement);
			pElement.setOriginatorId(element.getId());
			String triggerDescription = element.getTriggerDescription();
			pElement.setComment(triggerDescription != null ? triggerDescription : "");
			pElement.setName(element.getName());
			createPortsAtUpperLevel(element, context, machine, chart);
			// Create the transition condition by using the created symbols created earlier
			String triggers = getTransitionTrigger(machine, element, context);
			pElement.setEvent(triggers);
			String condition = getTransitionCondition(machine, element, context);
			pElement.setCondition(condition);
			pElement.setSource((AState) ContextHelper.getMainTarget(context, element.getSource()));
			pElement.setDestination((AState) ContextHelper.getMainTarget(context, element.getTarget()));
			AbstractState source = element.getSource();
			addGraphicalParameters(pElement, element, context, !(source instanceof InitialPseudoState));
			return pElement;
		}
		return null;
	}

	private void createPortsAtUpperLevel(StateTransition element, IContext context, StateMachine machine, Chart chart) {

		Predicate<? super AbstractEvent> predicate = TimeEvent.class::isInstance;
		predicate = predicate.or(ChangeEvent.class::isInstance);
		element.getTriggers().stream().filter(predicate.negate()).forEach((aEvent) -> {
			Object object = ContextHelper.getMainTarget(context, getID(machine, aEvent));
			if (object != null)
				return; // the event has already been transited
			Symbol symbol = SymbolFactory.createEvent(aEvent);
			createPortsAndLine(context, machine, chart, aEvent, symbol);
		});
//		Constraint guard = element.getGuard();
//		if (guard != null ) {
//			Object object = ContextHelper.getMainTarget(context, getID(machine, guard));
//			if (object != null )
//				return; // the event has already been transited
//			Symbol symbol = SymbolFactory.createData(guard);
//			createPortsAndLine(context, machine, chart, guard, symbol);
//		}
	}

	private void createPortsAndLine(IContext context, StateMachine machine, Chart chart, AbstractNamedElement aEvent,
			Symbol symbol) {
		System system = (System) chart.eContainer();
		Datatype type = (Datatype) ContextHelper.getMainTarget(context, aEvent);
		chart.getSymbols().add(symbol);
		ContextHelper.createMainTarget(context, getID(machine, aEvent), symbol);
		Port targetPort = MLCoreFactory.eINSTANCE.createPort();
		targetPort.setOriginatorId(aEvent.getId());
		targetPort.setKind(PortKind.INPORT);
		targetPort.setDatatype(type);
		targetPort.setIndex(computePortIndex(chart, targetPort));
		String portName = aEvent.getName();
		targetPort.setName(portName);
		chart.getPorts().add(targetPort);
		symbol.setUnderlyingPort(targetPort);

		Port sourcePort = MLCoreFactory.eINSTANCE.createPort();
		sourcePort.setOriginatorId(aEvent.getId());
		sourcePort.setKind(PortKind.INPORT);
		sourcePort.setIndex(computePortIndex(system, sourcePort));
		sourcePort.setName(portName);
		sourcePort.setDatatype(type);
		PropertyHelper.setSimpleProperty(sourcePort, "BusOutputAsStruct", "On");
		system.getPorts().add(sourcePort);
		Line line = MLCoreFactory.eINSTANCE.createLine();
		line.setName("");
		line.setSource(sourcePort);
		line.setTarget(targetPort);
		system.getLines().add(line);
	}

	private Object getID(StateMachine machine, ModelElement aEvent) {
		String id = machine.getId() + "---" + aEvent.getId();
		return id;
	}

	/**
	 * Compute the index of the port regarding it kind.
	 * 
	 * @param holder the {@link Chart} wherein the port will be created
	 * @param port   the {@link Port}
	 * @return the index of the new port. The default value id 1.
	 */
	protected int computePortIndex(PortHolder holder, Port port) {
		if (holder != null && port != null) {
			return Math.toIntExact(
					holder.getPorts().stream().filter(iPort -> iPort.getKind().equals(port.getKind())).count()) + 1;
		}
		return 1;
	}

	private String getTransitionCondition(StateMachine machine, StateTransition element, IContext context) {
		Constraint guard = element.getGuard();
		if (guard == null)
			return "";
		return CapellaEmbeddedLinkedTextEditorInput.getDefaultText(guard, guard.getName());
//		return CapellaServices.getService().getConstraintLabel(guard);
	}

	private String getTransitionTrigger(StateMachine machine, StateTransition element, IContext context) {
		StringBuffer result = new StringBuffer();
		EList<AbstractEvent> triggers = element.getTriggers();
		triggers.forEach((aEvent) -> {
			Object object = ContextHelper.getMainTarget(context, getID(machine, aEvent));
			if (object instanceof Symbol) {
				Symbol pSymbol = (Symbol) object;
				result.append(pSymbol.getName());
			}
			if (aEvent instanceof TimeEvent) {
				TimeEvent te = (TimeEvent) aEvent;
				String trigger = te.getName();
//				if (te.getExpression() instanceof Constraint && ((Constraint)te.getExpression()).getOwnedSpecification() instanceof OpaqueExpression) {
//					trigger = ConstraintExt.getPrimaryBody((OpaqueExpression) ((Constraint)te.getExpression()).getOwnedSpecification());
//					trigger = NameHelper.normalize(trigger);
//				}
				if (te.getExpression() instanceof Constraint) {
					Constraint constraint = (Constraint) te.getExpression();
					// trigger =
					// CapellaServices.getService().getConstraintLabel((Constraint)te.getExpression());
					trigger = CapellaEmbeddedLinkedTextEditorInput.getDefaultText(constraint, constraint.getName());
				}
				result.append(te.getKind().getName().toLowerCase()).append("(").append(trigger).append(")");
			}
			if (triggers.indexOf(aEvent) < triggers.size() - 1) {
				result.append(" | ");
			}
//			} else {
//				TransformationLogger.logError(Messages.bind(Messages.Transformation_Wrong_Element_Type, object.getClass(), Data.class));
//			}
		});
		return result.toString();
	}

	protected Chart getChart(StateTransition transition, IContext context) {
		StateMachine stateMachine = getStateMachine(transition, context);
		if (stateMachine == null)
			return null;
		return (Chart) ContextHelper.getMainTarget(context, stateMachine);
	}

	protected StateMachine getStateMachine(StateTransition transition, IContext context) {
		EObject transitionParent = transition.eContainer();
		while (transitionParent != null && !(transitionParent instanceof StateMachine)) {
			transitionParent = transitionParent.eContainer();
		}

		if (transitionParent instanceof StateMachine) {
			return (StateMachine) transitionParent;
		}
		return null;
	}

}

class SymbolFactory {

	public static Symbol createData(Constraint cElement) {
		Data pData = MLCoreFactory.eINSTANCE.createData();
		pData.setScope(Scope.INPUT);
		pData.setName(NameHelper.normalize(cElement.getName()) + getShortClassName(cElement.eClass()));
		pData.setOriginatorId(cElement.getId());
		return pData;
	}

	public static Symbol createEvent(AbstractEvent cElement) {
		Message pEvent = MLCoreFactory.eINSTANCE.createMessage();
		pEvent.setScope(Scope.INPUT);
		pEvent.setName(NameHelper.normalize(cElement.getName()) + getShortClassName(cElement.eClass()));
		pEvent.setOriginatorId(cElement.getId());
		return pEvent;
	}

	private static String getShortClassName(EClass eClass) {
		StringBuffer result = new StringBuffer("_");
		String className = eClass.getName();
		for (int i = 0; i < className.length(); i++) {
			char c = className.charAt(i);
			if (Character.isUpperCase(c)) {
				result.append(c);
			}
		}
		return result.toString();
	}
}
