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

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.Subsystem;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.transformation.utils.DatatypeHelper;
import org.eclipse.capella.simulink.transformation.utils.TraceabilityHelper;
import org.eclipse.capella.simulink.transformation.utils.NameHelper;
/**
 * 
 * @author 
 *
 */
public class SystemGenerator extends AbstractGenerator{


	@Override
	public String caseSystem(System object) {
		String name = NameHelper.getName(object);
		addStatement("new_system('"+name+"');");
		
		addModelerId(object, name);
		addDescription(object);
		processDictionaryOnSystem(object);
		processBlockPorts(object);
		processSLDiagramElements(object);
//		addParametersWithFullname(object, name);
		addLayout(object, name);
		
		//TODO compilation is disabled since an error is raised if models contain only virtual blocks.
		// compile model to check static error
//		addStatement(name+"([],[],[],'compile');");
		// terminate the simulation process (and do not block UI anymore...)
//		addStatement(name+"([],[],[],'term');");
		return "";
	}


	private void addLayout(SLDiagram diagram, String name) {
		if (!PropertyHelper.hasBoundsInChilds(diagram)) {
			Set<Port> usedPorts = new HashSet<>();
			diagram.getLines().stream().forEach(line -> {
				usedPorts.add(line.getSource()); 
				usedPorts.add(line.getTarget());
				});
			diagram.getPorts().stream().filter(x -> !usedPorts.contains(x)).forEach(p -> addPortDecoration(diagram, p));
			addStatement("try");
			addStatement("\tSimulink.BlockDiagram.arrangeSystem('"+name+"');");
			addStatement("catch");
			addStatement("end");
		}
	}


	private void addPortDecoration(SLDiagram diagram, Port port) {
		String diagramName = NameHelper.getFullName(diagram);
		String portName = NameHelper.getFullName(port);
		if (port.getKind() == PortKind.INPORT) { 
			addStatement("t_Block = add_block('simulink/Sinks/Terminator', '"+diagramName+"/Terminator', 'MakeNameUnique', 'on' );");
			addStatement("t_handles = get_param(t_Block, 'PortHandles');");
			addStatement("p_Block = get_param('"+portName+"', 'handle');");
			addStatement("p_handles = get_param(p_Block, 'PortHandles');");
			addStatement("terminator = t_handles.Inport(1);");
			addStatement("port = p_handles.Outport(1);");
			addStatement("add_line('"+diagramName+"', port, terminator);");
			addStatement("clear t_Block t_handles p_Block p_handles terminator port");
		}
		if (port.getKind() == PortKind.OUTPORT) { 
			addStatement("g_Block = add_block('simulink/Sources/Ground', '"+diagramName+"/Ground', 'MakeNameUnique', 'on' );");
			addStatement("g_handles = get_param(g_Block, 'PortHandles');");
			addStatement("p_Block = get_param('"+portName+"', 'handle');");
			addStatement("p_handles = get_param(p_Block, 'PortHandles');");
			addStatement("ground = g_handles.Outport(1);");
			addStatement("port = p_handles.Inport(1);");
			addStatement("add_line('"+diagramName+"', ground, port);");
			addStatement("clear g_Block g_handles p_Block p_handles ground port");
		}
	}

	private void processDictionaryOnSystem(System sys) {
		Dictionary dictionary = sys.getDictionary();
		if (dictionary == null)
			return ;
		// associate the dictionary to the model
		String fileName = NameHelper.getFileName(dictionary);
		addStatement("set_param('"+NameHelper.getName(sys)+"', 'DataDictionary', '"+fileName+"');");
	}
	/*
	 * We need to walk through dictionaries from leafs
	 */
	protected void processSLDiagramElements(SLDiagram object) {
		for (Block block : object.getBlocks()) {
			doSwitch(block);
		}
		for (Line line : object.getLines()) {
			doSwitch(line);
		}
	}


	@Override
	public String caseBlock(Block object) {
		processBlockProperties(object);
		processBlockPorts(object);
		return "";
	}


