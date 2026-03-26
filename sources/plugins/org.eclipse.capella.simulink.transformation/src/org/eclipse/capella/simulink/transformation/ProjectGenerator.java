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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.transformation.utils.LabelHelper;
import org.eclipse.capella.simulink.transformation.utils.NameHelper;
import org.eclipse.capella.simulink.transformation.utils.SystemCollector;
/**
 * 
 * @author 
 *
 */
public class ProjectGenerator extends AbstractGenerator{

	private final Set<Dictionary> visitedDicts = new HashSet<>();
	private final Set<String> usedVariables = new HashSet<>();
	/*
	 * see https://fr.mathworks.com/help/simulink/slref/simulink.createfromtemplate.html
	 */
	@Override
	public String caseProject(Project project) {
		String name = NameHelper.getName(project);
		// 1 - project setup
		String path = PropertyHelper.getSimpleProperty(project, "Folder");
		if (path == null) {
			addStatement("if not(exist('project_path', 'var'))");
			addStatement("	project_path = userpath;");
			addStatement("	project_path =  fullfile(project_path, '"+name+"');");
			addStatement("end");

		}
		else
			addStatement("project_path = '"+path+"';");
		addStatement("if isfolder(project_path)");
		addStatement("	proj = slproject.loadProject(project_path);");
		addStatement("else");
		addStatement("	proj = Simulink.createFromTemplate('Cap2SL2.sltx', 'Name', '"+name+"', 'Folder', project_path);");
		addStatement("end");

		
		addStatement("cd(project_path);");
		
		// 2 - generate types and dictionaries 
		project.getDictionaries().stream().forEach(dict -> {
			doSwitch(dict);
		});
		
		// 3 - clear all created variables
		if (!usedVariables.isEmpty())
			// we use evalin fct to perform the clear statement into the base workspace since we previously moved these variables from the fct workspace to the base workspace.
			addStatement("evalin('base', \"clear "+String.join(" ", usedVariables)+"\");");
		
		// 4 - create model files
		new SystemCollector().doSwitch(project).stream().forEach(sys -> {
			doSwitch(sys);
			String filename = NameHelper.getFilePath(sys);
			addStatement("file = proj.addFile('"+filename+"');");
			LabelHelper.addLabels(this, "file", sys);
		});
		addStatement("cd(proj.Information.ProjectStartupFolder);");
		addStatement("clear proj file project_path;");
		return "";
	}

	@Override
	public String caseDictionary(Dictionary dict) {
		dict.getSubDictionaries().stream().forEach(d -> caseDictionary(d));
		if (!visitedDicts.contains(dict)) {
			visitedDicts.add(dict);
			new DictionaryGenerator(sb, usedVariables).doSwitch(dict);
			String filename = NameHelper.getFilePath(dict);
			addStatement("file = proj.addFile('"+filename+"');");
			LabelHelper.addLabels(this, "file", dict);
		}
		return "";
	}

	@Override
	public String caseSystem(System sys) {
		new SystemGenerator(sb).doSwitch(sys);
		String sysname = NameHelper.getName(sys);
		String filename = NameHelper.getFilePath(sys);
		addStatement("save_system('"+sysname+"', fullfile(project_path, '"+filename+"'));");
		return "";
	}

	public ProjectGenerator() {
		super(new StringBuilder());
	}
}
