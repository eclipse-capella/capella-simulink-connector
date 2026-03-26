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
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getUnderlyingPort <em>Underlying Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSymbol()
 * @model abstract="true"
 * @generated
 */
public interface Symbol extends SFChartElement {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.capella.simulink.core.model.mlcore.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Scope
	 * @see #setScope(Scope)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSymbol_Scope()
	 * @model required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Underlying Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Port</em>' reference.
	 * @see #setUnderlyingPort(Port)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSymbol_UnderlyingPort()
	 * @model
	 * @generated
	 */
	Port getUnderlyingPort();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getUnderlyingPort <em>Underlying Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Port</em>' reference.
	 * @see #getUnderlyingPort()
	 * @generated
	 */
	void setUnderlyingPort(Port value);

} // Symbol
