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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends SLDiagramElement, DatatypeHolder {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' container reference.
	 * @see #setHolder(PortHolder)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPort_Holder()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortHolder#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	PortHolder getHolder();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder <em>Holder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' container reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(PortHolder value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.capella.simulink.core.model.mlcore.PortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortKind
	 * @see #setKind(PortKind)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	PortKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PortKind value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPort_Index()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // Port
