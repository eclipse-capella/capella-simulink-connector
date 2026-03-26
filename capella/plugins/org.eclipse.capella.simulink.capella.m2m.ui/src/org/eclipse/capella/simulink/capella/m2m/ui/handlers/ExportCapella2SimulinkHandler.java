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
package org.eclipse.capella.simulink.capella.m2m.ui.handlers;

import java.util.Objects;

import org.eclipse.capella.simulink.capella.m2m.ui.wizard.Capella2SimulinkExportWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;


public class ExportCapella2SimulinkHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Shell shell = HandlerUtil.getActiveShell(event);
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
		
        Objects.requireNonNull(shell);
        Objects.requireNonNull(workbench);
        Objects.requireNonNull(selection);

		Capella2SimulinkExportWizard wizard = new Capella2SimulinkExportWizard();
        wizard.init(workbench, selection);

        // The dialog that will present the wizard.
        WizardDialog dialog = new WizardDialog(shell, wizard);

        // Opens the UI for the end user.
        @SuppressWarnings("unused")
        int dialogReturnCode = dialog.open();

		return null;
    }

}
