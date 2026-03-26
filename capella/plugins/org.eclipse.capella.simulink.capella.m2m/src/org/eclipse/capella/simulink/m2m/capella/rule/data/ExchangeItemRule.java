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

import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;

import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.DataNameHelper;

public class ExchangeItemRule extends AbstractCapellaToPivotRule<ExchangeItem> {

	@Override
	public boolean isApplicableOn(ExchangeItem element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(ExchangeItem element) {
		List<IPremise> premises = new ArrayList<>();
		premises.add(createContainmentPremise(element.eContainer()));
		element.getOwnedElements().forEach(eie -> {
			if (eie.getType() != null)
				premises.add(createPrecedencePremise(eie.getType(), "eie"));
		});
		return premises;
	}

	@Override
	protected Object create(ExchangeItem element, IContext context) throws Exception {
		Bus bus = MLCoreFactory.eINSTANCE.createBus();
		bus.setName(DataNameHelper.getName(element));
		bus.setOriginatorId(element.getId());
		Object parent = ContextHelper.getMainTarget(context, element.eContainer());
		if (parent instanceof Dictionary) {
			((Dictionary) parent).getDatatypes().add(bus);
		}
		createElements(element, bus, context);
		ContextHelper.createMainTarget(context, element, bus);
		return bus;
	}

	private void createElements(ExchangeItem element, Bus bus, IContext context) {
		element.getOwnedElements().forEach(eie -> {
			BusElement busElement = MLCoreFactory.eINSTANCE.createBusElement();
			busElement.setName(eie.getName());
			busElement.setOriginatorId(eie.getId());
			if (eie.getType() != null) {
				Datatype type = (Datatype)ContextHelper.getMainTarget(context, eie.getType());
				busElement.setDatatype(type);
			}
			bus.getBusElements().add(busElement);
			
		});
		
	}
}
