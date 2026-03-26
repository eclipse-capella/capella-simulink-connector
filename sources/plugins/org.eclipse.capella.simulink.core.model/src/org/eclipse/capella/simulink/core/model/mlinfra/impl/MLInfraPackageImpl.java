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
package org.eclipse.capella.simulink.core.model.mlinfra.impl;

import java.util.Map;

import org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference;
import org.eclipse.capella.simulink.core.model.mlinfra.ElementReference;
import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;
import org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mlinfra.RawElement;
import org.eclipse.capella.simulink.core.model.mlinfra.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MLInfraPackageImpl extends EPackageImpl implements MLInfraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToValueEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MLInfraPackageImpl() {
		super(eNS_URI, MLInfraFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MLInfraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MLInfraPackage init() {
		if (isInited) return (MLInfraPackage)EPackage.Registry.INSTANCE.getEPackage(MLInfraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMLInfraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MLInfraPackageImpl theMLInfraPackage = registeredMLInfraPackage instanceof MLInfraPackageImpl ? (MLInfraPackageImpl)registeredMLInfraPackage : new MLInfraPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMLInfraPackage.createPackageContents();

		// Initialize created meta-data
		theMLInfraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMLInfraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MLInfraPackage.eNS_URI, theMLInfraPackage);
		return theMLInfraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRawElement() {
		return rawElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRawElement_Type() {
		return (EAttribute)rawElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRawElement_Children() {
		return (EReference)rawElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRawElement_Parent() {
		return (EReference)rawElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRawElement_CreationRequired() {
		return (EAttribute)rawElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRawElement_CreationParameters() {
		return (EReference)rawElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveValue() {
		return primitiveValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveValue_Specification() {
		return (EAttribute)primitiveValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementReference() {
		return elementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementReference_Element() {
		return (EReference)elementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterToValueEntry() {
		return parameterToValueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterToValueEntry_Key() {
		return (EAttribute)parameterToValueEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterToValueEntry_Value() {
		return (EReference)parameterToValueEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementParameterReference() {
		return elementParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementParameterReference_Parameter() {
		return (EAttribute)elementParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementParameterReference_ElementReference() {
		return (EReference)elementParameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleValue() {
		return multipleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleValue_Values() {
		return (EReference)multipleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedElement() {
		return parameterizedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedElement_Parameters() {
		return (EReference)parameterizedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedElement_Reference() {
		return (EReference)parameterizedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedElement_OriginatorId() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLInfraFactory getMLInfraFactory() {
		return (MLInfraFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rawElementEClass = createEClass(RAW_ELEMENT);
		createEAttribute(rawElementEClass, RAW_ELEMENT__TYPE);
		createEReference(rawElementEClass, RAW_ELEMENT__CHILDREN);
		createEReference(rawElementEClass, RAW_ELEMENT__PARENT);
		createEAttribute(rawElementEClass, RAW_ELEMENT__CREATION_REQUIRED);
		createEReference(rawElementEClass, RAW_ELEMENT__CREATION_PARAMETERS);

		valueEClass = createEClass(VALUE);

		primitiveValueEClass = createEClass(PRIMITIVE_VALUE);
		createEAttribute(primitiveValueEClass, PRIMITIVE_VALUE__SPECIFICATION);

		elementReferenceEClass = createEClass(ELEMENT_REFERENCE);
		createEReference(elementReferenceEClass, ELEMENT_REFERENCE__ELEMENT);

		parameterToValueEntryEClass = createEClass(PARAMETER_TO_VALUE_ENTRY);
		createEAttribute(parameterToValueEntryEClass, PARAMETER_TO_VALUE_ENTRY__KEY);
		createEReference(parameterToValueEntryEClass, PARAMETER_TO_VALUE_ENTRY__VALUE);

		elementParameterReferenceEClass = createEClass(ELEMENT_PARAMETER_REFERENCE);
		createEAttribute(elementParameterReferenceEClass, ELEMENT_PARAMETER_REFERENCE__PARAMETER);
		createEReference(elementParameterReferenceEClass, ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE);

		multipleValueEClass = createEClass(MULTIPLE_VALUE);
		createEReference(multipleValueEClass, MULTIPLE_VALUE__VALUES);

		parameterizedElementEClass = createEClass(PARAMETERIZED_ELEMENT);
		createEReference(parameterizedElementEClass, PARAMETERIZED_ELEMENT__PARAMETERS);
		createEReference(parameterizedElementEClass, PARAMETERIZED_ELEMENT__REFERENCE);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ORIGINATOR_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rawElementEClass.getESuperTypes().add(this.getParameterizedElement());
		valueEClass.getESuperTypes().add(this.getIdentifiedElement());
		primitiveValueEClass.getESuperTypes().add(this.getValue());
		elementReferenceEClass.getESuperTypes().add(this.getValue());
		parameterToValueEntryEClass.getESuperTypes().add(this.getIdentifiedElement());
		elementParameterReferenceEClass.getESuperTypes().add(this.getValue());
		multipleValueEClass.getESuperTypes().add(this.getValue());
		parameterizedElementEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(rawElementEClass, RawElement.class, "RawElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, RawElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRawElement_Children(), this.getRawElement(), this.getRawElement_Parent(), "children", null, 0, -1, RawElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRawElement_Parent(), this.getRawElement(), this.getRawElement_Children(), "parent", null, 0, 1, RawElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRawElement_CreationRequired(), ecorePackage.getEBoolean(), "creationRequired", "true", 1, 1, RawElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRawElement_CreationParameters(), this.getValue(), null, "creationParameters", null, 0, -1, RawElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveValueEClass, PrimitiveValue.class, "PrimitiveValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveValue_Specification(), ecorePackage.getEString(), "specification", null, 1, 1, PrimitiveValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementReferenceEClass, ElementReference.class, "ElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementReference_Element(), this.getParameterizedElement(), null, "element", null, 1, 1, ElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterToValueEntryEClass, Map.Entry.class, "ParameterToValueEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterToValueEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterToValueEntry_Value(), this.getValue(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementParameterReferenceEClass, ElementParameterReference.class, "ElementParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementParameterReference_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1, ElementParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementParameterReference_ElementReference(), this.getElementReference(), null, "elementReference", null, 1, 1, ElementParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleValueEClass, MultipleValue.class, "MultipleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleValue_Values(), this.getValue(), null, "values", null, 0, -1, MultipleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedElementEClass, ParameterizedElement.class, "ParameterizedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedElement_Parameters(), this.getParameterToValueEntry(), null, "parameters", null, 0, -1, ParameterizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedElement_Reference(), this.getElementReference(), null, "reference", null, 0, 1, ParameterizedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_OriginatorId(), ecorePackage.getEString(), "originatorId", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MLInfraPackageImpl
