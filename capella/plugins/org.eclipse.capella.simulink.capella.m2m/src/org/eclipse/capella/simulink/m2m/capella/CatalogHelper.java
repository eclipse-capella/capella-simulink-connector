/*******************************************************************************
 * Copyright (c) 2022-2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.m2m.capella;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.core.model.mloperation.description.Catalog;
import org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption;
import org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue;

/**
 * @author 
 *
 */
public class CatalogHelper {
	
	public static CatalogHelper HELPER; 
	private final Catalog catalog;
	
	private CatalogHelper(Catalog catalog) {
		this.catalog = catalog;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public static void init (String pathName) {
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createPlatformPluginURI(pathName, false);
		Resource resource = set.getResource(uri, true);
		Catalog catalog = (Catalog) resource.getContents().get(0);
		HELPER = new CatalogHelper(catalog);
	}
	
	public void setDefaultOptions(Operation operation) {
		operation.getMainConfiguration().getParameters().clear();
		for (ConfigurationOption option: CatalogHelper.HELPER.getCatalog().getOperation(operation.getKind()).getOptions()) {
			LabeledValue value = option.getDefaultValue();
			PrimitiveValue primitiveValue = MLInfraFactory.eINSTANCE.createPrimitiveValue();
			primitiveValue.setSpecification(value.getValue());
			operation.getMainConfiguration().getParameters().put(option.getId(), primitiveValue);
		}

	}

}
