/*******************************************************************************
 * Copyright (c) 2022-2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.capella.m2m.export.visitors;

import java.util.List;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.GeneralClass;
import org.polarsys.capella.core.data.information.datatype.Enumeration;

/**
 * @author 
 *
 */
public class TypeVisitor extends AVisitor{

	public TypeVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
        if (CapellacorePackage.Literals.CLASSIFIER.isInstance(obj)) {
        	Classifier clazz = (Classifier) obj;
        	collector.addAll(clazz.getContainedProperties());
        	return true;
        }
        if (CapellacorePackage.Literals.GENERAL_CLASS.isInstance(obj)) {
        	GeneralClass clazz = (GeneralClass) obj;
        	collector.addAll(clazz.getNestedGeneralClasses());
        	return true;
        }
        if (obj instanceof Enumeration) {
            Enumeration enumeration = (Enumeration) obj;
            collector.addAll(enumeration.getOwnedLiterals());
            return true;
        }
		return super.visit(obj);
	}

}
