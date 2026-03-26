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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends SLDiagramElement, PortHolder, DatatypeHolder {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(SLDiagram)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getBlock_Diagram()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getBlocks
	 * @model opposite="blocks" required="true" transient="false"
	 * @generated
	 */
	SLDiagram getDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(SLDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getBlock_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // Block