	@Override
	public String caseSystemReference(SystemReference object) {
		// We need to setup the ModelFile property so that the port list are updated accordingly.
		// So we add a new parameter and let the caseBlock() method work
		PrimitiveValue value = MLInfraFactory.eINSTANCE.createPrimitiveValue();
		value.setSpecification(NameHelper.getName(object.getSystem()));
		object.getParameters().put("ModelFile", value);

		return null;
	}


	protected void processBlockPorts(PortHolder object) {
		if (object instanceof Subsystem ) {
			// default subsystem comes with 1 input & 1 output & a line. Let's remove them (so we can set id on all new ports)
			//however subsytem from our toolbox does not ...
			String fullName = NameHelper.getFullName(object);
			addStatement("CapSLBridge.internal.cleanSubsystem('"+fullName+"');");
		}

		// we need to sort ports on the index. So that when a creation occures the index is kept
		object.getPorts().stream().sorted(Comparator.comparingInt(Port::getIndex)).forEach(p -> doSwitch(p));
	}


	protected void processBlockProperties(Block object) {
		String fullName = NameHelper.getFullName(object);
		addStatement("add_block('"+object.getSource()+"', '"+fullName+"');");
		if (PropertyHelper.hasBounds(object))
			addStatement("set_param('"+fullName+"', 'Position', '"+PropertyHelper.getBoundsForSimulink(object)+"')");
		addDatatype(object);
		addDescription(object);
		addModelerId(object, fullName);
		addParametersWithFullname(object, fullName);
	}

	/**
	 * see doc at https://www.mathworks.com/help/releases/R2020a/simulink/slref/add_line.html
	 * 
	 * TODO: Pour l'instant, on laisse à simulink le routage des liens 
	 */
	@Override
	public String caseLine(Line line) {
		String container = NameHelper.getFullName(line.getDiagram());
        Port sourcePort = line.getSource();
        Port targetPort = line.getTarget();
        addPortHandler(line, sourcePort, "source");
        addPortHandler(line, targetPort, "target");
        addStatement("line = add_line('"+container+"', source, target, 'autorouting','smart');");
//      Setting the name of line is not allowed on lines connected to ouput ports from  Bus Selector blocks.
  		String name = NameHelper.getName(line);
  		if (name != null && !name.isEmpty())
  			addStatement("set_param(line, 'Name', '"+name+"');");
  		if (TraceabilityHelper.hasTraceabilityId(line))
  			addStatement("set_param( line, 'Tag', '"+TraceabilityHelper.getTraceabilityId(line)+"');");
		addDescription("line", line);
		addParametersWithHandle(line, "line");
        addStatement("clear line handles source target;");
		return "";
	}


    private void addPortHandler(Line line, Port port, String variable) {
        addStatement("handles = get_param('"+getHolderName(line.eContainer(), port)+"', 'PortHandles');");
        PortHolder holder = port.getHolder();
        if (holder.equals(line.getDiagram()) ) {
            // block port
            String method = "unknown";
            if ("target".equals(variable))
                method = "Inport";
            if ("source".equals(variable))
                method = "Outport";
            addStatement(variable+" = handles."+method+"(1);");
        }
        else
            // port handle on a block
            addStatement(variable+" = handles."+port.getKind().getName()+"("+port.getIndex()+");");
    }

