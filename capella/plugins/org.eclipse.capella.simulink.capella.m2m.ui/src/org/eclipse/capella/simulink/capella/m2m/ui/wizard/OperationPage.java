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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;

import org.eclipse.capella.simulink.capella.m2m.export.ExportHandler;
import org.eclipse.capella.simulink.capella.m2m.ui.Activator;
import org.eclipse.capella.simulink.core.model.mloperation.description.Operation;
import org.eclipse.capella.simulink.m2m.capella.CatalogHelper;

/**
 * 
 * @author 
 *
 */
public class OperationPage extends WizardPage {
    private TableViewer operationViewer;
    private Label descriptionLabel;
	private org.eclipse.capella.simulink.core.model.mloperation.Operation operation;
	private ISelection initialSelection;

    protected OperationPage() {
        super("OperationPage", "", Activator.getDefault().getImageRegistry().getDescriptor(Activator.ICON_MLCORE_X2));
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.verticalSpacing = 0;
        layout.horizontalSpacing = 0;
        composite.setLayout(layout);
        GridData data = new GridData(GridData.FILL_BOTH);
        composite.setLayoutData(data);
        composite.setFont(parent.getFont());
     
        Label label = new Label(composite, SWT.None);
        label.setText("Select export strategy:");
        data = new GridData(GridData.FILL_HORIZONTAL);
        data.horizontalSpan = 2;
        label.setLayoutData(data);

        operationViewer = new TableViewer(composite, SWT.BORDER | SWT.SINGLE);
        operationViewer.setContentProvider(new ArrayContentProvider());
        operationViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((Operation)element).getOperationkind().getName();
            }

            @Override
            public Image getImage(Object element) {
            	String imageURL = ((Operation)element).getOperationkind().getImageURL();
                Object url = CapellaModellerEditPlugin.INSTANCE.getImage(imageURL);
                return ExtendedImageRegistry.INSTANCE.getImage(url);
            }
            
        });
        operationViewer.addSelectionChangedListener( event ->  {
                IStructuredSelection ss = operationViewer.getStructuredSelection();
                if (!ss.isEmpty() && ss.getFirstElement() instanceof Operation) {
                	Operation currentStrategy = (Operation)ss.getFirstElement();
                    String description = currentStrategy.getOperationkind().getDescription();
					descriptionLabel.setText(description);
					operation.setKind(currentStrategy.getOperationkind().getId());
					CatalogHelper.HELPER.setDefaultOptions(operation);
					setPageComplete(true);
                }
                else
                    setPageComplete(false);
        });
        operationViewer.getControl().setLayoutData(new GridData(GridData.FILL_VERTICAL));
        operationViewer.setInput(CatalogHelper.HELPER.getCatalog().getOperations());
        
        descriptionLabel = new Label(composite, SWT.WRAP  );
        descriptionLabel.setText("");
        data = new GridData(GridData.FILL_BOTH);
        data.horizontalIndent = 5;
        data.widthHint = 300;
        descriptionLabel.setLayoutData(data);
        
        setTitle("Export selection to Simulink®");
        setDescription("This wizard will export data into an intermediary model file which can be imported into Simulink®.");
        setControl(composite);

        // init selection
        operationViewer.setSelection(initialSelection);

    }

	public void setOperation(org.eclipse.capella.simulink.core.model.mloperation.Operation operation) {
		this.operation = operation;
	}

	public void setSelection(IStructuredSelection selection) {
		assert operationViewer != null;
		assert operationViewer.getControl() != null;
		assert !operationViewer.getControl().isDisposed();
		
		// try to select the right operation...
		try {
			for (IConfigurationElement confElt : RegistryFactory.getRegistry().getConfigurationElementsFor("org.eclipse.capella.simulink.m2m.capella.export")) {
				ExportHandler handler = (ExportHandler)confElt.createExecutableExtension("handlerClass");
				for (Object obj : selection.toArray())
				{
					Class<?> relatedMetaClass = handler.getRelatedMetaClass();
					Class<? extends Object> objClass = obj.getClass();
					if (relatedMetaClass.isAssignableFrom(objClass)) {
						for (Operation op : CatalogHelper.HELPER.getCatalog().getOperations()) {
							if (op.getId().equals(confElt.getAttribute("operationId"))) {
								initialSelection = new StructuredSelection(op);
								return ;
							}
						}
					}
				}
			}
		} catch (CoreException e) {
			// we don't care this time.
		}

		
	}


}
