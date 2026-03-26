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

import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.information.datatype.PhysicalQuantity;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.Signal;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;

/**
 * 
 * @author 
 *
 */
public class PhysicalQuantityRule extends AbstractCapellaToPivotRule<PhysicalQuantity> {

	

	@Override
	public boolean isApplicableOn(PhysicalQuantity element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(PhysicalQuantity element) {
		List<IPremise> pemises = new ArrayList<>();
		pemises.add(createContainmentPremise(element.eContainer()));
		element.getSuper().forEach(elt -> pemises.add(createPrecedencePremise(elt, "parent element")));
		return pemises;
	}

	@Override
	protected Object create(PhysicalQuantity element, IContext context) throws Exception {
		
		Signal custom = MLCoreFactory.eINSTANCE.createSignal();
		custom.setName(element.getName());
		custom.setOriginatorId(element.getId());
		if (element.getUnit() != null)
			custom.setUnit(element.getUnit().getName());
		if (element.getDefaultValue() instanceof LiteralNumericValue)
			custom.setInitialValue(((LiteralNumericValue)element.getDefaultValue()).getValue());
		if (!element.getSuper().isEmpty()) {
			GeneralizableElement generalizableElement = element.getSuper().get(0);
			Object datatype = ContextHelper.getMainTarget(context, generalizableElement);
			if (datatype instanceof Datatype)
				custom.setDatatype((Datatype) datatype);
		}
		Object parent = ContextHelper.getMainTarget(context, element.eContainer());
		if (parent instanceof Dictionary) {
			((Dictionary) parent).getDatatypes().add(custom);
		}
		ContextHelper.createMainTarget(context, element, custom);
		return custom;
	}
}
