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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Project#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Project#getDictionaries <em>Dictionaries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getProject_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.capella.simulink.core.model.mlcore.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Dictionaries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionaries</em>' reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getProject_Dictionaries()
	 * @model
	 * @generated
	 */
	EList<Dictionary> getDictionaries();

} // Project
