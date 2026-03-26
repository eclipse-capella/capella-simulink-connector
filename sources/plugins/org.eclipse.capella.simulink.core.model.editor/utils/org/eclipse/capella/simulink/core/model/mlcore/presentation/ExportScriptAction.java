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
package org.eclipse.capella.simulink.core.model.mlcore.presentation;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.capella.simulink.transformation.launcher.GeneratorLauncher;

/**
 * @author 
 *
 */
public class ExportScriptAction extends Action {
	private Resource selection;
	public ExportScriptAction() {
		super("Export script to console");
	}

	public void run() {
		ResourceSet rs = new ResourceSetImpl();
		GeneratorLauncher helper = new GeneratorLauncher();
		helper.configure(rs);
		String generate = null;
		try {
			generate = helper.generate(rs, selection.getURI());
		} catch (Exception e) {
			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));
			generate = writer.toString();
		}
		rs.getResources().stream().forEach(r -> r.unload());
		rs.getResources().clear();
		
		new ConsoleHelper().writeAndReveal(generate);
	}

	public void setSelection(ISelection selection) {
		this.selection = null;
		setEnabled(false);
		if (selection.isEmpty()) {
			return ;
		}
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection)selection;
			if (ss.size() != 1)
				return;
			Object elt = ss.getFirstElement();
			if (elt instanceof Resource) {
				this.selection = (Resource) elt;
				setEnabled(true);
			}
		}
	}

}
