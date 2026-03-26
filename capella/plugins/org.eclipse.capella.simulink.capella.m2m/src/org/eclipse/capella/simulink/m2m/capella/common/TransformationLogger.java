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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.eclipse.capella.simulink.m2m.capella.Activator;

/**
 * @author 
 */
public class TransformationLogger {

	public static void logError(String msg) {
		logError(msg, null);
	}
	
	public static void logInfo(String msg) {
		Activator.getDefault().getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, msg));
	}
	
	public static void logError(String msg, Throwable e) {
		IStatus status = null;
		if (e != null) {
			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e);
		} else {
			status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg);
		}
		Activator.getDefault().getLog().log(status);
	}
}
