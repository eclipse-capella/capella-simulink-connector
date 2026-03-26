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
package org.eclipse.capella.simulink.core.model.mlcore.impl;

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.Scope;
import org.eclipse.capella.simulink.core.model.mlcore.Symbol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl#getUnderlyingPort <em>Underlying Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SymbolImpl extends SFChartElementImpl implements Symbol {
	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.INPUT;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnderlyingPort() <em>Underlying Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingPort()
	 * @generated
	 * @ordered
	 */
	protected Port underlyingPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYMBOL__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getUnderlyingPort() {
		if (underlyingPort != null && underlyingPort.eIsProxy()) {
			InternalEObject oldUnderlyingPort = (InternalEObject)underlyingPort;
			underlyingPort = (Port)eResolveProxy(oldUnderlyingPort);
			if (underlyingPort != oldUnderlyingPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLCorePackage.SYMBOL__UNDERLYING_PORT, oldUnderlyingPort, underlyingPort));
			}
		}
		return underlyingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetUnderlyingPort() {
		return underlyingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderlyingPort(Port newUnderlyingPort) {
		Port oldUnderlyingPort = underlyingPort;
		underlyingPort = newUnderlyingPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYMBOL__UNDERLYING_PORT, oldUnderlyingPort, underlyingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MLCorePackage.SYMBOL__SCOPE:
				return getScope();
			case MLCorePackage.SYMBOL__UNDERLYING_PORT:
				if (resolve) return getUnderlyingPort();
				return basicGetUnderlyingPort();
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
			case MLCorePackage.SYMBOL__SCOPE:
				setScope((Scope)newValue);
				return;
			case MLCorePackage.SYMBOL__UNDERLYING_PORT:
				setUnderlyingPort((Port)newValue);
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
			case MLCorePackage.SYMBOL__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case MLCorePackage.SYMBOL__UNDERLYING_PORT:
				setUnderlyingPort((Port)null);
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
			case MLCorePackage.SYMBOL__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case MLCorePackage.SYMBOL__UNDERLYING_PORT:
				return underlyingPort != null;
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //SymbolImpl
