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
import org.polarsys.capella.core.data.information.datatype.NumericType;
import org.polarsys.capella.core.data.information.datatype.NumericTypeKind;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.PropertyHelper;
import org.eclipse.capella.simulink.core.model.mlcore.CustomType;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.PredefinedTypesHelper;

public class NumericTypeRule extends AbstractCapellaToPivotRule<NumericType> {

	

	@Override
	public boolean isApplicableOn(NumericType element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(NumericType element) {
		List<IPremise> pemises = new ArrayList<>();
		pemises.add(createContainmentPremise(element.eContainer()));
		return pemises;
	}

	@Override
	protected Object create(NumericType element, IContext context) throws Exception {
		
		if (PredefinedTypesHelper.isManaged(element.getName())) {
			EObject eObject = PredefinedTypesHelper.getType(context, element.getName());
			ContextHelper.createMainTarget(context, element, eObject);
			return eObject;
		}
		CustomType custom = MLCoreFactory.eINSTANCE.createCustomType();
		custom.setName(element.getName());
		custom.setOriginatorId(element.getId());
		if (NumericTypeKind.FLOAT.equals(element.getKind()))
			PropertyHelper.setSimpleProperty(custom, "DataTypeMode", "Double");
		else if (NumericTypeKind.INTEGER.equals(element.getKind())) {
			PropertyHelper.setSimpleProperty(custom, "DataTypeMode", "Fixed-point: slope and bias scaling");
			PropertyHelper.setSimpleProperty(custom, "Bias", "0");
			PropertyHelper.setSimpleProperty(custom, "Signedness", "Signed");
			PropertyHelper.setSimpleProperty(custom, "WordLength", "64");
		}
		PropertyHelper.setSimpleProperty(custom, "IsAlias", "true");
		Object parent = ContextHelper.getMainTarget(context, element.eContainer());
		if (parent instanceof Dictionary) {
			((Dictionary) parent).getDatatypes().add(custom);
		}
		ContextHelper.createMainTarget(context, element, custom);
		return custom;
	}
}
