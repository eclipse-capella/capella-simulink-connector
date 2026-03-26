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
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Literal;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.PredefinedTypesHelper;

/**
 * @author 
 *
 */
public class EnumerationRule extends AbstractCapellaToPivotRule<Enumeration> {

	@Override
	public boolean isApplicableOn(Enumeration element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(Enumeration element) {
		List<IPremise> pemises = new ArrayList<>();
		pemises.add(createContainmentPremise(element.eContainer()));
		return pemises;
	}

	@Override
	protected Object create(Enumeration element, IContext context) throws Exception {
		
		if (PredefinedTypesHelper.isManaged(element.getName())) {
			EObject eObject = PredefinedTypesHelper.getType(context, element.getName());
			ContextHelper.createMainTarget(context, element, eObject);
			return eObject;
		}
		org.eclipse.capella.simulink.core.model.mlcore.Enumeration custom = MLCoreFactory.eINSTANCE.createEnumeration();
		custom.setName(element.getName());
		custom.setOriginatorId(element.getId());
		Object parent = ContextHelper.getMainTarget(context, element.eContainer());
		if (parent instanceof Dictionary) {
			((Dictionary) parent).getDatatypes().add(custom);
		}
		element.getOwnedLiterals().forEach(lit -> {
			Literal literal = MLCoreFactory.eINSTANCE.createLiteral();
			literal.setName(lit.getName());
			literal.setOriginatorId(lit.getId());
			literal.setValue(custom.getLiterals().size());
			custom.getLiterals().add(literal);
		});
		ContextHelper.createMainTarget(context, element, custom);
		return custom;
	}
}
