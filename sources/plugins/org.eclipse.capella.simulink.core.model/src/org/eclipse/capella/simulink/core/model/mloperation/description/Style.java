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

import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getFontStyle <em>Font Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getStyle_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getStyle_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see #setFontStyle(int)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getStyle_FontStyle()
	 * @model required="true"
	 * @generated
	 */
	int getFontStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(int value);

} // Style
