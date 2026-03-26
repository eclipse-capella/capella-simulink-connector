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
package org.eclipse.capella.simulink.m2m.capella.rule.function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.m2m.capella.rule.common.AbstractCapellaToPivotRule;
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
		pemises.add(createPrecedencePremise(element.getSourceFunctionOutputPort(), "source"));
		pemises.add(createPrecedencePremise(element.getTargetFunctionInputPort(), "target"));
		return pemises;
	}

	@Override
	protected Object doCreate(FunctionalExchange fe, IContext context) throws Exception {
		Collection<Object> selection = getSelection(context);
		if (selection.contains(fe.getSource()) && selection.contains(fe.getTarget())) {
			
			SLDiagram system = FunctionalExchangeHelper.getTargetDiagram(context, fe);
			if (system != null) {
				// if 2 functions linked by an FE are exported, 2 models are created and there is no overall system (to display the FE)
				Line line = FunctionalExchangeHelper.createLine(fe, system, context);
				system.getLines().add(line);
			}
		}
		return null;
	}

}
