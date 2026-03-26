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

import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl#isIsLibrary <em>Is Library</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl#getDictionary <em>Dictionary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends SLDiagramImpl implements org.eclipse.capella.simulink.core.model.mlcore.System {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLibrary() <em>Is Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LIBRARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLibrary() <em>Is Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLibrary()
	 * @generated
	 * @ordered
	 */
	protected boolean isLibrary = IS_LIBRARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionary()
	 * @generated
	 * @ordered
	 */
	protected Dictionary dictionary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		super.setName(newName != null && newName.length() > 59 ? newName.substring(0, 59) : newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYSTEM__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLibrary() {
		return isLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLibrary(boolean newIsLibrary) {
		boolean oldIsLibrary = isLibrary;
		isLibrary = newIsLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYSTEM__IS_LIBRARY, oldIsLibrary, isLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dictionary getDictionary() {
		if (dictionary != null && dictionary.eIsProxy()) {
			InternalEObject oldDictionary = (InternalEObject)dictionary;
			dictionary = (Dictionary)eResolveProxy(oldDictionary);
			if (dictionary != oldDictionary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLCorePackage.SYSTEM__DICTIONARY, oldDictionary, dictionary));
			}
		}
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary basicGetDictionary() {
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDictionary(Dictionary newDictionary) {
		Dictionary oldDictionary = dictionary;
		dictionary = newDictionary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYSTEM__DICTIONARY, oldDictionary, dictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MLCorePackage.SYSTEM__FILE_NAME:
				return getFileName();
			case MLCorePackage.SYSTEM__IS_LIBRARY:
				return isIsLibrary();
			case MLCorePackage.SYSTEM__DICTIONARY:
				if (resolve) return getDictionary();
				return basicGetDictionary();
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
			case MLCorePackage.SYSTEM__FILE_NAME:
				setFileName((String)newValue);
				return;
			case MLCorePackage.SYSTEM__IS_LIBRARY:
				setIsLibrary((Boolean)newValue);
				return;
			case MLCorePackage.SYSTEM__DICTIONARY:
				setDictionary((Dictionary)newValue);
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
			case MLCorePackage.SYSTEM__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case MLCorePackage.SYSTEM__IS_LIBRARY:
				setIsLibrary(IS_LIBRARY_EDEFAULT);
				return;
			case MLCorePackage.SYSTEM__DICTIONARY:
				setDictionary((Dictionary)null);
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
			case MLCorePackage.SYSTEM__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case MLCorePackage.SYSTEM__IS_LIBRARY:
				return isLibrary != IS_LIBRARY_EDEFAULT;
			case MLCorePackage.SYSTEM__DICTIONARY:
				return dictionary != null;
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
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", isLibrary: ");
		result.append(isLibrary);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
