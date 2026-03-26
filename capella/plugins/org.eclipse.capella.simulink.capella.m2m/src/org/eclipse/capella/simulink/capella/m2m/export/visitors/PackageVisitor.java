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

import java.util.List;

import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.InformationPackage;

/**
 * @author 
 *
 */
public class PackageVisitor extends AVisitor{

	public PackageVisitor(List<Object> collector) {
		super(collector);
	}

	@Override
	public boolean visit(Object obj) {
		if (InformationPackage.eINSTANCE.getDataPkg().isInstance(obj)) {
			DataPkg pkg = (DataPkg) obj;
			collector.addAll(pkg.getOwnedDataPkgs());
			collector.addAll(pkg.getOwnedClasses());
			collector.addAll(pkg.getOwnedDataTypes());
			collector.addAll(pkg.getOwnedExchangeItems());
			return true;
		}
		if (CsPackage.eINSTANCE.getInterfacePkg().isInstance(obj)) {
			InterfacePkg pkg = (InterfacePkg) obj;
			collector.addAll(pkg.getOwnedInterfacePkgs());
			collector.addAll(pkg.getOwnedInterfaces());
			return true;
		}
		return super.visit(obj);
	}

}
