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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.AState;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.m2m.capella.common.TransformationLogger;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;

/**
 * @author 
 * @param <T>
 */
public abstract class AbstractStateRule<T extends AbstractState> extends AbstractCapellaSMToPivot<T> {

	@Override
	public List<IPremise> getPremises(AbstractState element) {
		EObject stateParent = identifyCapellaStateParent(element);
		if (stateParent != null) {
			List<IPremise> result = new ArrayList<>();
			result.add(createContainmentPremise(stateParent));
			return result;
		}
		return new ArrayList<>();
	}
	
	/**
	 * This add an {@link AState} element to it parent. {@link AState}  is the super type of 
	 * {@link org.eclipse.capella.simulink.core.model.mlcore.State} and {@link Junction}. 
	 * @param context
	 * @param pElement
	 * @param cElement
	 */
	protected void addToParent(IContext context, AState pElement, AbstractState cElement) {
		Object pParent = identifyPivotStateParent(cElement, context);
		if (pParent instanceof Chart) {
			((Chart) pParent).getStates().add(pElement);
		} else if (pParent instanceof org.eclipse.capella.simulink.core.model.mlcore.State) {
			((org.eclipse.capella.simulink.core.model.mlcore.State) pParent).getSubStates().add(pElement);
		} else {
			String msg = Messages.bind(Messages.Transformation_No_Parent_Found_In_Target_Model, pElement.getName());
			TransformationLogger.logError(msg);
		}
	}
	
	/**
	 * 
	 * @param state the Capella {@link State} to transform.
	 * @param context the transformation {@link IContext}
	 * @return <code>null</code> or a Pivot element. It is either a {@link Chart} or a {@link org.eclipse.capella.simulink.core.model.mlcore.State} 
	 */
	protected Object identifyPivotStateParent(AbstractState state, IContext context) {
		EObject cParent = identifyCapellaStateParent(state);
		if (cParent != null ) {
			//get its transformed container 
			return ContextHelper.getMainTarget(context, cParent);
		} else {
			String msg = Messages.bind(Messages.Transformation_No_Parent_Found_In_Source_Model, state.getName());
			TransformationLogger.logError(msg);
			return null;
		}
	}
	
	/**
	 * Identify the right parent state to use. The 3 cases are listed in the returns section
	 * @param state a {@link State} element under transformation
	 * @return 
	 * Either <code>null</code> or: 
	 * <ul>
	 * <li> {@link StateMachine} element containing the state </li>
	 * <li> {@link State} element containing the State in it default region</li>
	 * <li> {@link Region} element containing the state if there are more than one region in the parent {@link State} of that {@link Region} </li>
	 * </ul>
	 */
	protected EObject identifyCapellaStateParent(AbstractState state) {
		EObject currentStateParent = state.eContainer().eContainer();
		if (currentStateParent instanceof StateMachine) {
			// Case of a state in a StateMachine
			StateMachine stateParent = (StateMachine) currentStateParent;
			return stateParent.getOwnedRegions().size() > 1 ? /*parent=Region*/ state.eContainer() : /*parent=StateMachine*/ currentStateParent;
		} else if (currentStateParent instanceof State) {
			// Case of a state in a State
			State stateParent = (State) currentStateParent;
			return stateParent.getOwnedRegions().size() > 1 ? /*parent=Region*/ state.eContainer() : /*parent=State*/ currentStateParent;
		}
		return null;
	}

}
