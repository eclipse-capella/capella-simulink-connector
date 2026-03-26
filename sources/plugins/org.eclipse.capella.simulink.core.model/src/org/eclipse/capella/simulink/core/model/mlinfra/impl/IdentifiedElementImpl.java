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

import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identified Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.IdentifiedElementImpl#getOriginatorId <em>Originator Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IdentifiedElementImpl extends MinimalEObjectImpl.Container implements IdentifiedElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatorId() <em>Originator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatorId() <em>Originator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorId()
	 * @generated
	 * @ordered
	 */
	protected String originatorId = ORIGINATOR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLInfraPackage.Literals.IDENTIFIED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.IDENTIFIED_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginatorId() {
		return originatorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatorId(String newOriginatorId) {
		String oldOriginatorId = originatorId;
		originatorId = newOriginatorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID, oldOriginatorId, originatorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MLInfraPackage.IDENTIFIED_ELEMENT__ID:
				return getId();
			case MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID:
				return getOriginatorId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MLInfraPackage.IDENTIFIED_ELEMENT__ID:
				setId((String)newValue);
				return;
			case MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID:
				setOriginatorId((String)newValue);
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
			case MLInfraPackage.IDENTIFIED_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID:
				setOriginatorId(ORIGINATOR_ID_EDEFAULT);
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
			case MLInfraPackage.IDENTIFIED_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID:
				return ORIGINATOR_ID_EDEFAULT == null ? originatorId != null : !ORIGINATOR_ID_EDEFAULT.equals(originatorId);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", originatorId: ");
		result.append(originatorId);
		result.append(')');
		return result.toString();
	}

} //IdentifiedElementImpl
