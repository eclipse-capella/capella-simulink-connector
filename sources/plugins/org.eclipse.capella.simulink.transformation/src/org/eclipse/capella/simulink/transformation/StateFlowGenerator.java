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
package org.eclipse.capella.simulink.transformation;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.AState;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.Data;
import org.eclipse.capella.simulink.core.model.mlcore.Event;
import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.core.model.mlcore.Message;
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlcore.State;
import org.eclipse.capella.simulink.core.model.mlcore.Symbol;
import org.eclipse.capella.simulink.core.model.mlcore.Transition;
import org.eclipse.capella.simulink.transformation.utils.DatatypeHelper;
import org.eclipse.capella.simulink.transformation.utils.NameHelper;
import org.eclipse.capella.simulink.transformation.utils.TraceabilityHelper;
/**
 * 
 * @author 
 *
 */
public class StateFlowGenerator extends SystemGenerator{
	
	@Override
	public String caseChart(Chart object) {
		addStatement("states = containers.Map;");
		processBlockProperties(object);
		addStatement("rt = sfroot;");
		addStatement("ch = rt.find('-isa','Stateflow.Chart','Path', '"+NameHelper.getFullName(object)+"');");
		for (Symbol symbol : object.getSymbols()) {
			doSwitch(symbol);
		}
		processBlockPorts(object);
		for (AState state : object.getStates()) {
			doSwitch(state);
		}
		for (Transition transition : object.getTransitions()) {
			doSwitch(transition);
		}
		addStatement("clear states rt ch parent transition destination junction myVar source state;");
		return "";
	}

	@Override
	public String caseState(State object) {
		State parent = object.getParent();
		if (parent == null)
			addStatement("parent = ch;");
		else
			addStatement("parent = states('" + getId(parent)+ "');");
		addStatement("state = Stateflow.State(parent);");
		addStatement("state.Position = "+PropertyHelper.getBoundsForStateFlow(object)+";");
		if (TraceabilityHelper.hasTraceabilityId(object))
			addStatement("state.Tag = '"+TraceabilityHelper.getTraceabilityId(object)+"';");
		addStatement("state.labelString = "+computeStateLabel(object)+";");
		addStatement("state.Decomposition = '"+object.getType()+"';");
		addStatement("states('"+getId(object)+"') = state;");
		for (AState state : object.getSubStates()) {
			doSwitch(state);
		}
		return "";
	}

	@Override
	public String caseJunction(Junction object) {
		addStatement("junction = Stateflow.Junction(ch);");
		addStatement("junction.type = '"+object.getType().toString()+"';");
		if (TraceabilityHelper.hasTraceabilityId(object))
			addStatement("junction.Tag = '"+TraceabilityHelper.getTraceabilityId(object)+"';");
		addStatement("junction.Position.Center = "+PropertyHelper.getCenter(object)+";");
		addStatement("junction.Position.Radius = "+PropertyHelper.getRadius(object)+";");
		addStatement("states('"+getId(object)+"') = junction;");
		return "";
	}
	
	@Override
	public String caseTransition(Transition object) {
		addStatement("transition = Stateflow.Transition(ch);");
		if (TraceabilityHelper.hasTraceabilityId(object))
			addStatement("transition.Tag = '"+TraceabilityHelper.getTraceabilityId(object)+"';");
		String location;
		// the initial state does not really exist in SF. It's managed by a transition without source (with a sourceEnd to indicate its location) 
		if (object.getSource() != null) {
			addStatement("source = states('" + getId(object.getSource())+"');");
			addStatement("transition.source = source;");
		}
		location = PropertyHelper.getSourceLocation(object);
		if (location != null) {
			if (PropertyHelper.isOClockLocation(location))
				addStatement("transition.SourceOClock = " + location + ";");
			else
				addStatement("transition.SourceEndPoint = [" + location + "];");
		}
		if (object.getDestination() == null) {
			addStatement("echo (\'Error transition "+object.getId()+" has no destination.\');");
		}
		else {
			addStatement("destination = states('" + getId(object.getDestination())+"');");
			addStatement("transition.Destination = destination;");
			location = PropertyHelper.getDestinationLocation(object);
			if (location != null) {
				if (PropertyHelper.isOClockLocation(location))
					addStatement("transition.DestinationOClock = " + location+ ";");
				else
					addStatement("transition.DestinationEndPoint = [" + location + "];");
			}
		}
		StringBuilder label = new StringBuilder();
		if (!isEmpty(object.getEvent())) {
			label.append('\'').append(object.getEvent()).append('\'');
		}
		if (!isEmpty(object.getComment())) {
			if (label.length() != 0)
				label.append(" newline");
			label.append(" \'").append("...Trigger:").append(object.getComment()).append('\'');
		}
		if (!isEmpty(object.getCondition())) {
			if (label.length() != 0)
				label.append(" newline");
			label.append(" \'").append("...Guard:[").append(object.getCondition()).append("]").append('\'');
		}
		if (label.length() != 0)
			addStatement("transition.LabelString = ["+label.toString()+"];");
		return "";
	}
	
