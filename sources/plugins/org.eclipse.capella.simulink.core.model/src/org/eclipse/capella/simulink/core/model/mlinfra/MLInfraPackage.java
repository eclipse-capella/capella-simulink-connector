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
package org.eclipse.capella.simulink.core.model.mlinfra;

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
 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory
 * @model kind="package"
 * @generated
 */
public interface MLInfraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mlinfra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/capella/simulink/infra/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.capella.simulink.infra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLInfraPackage eINSTANCE = org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ORIGINATOR_ID = 1;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getParameterizedElement()
	 * @generated
	 */
	int PARAMETERIZED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__ORIGINATOR_ID = IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__PARAMETERS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT__REFERENCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameterized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_ELEMENT_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl <em>Raw Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getRawElement()
	 * @generated
	 */
	int RAW_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__ID = PARAMETERIZED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__ORIGINATOR_ID = PARAMETERIZED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__PARAMETERS = PARAMETERIZED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__REFERENCE = PARAMETERIZED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__TYPE = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__CHILDREN = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__PARENT = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__CREATION_REQUIRED = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT__CREATION_PARAMETERS = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Raw Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT_FEATURE_COUNT = PARAMETERIZED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Raw Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_ELEMENT_OPERATION_COUNT = PARAMETERIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ValueImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ORIGINATOR_ID = IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.PrimitiveValueImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__ORIGINATOR_ID = VALUE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__SPECIFICATION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementReferenceImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getElementReference()
	 * @generated
	 */
	int ELEMENT_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__ORIGINATOR_ID = VALUE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE__ELEMENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterToValueEntryImpl <em>Parameter To Value Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterToValueEntryImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getParameterToValueEntry()
	 * @generated
	 */
	int PARAMETER_TO_VALUE_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY__ORIGINATOR_ID = IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY__KEY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY__VALUE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter To Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter To Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TO_VALUE_ENTRY_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl <em>Element Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getElementParameterReference()
	 * @generated
	 */
	int ELEMENT_PARAMETER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE__ORIGINATOR_ID = VALUE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE__PARAMETER = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARAMETER_REFERENCE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.MultipleValueImpl <em>Multiple Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MultipleValueImpl
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getMultipleValue()
	 * @generated
	 */
	int MULTIPLE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUE__ID = VALUE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUE__ORIGINATOR_ID = VALUE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement <em>Raw Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement
	 * @generated
	 */
	EClass getRawElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getType()
	 * @see #getRawElement()
	 * @generated
	 */
	EAttribute getRawElement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getChildren()
	 * @see #getRawElement()
	 * @generated
	 */
	EReference getRawElement_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getParent()
	 * @see #getRawElement()
	 * @generated
	 */
	EReference getRawElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#isCreationRequired <em>Creation Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Required</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#isCreationRequired()
	 * @see #getRawElement()
	 * @generated
	 */
	EAttribute getRawElement_CreationRequired();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getCreationParameters <em>Creation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creation Parameters</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.RawElement#getCreationParameters()
	 * @see #getRawElement()
	 * @generated
	 */
	EReference getRawElement_CreationParameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue#getSpecification()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_Specification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ElementReference
	 * @generated
	 */
	EClass getElementReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementReference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ElementReference#getElement()
	 * @see #getElementReference()
	 * @generated
	 */
	EReference getElementReference_Element();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Parameter To Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter To Value Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.eclipse.capella.simulink.core.model.mlinfra.Value" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getParameterToValueEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterToValueEntry()
	 * @generated
	 */
	EAttribute getParameterToValueEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterToValueEntry()
	 * @generated
	 */
	EReference getParameterToValueEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference <em>Element Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Parameter Reference</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference
	 * @generated
	 */
	EClass getElementParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getParameter()
	 * @see #getElementParameterReference()
	 * @generated
	 */
	EAttribute getElementParameterReference_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getElementReference <em>Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Reference</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference#getElementReference()
	 * @see #getElementParameterReference()
	 * @generated
	 */
	EReference getElementParameterReference_ElementReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue <em>Multiple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue
	 * @generated
	 */
	EClass getMultipleValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue#getValues()
	 * @see #getMultipleValue()
	 * @generated
	 */
	EReference getMultipleValue_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement <em>Parameterized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement
	 * @generated
	 */
	EClass getParameterizedElement();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getParameters()
	 * @see #getParameterizedElement()
	 * @generated
	 */
	EReference getParameterizedElement_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement#getReference()
	 * @see #getParameterizedElement()
	 * @generated
	 */
	EReference getParameterizedElement_Reference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getOriginatorId <em>Originator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originator Id</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement#getOriginatorId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_OriginatorId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MLInfraFactory getMLInfraFactory();

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
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl <em>Raw Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getRawElement()
		 * @generated
		 */
		EClass RAW_ELEMENT = eINSTANCE.getRawElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_ELEMENT__TYPE = eINSTANCE.getRawElement_Type();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_ELEMENT__CHILDREN = eINSTANCE.getRawElement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_ELEMENT__PARENT = eINSTANCE.getRawElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Creation Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_ELEMENT__CREATION_REQUIRED = eINSTANCE.getRawElement_CreationRequired();

		/**
		 * The meta object literal for the '<em><b>Creation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_ELEMENT__CREATION_PARAMETERS = eINSTANCE.getRawElement_CreationParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ValueImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.PrimitiveValueImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__SPECIFICATION = eINSTANCE.getPrimitiveValue_Specification();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementReferenceImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getElementReference()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE__ELEMENT = eINSTANCE.getElementReference_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterToValueEntryImpl <em>Parameter To Value Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterToValueEntryImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getParameterToValueEntry()
		 * @generated
		 */
		EClass PARAMETER_TO_VALUE_ENTRY = eINSTANCE.getParameterToValueEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TO_VALUE_ENTRY__KEY = eINSTANCE.getParameterToValueEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TO_VALUE_ENTRY__VALUE = eINSTANCE.getParameterToValueEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl <em>Element Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getElementParameterReference()
		 * @generated
		 */
		EClass ELEMENT_PARAMETER_REFERENCE = eINSTANCE.getElementParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getElementParameterReference_Parameter();

		/**
		 * The meta object literal for the '<em><b>Element Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE = eINSTANCE.getElementParameterReference_ElementReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.MultipleValueImpl <em>Multiple Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MultipleValueImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getMultipleValue()
		 * @generated
		 */
		EClass MULTIPLE_VALUE = eINSTANCE.getMultipleValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_VALUE__VALUES = eINSTANCE.getMultipleValue_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl <em>Parameterized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getParameterizedElement()
		 * @generated
		 */
		EClass PARAMETERIZED_ELEMENT = eINSTANCE.getParameterizedElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_ELEMENT__PARAMETERS = eINSTANCE.getParameterizedElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_ELEMENT__REFERENCE = eINSTANCE.getParameterizedElement_Reference();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlinfra.impl.MLInfraPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Originator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ORIGINATOR_ID = eINSTANCE.getIdentifiedElement_OriginatorId();

	}

} //MLInfraPackage
