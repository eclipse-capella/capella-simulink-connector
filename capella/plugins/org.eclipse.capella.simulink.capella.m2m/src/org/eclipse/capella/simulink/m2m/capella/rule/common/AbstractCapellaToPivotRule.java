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
package org.eclipse.capella.simulink.m2m.capella.rule.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.transposer.api.ITransposerWorkflow;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.rule.AbstractTransformationRule;


public abstract class AbstractCapellaToPivotRule <T extends EObject> extends AbstractTransformationRule<T>{

	protected static final String ROOT_SYSTEM_FOR_SUBSYSTEMFUNCTION = "root.system.for.sub.system.function";
	
	@Override
	public List<IPremise> getPremises(T element) {
		return new ArrayList<>();
	}
	
	public List<IPremise> getPremises(T element, IContext context) {
		return getPremises(element);
	}
	
	@Override
	protected void update(Object object_p, T element, IContext context) throws Exception {
	}

	@Override
	protected Object create(T element, IContext context) throws Exception {
		Collection<Object> selection = getSelection(context);
		if (selection.contains(element))
			return doCreate(element, context);
		return null;
	}

	protected Object doCreate(T element, IContext context) throws Exception {
		return null;
	}
	
	protected List<Object> getSelection(IContext context) {
		return (List<Object>)context.get(ITransposerWorkflow.TRANSPOSER_SELECTION);
	}
	
}
