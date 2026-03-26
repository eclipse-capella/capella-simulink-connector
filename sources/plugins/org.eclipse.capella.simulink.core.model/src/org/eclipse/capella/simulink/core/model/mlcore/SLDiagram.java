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
package org.eclipse.capella.simulink.core.model.mlcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SL Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSLDiagram()
 * @model abstract="true"
 * @generated
 */
public interface SLDiagram extends NamedElement, PortHolder {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Block}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSLDiagram_Blocks()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<Block> getBlocks();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capella.simulink.core.model.mlcore.Line}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getSLDiagram_Lines()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<Line> getLines();

} // SLDiagram
