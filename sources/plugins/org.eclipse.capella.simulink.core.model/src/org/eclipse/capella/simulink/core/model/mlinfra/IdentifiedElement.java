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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getOriginatorId <em>Originator Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getIdentifiedElement()
 * @model abstract="true"
 * @generated
 */
public interface IdentifiedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getIdentifiedElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator Id</em>' attribute.
	 * @see #setOriginatorId(String)
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#getIdentifiedElement_OriginatorId()
	 * @model
	 * @generated
	 */
	String getOriginatorId();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getOriginatorId <em>Originator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator Id</em>' attribute.
	 * @see #getOriginatorId()
	 * @generated
	 */
	void setOriginatorId(String value);

} // IdentifiedElement
