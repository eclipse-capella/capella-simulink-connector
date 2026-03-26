/*******************************************************************************
 * Copyright (c) 2022-2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.capella.m2m.export.visitors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.semantic.queries.basic.queries.Component_parentComponent;
import org.polarsys.capella.core.semantic.queries.basic.queries.FunctionalChain_enactedComponents;

/**
 * @author 
 *
 */
public class FunctionalChainVisitor extends AVisitor{

	public FunctionalChainVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
		if (obj instanceof FunctionalChain) {
			FunctionalChain fc = (FunctionalChain)obj;
            addInvolvedComponents(obj);
            collector.addAll(fc.getInvolvedFunctions());
            collector.addAll(fc.getInvolvedFunctionalExchanges());
			return true;
		}
		return super.visit(obj);
	}

	private void addInvolvedComponents(Object obj) {
		// First navigate from the Functional Chain to its involved components.
		IQuery involvedComponentsQuery = new FunctionalChain_enactedComponents();
		List<Component> directlyInvolvedComponents = involvedComponentsQuery.compute(obj).stream().filter(Component.class::isInstance).map(Component.class::cast)
		        .collect(Collectors.toList());

		// Now we want to recursively navigate to the parent components of our components.
		Set<Component> allInvolvedComponents = new HashSet<>(directlyInvolvedComponents);
		List<Component> componentsWhoseParentsToRetrieve = new ArrayList<>(directlyInvolvedComponents);
		while (!componentsWhoseParentsToRetrieve.isEmpty()) {
		    List<Component> componentsWhoseParentsWereRetrieved = new ArrayList<>();
		    List<Component> parentComponents = new ArrayList<>();
		    for (Component componentWhoseParentsToRetrieve : componentsWhoseParentsToRetrieve) {
		        IQuery parentComponentsQuery = new Component_parentComponent();
		        List<Component> parentComponentsOfCurrentComponent = parentComponentsQuery.compute(componentWhoseParentsToRetrieve).stream().filter(Component.class::isInstance)
		                .map(Component.class::cast).collect(Collectors.toList());
		        parentComponents.addAll(parentComponentsOfCurrentComponent);
		        componentsWhoseParentsWereRetrieved.add(componentWhoseParentsToRetrieve);
		    }
		    componentsWhoseParentsToRetrieve.addAll(parentComponents);
		    componentsWhoseParentsToRetrieve.removeAll(componentsWhoseParentsWereRetrieved);
		    allInvolvedComponents.addAll(parentComponents);
		}
		collector.addAll(allInvolvedComponents.stream().sorted(Comparator.comparing(Component::getName)).collect(Collectors.toList()));
	}

}
