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

import org.polarsys.capella.core.data.information.Association;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.Property;

/**
 * @author 
 *
 */
public class PropertyVisitor extends AVisitor{

	public PropertyVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
		if (InformationPackage.Literals.PROPERTY.isInstance(obj)) {
            Property property = (Property) obj;
            switch (property.getAggregationKind()) {
            
            case COMPOSITION:
                // Then we return the types on the other
                // side of the composition.
            	collector.add(property.getType());
            	return true;
            case ASSOCIATION:
                // Then we return the types on the other
                // side of the composition.
                Association association = property.getAssociation();
                if (association != null && association.getNavigableMembers().contains(property)) {
                	collector.add(property.getType());
                }
                return true;
            }
        	
        }

		return super.visit(obj);
	}

}
