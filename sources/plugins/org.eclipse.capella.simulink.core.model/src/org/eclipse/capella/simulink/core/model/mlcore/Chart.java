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
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends Block {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getChart_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.AState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getChart_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<AState> getStates();

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Symbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getChart_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getSymbols();

} // Chart
