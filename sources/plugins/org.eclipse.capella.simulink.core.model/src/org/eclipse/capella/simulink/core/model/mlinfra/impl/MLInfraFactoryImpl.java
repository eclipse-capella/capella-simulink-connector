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
import java.util.UUID;

import org.eclipse.capella.simulink.core.model.mlinfra.*;

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
public class MLInfraFactoryImpl extends EFactoryImpl implements MLInfraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MLInfraFactory init() {
		try {
			MLInfraFactory theMLInfraFactory = (MLInfraFactory)EPackage.Registry.INSTANCE.getEFactory(MLInfraPackage.eNS_URI);
			if (theMLInfraFactory != null) {
				return theMLInfraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MLInfraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLInfraFactoryImpl() {
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
			case MLInfraPackage.RAW_ELEMENT: return createRawElement();
			case MLInfraPackage.PRIMITIVE_VALUE: return createPrimitiveValue();
			case MLInfraPackage.ELEMENT_REFERENCE: return createElementReference();
			case MLInfraPackage.PARAMETER_TO_VALUE_ENTRY: return (EObject)createParameterToValueEntry();
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE: return createElementParameterReference();
			case MLInfraPackage.MULTIPLE_VALUE: return createMultipleValue();
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
	public RawElement createRawElement() {
		RawElementImpl rawElement = new RawElementImpl();
		rawElement.setId(UUID.randomUUID().toString());
		return rawElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PrimitiveValue createPrimitiveValue() {
		PrimitiveValueImpl primitiveValue = new PrimitiveValueImpl();
		primitiveValue.setId(UUID.randomUUID().toString());
		return primitiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ElementReference createElementReference() {
		ElementReferenceImpl elementReference = new ElementReferenceImpl();
		elementReference.setId(UUID.randomUUID().toString());
		return elementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map.Entry<String, Value> createParameterToValueEntry() {
		ParameterToValueEntryImpl parameterToValueEntry = new ParameterToValueEntryImpl();
		parameterToValueEntry.setId(UUID.randomUUID().toString());
		return parameterToValueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ElementParameterReference createElementParameterReference() {
		ElementParameterReferenceImpl elementParameterReference = new ElementParameterReferenceImpl();
		elementParameterReference.setId(UUID.randomUUID().toString());
		return elementParameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public MultipleValue createMultipleValue() {
		MultipleValueImpl multipleValue = new MultipleValueImpl();
		multipleValue.setId(UUID.randomUUID().toString());
		return multipleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLInfraPackage getMLInfraPackage() {
		return (MLInfraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MLInfraPackage getPackage() {
		return MLInfraPackage.eINSTANCE;
	}

} //MLInfraFactoryImpl
