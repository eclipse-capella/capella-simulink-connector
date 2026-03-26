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
package org.eclipse.capella.simulink.core.model.mloperation.description;

import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOperationkind <em>Operationkind</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getReadonlyOptions <em>Readonly Options</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Operationkind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationkind</em>' containment reference.
	 * @see #setOperationkind(OperationKind)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperation_Operationkind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationKind getOperationkind();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOperationkind <em>Operationkind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationkind</em>' containment reference.
	 * @see #getOperationkind()
	 * @generated
	 */
	void setOperationkind(OperationKind value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperation_Options()
	 * @model
	 * @generated
	 */
	EList<ConfigurationOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Readonly Options</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly Options</em>' reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperation_ReadonlyOptions()
	 * @model
	 * @generated
	 */
	EList<ConfigurationOption> getReadonlyOptions();

} // Operation
