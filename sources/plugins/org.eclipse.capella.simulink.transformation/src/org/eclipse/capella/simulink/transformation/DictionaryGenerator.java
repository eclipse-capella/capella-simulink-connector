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
package org.eclipse.capella.simulink.transformation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.CustomType;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Enumeration;
import org.eclipse.capella.simulink.core.model.mlcore.Signal;
import org.eclipse.capella.simulink.transformation.utils.DatatypeHelper;
import org.eclipse.capella.simulink.transformation.utils.NameHelper;

/**
 * 
 * @author 
 *
 */
public class DictionaryGenerator extends AbstractGenerator {
	
	// TODO add a quotedString as a sibling of PrimitiveValue to handle these cases
	private static final Set<String> CUSTOMTYPE_STRING_FIELDS = new HashSet<>(Arrays.asList("DataScope", "DataTypeMode", "DataTypeOverride", "HeaderFile", "Description", "Signedness"));
	private static final Set<String> ENUMERATION_STRING_FIELDS = new HashSet<>(Arrays.asList("DataScope", "DefaultValue", "Description", "HeaderFile", "StorageType"));
	private static final Set<String> SIGNAL_STRING_FIELDS = new HashSet<>(Arrays.asList("Description"));
	private final Set<String> usedVariables;
	

	public DictionaryGenerator(StringBuilder sb, Set<String> usedVariables) {
		super(sb);
		this.usedVariables = usedVariables;
	}

	
	@Override
	public String caseBus(Bus bus) {
		addStatement("clear elems;");
		int counter = 1;
		for (BusElement elt : bus.getBusElements()) {
			String name = "elems("+(counter++)+")";
			addStatement(name + " = Simulink.BusElement;");
			String eltName = NameHelper.getName(elt);
			addStatement(name + ".Name = '"+eltName+"';");
			addModelerId(elt, name);
//			elems(1).Dimensions = 1;
//			elems(1).DimensionsMode = 'Fixed';
			if (DatatypeHelper.hasDatatype(elt))
				addStatement(name + ".DataType = "+DatatypeHelper.toString(elt.getDatatype())+";");
//			elems(1).SampleTime = -1;
//			elems(1).Complexity = 'real';
		}
		String busName = NameHelper.getName(bus);
		addStatement(busName+" = Simulink.Bus;");
		addModelerId(bus, busName);
		if (!bus.getBusElements().isEmpty())
			addStatement(busName+".Elements = elems;");
		assignToBaseWorkspace(busName);
		addStatement("clear elems;");
		return busName;
	}


	private void assignToBaseWorkspace(String variable) {
		addStatement("assignin('base', '"+variable+"', "+variable+");"); // ensure the variable is in the base workspace
	}

	
	@Override
	public String caseSignal(Signal object) {
		String name = NameHelper.getName(object);
		addStatement(name + " = Simulink.Signal;");
		if (DatatypeHelper.hasDatatype(object))
			addStatement(name + ".DataType = "+DatatypeHelper.toString(object.getDatatype())+";");
		if (!NameHelper.isEmpty(object.getInitialValue()))
			addStatement(name + ".InitialValue = '"+object.getInitialValue()+"';");
		if (!NameHelper.isEmpty(object.getUnit()))
			addStatement(name + ".Unit = '"+object.getUnit()+"';");
		addModelerId(object, name);
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			String value = entry.getValue();
			if (SIGNAL_STRING_FIELDS.contains(entry.getKey()))
				value = "'" + value +"'";
			addStatement(name+"."+entry.getKey()+" = "+value+";");
		}
		assignToBaseWorkspace(name);
		return name;
	}


	@Override
	public String caseEnumeration(Enumeration object) {
		String name = NameHelper.getName(object);
		addStatement(name + " = Simulink.data.dictionary.EnumTypeDefinition;");
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			String value = entry.getValue();
			if (ENUMERATION_STRING_FIELDS.contains(entry.getKey()))
				value = "'" + value +"'";
			addStatement(name+"."+entry.getKey()+" = "+value+";");
		}
		object.getLiterals().stream().forEach(literal -> {
			String literalName = NameHelper.getName(literal);
			addStatement("appendEnumeral("+name+", '"+literalName+"', "+literal.getValue()+", '');");
		});

		// Enum object comes with a default literal
		addStatement("removeEnumeral("+name+",1);");

		assignToBaseWorkspace(name);

		return name;
	}


	@Override
	public String caseCustomType(CustomType object) {
		// We are forced to use dot notation to setup the properties on NumericTypes.
		// We are not allowed to use set_param() function
		// char values must be quoted while the others must not be.
		String name = NameHelper.getName(object);
		addStatement(name + " = Simulink.NumericType;");
		Map<String, String> parameters = PropertyHelper.getMatlabParameters(object);
		for (Entry<String, String> entry : parameters.entrySet()) {
			String value = entry.getValue();
			if (CUSTOMTYPE_STRING_FIELDS.contains(entry.getKey()))
				value = "'" + value +"'";
			addStatement(name+"."+entry.getKey()+" = "+value+";");
		}
		assignToBaseWorkspace(name);

		return name;
	}

	@Override
	public String caseDictionary(Dictionary dict) {
		String name = NameHelper.getName(dict);
		String[] variables = dict.getDatatypes().stream().map(x -> "'"+doSwitch(x)+"'").toArray(String[]::new);
		String dictPath = NameHelper.getFilePath(dict);
		addStatement("if isfile('"+dictPath+"')");
		addStatement("\t"+name + " = Simulink.data.dictionary.open('"+dictPath+"');");
		addStatement("else");
		addStatement("\t"+name + " = Simulink.data.dictionary.create('"+dictPath+"');");
		addStatement("end");
		if (variables.length != 0) {
			String varList = "{"+String.join(", ", variables)+"}";
			addStatement("importFromBaseWorkspace("+name+", 'varList', "+varList+", 'existingVarsAction','overwrite');");
		}
		// add references to sub directories (which are already been created)
		dict.getSubDictionaries().stream().forEach(child -> addStatement("addDataSource("+name+", '"+NameHelper.getFileName(child)+"');"));
		addStatement("saveChanges("+name+");");
		addStatement("clear "+name+";");
		usedVariables.addAll(Arrays.asList(variables));
		return "";
	}


}
