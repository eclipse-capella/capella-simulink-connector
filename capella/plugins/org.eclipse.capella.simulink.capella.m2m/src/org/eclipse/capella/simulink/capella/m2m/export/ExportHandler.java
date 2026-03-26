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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.core.api.parameter.WorkflowActivityParameter;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;

import org.eclipse.capella.simulink.capella.m2m.export.visitors.AVisitor;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.transposer.VerboseTransposerLauncher;


/**
 * @author 
 *
 */
public abstract class ExportHandler {
	
	protected final TransposerConfiguration configuration = new TransposerConfiguration();
	protected String mappingID;
	protected String purposeID;

	public abstract Class<?> getRelatedMetaClass();

	protected abstract void configure();
	protected abstract List<AVisitor> getVisitors(List<Object> collector);
	
	public void transform(Operation operation, List<Object> selection, IProgressMonitor progressMonitor) throws Exception {
		configure();
		WorkflowActivityParameter waParam = configuration.getPreAnalysisActivities();
		for (String key : waParam.getActivitiesID())
			waParam.addParameter(key, new GenericParameter<Operation>(IConstants.CURRENT_OPERATION, operation, "description"));

		VerboseTransposerLauncher.launch(selection, this.purposeID, this.mappingID, configuration, progressMonitor);
	}

	protected final WorkflowActivityParameter createWorkflowActivityParameter(String... activitiesIDs) {
		WorkflowActivityParameter waParameter = new WorkflowActivityParameter();
		for (String id : activitiesIDs) {
            waParameter.addActivity(id);
		}
		return waParameter;
	}
	
	public List<Object> computeScope(List<EObject> input) {
			
		List<Object> collector = new UniqueEList<>(input);
		Set<Object> visited = new HashSet<>();
		List<AVisitor> visitors = getVisitors(collector);
		for (int n = 0; n < collector.size(); n++) {
			Object obj = collector.get(n);
			if (visited.contains(obj))
				continue;
			visitors.forEach(v -> v.visit(obj));
			visited.add(obj);
		}
		return collector;
	}
	
}
