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
package org.eclipse.capella.simulink.m2m.capella.rule.data.helper;

import java.util.Collection;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;

/**
 * @author 
 *
 */
public class DictionaryHelper {
	public static void createDefaultDictionaries(IContext context, CapellaElement element, System system) {
		BlockArchitecture blockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(element);
		Dictionary layerDict = (Dictionary)ContextHelper.getMainTarget(context, blockArchitecture);
		if (layerDict == null) {
			layerDict = createDictionary(context, blockArchitecture, blockArchitecture.getName());
			PropertyHelper.markAsLayerRoot(layerDict);
			ContextHelper.createMainTarget(context, blockArchitecture, layerDict);
		}
		Dictionary sytemDict = system.getDictionary();
		if (sytemDict == null) {
			sytemDict = createDictionary(context, element, system.getName());
			system.setDictionary(sytemDict);
			sytemDict.getSubDictionaries().add(layerDict);
		}

	}

	private static void registerDictionary(Dictionary elt, IContext context) {
		((Collection<Dictionary>)context.get(IConstants.DICTIONARIES)).add(elt);
	}

	public static Dictionary getLayerDictionary(IContext context, CapellaElement element) {
		BlockArchitecture blockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(element);
		Dictionary layerDict = (Dictionary)ContextHelper.getMainTarget(context, blockArchitecture);
		return layerDict;
	}
	
	public static Dictionary createDictionary(IContext context, CapellaElement element, String name) {
		Dictionary dict = MLCoreFactory.eINSTANCE.createDictionary();
		registerDictionary(dict, context);
		dict.setName(name);
		dict.setOriginatorId(element.getId());
		PropertyHelper.setLayer(dict, CapellaModelHelper.getElementLayer(element).name());
		Object root = context.get(IConstants.PIVOT_ROOT_CONTAINER);
		if (root instanceof Project) {
			Project prj =(Project)root;
			prj.getDictionaries().add(dict);
			prj.eResource().getContents().add(dict);
		}
		return dict;
	}

}
