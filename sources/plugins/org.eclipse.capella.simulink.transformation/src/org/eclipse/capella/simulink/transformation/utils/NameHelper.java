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
package org.eclipse.capella.simulink.transformation.utils;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.core.model.mlcore.util.MLCoreSwitch;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;

/**
 * @author 
 *
 */
public class NameHelper {
	
	private static final String DICTIONARY_EXTENSION = ".sldd";
	private static final String MODEL_EXTENSION = ".slx";
	

	public static String getFileName(Dictionary dict) {
		String name = getName(dict);
		String filename = name+DICTIONARY_EXTENSION;
//		if (dict.getFileName() != null && !dict.getFileName().isEmpty()) {
//			filename = dict.getFileName();
//			if (!filename.endsWith(DICTIONARY_EXTENSION))
//				filename += DICTIONARY_EXTENSION;
//		}
		return filename;
	}

	public static String getFilePath(Dictionary dic) {
		return getFilePath(dic, DICTIONARY_EXTENSION);
	}

	public static String getFilePath(System sys) {
		return getFilePath(sys, MODEL_EXTENSION);
	}
	
	private static String getFilePath(NamedElement sys, String ext) {
		String sysname = "models/";
        if (DICTIONARY_EXTENSION.equals(ext))
        	sysname = "data/";
		String path = PropertyHelper.getLayer(sys);
		if (path != null) 
			sysname += (path+"/");
		sysname += getName(sys);
		return sysname+ext;
	}

	public static String getFullName(NamedElement elt) {
		return getFullName(elt, "");
	}

	public static boolean isEmpty(String value) {
		return value == null || value.isEmpty();
	}

	protected static String getFullName(NamedElement elt, String suffix) {
		String name = NameHelper.getName(elt);
		if (!isEmpty(suffix))
			name = name + "/" + suffix;
		// full names are relative to the containing model (ie system).
		if (elt.eContainer() == null || elt instanceof System)
			return name;
		return getFullName((NamedElement) elt.eContainer(), name);
	}

	public static String getName(NamedElement elt) {
		return new MLCoreSwitch<String>() {
	
			@Override
			public String caseDictionary(Dictionary object) {
				if (PropertyHelper.hasLayerRootMark(elt)) {
					String layer = PropertyHelper.getLayer(elt);
					return layer+"_FunctionalExchanges_Categories";
				}
				return getPrefixedName(object);
			}

			@Override
			public String caseSystem(System object) {
				// Matlab does not support filename longer than 59 chars while making references between model files!
				String prefixedName = getPrefixedName(object);
				return prefixedName.substring(0, Math.min(prefixedName.length(), 55));
			}
			public String getPrefixedName(ParameterizedElement object) {
				
				String name = org.eclipse.capella.simulink.core.model.NameHelper.normalize(elt.getName());
				String layer = PropertyHelper.getLayer(elt);
				if (layer == null) 
					return name;
				if (name.charAt(0) == '_')
					return layer+name;
				return layer+'_'+name;
			}

			@Override
			public String caseNamedElement(NamedElement object) {
				return org.eclipse.capella.simulink.core.model.NameHelper.normalize(elt.getName());
			}
		}.doSwitch(elt);
	}
}
