/*******************************************************************************
 * Copyright (c) 2022, 2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.capella.m2m.tests;

import org.eclipse.capella.simulink.core.model.mlcore.presentation.ExportScriptAction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.StructuredSelection;
import org.junit.jupiter.api.Test;

public class Export2ConsoleTest {

	@Test
	public void testExport() {
		FileHelper.installProjectIntoWorkspace("resources/mlcore");
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI("mlcore/mystate.mlcore", false);
		Resource resource = set.getResource(uri, true);
		EObject obj = resource.getContents().get(0);
		ExportScriptAction action = new ExportScriptAction();
		action.setSelection(new StructuredSelection(obj));
		System.out.println();
	}
}
