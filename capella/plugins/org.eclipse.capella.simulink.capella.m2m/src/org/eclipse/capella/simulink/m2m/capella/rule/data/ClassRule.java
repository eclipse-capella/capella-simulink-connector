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
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.Property;
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
import org.eclipse.capella.simulink.m2m.capella.rule.data.helper.PredefinedTypesHelper;

public class ClassRule extends AbstractCapellaToPivotRule<org.polarsys.capella.core.data.information.Class> {

	@Override
	public boolean isApplicableOn(org.polarsys.capella.core.data.information.Class element) {
		return true;
	}
	
	@Override
	public List<IPremise> getPremises(org.polarsys.capella.core.data.information.Class element) {
		List<IPremise> pemises = new ArrayList<>();
		
		Consumer<? super Property> consumer = prop -> {
			if (prop.getType() != null)
				pemises.add(createPrecedencePremise(prop.getType(), prop.getType().getName()));
			};
		for (Generalization gen : element.getOwnedGeneralizations()) {
			GeneralizableElement super1 = gen.getSuper();
			if (super1 instanceof Classifier) {
				Classifier classifier = (Classifier)super1;
				classifier.getContainedProperties().forEach(consumer);
			}
		}
		element.getContainedProperties().forEach(consumer);
		pemises.add(createContainmentPremise(element.eContainer()));
		return pemises;
	}

	@Override
	protected Object create(org.polarsys.capella.core.data.information.Class element, IContext context) throws Exception {
		Bus bus = MLCoreFactory.eINSTANCE.createBus();
		bus.setName(DataNameHelper.getName(element));
		bus.setOriginatorId(element.getId());
		Object parent = ContextHelper.getMainTarget(context, element.eContainer());
		if (parent instanceof Dictionary) {
			((Dictionary) parent).getDatatypes().add(bus);
		}
		ContextHelper.createMainTarget(context, element, bus);
		createProperties(context, bus, element);
		return bus;
	}

	private void createProperties( IContext context, Bus bus, Classifier current) {
		current.getContainedProperties().forEach(p -> {
			BusElement busElement = MLCoreFactory.eINSTANCE.createBusElement();
			busElement.setName(p.getName());
			busElement.setOriginatorId(p.getId());
			
			Object type = ContextHelper.getMainTarget(context, p.getType());
			if (type == null && p.getType() != null)
				type = PredefinedTypesHelper.getType(context, p.getType().getName());
			if (type != null && type instanceof Datatype)
				busElement.setDatatype((Datatype) type);
			bus.getBusElements().add(busElement);
		});
		
		for (Generalization gen : current.getOwnedGeneralizations()) {
			GeneralizableElement super1 = gen.getSuper();
			if (super1 instanceof Classifier) {
				Classifier classifier = (Classifier)super1;
				createProperties(context, bus, classifier);
			}
		}
		
	}
}
