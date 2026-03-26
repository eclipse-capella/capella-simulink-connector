/*******************************************************************************
 * Copyright (c) 2020, 2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.transformation;


import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.util.MLCoreSwitch;
import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;
import org.eclipse.capella.simulink.transformation.utils.TraceabilityHelper;
import org.eclipse.capella.simulink.transformation.utils.NameHelper;

/**
 * 
 * @author 
 *
 */
public class AbstractGenerator extends MLCoreSwitch<String> {

	protected final StringBuilder sb;

	public static boolean isEmpty(String value) {
		return NameHelper.isEmpty(value);
	}

	protected void addModelerId(IdentifiedElement object, String fullName) {
		if (!TraceabilityHelper.hasTraceabilityId(object)) 
			return ;
		if (object instanceof Datatype || object instanceof BusElement)
			addStatement(fullName+".Description = '"+TraceabilityHelper.getTraceabilityId(object)+"';");
		else
			addStatement("set_param('"+fullName+"', 'Tag', '"+TraceabilityHelper.getTraceabilityId(object)+"');");
	}

	public void addStatement(String statement) {
		sb.append(statement).append("\n");
	}

	public String getScript() {
		return sb.toString();
	}



	public AbstractGenerator(StringBuilder sb) {
		super();
		this.sb = sb;
	}
	

}