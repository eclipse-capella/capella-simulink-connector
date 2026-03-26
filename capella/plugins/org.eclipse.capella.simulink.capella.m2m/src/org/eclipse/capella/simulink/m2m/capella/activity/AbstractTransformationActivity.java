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
package org.eclipse.capella.simulink.m2m.capella.activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.polarsys.kitalpha.cadence.core.api.IActivity;
import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.kitalpha.cadence.core.api.parameter.DeclaredParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.ParameterError;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;

/**
 * @author 
 */
public abstract class AbstractTransformationActivity implements IActivity, ITransposerWorkflow{
	@Override
	public Collection<DeclaredParameter> getParameters() {
		return new ArrayList<DeclaredParameter>();
	}

	@Override
	public Map<String, ParameterError<?>> validateParameters(ActivityParameters valuedParameters_p) {
		return new HashMap<String, ParameterError<?>>();
	}
}
