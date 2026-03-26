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
package org.eclipse.capella.simulink.capella.m2m.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import org.eclipse.capella.simulink.capella.m2m.ui.Activator;
import org.eclipse.capella.simulink.core.model.mloperation.MloperationFactory;
import org.eclipse.capella.simulink.m2m.capella.CatalogHelper;
import org.eclipse.capella.simulink.m2m.capella.launcher.OperationRunnable;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;

/**
 * @author 
 *
 */
public class Capella2SimulinkExportWizard extends Wizard implements IWorkbenchWizard {

    private final OperationPage operationPage = new OperationPage();
    private final OptionPage optionPage = new OptionPage();
    private IStructuredSelection selection;
	private final org.eclipse.capella.simulink.core.model.mloperation.Operation operation = MloperationFactory.eINSTANCE.createOperation();
    
    public Capella2SimulinkExportWizard() {
        super();
        setNeedsProgressMonitor(true);
        optionPage.setOperation(operation);
        operationPage.setOperation(operation);
        
    }

    @Override
    public void addPages() {
        addPage(operationPage);
        addPage(optionPage);
    }

    @Override
    public boolean canFinish() {
        return operation.getKind() != null ;
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page.equals(operationPage)) {
        	if (operation.getKind() == null)
        		return null;
        	if (!CatalogHelper.HELPER.getCatalog().getOperation(operation.getKind()).getOptions().isEmpty())
                return optionPage;
        }
        return null;
    }

    @Override
    public boolean performFinish() {
        
        try {
        	Stream.of(selection.toArray()).map(EObject.class::cast).forEach(obj -> operation.getTargets().add(obj));
            OperationRunnable exportRunnable = new OperationRunnable(operation);
            getContainer().run(false, false, exportRunnable);
        } catch (InvocationTargetException e) {
            handleException(e.getTargetException());
            return false;
        } catch (InterruptedException e) {
            handleException(e);
            return false;
        }
        MessageDialog.openInformation(this.getShell(), Messages.Export_Action_Label, Messages.Transformation_Finish_Succes_Message);
        return true;
    }
    
    private void handleException(Throwable e) {
    	if (e instanceof InvocationTargetException)
    		e = ((InvocationTargetException) e).getTargetException();
        Status status = new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), Messages.Transformation_Finish_Error_Message, e);
        if (status.isOK()){
            return ;
        }
        Activator.getDefault().getLog().log(status);
        String message = "Transformation finished with error: "+e.getClass().getSimpleName();
        if (e.getMessage() != null)
            message += "\n\n"+e.getMessage()+"\n";
        message += "\nMore details are available in the error log";
        MessageDialog.openError(this.getShell(), Messages.Export_Action_Label, message);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        this.selection = selection;
        operationPage.setSelection(selection);
    }
}
