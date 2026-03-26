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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.System;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;

public class SMInitializeTransformation extends GenericInitializeTransformation {

	@Override
	protected EObject createRootObject(IContext context, Resource pivotResource, SystemEngineering systemEngineering, Collection<CapellaElement> selection) {
		Project project = (Project)super.createRootObject(context, pivotResource, systemEngineering, selection);
		selection.forEach(element -> {
			if (element instanceof StateMachine) {
				StateMachine machine = (StateMachine) element;
				Type level = CapellaModelHelper.getElementLayer(machine);
				System system = MLCoreFactory.eINSTANCE.createSystem();
				system.setName(machine.getName());
				system.setOriginatorId(machine.getId());
				PropertyHelper.setLayer(system, level.name());
				project.getSystems().add(system);
				// using ID as key since machine object will be bound to a chart object
				ContextHelper.createMainTarget(context, machine.getId(), system);	
			}
		});

		return project;
	}

}
