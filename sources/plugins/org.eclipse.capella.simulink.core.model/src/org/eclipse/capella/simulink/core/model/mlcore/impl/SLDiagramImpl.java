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

import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SL Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SLDiagramImpl extends NamedElementImpl implements SLDiagram {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLCorePackage.Literals.SL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, MLCorePackage.SL_DIAGRAM__PORTS, MLCorePackage.PORT__HOLDER);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentWithInverseEList<Block>(Block.class, this, MLCorePackage.SL_DIAGRAM__BLOCKS, MLCorePackage.BLOCK__DIAGRAM);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentWithInverseEList<Line>(Line.class, this, MLCorePackage.SL_DIAGRAM__LINES, MLCorePackage.LINE__DIAGRAM);
		}
		return lines;
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBlocks()).basicAdd(otherEnd, msgs);
			case MLCorePackage.SL_DIAGRAM__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case MLCorePackage.SL_DIAGRAM__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				return getPorts();
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				return getBlocks();
			case MLCorePackage.SL_DIAGRAM__LINES:
				return getLines();
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case MLCorePackage.SL_DIAGRAM__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				getPorts().clear();
				return;
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				getBlocks().clear();
				return;
			case MLCorePackage.SL_DIAGRAM__LINES:
				getLines().clear();
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
			case MLCorePackage.SL_DIAGRAM__PORTS:
				return ports != null && !ports.isEmpty();
			case MLCorePackage.SL_DIAGRAM__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case MLCorePackage.SL_DIAGRAM__LINES:
				return lines != null && !lines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PortHolder.class) {
			switch (derivedFeatureID) {
				case MLCorePackage.SL_DIAGRAM__PORTS: return MLCorePackage.PORT_HOLDER__PORTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PortHolder.class) {
			switch (baseFeatureID) {
				case MLCorePackage.PORT_HOLDER__PORTS: return MLCorePackage.SL_DIAGRAM__PORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SLDiagramImpl
