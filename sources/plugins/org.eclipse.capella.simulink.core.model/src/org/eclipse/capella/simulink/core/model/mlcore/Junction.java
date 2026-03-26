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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Junction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getJunction()
 * @model
 * @generated
 */
public interface Junction extends AState {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"CONNECTIVE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.capella.simulink.core.model.mlcore.JunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.JunctionType
	 * @see #setType(JunctionType)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getJunction_Type()
	 * @model default="CONNECTIVE" required="true"
	 * @generated
	 */
	JunctionType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Junction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.JunctionType
	 * @see #getType()
	 * @generated
	 */
	void setType(JunctionType value);

} // Junction
