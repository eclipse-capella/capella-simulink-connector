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
package org.eclipse.capella.simulink.m2m.capella.rule.data.helper;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.information.ExchangeItem;

public class DataNameHelper {
	
	static final String NAME__BUS_CATEGORY_PREFIX = "busCat_"; //$NON-NLS-1$
	static final String NAME__BUS_FUNCTIONAL_EXCHANGE_PREFIX = "busFE_"; //$NON-NLS-1$
	static final String NAME__BUS_EI_PREFIX = "busEI_"; //$NON-NLS-1$
	static final String NAME__BUS_CLASS_PREFIX = "busClass_"; //$NON-NLS-1$
	
	public static String getName(NamedElement element) {
//		if (element instanceof Categoty) {
//			return caseCAT(element);
//		}
		if (element instanceof FunctionalExchange) {
			return caseFunctionalExchange(element);
		}
		if (element instanceof ExchangeItem) {
			return caseExchangeItem(element);
		}
		if (element instanceof org.polarsys.capella.core.data.information.Class) {
			return caseClass(element);
		}
		return element.getName();
	}

//	private static String caseCAT(CAT element) {
//		return NAME__BUS_CATEGORY_PREFIX + element.getName();
//	}
	
	private static String caseFunctionalExchange(NamedElement element) {
		return NAME__BUS_FUNCTIONAL_EXCHANGE_PREFIX + element.getName();
	}
	
	private static String caseExchangeItem(NamedElement element) {
		return NAME__BUS_EI_PREFIX + element.getName();
	}
	
	private static String caseClass(NamedElement element) {
		return NAME__BUS_CLASS_PREFIX + element.getName();
	}
}
