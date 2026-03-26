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
package org.eclipse.capella.simulink.m2m.capella.message;

import org.eclipse.osgi.util.NLS;

/**
 * @author 
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.capella.simulink.m2m.capella.message.messages"; //$NON-NLS-1$
	public static String Transformation_Finalize_Error_Message;
	public static String Transformation_Finalize_Message;
	public static String Transformation_Initialize_Error_Message;
	public static String Transformation_Finish_Succes_Message;
	public static String Transformation_Finish_Error_Message;
	public static String Transformation_No_Parent_Found_In_Target_Model;
	public static String Transformation_No_Parent_Found_In_Source_Model;
	public static String Transformation_Wrong_Element_Type;
	public static String Transformation_Of_Element_Fails;
	public static String Export_Action_Label;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