	@Override
	public String casePort(Port object) {
		if (object.getHolder() instanceof Subsystem || object.getHolder() instanceof System ) {
			String fullName = NameHelper.getFullName(object);
			PortKind kind = object.getKind();
			int index = object.getIndex();
			addStatement("add_block('"+getLibraryName(kind)+"', '"+fullName+"');");
            if (!PortKind.ENABLE.equals(kind))
            	addStatement("set_param('"+fullName+"', 'Port', '"+index+"');");
			addDatatype(object);
			if (PortKind.OUTPORT.equals(kind) && DatatypeHelper.isBus(object))
				addStatement("set_param('"+fullName+"', 'BusOutputAsStruct', 'on');");
			if (PropertyHelper.hasBounds(object))
				addStatement("set_param('"+fullName+"', 'Position', '"+PropertyHelper.getBoundsForSimulink(object)+"');");
			addModelerId(object, fullName);
			addDescription(object);
			addParametersWithFullname(object, fullName);
				//there is something weird: created port handle (return by add_block) doesn't match the value in 'porthandles' property in container... 
			return "";
		}
		String fullName = NameHelper.getFullName(object.getHolder());
		PortKind kind = object.getKind();
		// Matlab does not allow tag on input ports ... Note: it does not seem to apply to subsystem block.
        if (PortKind.OUTPORT.equals(kind)) {
			// Matlab 18 does not support these statements on one line
			addStatement("handles = get_param('"+fullName+"', 'porthandles');");
			if (TraceabilityHelper.hasTraceabilityId(object))
				addStatement("set_param(handles."+kind.getName()+"("+object.getIndex()+"), 'Tag', '"+TraceabilityHelper.getTraceabilityId(object)+"');");
			addStatement("clear handles;");
		}
		return "";
	}


	@Override
	public String caseSubsystem(Subsystem object) {
		caseBlock(object);
		processSLDiagramElements(object);
		addLayout(object, NameHelper.getFullName(object));

		return "";
	}

	@Override
	public String caseChart(Chart object) {
		new StateFlowGenerator(sb).doSwitch(object);
		return "";
	}


	/*	
	 * The issued command uses double quote on the fullname.
	 */
	protected void addParametersWithFullname(ParameterizedElement object, String fullName) {
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			addStatement("set_param('"+fullName+"', '"+entry.getKey()+"', '"+entry.getValue()+"')");
		}
	}
	
	protected void addParametersWithDotNotation(ParameterizedElement object, String name) {
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			addStatement(name +"."+entry.getKey()+" = '"+entry.getValue()+"';");
		}
	}
	
	private void addDescription(NamedElement elt) {
		if (elt.getDescription() != null && !elt.getDescription().isEmpty()) {
			String name = NameHelper.getFullName(elt);
			addDescription("'"+name+"'", elt);
		}
	}
	private void addDescription(String name, NamedElement elt) {
		if (elt.getDescription() != null && !elt.getDescription().isEmpty()) {
			addStatement("set_param("+name+", 'Description', '"+elt.getDescription()+"');");
		}
	}
	
	private void addDatatype(DatatypeHolder holder) {
		if (DatatypeHelper.hasDatatype(holder)) {
			String name = NameHelper.getFullName(holder);
			addStatement("set_param('"+name+"', 'OutDataTypeStr', "+DatatypeHelper.toString(holder.getDatatype())+");");
		}
	}
	
	/*
	 * The issued command doesn't use any quote on the handle value.
	 */
	private void addParametersWithHandle(ParameterizedElement object, String handle) {
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			addStatement("set_param("+handle+", '"+entry.getKey()+"', '"+entry.getValue()+"')");
		}
	}
	
	public SystemGenerator() {
		super(new StringBuilder());
	}


	public SystemGenerator(StringBuilder sb) {
		super(sb);
	}


    protected String getHolderName(EObject container, Port port) {
		PortHolder holder = port.getHolder();
		if (holder.equals(container) && ( holder instanceof Subsystem || holder instanceof System)) 
            return NameHelper.getFullName(port);
        return NameHelper.getFullName(holder);
	}


	private String getLibraryName(PortKind kind) {
		switch (kind) {
		case INPORT:
			return "simulink/Ports & Subsystems/In1";
		case OUTPORT:
			return "simulink/Ports & Subsystems/Out1";
		case ENABLE:
			return "simulink/Ports & Subsystems/Enable";
		case TRIGGER:
			return "simulink/Ports & Subsystems/Trigger";
			
		default:
			throw new UnsupportedOperationException();
		}
	}
}
