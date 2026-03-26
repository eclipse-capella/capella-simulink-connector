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
package org.eclipse.capella.simulink.core.model.impl;

import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.impl.PortImpl;

/**
 * @author 
 *
 */
public class ReferencedPort extends PortImpl {

	private final Port sourcePort;

	public ReferencedPort(Port source) {
		this.sourcePort = source;
		setId("derived-"+source.getId());
	}

	@Override
	public Datatype getDatatype() {
		return sourcePort.getDatatype();
	}

	@Override
	public PortHolder getHolder() {
		return (PortHolder) eContainer();
	}

	@Override
	public PortKind getKind() {
		return sourcePort.getKind();
	}

	@Override
	public int getIndex() {
		return sourcePort.getIndex();
	}

	@Override
	public String getName() {
		return sourcePort.getName();
	}

	@Override
	public String getDescription() {
		return sourcePort.getDescription();
	}

	public Port getSourcePort() {
		return sourcePort;
	}

	public String getOriginatorId() {
		return sourcePort.getOriginatorId();
	}


}
