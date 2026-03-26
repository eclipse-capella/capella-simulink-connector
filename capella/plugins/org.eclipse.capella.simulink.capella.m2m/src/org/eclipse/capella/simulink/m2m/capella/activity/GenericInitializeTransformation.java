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
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.urihandlers.BundledLibraryURIHandlerImpl;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;

/**
 * @author 
 */
public class GenericInitializeTransformation extends AbstractTransformationActivity {

	/** 
	 * Default constructor
	 */
	public GenericInitializeTransformation(){
		// Nothing to do.
	}

	@Override
	public IStatus run(ActivityParameters activityParams_p){
		//1. Get the selection
		@SuppressWarnings("unchecked")
		Collection<Object> selectionOriginal = (Collection<Object>)activityParams_p.getParameter(TRANSPOSER_SELECTION).getValue();
		
		if (selectionOriginal == null || selectionOriginal.isEmpty()){
			return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, Messages.Transformation_Initialize_Error_Message);
		}
		
		ResourceSet set = new ResourceSetImpl();
		set.getURIConverter().getURIHandlers().add(0, new BundledLibraryURIHandlerImpl());
		
		//2. Create pivot resource
		Resource pivotResource = null;
		List<CapellaElement> selection = selectionOriginal.stream().filter(CapellaElement.class::isInstance).map(CapellaElement.class::cast).collect(Collectors.toList() );
		if (selection.isEmpty())
			return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, "No object to export!");
		SystemEngineering systemEngineering = SystemEngineeringExt.getSystemEngineering(selection.get(0));
		if ( systemEngineering.eResource() == null) 
			return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, Messages.Transformation_Initialize_Error_Message);
		URI uri = EcoreUtil.getURI(systemEngineering);
		if (uri != null){
			uri = uri.trimFileExtension().appendFileExtension(IConstants.PIVOT_EXTENSION).trimFragment();
		}
		pivotResource = set.createResource(uri);
	
		// 3. Create the root pivot root model element: a Project element
		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		EObject root = createRootObject(context, pivotResource, systemEngineering, selection);
		
		// 5. Put Pivot ResourceSet and Resource in Transposer context
		context.put(TRANSPOSER_SELECTION, selectionOriginal);
		context.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, set);
		context.put(IConstants.PIVOT_ROOT_CONTAINER, root);
		context.put(IConstants.DICTIONARIES, new HashSet<Dictionary>());
		context.put(IConstants.CURRENT_OPERATION, activityParams_p.getParameter(IConstants.CURRENT_OPERATION).getValue());
		return Status.OK_STATUS;
	}

	protected EObject createRootObject(IContext context, Resource pivotResource, SystemEngineering systemEngineering, Collection<CapellaElement> selections) {
		Project project = MLCoreFactory.eINSTANCE.createProject();
		project.setName(systemEngineering.getName());
		project.setOriginatorId(systemEngineering.getId());
		pivotResource.getContents().add(project);
		return project;
	}
}
