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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import org.eclipse.capella.simulink.capella.m2m.ui.Activator;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mloperation.Configuration;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption;
import org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue;
import org.eclipse.capella.simulink.core.model.mloperation.description.Style;
import org.eclipse.capella.simulink.m2m.capella.CatalogHelper;

/**
 * 
 * @author 
 *
 */
public class OptionPage extends WizardPage {

	private Operation operation;
	private final List<Group> optionControls = new ArrayList<>();
    
    protected OptionPage() {
        super("functionPage", "", Activator.getDefault().getImageRegistry().getDescriptor(Activator.ICON_MLCORE_X2));
    }

    @Override
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));

        setTitle("Export Parameters");
        setDescription("Adjust options to export elements.");
        setControl(composite);
    }

    protected void createOptionControls(Composite mainControl, ConfigurationOption option) {
    	Group group = new Group(mainControl, SWT.NONE);
    	optionControls.add(group);
    	group.setText(option.getName());
    	group.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
    	group.setLayout(new RowLayout(SWT.VERTICAL));
    	String description = option.getDescription();
		if (!isEmpty(description)) {
	        StyledText text = new StyledText(group, SWT.WRAP | SWT.MULTI | SWT.READ_ONLY | SWT.H_SCROLL );
	        text.setText(description);
	        List <StyleRange> ranges = new ArrayList<>();
	        for (Style sstyle : option.getDescriptionStyle()) {
		        StyleRange style = new StyleRange();
		        style.start = sstyle.getStart();
		        style.length = sstyle.getLength();
		        style.fontStyle = sstyle.getFontStyle();
		        ranges.add(style);
	        }
	        if (!ranges.isEmpty())
	        	text.setStyleRanges(ranges.toArray(new StyleRange[ranges.size()]));
	        text.setBackground(group.getBackground());
	        RowData layoutData = new RowData();
	        layoutData.width = 700;
	        text.setLayoutData(layoutData);
		}
    	for (LabeledValue value : option.getAvailableValues()) {
    		Button btn = new Button(group, SWT.RADIO);
    		btn.setText(value.getName());
    		btn.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent event) {
					Configuration config = operation.getMainConfiguration();
					PrimitiveValue primitiveValue = MLInfraFactory.eINSTANCE.createPrimitiveValue();
					primitiveValue.setSpecification(value.getValue());
					config.getParameters().put(option.getId(), primitiveValue);
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
    		Configuration config = operation.getMainConfiguration();
    		PrimitiveValue value2 = (PrimitiveValue)config.getParameters().get(option.getId());
    		if (value2 == null)
    			btn.setSelection(value == option.getDefaultValue());
    		else
    			btn.setSelection(value.getValue().equals(value2.getSpecification()));
    	}
    }
    
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
    
	@Override
	
	public void setVisible(boolean visible) {
		if (visible) {
			Composite composite = (Composite)getControl();
	        org.eclipse.capella.simulink.core.model.mloperation.description.Operation description = CatalogHelper.HELPER.getCatalog().getOperation(operation.getKind());
			for (ConfigurationOption option: description.getOptions()) {
		        if (!description.getReadonlyOptions().contains(option))
		        	createOptionControls(composite, option);
	        }
		} else {
			for (Group grp : optionControls)
				grp.dispose();
			optionControls.clear();
		}
		
		super.setVisible(visible);
		getShell().pack();
	}

	public static boolean isEmpty(String value) {
		return value == null || value.isEmpty();
	}
}
