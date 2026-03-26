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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getAvailableValues <em>Available Values</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getConfigurationOption()
 * @model
 * @generated
 */
public interface ConfigurationOption extends DescriptionElement {
	/**
	 * Returns the value of the '<em><b>Available Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Values</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getConfigurationOption_AvailableValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabeledValue> getAvailableValues();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(LabeledValue)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#getConfigurationOption_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	LabeledValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(LabeledValue value);

} // ConfigurationOption
