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
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.transformation.AbstractGenerator;

/**
 * 
 * @author 
 *
 */
public class LabelHelper {
	
	public static void addLabels(AbstractGenerator generator, String target, NamedElement element) {
		String level = PropertyHelper.getLayer(element);
		if (level != null) 
			generator.addStatement("addLabel("+target+", 'Capella Layer', '"+level+"');");
	}

}
