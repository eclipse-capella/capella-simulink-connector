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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.capella.simulink.core.model.impl.ReferencedPort;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl#getReferencedPorts <em>Referenced Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemReferenceImpl extends BlockImpl implements SystemReference {

	private final class SystemAdapter extends AdapterImpl {
		
		@Override
		public void notifyChanged(Notification msg) {
			if ( MLCorePackage.eINSTANCE.getPortHolder_Ports().equals(msg.getFeature()))
				updatePorts();
		}
	}



	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.capella.simulink.core.model.mlcore.System system;

	/**
	 * The cached value of the '{@link #getReferencedPorts() <em>Referenced Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> referencedPorts;

	private final SystemAdapter systemAdapter = new SystemAdapter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.SYSTEM_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.capella.simulink.core.model.mlcore.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (org.eclipse.capella.simulink.core.model.mlcore.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLCorePackage.SYSTEM_REFERENCE__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.capella.simulink.core.model.mlcore.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSystem(org.eclipse.capella.simulink.core.model.mlcore.System newSystem) {
		org.eclipse.capella.simulink.core.model.mlcore.System oldSystem = system;
		if (oldSystem != null)
			oldSystem.eAdapters().remove(systemAdapter);
		system = newSystem;
		updatePorts();
		if (system != null)
			system.eAdapters().add(systemAdapter);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLCorePackage.SYSTEM_REFERENCE__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getReferencedPorts() {
		if (referencedPorts == null) {
			referencedPorts = new EObjectContainmentEList<Port>(Port.class, this, MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS);
		}
		return referencedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Port getReferencedPort(Port systemPort) {
		if (system == null)
			return null;
		for (Port p: getReferencedPorts()) {
			if (((ReferencedPort)p).getSourcePort().equals(systemPort))
				return p;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS:
				return ((InternalEList<?>)getReferencedPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public String getOriginatorId() {
		if (system == null)
			return super.getOriginatorId();
		return system.getOriginatorId();
	}

	private void updatePorts() {
		Map<String, Port> existing = getReferencedPorts().stream().collect( Collectors.toMap(x -> x.getId(), Function.identity()) );
		getReferencedPorts().clear();
		if (system == null)
			return;
		getSystem().getPorts().stream().forEach(p -> {
			Port port = existing.get(p.getId());
			if (port == null) {
				port = new ReferencedPort(p);
				port.setId("derived-"+getId()+"--"+p.getId());

			}
			getReferencedPorts().add(port);
		});
	}


	@Override
	public EList<Port> getPorts() {
		return getReferencedPorts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MLCorePackage.SYSTEM_REFERENCE__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS:
				return getReferencedPorts();
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
			case MLCorePackage.SYSTEM_REFERENCE__SYSTEM:
				setSystem((org.eclipse.capella.simulink.core.model.mlcore.System)newValue);
				return;
			case MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS:
				getReferencedPorts().clear();
				getReferencedPorts().addAll((Collection<? extends Port>)newValue);
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
			case MLCorePackage.SYSTEM_REFERENCE__SYSTEM:
				setSystem((org.eclipse.capella.simulink.core.model.mlcore.System)null);
				return;
			case MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS:
				getReferencedPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MLCorePackage.BLOCK__PORTS:
				return false;
			case MLCorePackage.SYSTEM_REFERENCE__SYSTEM:
				return system != null;
			case MLCorePackage.SYSTEM_REFERENCE__REFERENCED_PORTS:
				return referencedPorts != null && !referencedPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MLCorePackage.SYSTEM_REFERENCE___GET_REFERENCED_PORT__PORT:
				return getReferencedPort((Port)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemReferenceImpl
