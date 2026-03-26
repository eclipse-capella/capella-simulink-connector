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
package org.eclipse.capella.simulink.core.model.mloperation.description.impl;

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage;

import org.eclipse.capella.simulink.core.model.mloperation.description.Catalog;
import org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionFactory;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage;
import org.eclipse.capella.simulink.core.model.mloperation.description.LabeledValue;
import org.eclipse.capella.simulink.core.model.mloperation.description.Operation;
import org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind;
import org.eclipse.capella.simulink.core.model.mloperation.description.Style;

import org.eclipse.capella.simulink.core.model.mloperation.impl.MloperationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionPackageImpl extends EPackageImpl implements DescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

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
	 * @see org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DescriptionPackageImpl() {
		super(eNS_URI, DescriptionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DescriptionPackage init() {
		if (isInited) return (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DescriptionPackageImpl theDescriptionPackage = registeredDescriptionPackage instanceof DescriptionPackageImpl ? (DescriptionPackageImpl)registeredDescriptionPackage : new DescriptionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MLCorePackage.eINSTANCE.eClass();
		MLInfraPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MloperationPackage.eNS_URI);
		MloperationPackageImpl theMloperationPackage = (MloperationPackageImpl)(registeredPackage instanceof MloperationPackageImpl ? registeredPackage : MloperationPackage.eINSTANCE);

		// Create package meta-data objects
		theDescriptionPackage.createPackageContents();
		theMloperationPackage.createPackageContents();

		// Initialize created meta-data
		theDescriptionPackage.initializePackageContents();
		theMloperationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DescriptionPackage.eNS_URI, theDescriptionPackage);
		return theDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOption() {
		return configurationOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOption_AvailableValues() {
		return (EReference)configurationOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOption_DefaultValue() {
		return (EReference)configurationOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionElement() {
		return descriptionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDescriptionElement_DescriptionStyle() {
		return (EReference)descriptionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Operationkind() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Options() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_ReadonlyOptions() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationKind() {
		return operationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationKind_ImageURL() {
		return (EAttribute)operationKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Operations() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Options() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCatalog__GetOperation__String() {
		return catalogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledValue() {
		return labeledValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabeledValue_Name() {
		return (EAttribute)labeledValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabeledValue_Value() {
		return (EAttribute)labeledValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Start() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Length() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_FontStyle() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionFactory getDescriptionFactory() {
		return (DescriptionFactory)getEFactoryInstance();
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
		configurationOptionEClass = createEClass(CONFIGURATION_OPTION);
		createEReference(configurationOptionEClass, CONFIGURATION_OPTION__AVAILABLE_VALUES);
		createEReference(configurationOptionEClass, CONFIGURATION_OPTION__DEFAULT_VALUE);

		descriptionElementEClass = createEClass(DESCRIPTION_ELEMENT);
		createEReference(descriptionElementEClass, DESCRIPTION_ELEMENT__DESCRIPTION_STYLE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__OPERATIONKIND);
		createEReference(operationEClass, OPERATION__OPTIONS);
		createEReference(operationEClass, OPERATION__READONLY_OPTIONS);

		operationKindEClass = createEClass(OPERATION_KIND);
		createEAttribute(operationKindEClass, OPERATION_KIND__IMAGE_URL);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__OPERATIONS);
		createEReference(catalogEClass, CATALOG__OPTIONS);
		createEOperation(catalogEClass, CATALOG___GET_OPERATION__STRING);

		labeledValueEClass = createEClass(LABELED_VALUE);
		createEAttribute(labeledValueEClass, LABELED_VALUE__NAME);
		createEAttribute(labeledValueEClass, LABELED_VALUE__VALUE);

		styleEClass = createEClass(STYLE);
		createEAttribute(styleEClass, STYLE__START);
		createEAttribute(styleEClass, STYLE__LENGTH);
		createEAttribute(styleEClass, STYLE__FONT_STYLE);
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

		// Obtain other dependent packages
		MLCorePackage theMLCorePackage = (MLCorePackage)EPackage.Registry.INSTANCE.getEPackage(MLCorePackage.eNS_URI);
		MLInfraPackage theMLInfraPackage = (MLInfraPackage)EPackage.Registry.INSTANCE.getEPackage(MLInfraPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationOptionEClass.getESuperTypes().add(this.getDescriptionElement());
		descriptionElementEClass.getESuperTypes().add(theMLCorePackage.getNamedElement());
		operationEClass.getESuperTypes().add(theMLInfraPackage.getParameterizedElement());
		operationKindEClass.getESuperTypes().add(this.getDescriptionElement());
		catalogEClass.getESuperTypes().add(theMLInfraPackage.getIdentifiedElement());
		labeledValueEClass.getESuperTypes().add(theMLInfraPackage.getValue());
		styleEClass.getESuperTypes().add(theMLInfraPackage.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationOptionEClass, ConfigurationOption.class, "ConfigurationOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationOption_AvailableValues(), this.getLabeledValue(), null, "availableValues", null, 0, -1, ConfigurationOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationOption_DefaultValue(), this.getLabeledValue(), null, "defaultValue", null, 1, 1, ConfigurationOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionElementEClass, DescriptionElement.class, "DescriptionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptionElement_DescriptionStyle(), this.getStyle(), null, "descriptionStyle", null, 0, -1, DescriptionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Operationkind(), this.getOperationKind(), null, "operationkind", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Options(), this.getConfigurationOption(), null, "options", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReadonlyOptions(), this.getConfigurationOption(), null, "readonlyOptions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationKindEClass, OperationKind.class, "OperationKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationKind_ImageURL(), ecorePackage.getEString(), "imageURL", null, 1, 1, OperationKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Operations(), this.getOperation(), null, "operations", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Options(), this.getConfigurationOption(), null, "options", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCatalog__GetOperation__String(), this.getOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "kind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(labeledValueEClass, LabeledValue.class, "LabeledValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, LabeledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabeledValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, LabeledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Start(), ecorePackage.getEInt(), "start", null, 1, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_Length(), ecorePackage.getEInt(), "length", null, 1, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_FontStyle(), ecorePackage.getEInt(), "fontStyle", null, 1, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DescriptionPackageImpl
