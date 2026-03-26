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
 * A representation of the model object '<em><b>Port Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPortHolder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PortHolder extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Port}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPortHolder_Ports()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder
	 * @model opposite="holder" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // PortHolder
