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

import java.util.Collection;

import org.eclipse.capella.simulink.core.model.mlinfra.impl.ParameterizedElementImpl;

import org.eclipse.capella.simulink.core.model.mloperation.Configuration;
import org.eclipse.capella.simulink.core.model.mloperation.MloperationPackage;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl#getMainConfiguration <em>Main Configuration</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.impl.OperationImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ParameterizedElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targets;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainConfiguration() <em>Main Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration mainConfiguration;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EMap<EObject, Configuration> configurations;

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
		return MloperationPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<EObject>(EObject.class, this, MloperationPackage.OPERATION__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MloperationPackage.OPERATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getMainConfiguration() {
		if (mainConfiguration != null && mainConfiguration.eIsProxy()) {
			InternalEObject oldMainConfiguration = (InternalEObject)mainConfiguration;
			mainConfiguration = (Configuration)eResolveProxy(oldMainConfiguration);
			if (mainConfiguration != oldMainConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MloperationPackage.OPERATION__MAIN_CONFIGURATION, oldMainConfiguration, mainConfiguration));
			}
		}
		return mainConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetMainConfiguration() {
		return mainConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainConfiguration(Configuration newMainConfiguration) {
		Configuration oldMainConfiguration = mainConfiguration;
		mainConfiguration = newMainConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MloperationPackage.OPERATION__MAIN_CONFIGURATION, oldMainConfiguration, mainConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<EObject, Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EcoreEMap<EObject,Configuration>(MloperationPackage.Literals.OBJECT_TO_CONFIGURATION_VALUE_ENTRY, ObjectToConfigurationValueEntryImpl.class, this, MloperationPackage.OPERATION__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MloperationPackage.OPERATION__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
			case MloperationPackage.OPERATION__TARGETS:
				return getTargets();
			case MloperationPackage.OPERATION__KIND:
				return getKind();
			case MloperationPackage.OPERATION__MAIN_CONFIGURATION:
				if (resolve) return getMainConfiguration();
				return basicGetMainConfiguration();
			case MloperationPackage.OPERATION__CONFIGURATIONS:
				if (coreType) return getConfigurations();
				else return getConfigurations().map();
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
			case MloperationPackage.OPERATION__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends EObject>)newValue);
				return;
			case MloperationPackage.OPERATION__KIND:
				setKind((String)newValue);
				return;
			case MloperationPackage.OPERATION__MAIN_CONFIGURATION:
				setMainConfiguration((Configuration)newValue);
				return;
			case MloperationPackage.OPERATION__CONFIGURATIONS:
				((EStructuralFeature.Setting)getConfigurations()).set(newValue);
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
			case MloperationPackage.OPERATION__TARGETS:
				getTargets().clear();
				return;
			case MloperationPackage.OPERATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MloperationPackage.OPERATION__MAIN_CONFIGURATION:
				setMainConfiguration((Configuration)null);
				return;
			case MloperationPackage.OPERATION__CONFIGURATIONS:
				getConfigurations().clear();
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
			case MloperationPackage.OPERATION__TARGETS:
				return targets != null && !targets.isEmpty();
			case MloperationPackage.OPERATION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case MloperationPackage.OPERATION__MAIN_CONFIGURATION:
				return mainConfiguration != null;
			case MloperationPackage.OPERATION__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
