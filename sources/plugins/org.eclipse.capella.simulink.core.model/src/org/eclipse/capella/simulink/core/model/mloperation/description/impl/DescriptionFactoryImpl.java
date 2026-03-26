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

import org.eclipse.capella.simulink.core.model.mloperation.description.*;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionFactoryImpl extends EFactoryImpl implements DescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptionFactory init() {
		try {
			DescriptionFactory theDescriptionFactory = (DescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(DescriptionPackage.eNS_URI);
			if (theDescriptionFactory != null) {
				return theDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DescriptionPackage.CONFIGURATION_OPTION: return createConfigurationOption();
			case DescriptionPackage.OPERATION: return createOperation();
			case DescriptionPackage.OPERATION_KIND: return createOperationKind();
			case DescriptionPackage.CATALOG: return createCatalog();
			case DescriptionPackage.LABELED_VALUE: return createLabeledValue();
			case DescriptionPackage.STYLE: return createStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ConfigurationOption createConfigurationOption() {
		ConfigurationOptionImpl configurationOption = new ConfigurationOptionImpl();
		configurationOption.setId(UUID.randomUUID().toString());
		return configurationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		operation.setId(UUID.randomUUID().toString());
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public OperationKind createOperationKind() {
		OperationKindImpl operationKind = new OperationKindImpl();
		operationKind.setId(UUID.randomUUID().toString());
		return operationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		catalog.setId(UUID.randomUUID().toString());
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public LabeledValue createLabeledValue() {
		LabeledValueImpl labeledValue = new LabeledValueImpl();
		labeledValue.setId(UUID.randomUUID().toString());
		return labeledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		style.setId(UUID.randomUUID().toString());
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionPackage getDescriptionPackage() {
		return (DescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DescriptionPackage getPackage() {
		return DescriptionPackage.eINSTANCE;
	}

} //DescriptionFactoryImpl
