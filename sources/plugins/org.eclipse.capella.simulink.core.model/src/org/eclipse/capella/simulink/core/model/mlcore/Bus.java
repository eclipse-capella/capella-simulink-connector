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
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Bus#getBusElements <em>Bus Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends Datatype {
	/**
	 * Returns the value of the '<em><b>Bus Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.BusElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Elements</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getBus_BusElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusElement> getBusElements();

} // Bus
