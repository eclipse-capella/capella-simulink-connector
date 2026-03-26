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

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface DescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "description";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/capella/simulink/operation/description/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.capella.simulink.operation.description";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DescriptionPackage eINSTANCE = org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getDescriptionElement()
	 * @generated
	 */
	int DESCRIPTION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__ID = MLCorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__ORIGINATOR_ID = MLCorePackage.NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__PARAMETERS = MLCorePackage.NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__REFERENCE = MLCorePackage.NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__NAME = MLCorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__DESCRIPTION = MLCorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT__DESCRIPTION_STYLE = MLCorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT_FEATURE_COUNT = MLCorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ELEMENT_OPERATION_COUNT = MLCorePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.ConfigurationOptionImpl <em>Configuration Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.ConfigurationOptionImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getConfigurationOption()
	 * @generated
	 */
	int CONFIGURATION_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__ID = DESCRIPTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__ORIGINATOR_ID = DESCRIPTION_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__PARAMETERS = DESCRIPTION_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__REFERENCE = DESCRIPTION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__NAME = DESCRIPTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__DESCRIPTION = DESCRIPTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__DESCRIPTION_STYLE = DESCRIPTION_ELEMENT__DESCRIPTION_STYLE;

	/**
	 * The feature id for the '<em><b>Available Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__AVAILABLE_VALUES = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION__DEFAULT_VALUE = DESCRIPTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPTION_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

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
	 * The feature id for the '<em><b>Operationkind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONKIND = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPTIONS = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Readonly Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__READONLY_OPTIONS = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationKindImpl <em>Operation Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationKindImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__ID = DESCRIPTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__ORIGINATOR_ID = DESCRIPTION_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__PARAMETERS = DESCRIPTION_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__REFERENCE = DESCRIPTION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__NAME = DESCRIPTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__DESCRIPTION = DESCRIPTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description Style</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__DESCRIPTION_STYLE = DESCRIPTION_ELEMENT__DESCRIPTION_STYLE;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND__IMAGE_URL = DESCRIPTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND_FEATURE_COUNT = DESCRIPTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_KIND_OPERATION_COUNT = DESCRIPTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ID = MLInfraPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__ORIGINATOR_ID = MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__OPERATIONS = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__OPTIONS = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_OPERATION__STRING = MLInfraPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.LabeledValueImpl <em>Labeled Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.LabeledValueImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getLabeledValue()
	 * @generated
	 */
	int LABELED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE__ID = MLInfraPackage.VALUE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE__ORIGINATOR_ID = MLInfraPackage.VALUE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE__NAME = MLInfraPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE__VALUE = MLInfraPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE_FEATURE_COUNT = MLInfraPackage.VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labeled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_VALUE_OPERATION_COUNT = MLInfraPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.StyleImpl
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = MLInfraPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ORIGINATOR_ID = MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__START = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__LENGTH = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__FONT_STYLE = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption <em>Configuration Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Option</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption
	 * @generated
	 */
	EClass getConfigurationOption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getAvailableValues <em>Available Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Values</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getAvailableValues()
	 * @see #getConfigurationOption()
	 * @generated
	 */
	EReference getConfigurationOption_AvailableValues();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption#getDefaultValue()
	 * @see #getConfigurationOption()
	 * @generated
	 */
	EReference getConfigurationOption_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement
	 * @generated
	 */
	EClass getDescriptionElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement#getDescriptionStyle <em>Description Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description Style</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement#getDescriptionStyle()
	 * @see #getDescriptionElement()
	 * @generated
	 */
	EReference getDescriptionElement_DescriptionStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOperationkind <em>Operationkind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operationkind</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOperationkind()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationkind();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getOptions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Options();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getReadonlyOptions <em>Readonly Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readonly Options</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Operation#getReadonlyOptions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReadonlyOptions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Kind</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind
	 * @generated
	 */
	EClass getOperationKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind#getImageURL <em>Image URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image URL</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind#getImageURL()
	 * @see #getOperationKind()
	 * @generated
	 */
	EAttribute getOperationKind_ImageURL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOperations()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOptions()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Options();

	/**
	 * Returns the meta object for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOperation(java.lang.String) <em>Get Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation</em>' operation.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Catalog#getOperation(java.lang.String)
	 * @generated
	 */
	EOperation getCatalog__GetOperation__String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue <em>Labeled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue
	 * @generated
	 */
	EClass getLabeledValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue#getName()
	 * @see #getLabeledValue()
	 * @generated
	 */
	EAttribute getLabeledValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue#getValue()
	 * @see #getLabeledValue()
	 * @generated
	 */
	EAttribute getLabeledValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Style#getStart()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Style#getLength()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mloperation.description.Style#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.Style#getFontStyle()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_FontStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DescriptionFactory getDescriptionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.ConfigurationOptionImpl <em>Configuration Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.ConfigurationOptionImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getConfigurationOption()
		 * @generated
		 */
		EClass CONFIGURATION_OPTION = eINSTANCE.getConfigurationOption();

		/**
		 * The meta object literal for the '<em><b>Available Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_OPTION__AVAILABLE_VALUES = eINSTANCE.getConfigurationOption_AvailableValues();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_OPTION__DEFAULT_VALUE = eINSTANCE.getConfigurationOption_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getDescriptionElement()
		 * @generated
		 */
		EClass DESCRIPTION_ELEMENT = eINSTANCE.getDescriptionElement();

		/**
		 * The meta object literal for the '<em><b>Description Style</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION_ELEMENT__DESCRIPTION_STYLE = eINSTANCE.getDescriptionElement_DescriptionStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operationkind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATIONKIND = eINSTANCE.getOperation_Operationkind();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPTIONS = eINSTANCE.getOperation_Options();

		/**
		 * The meta object literal for the '<em><b>Readonly Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__READONLY_OPTIONS = eINSTANCE.getOperation_ReadonlyOptions();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationKindImpl <em>Operation Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationKindImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getOperationKind()
		 * @generated
		 */
		EClass OPERATION_KIND = eINSTANCE.getOperationKind();

		/**
		 * The meta object literal for the '<em><b>Image URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_KIND__IMAGE_URL = eINSTANCE.getOperationKind_ImageURL();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__OPERATIONS = eINSTANCE.getCatalog_Operations();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__OPTIONS = eINSTANCE.getCatalog_Options();

		/**
		 * The meta object literal for the '<em><b>Get Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOG___GET_OPERATION__STRING = eINSTANCE.getCatalog__GetOperation__String();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.LabeledValueImpl <em>Labeled Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.LabeledValueImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getLabeledValue()
		 * @generated
		 */
		EClass LABELED_VALUE = eINSTANCE.getLabeledValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_VALUE__NAME = eINSTANCE.getLabeledValue_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_VALUE__VALUE = eINSTANCE.getLabeledValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.StyleImpl
		 * @see org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__START = eINSTANCE.getStyle_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__LENGTH = eINSTANCE.getStyle_Length();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__FONT_STYLE = eINSTANCE.getStyle_FontStyle();

	}

} //DescriptionPackage
