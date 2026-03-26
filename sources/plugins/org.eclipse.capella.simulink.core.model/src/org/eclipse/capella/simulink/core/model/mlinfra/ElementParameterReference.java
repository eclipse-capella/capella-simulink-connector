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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getElementReference <em>Element Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getElementParameterReference()
 * @model
 * @generated
 */
public interface ElementParameterReference extends Value {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getElementParameterReference_Parameter()
	 * @model required="true"
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Element Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Reference</em>' containment reference.
	 * @see #setElementReference(ElementReference)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getElementParameterReference_ElementReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementReference getElementReference();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getElementReference <em>Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Reference</em>' containment reference.
	 * @see #getElementReference()
	 * @generated
	 */
	void setElementReference(ElementReference value);

} // ElementParameterReference