	@Override
	public String caseMessage(Message object) {
		addStatement("myVar = Stateflow.Message(ch);");
		processSymbolProperties(object);
		addDatatype(object);
		addStatement("v = version('-release');");
		addStatement("minor = v(5);");
		addStatement("vers = str2num(v(1:4));");
		addStatement("if (vers == 2019 && minor == 'b' ) | vers >= 2020;");
		addStatement("\tmyVar.UseInternalQueue = 0;");
		addStatement("end");
		addStatement("clear v minor vers;");
		return "";
	}

	@Override
	public String caseEvent(Event object) {
		addStatement("myVar = Stateflow.Event(ch);");
		processSymbolProperties(object);
		return "";
	}

	@Override
	public String caseData(Data object) {
		addStatement("myVar = Stateflow.Data(ch);");
		processSymbolProperties(object);
		addDatatype(object);
		return "";
	}
	
	private void addDatatype(Symbol object) {
		if (object.getUnderlyingPort() != null && object.getUnderlyingPort().getDatatype() != null)
			addStatement("myVar.DataType = "+DatatypeHelper.toString(object.getUnderlyingPort().getDatatype())+";");
	}

	private void processSymbolProperties(Symbol object) {
		addStatement("myVar.Name = '"+object.getName()+"';");
		addStatement("myVar.Scope = '"+object.getScope()+"';");
		if (!NameHelper.isEmpty(object.getDescription()))
			addStatement("myVar.Description = '"+object.getDescription()+"';");
		if (object.getUnderlyingPort() != null)
			addStatement("myVar.Port = "+object.getUnderlyingPort().getIndex()+";");
		if (TraceabilityHelper.hasTraceabilityId(object)) 
			addStatement("myVar.Tag = '"+TraceabilityHelper.getTraceabilityId(object)+"';");
		addParametersWithDotNotation(object, "myVar");
	}
	
	/*
	 * see https://fr.mathworks.com/help/stateflow/ug/states.html#f18-74450
	 * TODO  events, messages and binds are not supported
	 */

	private String computeStateLabel(State state) {
		StringBuilder sb = new StringBuilder();
		sb.append("'").append(NameHelper.getName(state)).append("'");
		if (!isEmpty(state.getEntry()))
			sb.append(", 10, '").append("en: ").append(state.getEntry()).append("'");
		if (!isEmpty(state.getDuring()))
			sb.append(", 10, '").append("du: ").append(state.getDuring()).append("'");
		if (!isEmpty(state.getExit()))
			sb.append(", 10, '").append("ex: ").append(state.getExit()).append("'");
		if (isEmpty(state.getEntry()) && isEmpty(state.getDuring()) && isEmpty(state.getExit()))
			return sb.toString();
		return sb.insert(0, '[').append(']').toString();
			
	}
	
	protected String getId(NamedElement elt) {
		if (isEmpty(elt.getOriginatorId()) )
			return elt.getId();
		return elt.getOriginatorId();
					
	}
	public StateFlowGenerator(StringBuilder sb) {
		super(sb);
	}

}
