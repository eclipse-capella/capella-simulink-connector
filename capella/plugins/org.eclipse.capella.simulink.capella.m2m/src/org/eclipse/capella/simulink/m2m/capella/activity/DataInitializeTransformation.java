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
package org.eclipse.capella.simulink.m2m.capella.activity;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
/**
 * @author 
 */
public class DataInitializeTransformation extends GenericInitializeTransformation {

	/** 
	 * Default constructor
	 */
	public DataInitializeTransformation(){
		// Nothing to do.
	}

	@Override
	protected EObject createRootObject(IContext context, Resource pivotResource, SystemEngineering systemEngineering, Collection<CapellaElement> selection) {
		Project project = (Project)super.createRootObject(context, pivotResource, systemEngineering, selection);
//		Dictionary dictionary = MLCoreFactory.eINSTANCE.createDictionary();
//		dictionary.setName(systemEngineering.getName()+" [Head Dictionary]");
//		pivotResource.getContents().add(dictionary);
//		project.getDictionaries().add(dictionary);
//		ContextHelper.createMainTarget(context, element, custom);
		return project;
	}

}
