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
package org.eclipse.capella.simulink.core.model.mloperation.description;

import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement#getDescriptionStyle <em>Description Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getDescriptionElement()
 * @model abstract="true"
 * @generated
 */
public interface DescriptionElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Style</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getDescriptionElement_DescriptionStyle()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getDescriptionStyle();

} // DescriptionElement
