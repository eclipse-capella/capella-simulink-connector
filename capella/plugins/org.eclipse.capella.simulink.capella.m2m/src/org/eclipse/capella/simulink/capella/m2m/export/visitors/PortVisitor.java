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

import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;

/**
 * @author 
 *
 */
public class PortVisitor extends AVisitor{

	public PortVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
        if (obj instanceof FunctionInputPort) {
            FunctionInputPort functionPort = (FunctionInputPort) obj;
            collector.addAll(functionPort.getIncomingFunctionalExchanges());
            return true;
        } 
        if (obj instanceof FunctionOutputPort) {
            FunctionOutputPort functionPort = (FunctionOutputPort) obj;
            collector.addAll(functionPort.getOutgoingFunctionalExchanges());
            return true;
        }
		return super.visit(obj);
	}

}
