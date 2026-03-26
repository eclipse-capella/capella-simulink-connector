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
package org.eclipse.capella.simulink.core.model.mloperation.impl;

import java.util.Map;

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.capella.simulink.core.model.mloperation.Configuration;
import org.eclipse.capella.simulink.core.model.mloperation.MloperationFactory;
import org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;

import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage;

import org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionPackageImpl;

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
public class MloperationPackageImpl extends EPackageImpl implements MloperationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

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
	private EClass objectToConfigurationValueEntryEClass = null;

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
	 * @see org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MloperationPackageImpl() {
		super(eNS_URI, MloperationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MloperationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MloperationPackage init() {
		if (isInited) return (MloperationPackage)EPackage.Registry.INSTANCE.getEPackage(MloperationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMloperationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MloperationPackageImpl theMloperationPackage = registeredMloperationPackage instanceof MloperationPackageImpl ? (MloperationPackageImpl)registeredMloperationPackage : new MloperationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MLCorePackage.eINSTANCE.eClass();
		MLInfraPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(registeredPackage instanceof DescriptionPackageImpl ? registeredPackage : DescriptionPackage.eINSTANCE);

		// Create package meta-data objects
		theMloperationPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theMloperationPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMloperationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MloperationPackage.eNS_URI, theMloperationPackage);
		return theMloperationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Parent() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
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
	public EReference getOperation_Targets() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Kind() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_MainConfiguration() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Configurations() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectToConfigurationValueEntry() {
		return objectToConfigurationValueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectToConfigurationValueEntry_Key() {
		return (EReference)objectToConfigurationValueEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectToConfigurationValueEntry_Value() {
		return (EReference)objectToConfigurationValueEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MloperationFactory getMloperationFactory() {
		return (MloperationFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PARENT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__TARGETS);
		createEAttribute(operationEClass, OPERATION__KIND);
		createEReference(operationEClass, OPERATION__MAIN_CONFIGURATION);
		createEReference(operationEClass, OPERATION__CONFIGURATIONS);

		objectToConfigurationValueEntryEClass = createEClass(OBJECT_TO_CONFIGURATION_VALUE_ENTRY);
		createEReference(objectToConfigurationValueEntryEClass, OBJECT_TO_CONFIGURATION_VALUE_ENTRY__KEY);
		createEReference(objectToConfigurationValueEntryEClass, OBJECT_TO_CONFIGURATION_VALUE_ENTRY__VALUE);
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
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		MLInfraPackage theMLInfraPackage = (MLInfraPackage)EPackage.Registry.INSTANCE.getEPackage(MLInfraPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDescriptionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationEClass.getESuperTypes().add(theMLInfraPackage.getParameterizedElement());
		operationEClass.getESuperTypes().add(theMLInfraPackage.getParameterizedElement());
		objectToConfigurationValueEntryEClass.getESuperTypes().add(theMLInfraPackage.getIdentifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Parent(), this.getConfiguration(), null, "parent", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Kind(), ecorePackage.getEString(), "kind", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_MainConfiguration(), this.getConfiguration(), null, "mainConfiguration", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Configurations(), this.getObjectToConfigurationValueEntry(), null, "configurations", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectToConfigurationValueEntryEClass, Map.Entry.class, "ObjectToConfigurationValueEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectToConfigurationValueEntry_Key(), ecorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectToConfigurationValueEntry_Value(), this.getConfiguration(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MloperationPackageImpl
