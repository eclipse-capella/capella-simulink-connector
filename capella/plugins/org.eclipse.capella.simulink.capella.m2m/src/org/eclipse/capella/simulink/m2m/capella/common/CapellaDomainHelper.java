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
package org.eclipse.capella.simulink.m2m.capella.common;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper;

/**
 * @author 
 */
public class CapellaDomainHelper extends EmfDomainHelper {
	
	@Override
	public boolean isHotSpot(Object object_p) {
		return object_p instanceof EObject;
	}
	
	@Override
	public Collection<Object> getAnalysisSources(Collection<?> selection_p) {
		return super.getAnalysisSources(selection_p);
	}

	@Override
	protected Set<EPackage> getEPackages() {
		Set<EPackage> eAllPackages = new LinkedHashSet<EPackage>();
		eAllPackages.addAll(super.getEPackages());
	    eAllPackages.add(CapellacommonPackage.eINSTANCE);	
	    return eAllPackages;
	}
	
	  /**
	   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper#getDomainMetaclass(java.lang.String)
	   */
	  @Override
	public Class<?> getDomainMetaclass(String name_p) {
	    try {
	      return Class.forName(name_p);
	    } catch (ClassNotFoundException e) {
	    	TransformationLogger.logError("No Domain Class called : " + name_p, e);
	    }
	    return null;
	  }
}
