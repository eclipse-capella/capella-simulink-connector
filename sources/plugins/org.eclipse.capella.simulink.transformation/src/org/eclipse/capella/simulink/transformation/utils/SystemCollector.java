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
package org.eclipse.capella.simulink.transformation.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlcore.util.MLCoreSwitch;

/**
 * Used to gather systems/project in right order for generation. Leafs first and so on.
 *  
 * @author 
 *
 */
public class SystemCollector extends MLCoreSwitch<List<System>> {

	private final List<System> systems = new ArrayList<>();
	private Project project;
	
	@Override
	public List<System> caseSystem(System sys) {
		if (systems.contains(sys))
			systems.remove(sys);
		systems.add(0, sys);
		if (sys.getDictionary() != null && !project.getDictionaries().contains(sys.getDictionary()))
			throw new IllegalStateException("The dict '"+sys.getDictionary().getName()+"' must be referenced by the project.");
			
		return null;
	}

	@Override
	public List<System> caseSLDiagram(SLDiagram object) {
		for (Block block : object.getBlocks()) {
			doSwitch(block);
		}
		return systems;
	}

	@Override
	public List<System> caseSystemReference(SystemReference ref) {
		if (ref.getSystem() == null)
			throw new IllegalStateException("SystemReference '"+ref.getId()+"' has no system.");
		doSwitch(ref.getSystem());
		return systems;
	}
	
	public List<System> caseProject(Project object) {
		this.project = object;
		for (System sys :object.getSystems()) {
			doSwitch(sys);
		}
		return systems;
	}
	
}