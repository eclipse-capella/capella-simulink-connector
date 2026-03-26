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
import java.util.UUID;

import org.eclipse.capella.simulink.core.model.mloperation.*;

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
public class MloperationFactoryImpl extends EFactoryImpl implements MloperationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MloperationFactory init() {
		try {
			MloperationFactory theMloperationFactory = (MloperationFactory)EPackage.Registry.INSTANCE.getEFactory(MloperationPackage.eNS_URI);
			if (theMloperationFactory != null) {
				return theMloperationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MloperationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MloperationFactoryImpl() {
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
			case MloperationPackage.CONFIGURATION: return createConfiguration();
			case MloperationPackage.OPERATION: return createOperation();
			case MloperationPackage.OBJECT_TO_CONFIGURATION_VALUE_ENTRY: return (EObject)createObjectToConfigurationValueEntry();
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
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		configuration.setId(UUID.randomUUID().toString());
		return configuration;
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
		operation.setMainConfiguration(createConfiguration());
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map.Entry<EObject, Configuration> createObjectToConfigurationValueEntry() {
		ObjectToConfigurationValueEntryImpl objectToConfigurationValueEntry = new ObjectToConfigurationValueEntryImpl();
		objectToConfigurationValueEntry.setId(UUID.randomUUID().toString());
		return objectToConfigurationValueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MloperationPackage getMloperationPackage() {
		return (MloperationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MloperationPackage getPackage() {
		return MloperationPackage.eINSTANCE;
	}

} //MloperationFactoryImpl
