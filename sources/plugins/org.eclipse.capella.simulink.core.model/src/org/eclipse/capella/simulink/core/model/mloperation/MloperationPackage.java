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

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationFactory
 * @model kind="package"
 * @generated
 */
public interface MloperationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mloperation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/capella/simulink/operation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.capella.simulink.operation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MloperationPackage eINSTANCE = org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.ConfigurationImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ORIGINATOR_ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PARAMETERS = MLInfraPackage.PARAMETERIZED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__REFERENCE = MLInfraPackage.PARAMETERIZED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PARENT = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ORIGINATOR_ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = MLInfraPackage.PARAMETERIZED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REFERENCE = MLInfraPackage.PARAMETERIZED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TARGETS = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__KIND = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MAIN_CONFIGURATION = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONFIGURATIONS = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.ObjectToConfigurationValueEntryImpl <em>Object To Configuration Value Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.ObjectToConfigurationValueEntryImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getObjectToConfigurationValueEntry()
	 * @generated
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY__ID = MLInfraPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY__ORIGINATOR_ID = MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY__KEY = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY__VALUE = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object To Configuration Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY_FEATURE_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object To Configuration Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TO_CONFIGURATION_VALUE_ENTRY_OPERATION_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mloperation.Configuration#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Configuration#getParent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Operation#getTargets()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Targets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Operation#getKind()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getMainConfiguration <em>Main Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Configuration</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Operation#getMainConfiguration()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_MainConfiguration();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.capella.simulink.core.model.mloperation.Operation#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Configurations</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.Operation#getConfigurations()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Configurations();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Object To Configuration Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object To Configuration Value Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject" keyRequired="true"
	 *        valueType="org.eclipse.capella.simulink.core.model.mloperation.Configuration" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getObjectToConfigurationValueEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getObjectToConfigurationValueEntry()
	 * @generated
	 */
	EReference getObjectToConfigurationValueEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getObjectToConfigurationValueEntry()
	 * @generated
	 */
	EReference getObjectToConfigurationValueEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MloperationFactory getMloperationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.ConfigurationImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PARENT = eINSTANCE.getConfiguration_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TARGETS = eINSTANCE.getOperation_Targets();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__KIND = eINSTANCE.getOperation_Kind();

		/**
		 * The meta object literal for the '<em><b>Main Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__MAIN_CONFIGURATION = eINSTANCE.getOperation_MainConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CONFIGURATIONS = eINSTANCE.getOperation_Configurations();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.impl.ObjectToConfigurationValueEntryImpl <em>Object To Configuration Value Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.ObjectToConfigurationValueEntryImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl#getObjectToConfigurationValueEntry()
		 * @generated
		 */
		EClass OBJECT_TO_CONFIGURATION_VALUE_ENTRY = eINSTANCE.getObjectToConfigurationValueEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TO_CONFIGURATION_VALUE_ENTRY__KEY = eINSTANCE.getObjectToConfigurationValueEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TO_CONFIGURATION_VALUE_ENTRY__VALUE = eINSTANCE.getObjectToConfigurationValueEntry_Value();

	}

} //MloperationPackage
