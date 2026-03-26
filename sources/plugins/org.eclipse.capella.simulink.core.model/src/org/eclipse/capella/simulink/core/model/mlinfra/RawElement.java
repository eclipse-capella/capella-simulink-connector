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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#isCreationRequired <em>Creation Required</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getCreationParameters <em>Creation Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement()
 * @model
 * @generated
 */
public interface RawElement extends ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement_Children()
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RawElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(RawElement)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement_Parent()
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	RawElement getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RawElement value);

	/**
	 * Returns the value of the '<em><b>Creation Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Required</em>' attribute.
	 * @see #setCreationRequired(boolean)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement_CreationRequired()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCreationRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#isCreationRequired <em>Creation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Required</em>' attribute.
	 * @see #isCreationRequired()
	 * @generated
	 */
	void setCreationRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlinfra.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Parameters</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getRawElement_CreationParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getCreationParameters();

} // RawElement
