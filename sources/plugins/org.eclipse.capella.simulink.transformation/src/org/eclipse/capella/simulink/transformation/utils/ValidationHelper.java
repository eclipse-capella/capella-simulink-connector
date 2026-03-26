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
package org.eclipse.capella.simulink.transformation.utils;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

/**
 * 
 * @author 
 *
 */

public final class ValidationHelper extends Diagnostician {

	public String getObjectLabel(EObject eObject)
	  {
		  EClass eClass = eObject.eClass();
		  Object id = getValue(eObject, MLInfraPackage.eINSTANCE.getIdentifiedElement_Id());
		  Object name = getValue(eObject, MLCorePackage.eINSTANCE.getNamedElement_Name());
		  String result = eClass.getName();
		  if (name != null)
			  result += " ("+name+")";
		  if (id != null && !eObject.eIsProxy()) 
			  result += " ["+id+"]";
		  return result ;
	  }

	protected Object getValue(EObject obj, EAttribute feature) {
		EStructuralFeature eStructuralFeature = obj.eClass().getEStructuralFeature(feature.getName());
		if (eStructuralFeature == null)
			return null;
		return obj.eGet(eStructuralFeature);
	}

	public List<Diagnostic> processValidation(EObject elt) {
		Diagnostic validate = validate(elt);
		if (validate.getSeverity() == Diagnostic.ERROR)
			return validate.getChildren();
		return Collections.emptyList();
	}

}