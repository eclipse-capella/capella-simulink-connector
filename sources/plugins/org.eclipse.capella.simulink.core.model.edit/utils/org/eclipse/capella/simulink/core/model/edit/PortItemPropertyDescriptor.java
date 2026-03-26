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
package org.eclipse.capella.simulink.core.model.edit;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.Port;

/**
 * @author 
 *
 */
public class PortItemPropertyDescriptor extends ItemPropertyDescriptor {
	public PortItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description, feature, true, false, true, null, null, null);
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		if ( !(object instanceof Line) ||  feature == null)
			return super.getChoiceOfValues(object);
		Line line = (Line)object;
		List<Port> collector = line.getDiagram().getBlocks().stream().flatMap(blk -> blk.getPorts().stream()).collect(Collectors.toList() );
		collector.addAll(line.getDiagram().getPorts());
		return collector;
	}

}
