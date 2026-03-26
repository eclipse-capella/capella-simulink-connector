/*******************************************************************************
 * Copyright (c) 2022-2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.capella.m2m.export.visitors;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

/**
 * @author 
 *
 */
public class StateMachineVisitor extends AVisitor{

	public StateMachineVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
        if (obj instanceof StateMachine) {
        	StateMachine machine = (StateMachine) obj;
        	Session session = SessionManager.INSTANCE.getSession(machine);
        	
        	machine.getOwnedRegions().forEach(region -> {
        		collector.add(region);
        		// we need to add the diagram so that we can  keep the diagram layout
                List<DDiagram> diagrams = DialectManager.INSTANCE.getRepresentations(region, session).stream().filter(DDiagram.class::isInstance).map(DDiagram.class::cast).collect(Collectors.toList());
                if (diagrams.isEmpty())
                    throw new IllegalStateException("Cannot find diagram for region with id " + region.getId());
                collector.add(diagrams.get(0));
        	});;
            return true;
        } 
        if (obj instanceof Region) {
        	Region region = (Region)obj;
        	collector.addAll(region.getInvolvedStates());
        	collector.addAll(region.getOwnedTransitions());
        	return true;
        }
        if (obj instanceof State) {
        	State state = (State)obj;
        	collector.addAll(state.getOwnedRegions());
        	return true;
        }
        if (obj instanceof StateTransition) {
        	StateTransition state = (StateTransition)obj;
        	collector.addAll(state.getTriggers());
            return true;
        }
		return super.visit(obj);
	}

}
