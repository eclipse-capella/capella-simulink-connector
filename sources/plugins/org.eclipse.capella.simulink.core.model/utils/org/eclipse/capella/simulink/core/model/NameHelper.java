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
package org.eclipse.capella.simulink.core.model;

import java.text.Normalizer;
import java.text.Normalizer.Form;

/**
 * @author 
 *
 */

public class NameHelper {

	public static String normalize(String name) {
		if (name == null)
			return "";
		//  convert 'augmented' char to basic char. for example � -> e, then special chars -> _ and whitechars -> _ 
		return Normalizer.normalize(name.trim(), Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll("[^a-zA-Z0-9\\s]","_").replaceAll("\\s", "_");
	}

}
