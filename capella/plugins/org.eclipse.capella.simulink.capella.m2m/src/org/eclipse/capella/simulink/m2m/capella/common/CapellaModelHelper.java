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
package org.eclipse.capella.simulink.m2m.capella.common;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;

public class CapellaModelHelper {

	public static Type getElementLayer(EObject cElement) {
		BlockArchitecture rootBlockArchitecture = BlockArchitectureExt.getRootBlockArchitecture(cElement);
		if (rootBlockArchitecture != null) {
			return BlockArchitectureExt.getBlockArchitectureType(rootBlockArchitecture);
		}
		return null;
	}
}
