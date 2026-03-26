/**
 * Copyright (c) 2020, 2026 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Thales - initial API and implementation
 * 
 */
package org.eclipse.capella.simulink.core.model.mlinfra;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getParameterizedElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterizedElement extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.capella.simulink.core.model.mlinfra.Value},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getParameterizedElement_Parameters()
	 * @model mapType="org.eclipse.capella.simulink.core.model.mlinfra.ParameterToValueEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.capella.simulink.core.model.mlinfra.Value&gt;"
	 * @generated
	 */
	EMap<String, Value> getParameters();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ElementReference)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getParameterizedElement_Reference()
	 * @model containment="true"
	 * @generated
	 */
	ElementReference getReference();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ElementReference value);

} // ParameterizedElement
