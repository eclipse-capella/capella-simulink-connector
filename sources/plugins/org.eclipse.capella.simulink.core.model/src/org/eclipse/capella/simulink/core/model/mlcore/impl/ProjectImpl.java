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

import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Project;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl#getDictionaries <em>Dictionaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.capella.simulink.core.model.mlcore.System> systems;

	/**
	 * The cached value of the '{@link #getDictionaries() <em>Dictionaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Dictionary> dictionaries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.capella.simulink.core.model.mlcore.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<org.eclipse.capella.simulink.core.model.mlcore.System>(org.eclipse.capella.simulink.core.model.mlcore.System.class, this, MLCorePackage.PROJECT__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dictionary> getDictionaries() {
		if (dictionaries == null) {
			dictionaries = new EObjectResolvingEList<Dictionary>(Dictionary.class, this, MLCorePackage.PROJECT__DICTIONARIES);
		}
		return dictionaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MLCorePackage.PROJECT__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
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
			case MLCorePackage.PROJECT__SYSTEMS:
				return getSystems();
			case MLCorePackage.PROJECT__DICTIONARIES:
				return getDictionaries();
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
			case MLCorePackage.PROJECT__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends org.eclipse.capella.simulink.core.model.mlcore.System>)newValue);
				return;
			case MLCorePackage.PROJECT__DICTIONARIES:
				getDictionaries().clear();
				getDictionaries().addAll((Collection<? extends Dictionary>)newValue);
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
			case MLCorePackage.PROJECT__SYSTEMS:
				getSystems().clear();
				return;
			case MLCorePackage.PROJECT__DICTIONARIES:
				getDictionaries().clear();
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
			case MLCorePackage.PROJECT__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case MLCorePackage.PROJECT__DICTIONARIES:
				return dictionaries != null && !dictionaries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
