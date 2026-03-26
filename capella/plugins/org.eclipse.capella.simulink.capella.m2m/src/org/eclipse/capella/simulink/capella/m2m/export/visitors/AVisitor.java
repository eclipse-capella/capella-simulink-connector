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

/**
 * @author 
 *
 */
public class AVisitor {
	protected final List<Object> collector;
	
	public AVisitor(List<Object> collector) {
		super();
		this.collector = collector;
	}

	public boolean visit(Object obj) {
		return false;
	}
}
