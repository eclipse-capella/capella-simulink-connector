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

import java.util.Collection;

import org.eclipse.capella.simulink.core.model.mlcore.AState;
import org.eclipse.capella.simulink.core.model.mlcore.DecompositionType;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl#getDuring <em>During</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl#getSubStates <em>Sub States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends AStateImpl implements State {
	/**
	 * The default value of the '{@link #getExit() <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected String exit = EXIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected String entry = ENTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuring() <em>During</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuring()
	 * @generated
	 * @ordered
	 */
	protected static final String DURING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuring() <em>During</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuring()
	 * @generated
	 * @ordered
	 */
	protected String during = DURING_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DecompositionType TYPE_EDEFAULT = DecompositionType.EXCLUSIVE_OR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecompositionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStates() <em>Sub States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStates()
	 * @generated
	 * @ordered
	 */
	protected EList<AState> subStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExit(String newExit) {
		String oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.STATE__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntry(String newEntry) {
		String oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.STATE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDuring() {
		return during;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuring(String newDuring) {
		String oldDuring = during;
		during = newDuring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.STATE__DURING, oldDuring, during));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecompositionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DecompositionType newType) {
		DecompositionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.STATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AState> getSubStates() {
		if (subStates == null) {
			subStates = new EObjectContainmentWithInverseEList<AState>(AState.class, this, MLCorePackage.STATE__SUB_STATES, MLCorePackage.ASTATE__PARENT);
		}
		return subStates;
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
			case MLCorePackage.STATE__SUB_STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubStates()).basicAdd(otherEnd, msgs);
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
			case MLCorePackage.STATE__SUB_STATES:
				return ((InternalEList<?>)getSubStates()).basicRemove(otherEnd, msgs);
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
			case MLCorePackage.STATE__EXIT:
				return getExit();
			case MLCorePackage.STATE__ENTRY:
				return getEntry();
			case MLCorePackage.STATE__DURING:
				return getDuring();
			case MLCorePackage.STATE__TYPE:
				return getType();
			case MLCorePackage.STATE__SUB_STATES:
				return getSubStates();
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
			case MLCorePackage.STATE__EXIT:
				setExit((String)newValue);
				return;
			case MLCorePackage.STATE__ENTRY:
				setEntry((String)newValue);
				return;
			case MLCorePackage.STATE__DURING:
				setDuring((String)newValue);
				return;
			case MLCorePackage.STATE__TYPE:
				setType((DecompositionType)newValue);
				return;
			case MLCorePackage.STATE__SUB_STATES:
				getSubStates().clear();
				getSubStates().addAll((Collection<? extends AState>)newValue);
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
			case MLCorePackage.STATE__EXIT:
				setExit(EXIT_EDEFAULT);
				return;
			case MLCorePackage.STATE__ENTRY:
				setEntry(ENTRY_EDEFAULT);
				return;
			case MLCorePackage.STATE__DURING:
				setDuring(DURING_EDEFAULT);
				return;
			case MLCorePackage.STATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MLCorePackage.STATE__SUB_STATES:
				getSubStates().clear();
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
			case MLCorePackage.STATE__EXIT:
				return EXIT_EDEFAULT == null ? exit != null : !EXIT_EDEFAULT.equals(exit);
			case MLCorePackage.STATE__ENTRY:
				return ENTRY_EDEFAULT == null ? entry != null : !ENTRY_EDEFAULT.equals(entry);
			case MLCorePackage.STATE__DURING:
				return DURING_EDEFAULT == null ? during != null : !DURING_EDEFAULT.equals(during);
			case MLCorePackage.STATE__TYPE:
				return type != TYPE_EDEFAULT;
			case MLCorePackage.STATE__SUB_STATES:
				return subStates != null && !subStates.isEmpty();
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
		result.append(" (exit: ");
		result.append(exit);
		result.append(", entry: ");
		result.append(entry);
		result.append(", during: ");
		result.append(during);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StateImpl
