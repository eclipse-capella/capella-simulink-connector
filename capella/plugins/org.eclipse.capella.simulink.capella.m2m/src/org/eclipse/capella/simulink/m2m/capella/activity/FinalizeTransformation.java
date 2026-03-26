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

import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.TransposerCorePlugin;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.message.Messages;

/**
 * @author 
 */
public class FinalizeTransformation extends AbstractTransformationActivity {

	/**
	 * Default constructor
	 */
	public FinalizeTransformation() {
		// Nothing to do.
	}

	@Override
	public IStatus run(ActivityParameters activityParams_p){
		IContext context = (IContext) activityParams_p.getParameter(TRANSPOSER_CONTEXT).getValue();
		Object rootContainer = context.get(IConstants.PIVOT_ROOT_CONTAINER);
		if (rootContainer instanceof EObject) {
			return saveEObjectResource((EObject) rootContainer);
		} else {
			if (rootContainer instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<EObject, EObject> rootContainersMap = (Map<EObject, EObject>) rootContainer;
				final MultiStatus status = new MultiStatus(TransposerCorePlugin.PLUGIN_ID, 0, Messages.Transformation_Finalize_Message, null);
				rootContainersMap.values().forEach(eo -> {
					IStatus saveStatus = saveEObjectResource(eo);
					status.add(saveStatus);
				});
				return status;
			}
		}
		context.reset();
		return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, Messages.Transformation_Finalize_Error_Message);
	}
	
	public IStatus saveEObjectResource(EObject eObject) {
		Resource resource = eObject.eResource();
		if (resource != null){
			ResourceUtil.saveResource(resource);
			return Status.OK_STATUS;
		}
		return new Status(IStatus.ERROR, TransposerCorePlugin.PLUGIN_ID, Messages.Transformation_Finalize_Error_Message);
	}
}
