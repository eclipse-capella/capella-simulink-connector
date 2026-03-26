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
package org.eclipse.capella.simulink.m2m.capella.launcher;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;

import org.eclipse.capella.simulink.capella.m2m.export.ExportHandler;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.m2m.capella.CatalogHelper;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;

/**
 * @author 
 *
 */
public class OperationRunnable implements IRunnableWithProgress {

    private Operation operation;

    public OperationRunnable(Operation strategy) {
        this.operation = strategy;
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        monitor.beginTask(Messages.Export_Action_Label, 6);
        monitor.worked(3);
        try {
	        ExportHandler export = getHandler();
	        List<Object> scopedSelection = export.computeScope(operation.getTargets());
	        monitor.worked(1);
	        if (scopedSelection.isEmpty()) {
	            throw new IllegalStateException(Messages.Transformation_Initialize_Error_Message);
	        }
	        export.transform(operation, scopedSelection, monitor);
	        monitor.done();

        } catch (Exception e) {
            throw new InvocationTargetException(e);
        }

    }

	private ExportHandler getHandler() throws CoreException {
		org.eclipse.capella.simulink.core.model.mloperation.description.Operation operationDesc = CatalogHelper.HELPER.getCatalog().getOperation(operation.getKind());
		if (operationDesc == null)
			throw new IllegalStateException("The operation kind '"+operation.getKind()+"' is not supported");
        
		for (IConfigurationElement confElt : RegistryFactory.getRegistry().getConfigurationElementsFor("org.eclipse.capella.simulink.m2m.capella.export")) {
			if (operationDesc.getId().equals(confElt.getAttribute("operationId")))
				return (ExportHandler)confElt.createExecutableExtension("handlerClass");
		}
		throw new IllegalStateException("Cannot find export handler for kind '"+operationDesc.getId()+"'");
	}

}
