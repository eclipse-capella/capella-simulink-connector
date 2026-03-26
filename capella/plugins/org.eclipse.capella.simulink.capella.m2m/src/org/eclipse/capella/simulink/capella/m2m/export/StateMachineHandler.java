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
package org.eclipse.capella.simulink.capella.m2m.export;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.data.capellacommon.StateMachine;

import org.eclipse.capella.simulink.capella.m2m.export.visitors.AVisitor;
import org.eclipse.capella.simulink.capella.m2m.export.visitors.StateMachineVisitor;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;

/**
 * @author 
 *
 */
public class StateMachineHandler extends ExportHandler {

	@Override
	public void configure() {
		this.purposeID = IConstants.TRANSFORMATION_CAPELLA_SM_TO_PIVOT_PURPOSE;
		this.mappingID = IConstants.TRANSFORMATION_CAPELLA_SM_TO_PIVOT_MAPPING;
		configuration.setPreAnalysisActivities(
				createWorkflowActivityParameter(IConstants.TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_SM_ACTIVITY_ID,
						IConstants.TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_COLLECT_GRAPHICAL_DATA_ID));
		configuration.setPostExecutionActivities(
				createWorkflowActivityParameter(IConstants.TRANSFORMATION_CAPELLA_TO_PIVOT_DICTIONARY_DEPENDENCY_ID,
						IConstants.TRANSFORMATION_CAPELLA_TO_PIVOT_POST_ACTIVITY_ID));
	}

	@Override
	public Class<?> getRelatedMetaClass() {
		return StateMachine.class;
	}

	@Override
	protected List<AVisitor> getVisitors(List<Object> collector) {
		return Arrays.asList(new AVisitor[] {new StateMachineVisitor(collector)});
	}

}
