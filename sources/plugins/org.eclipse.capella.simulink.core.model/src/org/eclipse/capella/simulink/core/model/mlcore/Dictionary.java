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
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getSubDictionaries <em>Sub Dictionaries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Datatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getDictionary_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datatype> getDatatypes();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getDictionary_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Dictionaries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Dictionaries</em>' reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getDictionary_SubDictionaries()
	 * @model
	 * @generated
	 */
	EList<Dictionary> getSubDictionaries();

} // Dictionary
