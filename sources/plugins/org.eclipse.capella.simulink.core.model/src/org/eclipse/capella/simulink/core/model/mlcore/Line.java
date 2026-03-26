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
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getLine()
 * @model
 * @generated
 */
public interface Line extends SLDiagramElement {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(SLDiagram)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getLine_Diagram()
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getLines
	 * @model opposite="lines" required="true" transient="false"
	 * @generated
	 */
	SLDiagram getDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(SLDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getLine_Source()
	 * @model required="true"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getLine_Target()
	 * @model required="true"
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

} // Line
