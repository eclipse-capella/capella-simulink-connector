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

import java.util.Collection;

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;
import org.eclipse.capella.simulink.core.model.mlinfra.RawElement;
import org.eclipse.capella.simulink.core.model.mlinfra.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raw Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl#isCreationRequired <em>Creation Required</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.RawElementImpl#getCreationParameters <em>Creation Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RawElementImpl extends ParameterizedElementImpl implements RawElement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<RawElement> children;

	/**
	 * The default value of the '{@link #isCreationRequired() <em>Creation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATION_REQUIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreationRequired() <em>Creation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreationRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean creationRequired = CREATION_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationParameters() <em>Creation Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> creationParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RawElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLInfraPackage.Literals.RAW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.RAW_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RawElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<RawElement>(RawElement.class, this, MLInfraPackage.RAW_ELEMENT__CHILDREN, MLInfraPackage.RAW_ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawElement getParent() {
		if (eContainerFeatureID() != MLInfraPackage.RAW_ELEMENT__PARENT) return null;
		return (RawElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(RawElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MLInfraPackage.RAW_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(RawElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MLInfraPackage.RAW_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MLInfraPackage.RAW_ELEMENT__CHILDREN, RawElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.RAW_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreationRequired() {
		return creationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationRequired(boolean newCreationRequired) {
		boolean oldCreationRequired = creationRequired;
		creationRequired = newCreationRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.RAW_ELEMENT__CREATION_REQUIRED, oldCreationRequired, creationRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Value> getCreationParameters() {
		if (creationParameters == null) {
			creationParameters = new EObjectContainmentEList<Value>(Value.class, this, MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS);
		}
		return creationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((RawElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS:
				return ((InternalEList<?>)getCreationParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, MLInfraPackage.RAW_ELEMENT__CHILDREN, RawElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MLInfraPackage.RAW_ELEMENT__TYPE:
				return getType();
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				return getChildren();
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				return getParent();
			case MLInfraPackage.RAW_ELEMENT__CREATION_REQUIRED:
				return isCreationRequired();
			case MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS:
				return getCreationParameters();
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
			case MLInfraPackage.RAW_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends RawElement>)newValue);
				return;
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				setParent((RawElement)newValue);
				return;
			case MLInfraPackage.RAW_ELEMENT__CREATION_REQUIRED:
				setCreationRequired((Boolean)newValue);
				return;
			case MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS:
				getCreationParameters().clear();
				getCreationParameters().addAll((Collection<? extends Value>)newValue);
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
			case MLInfraPackage.RAW_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				setParent((RawElement)null);
				return;
			case MLInfraPackage.RAW_ELEMENT__CREATION_REQUIRED:
				setCreationRequired(CREATION_REQUIRED_EDEFAULT);
				return;
			case MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS:
				getCreationParameters().clear();
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
			case MLInfraPackage.RAW_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MLInfraPackage.RAW_ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case MLInfraPackage.RAW_ELEMENT__PARENT:
				return getParent() != null;
			case MLInfraPackage.RAW_ELEMENT__CREATION_REQUIRED:
				return creationRequired != CREATION_REQUIRED_EDEFAULT;
			case MLInfraPackage.RAW_ELEMENT__CREATION_PARAMETERS:
				return creationParameters != null && !creationParameters.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", creationRequired: ");
		result.append(creationRequired);
		result.append(')');
		return result.toString();
	}

} //RawElementImpl
