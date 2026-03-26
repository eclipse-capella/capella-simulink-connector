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
 * A representation of the model object '<em><b>System Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getReferencedPorts <em>Referenced Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystemReference()
 * @model
 * @generated
 */
public interface SystemReference extends Block {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(org.eclipse.capella.simulink.core.model.mlcore.System)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystemReference_System()
	 * @model
	 * @generated
	 */
	org.eclipse.capella.simulink.core.model.mlcore.System getSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(org.eclipse.capella.simulink.core.model.mlcore.System value);

	/**
	 * Returns the value of the '<em><b>Referenced Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Ports</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystemReference_ReferencedPorts()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Port> getReferencedPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model systemPortRequired="true"
	 * @generated
	 */
	Port getReferencedPort(Port systemPort);

} // SystemReference
