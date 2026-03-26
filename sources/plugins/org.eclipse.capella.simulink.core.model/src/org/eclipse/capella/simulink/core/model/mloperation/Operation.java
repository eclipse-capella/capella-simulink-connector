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
package org.eclipse.capella.simulink.core.model.mloperation;

import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getMainConfiguration <em>Main Configuration</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends ParameterizedElement {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#getOperation_Targets()
	 * @model
	 * @generated
	 */
	EList<EObject> getTargets();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#getOperation_Kind()
	 * @model required="true"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Main Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Configuration</em>' reference.
	 * @see #setMainConfiguration(Configuration)
	 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#getOperation_MainConfiguration()
	 * @model
	 * @generated
	 */
	Configuration getMainConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getMainConfiguration <em>Main Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Configuration</em>' reference.
	 * @see #getMainConfiguration()
	 * @generated
	 */
	void setMainConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EObject},
	 * and the value is of type {@link org.eclipse.capella.simulink.core.model.mloperation.Configuration},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' map.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#getOperation_Configurations()
	 * @model mapType="org.eclipse.capella.simulink.core.model.mloperation.ObjectToConfigurationValueEntry&lt;org.eclipse.emf.ecore.EObject, org.eclipse.capella.simulink.core.model.mloperation.Configuration&gt;"
	 * @generated
	 */
	EMap<EObject, Configuration> getConfigurations();

} // Operation
