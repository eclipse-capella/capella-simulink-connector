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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.capella.simulink.core.model.mlcore.BuiltIntype;
import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.CustomType;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder;
import org.eclipse.capella.simulink.core.model.mlcore.Enumeration;
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlcore.Signal;
import org.eclipse.capella.simulink.core.model.mlcore.util.MLCoreSwitch;

/**
 * @author 
 *
 */
public class DatatypeHelper {
	
	public static boolean isBus(NamedElement elt) {
		if (elt instanceof DatatypeHolder) {
			DatatypeHolder holder = (DatatypeHolder)elt;
			Datatype datatype = holder.getDatatype();
			if (datatype instanceof DatatypeHolder)
				return isBus(datatype);
			return datatype instanceof Bus;
		}
		return false;
	}
	
	public static boolean hasDatatype(NamedElement elt) {
		if (elt instanceof DatatypeHolder) {
			DatatypeHolder holder = (DatatypeHolder)elt;
			Datatype datatype = holder.getDatatype();
			if (datatype instanceof DatatypeHolder)
				return hasDatatype(datatype);
			return datatype != null;
		}
		return false;
	}
	
	public static String toString(Datatype type) {
		return new MLCoreSwitch<String>() {

			@Override
			public String caseBus(Bus object) {
				return quote("Bus: "+NameHelper.getName(object));
			}

			@Override
			public String caseBuiltIntype(BuiltIntype object) {
				return quote(object.getName());
			}

			@Override
			public String caseCustomType(CustomType object) {
				return quote(NameHelper.getName(object));
			}

			@Override
			public String caseEnumeration(Enumeration object) {
				return quote("Enum: "+NameHelper.getName(object));
			}

			@Override
			public String caseSignal(Signal object) {
				return  NameHelper.getName(object)+ ".DataType";
			}

			@Override
			public String defaultCase(EObject object) {
				return quote("Unexpected type: "+object);
			}
			
			private String quote(String value) {
				return "'"+value+"'";
			}
			
		}.doSwitch(type);
	}
}
