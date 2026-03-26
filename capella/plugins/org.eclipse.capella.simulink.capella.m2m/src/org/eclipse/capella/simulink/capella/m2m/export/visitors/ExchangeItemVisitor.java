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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.GeneralClass;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datatype.PhysicalQuantity;

/**
 * @author 
 *
 */
public class ExchangeItemVisitor extends AVisitor{

	public ExchangeItemVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
        if (obj instanceof ExchangeItem) {
            ExchangeItem ei = (ExchangeItem) obj;
            collector.addAll(ei.getOwnedElements());
            return true;
        }
        if (obj instanceof ExchangeItemElement) {
            ExchangeItemElement eie = (ExchangeItemElement) obj;
            if (eie.getType() instanceof Class || eie.getType() instanceof Enumeration || eie.getType() instanceof PhysicalQuantity) {
            	collector.add(eie.getType());
            }
            return true;
        }

		return super.visit(obj);
	}

}
