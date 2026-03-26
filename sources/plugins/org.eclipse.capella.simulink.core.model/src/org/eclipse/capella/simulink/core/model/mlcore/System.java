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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.System#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.System#isIsLibrary <em>Is Library</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.System#getDictionary <em>Dictionary</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends SLDiagram {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystem_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.System#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Is Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Library</em>' attribute.
	 * @see #setIsLibrary(boolean)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystem_IsLibrary()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.System#isIsLibrary <em>Is Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Library</em>' attribute.
	 * @see #isIsLibrary()
	 * @generated
	 */
	void setIsLibrary(boolean value);

	/**
	 * Returns the value of the '<em><b>Dictionary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary</em>' reference.
	 * @see #setDictionary(Dictionary)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSystem_Dictionary()
	 * @model
	 * @generated
	 */
	Dictionary getDictionary();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.System#getDictionary <em>Dictionary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary</em>' reference.
	 * @see #getDictionary()
	 * @generated
	 */
	void setDictionary(Dictionary value);

} // System
