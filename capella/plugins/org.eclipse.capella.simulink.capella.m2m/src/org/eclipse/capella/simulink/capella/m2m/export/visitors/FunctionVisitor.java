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

import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.helpers.fa.services.FunctionExt;

/**
 * @author 
 *
 */
public class FunctionVisitor extends AVisitor{

	private final boolean collectionSubFunctions;

	
	public FunctionVisitor(List<Object> collector, boolean collectionSubFunctions) {
		super(collector);
		this.collectionSubFunctions = collectionSubFunctions;
	}

	public FunctionVisitor(List<Object> collector) {
		this(collector, true);
	}

	@Override
	public boolean visit(Object obj) {
		if (obj instanceof AbstractFunction) {
			AbstractFunction fct = (AbstractFunction) obj;
			collector.addAll(FunctionExt.getOwnedFunctionPorts(fct));
			if(collectionSubFunctions)
				collector.addAll(fct.getSubFunctions());
			return true;
		}
		return super.visit(obj);
	}

}
