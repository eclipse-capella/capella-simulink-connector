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

import java.util.Collection;

import org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl;

import org.eclipse.capella.simulink.core.model.mloperation.description.ConfigurationOption;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage;
import org.eclipse.capella.simulink.core.model.mloperation.description.Operation;
import org.eclipse.capella.simulink.core.model.mloperation.description.OperationKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl#getOperationkind <em>Operationkind</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.OperationImpl#getReadonlyOptions <em>Readonly Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ParameterizedElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getOperationkind() <em>Operationkind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationkind()
	 * @generated
	 * @ordered
	 */
	protected OperationKind operationkind;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationOption> options;

	/**
	 * The cached value of the '{@link #getReadonlyOptions() <em>Readonly Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadonlyOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationOption> readonlyOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationKind getOperationkind() {
		return operationkind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationkind(OperationKind newOperationkind, NotificationChain msgs) {
		OperationKind oldOperationkind = operationkind;
		operationkind = newOperationkind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.OPERATION__OPERATIONKIND, oldOperationkind, newOperationkind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationkind(OperationKind newOperationkind) {
		if (newOperationkind != operationkind) {
			NotificationChain msgs = null;
			if (operationkind != null)
				msgs = ((InternalEObject)operationkind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.OPERATION__OPERATIONKIND, null, msgs);
			if (newOperationkind != null)
				msgs = ((InternalEObject)newOperationkind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.OPERATION__OPERATIONKIND, null, msgs);
			msgs = basicSetOperationkind(newOperationkind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.OPERATION__OPERATIONKIND, newOperationkind, newOperationkind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationOption> getOptions() {
		if (options == null) {
			options = new EObjectResolvingEList<ConfigurationOption>(ConfigurationOption.class, this, DescriptionPackage.OPERATION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfigurationOption> getReadonlyOptions() {
		if (readonlyOptions == null) {
			readonlyOptions = new EObjectResolvingEList<ConfigurationOption>(ConfigurationOption.class, this, DescriptionPackage.OPERATION__READONLY_OPTIONS);
		}
		return readonlyOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.OPERATION__OPERATIONKIND:
				return basicSetOperationkind(null, msgs);
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
			case DescriptionPackage.OPERATION__OPERATIONKIND:
				return getOperationkind();
			case DescriptionPackage.OPERATION__OPTIONS:
				return getOptions();
			case DescriptionPackage.OPERATION__READONLY_OPTIONS:
				return getReadonlyOptions();
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
			case DescriptionPackage.OPERATION__OPERATIONKIND:
				setOperationkind((OperationKind)newValue);
				return;
			case DescriptionPackage.OPERATION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ConfigurationOption>)newValue);
				return;
			case DescriptionPackage.OPERATION__READONLY_OPTIONS:
				getReadonlyOptions().clear();
				getReadonlyOptions().addAll((Collection<? extends ConfigurationOption>)newValue);
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
			case DescriptionPackage.OPERATION__OPERATIONKIND:
				setOperationkind((OperationKind)null);
				return;
			case DescriptionPackage.OPERATION__OPTIONS:
				getOptions().clear();
				return;
			case DescriptionPackage.OPERATION__READONLY_OPTIONS:
				getReadonlyOptions().clear();
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
			case DescriptionPackage.OPERATION__OPERATIONKIND:
				return operationkind != null;
			case DescriptionPackage.OPERATION__OPTIONS:
				return options != null && !options.isEmpty();
			case DescriptionPackage.OPERATION__READONLY_OPTIONS:
				return readonlyOptions != null && !readonlyOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
