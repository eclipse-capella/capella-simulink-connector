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

import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getCatalog_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getCatalog_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationOption> getOptions();

	/**
	 * <!-- begin-user-doc -->
	 * Provides the operation of a given kind.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Operation getOperation(String kind);

} // Catalog
