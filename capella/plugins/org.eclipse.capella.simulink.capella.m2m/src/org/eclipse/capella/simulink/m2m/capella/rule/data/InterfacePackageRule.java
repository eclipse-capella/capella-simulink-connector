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
package org.eclipse.capella.simulink.m2m.capella.rule.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.m2m.capella.common.CapellaModelHelper;
import org.eclipse.capella.simulink.m2m.capella.common.IConstants;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DictionaryHelper;

/**
 * 
 * @author 
 *
 */
public class InterfacePackageRule extends AbstractCapellaToPivotRule<InterfacePkg> {

	@Override
	public boolean isApplicableOn(InterfacePkg interfacePkg) {
        return !interfacePkg.getOwnedExchangeItems().isEmpty();
	}
	
	@Override
	public List<IPremise> getPremises(InterfacePkg element) {
		List<IPremise> pemises = new ArrayList<>();
		return pemises;
	}

	@Override
	protected Object create(InterfacePkg element, IContext context) throws Exception {
		Dictionary dictionary = DictionaryHelper.createDictionary(context, element, element.getName());
		ContextHelper.createMainTarget(context, element, dictionary);
		return dictionary;
	}
}
