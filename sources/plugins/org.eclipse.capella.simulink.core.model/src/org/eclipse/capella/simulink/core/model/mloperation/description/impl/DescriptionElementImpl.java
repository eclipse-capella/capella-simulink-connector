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

import org.eclipse.capella.simulink.core.model.mlcore.impl.NamedElementImpl;

import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionElement;
import org.eclipse.capella.simulink.core.model.mloperation.description.DescriptionPackage;
import org.eclipse.capella.simulink.core.model.mloperation.description.Style;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mloperation.description.impl.DescriptionElementImpl#getDescriptionStyle <em>Description Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DescriptionElementImpl extends NamedElementImpl implements DescriptionElement {
	/**
	 * The cached value of the '{@link #getDescriptionStyle() <em>Description Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> descriptionStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.DESCRIPTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Style> getDescriptionStyle() {
		if (descriptionStyle == null) {
			descriptionStyle = new EObjectContainmentEList<Style>(Style.class, this, DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE);
		}
		return descriptionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE:
				return ((InternalEList<?>)getDescriptionStyle()).basicRemove(otherEnd, msgs);
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
			case DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE:
				return getDescriptionStyle();
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
			case DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE:
				getDescriptionStyle().clear();
				getDescriptionStyle().addAll((Collection<? extends Style>)newValue);
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
			case DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE:
				getDescriptionStyle().clear();
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
			case DescriptionPackage.DESCRIPTION_ELEMENT__DESCRIPTION_STYLE:
				return descriptionStyle != null && !descriptionStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DescriptionElementImpl
