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
package org.eclipse.capella.simulink.m2m.capella.rule.sm;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
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
import org.eclipse.capella.simulink.m2m.capella.rule.function.helper.FunctionalExchangeHelper;

/**
 * 
 * @author 
 *
 */
public class FunctionalExchangeRule extends AbstractCapellaToPivotRule<FunctionalExchange> {

	@Override
	public boolean isApplicableOn(FunctionalExchange element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(FunctionalExchange element) {
		List<IPremise> pemises = new ArrayList<>();
		element.getExchangedItems().forEach(ei -> pemises.add(createPrecedencePremise(ei, "ei")));
		pemises.add(createPrecedencePremise(element.getSourceFunctionOutputPort().eContainer(), "source"));
		pemises.add(createPrecedencePremise(element.getTargetFunctionInputPort().eContainer(), "target"));
		return pemises;
	}

	@Override
	protected Object doCreate(FunctionalExchange fe, IContext context) throws Exception {
		Datatype bus = FunctionalExchangeHelper.createType(fe, context);
		ContextHelper.createMainTarget(context, fe, bus);
		return bus;
	}
}
