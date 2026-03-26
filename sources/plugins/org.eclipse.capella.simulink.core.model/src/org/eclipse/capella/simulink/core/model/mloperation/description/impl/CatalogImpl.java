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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl;

import org.eclipse.capella.simulink.core.model.mloperation.description.Catalog;
import org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage;
import org.eclipse.capella.simulink.core.model.mloperation.description.Operation;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.CatalogImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends IdentifiedElementImpl implements Catalog {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationOption> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, DescriptionPackage.CATALOG__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<ConfigurationOption>(ConfigurationOption.class, this, DescriptionPackage.CATALOG__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.CATALOG__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case DescriptionPackage.CATALOG__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.CATALOG__OPERATIONS:
				return getOperations();
			case DescriptionPackage.CATALOG__OPTIONS:
				return getOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DescriptionPackage.CATALOG__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case DescriptionPackage.CATALOG__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ConfigurationOption>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DescriptionPackage.CATALOG__OPERATIONS:
				getOperations().clear();
				return;
			case DescriptionPackage.CATALOG__OPTIONS:
				getOptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DescriptionPackage.CATALOG__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case DescriptionPackage.CATALOG__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DescriptionPackage.CATALOG___GET_OPERATION__STRING:
				return getOperation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Get the operation of a given kind.
	 * 
	 * @param kind The ID of the kind of the desired operation.
	 * @return The first registered operation of the requested kind, or
	 *         <code>null</code> if not found.
	 * @generated NOT
	 */
	@Override
	public Operation getOperation(String kind) {
		for (Operation op : getOperations()) {
			if (kind.equals(op.getOperationkind().getId()))
				return op;
		}
		return null;
	}

} //CatalogImpl
