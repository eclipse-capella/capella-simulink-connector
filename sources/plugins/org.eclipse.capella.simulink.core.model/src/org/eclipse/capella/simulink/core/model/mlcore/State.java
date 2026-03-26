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
package org.eclipse.capella.simulink.core.model.mlcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.State#getDuring <em>During</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.State#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.State#getSubStates <em>Sub States</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState()
 * @model
 * @generated
 */
public interface State extends AState {
	/**
	 * Returns the value of the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' attribute.
	 * @see #setExit(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState_Exit()
	 * @model
	 * @generated
	 */
	String getExit();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getExit <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' attribute.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(String value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' attribute.
	 * @see #setEntry(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState_Entry()
	 * @model
	 * @generated
	 */
	String getEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getEntry <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' attribute.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During</em>' attribute.
	 * @see #setDuring(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState_During()
	 * @model
	 * @generated
	 */
	String getDuring();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getDuring <em>During</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' attribute.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.capella.simulink.core.model.mlcore.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DecompositionType
	 * @see #setType(DecompositionType)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState_Type()
	 * @model required="true"
	 * @generated
	 */
	DecompositionType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DecompositionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecompositionType value);

	/**
	 * Returns the value of the '<em><b>Sub States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.AState}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.AState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub States</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getState_SubStates()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.AState#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AState> getSubStates();

} // State
