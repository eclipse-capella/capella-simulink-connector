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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.urihandlers.LibraryURIHandler;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;;

/**
 * 
 * @author 
 *
 */
public class DictionaryDependencyActivity extends AbstractTransformationActivity {

	@SuppressWarnings("unchecked")
	@Override
	public IStatus run(ActivityParameters activityParams) {
		IContext context = (IContext) activityParams.getParameter(TRANSPOSER_CONTEXT).getValue();
		((Collection<Dictionary>)context.get(IConstants.DICTIONARIES)).forEach(dictionary -> {
			dictionary.eAllContents().forEachRemaining(t -> {
				if (t instanceof BusElement) {
					BusElement busElt = (BusElement)t;
					if (busElt.getDatatype() == null)
						return ;
					EObject container = busElt.getDatatype().eContainer();
					if (container instanceof Dictionary && isValidDictionary((Dictionary)container, dictionary )) {
						dictionary.getSubDictionaries().add((Dictionary) container);
					}
				}
			});
		});
		return Status.OK_STATUS;
	}

	private boolean isValidDictionary(Dictionary container, Dictionary dictionary) {
		if (dictionary.equals(container))
			return false;
		if (dictionary.getSubDictionaries().contains(container))
			return false;
		if (LibraryURIHandler.SCHEME.equals(container.eResource().getURI().scheme()))
			return false;
		return true;
	}
}
