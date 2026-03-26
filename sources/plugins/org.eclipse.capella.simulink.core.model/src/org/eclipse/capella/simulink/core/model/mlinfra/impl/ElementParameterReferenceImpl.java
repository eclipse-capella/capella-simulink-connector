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

import org.eclipse.capella.simulink.core.model.mlinfra.ElementParameterReference;
import org.eclipse.capella.simulink.core.model.mlinfra.ElementReference;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlinfra.impl.ElementParameterReferenceImpl#getElementReference <em>Element Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementParameterReferenceImpl extends ValueImpl implements ElementParameterReference {
	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementReference() <em>Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementReference()
	 * @generated
	 * @ordered
	 */
	protected ElementReference elementReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementParameterReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLInfraPackage.Literals.ELEMENT_PARAMETER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementReference getElementReference() {
		return elementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementReference(ElementReference newElementReference, NotificationChain msgs) {
		ElementReference oldElementReference = elementReference;
		elementReference = newElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE, oldElementReference, newElementReference);
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
	public void setElementReference(ElementReference newElementReference) {
		if (newElementReference != elementReference) {
			NotificationChain msgs = null;
			if (elementReference != null)
				msgs = ((InternalEObject)elementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE, null, msgs);
			if (newElementReference != null)
				msgs = ((InternalEObject)newElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetElementReference(newElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE, newElementReference, newElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE:
				return basicSetElementReference(null, msgs);
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
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__PARAMETER:
				return getParameter();
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE:
				return getElementReference();
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
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__PARAMETER:
				setParameter((String)newValue);
				return;
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE:
				setElementReference((ElementReference)newValue);
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
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE:
				setElementReference((ElementReference)null);
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
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case MLInfraPackage.ELEMENT_PARAMETER_REFERENCE__ELEMENT_REFERENCE:
				return elementReference != null;
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
		result.append(" (parameter: ");
		result.append(parameter);
		result.append(')');
		return result.toString();
	}

} //ElementParameterReferenceImpl
