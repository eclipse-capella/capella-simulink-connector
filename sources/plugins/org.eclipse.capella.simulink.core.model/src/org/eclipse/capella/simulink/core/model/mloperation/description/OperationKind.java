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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind#getImageURL <em>Image URL</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperationKind()
 * @model
 * @generated
 */
public interface OperationKind extends DescriptionElement {
	/**
	 * Returns the value of the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image URL</em>' attribute.
	 * @see #setImageURL(String)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getOperationKind_ImageURL()
	 * @model required="true"
	 * @generated
	 */
	String getImageURL();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind#getImageURL <em>Image URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image URL</em>' attribute.
	 * @see #getImageURL()
	 * @generated
	 */
	void setImageURL(String value);

} // OperationKind
