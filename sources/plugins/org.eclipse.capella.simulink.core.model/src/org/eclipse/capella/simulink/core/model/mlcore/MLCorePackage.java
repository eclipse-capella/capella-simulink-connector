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

import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory
 * @model kind="package"
 * @generated
 */
public interface MLCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mlcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/capella/simulink/core/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.capella.simulink.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLCorePackage eINSTANCE = org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.NamedElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ORIGINATOR_ID = MLInfraPackage.PARAMETERIZED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PARAMETERS = MLInfraPackage.PARAMETERIZED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERENCE = MLInfraPackage.PARAMETERIZED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MLInfraPackage.PARAMETERIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl <em>SL Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSLDiagram()
	 * @generated
	 */
	int SL_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__BLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM__LINES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SL Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SL Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramElementImpl <em>SL Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSLDiagramElement()
	 * @generated
	 */
	int SL_DIAGRAM_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>SL Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT___GET_DIAGRAM = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SL Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SL_DIAGRAM_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BlockImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = SL_DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ORIGINATOR_ID = SL_DIAGRAM_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARAMETERS = SL_DIAGRAM_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REFERENCE = SL_DIAGRAM_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = SL_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DESCRIPTION = SL_DIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PORTS = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DATATYPE = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DIAGRAM = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SOURCE = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___GET_DIAGRAM = SL_DIAGRAM_ELEMENT___GET_DIAGRAM;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = SL_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.LineImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = SL_DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ORIGINATOR_ID = SL_DIAGRAM_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PARAMETERS = SL_DIAGRAM_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__REFERENCE = SL_DIAGRAM_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = SL_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DESCRIPTION = SL_DIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DIAGRAM = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE___GET_DIAGRAM = SL_DIAGRAM_ELEMENT___GET_DIAGRAM;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = SL_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.PortImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = SL_DIAGRAM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ORIGINATOR_ID = SL_DIAGRAM_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PARAMETERS = SL_DIAGRAM_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REFERENCE = SL_DIAGRAM_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = SL_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = SL_DIAGRAM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATATYPE = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HOLDER = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__KIND = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INDEX = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = SL_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_DIAGRAM = SL_DIAGRAM_ELEMENT___GET_DIAGRAM;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = SL_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = SL_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ORIGINATOR_ID = SL_DIAGRAM__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARAMETERS = SL_DIAGRAM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REFERENCE = SL_DIAGRAM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = SL_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = SL_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PORTS = SL_DIAGRAM__PORTS;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BLOCKS = SL_DIAGRAM__BLOCKS;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LINES = SL_DIAGRAM__LINES;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FILE_NAME = SL_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IS_LIBRARY = SL_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DICTIONARY = SL_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = SL_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = SL_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SubsystemImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ID = SL_DIAGRAM__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ORIGINATOR_ID = SL_DIAGRAM__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__PARAMETERS = SL_DIAGRAM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__REFERENCE = SL_DIAGRAM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__NAME = SL_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DESCRIPTION = SL_DIAGRAM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__PORTS = SL_DIAGRAM__PORTS;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__BLOCKS = SL_DIAGRAM__BLOCKS;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__LINES = SL_DIAGRAM__LINES;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DATATYPE = SL_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DIAGRAM = SL_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SOURCE = SL_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = SL_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM___GET_DIAGRAM = SL_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = SL_DIAGRAM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.ChartImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getChart()
	 * @generated
	 */
	int CHART = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ORIGINATOR_ID = BLOCK__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__REFERENCE = BLOCK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DESCRIPTION = BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PORTS = BLOCK__PORTS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DATATYPE = BLOCK__DATATYPE;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DIAGRAM = BLOCK__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SOURCE = BLOCK__SOURCE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TRANSITIONS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__STATES = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SYMBOLS = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART___GET_DIAGRAM = BLOCK___GET_DIAGRAM;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SFChartElementImpl <em>SF Chart Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SFChartElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSFChartElement()
	 * @generated
	 */
	int SF_CHART_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>SF Chart Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT___GET_CHART = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SF Chart Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SF_CHART_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.AStateImpl <em>AState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.AStateImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getAState()
	 * @generated
	 */
	int ASTATE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__ID = SF_CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__ORIGINATOR_ID = SF_CHART_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__PARAMETERS = SF_CHART_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__REFERENCE = SF_CHART_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__NAME = SF_CHART_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__DESCRIPTION = SF_CHART_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__INCOMING_TRANSITIONS = SF_CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__OUTGOING_TRANSITIONS = SF_CHART_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE__PARENT = SF_CHART_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE_FEATURE_COUNT = SF_CHART_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE___GET_CHART = SF_CHART_ELEMENT___GET_CHART;

	/**
	 * The number of operations of the '<em>AState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATE_OPERATION_COUNT = SF_CHART_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.TransitionImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = SF_CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ORIGINATOR_ID = SF_CHART_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETERS = SF_CHART_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REFERENCE = SF_CHART_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = SF_CHART_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = SF_CHART_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = SF_CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = SF_CHART_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = SF_CHART_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESTINATION = SF_CHART_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = SF_CHART_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = SF_CHART_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = SF_CHART_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_CHART = SF_CHART_ELEMENT___GET_CHART;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = SF_CHART_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ID = SF_CHART_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ORIGINATOR_ID = SF_CHART_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__PARAMETERS = SF_CHART_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__REFERENCE = SF_CHART_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = SF_CHART_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__DESCRIPTION = SF_CHART_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__SCOPE = SF_CHART_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Underlying Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__UNDERLYING_PORT = SF_CHART_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = SF_CHART_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL___GET_CHART = SF_CHART_ELEMENT___GET_CHART;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = SF_CHART_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getState()
	 * @generated
	 */
	int STATE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = ASTATE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ORIGINATOR_ID = ASTATE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARAMETERS = ASTATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REFERENCE = ASTATE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ASTATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = ASTATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = ASTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = ASTATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = ASTATE__PARENT;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = ASTATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = ASTATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>During</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DURING = ASTATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TYPE = ASTATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUB_STATES = ASTATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ASTATE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_CHART = ASTATE___GET_CHART;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ASTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.JunctionImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = ASTATE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ORIGINATOR_ID = ASTATE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PARAMETERS = ASTATE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__REFERENCE = ASTATE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = ASTATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DESCRIPTION = ASTATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__INCOMING_TRANSITIONS = ASTATE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTGOING_TRANSITIONS = ASTATE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PARENT = ASTATE__PARENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__TYPE = ASTATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = ASTATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION___GET_CHART = ASTATE___GET_CHART;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = ASTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DataImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getData()
	 * @generated
	 */
	int DATA = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = SYMBOL__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ORIGINATOR_ID = SYMBOL__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETERS = SYMBOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__REFERENCE = SYMBOL__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DESCRIPTION = SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SCOPE = SYMBOL__SCOPE;

	/**
	 * The feature id for the '<em><b>Underlying Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__UNDERLYING_PORT = SYMBOL__UNDERLYING_PORT;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA___GET_CHART = SYMBOL___GET_CHART;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MessageImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = SYMBOL__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ORIGINATOR_ID = SYMBOL__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETERS = SYMBOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__REFERENCE = SYMBOL__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SCOPE = SYMBOL__SCOPE;

	/**
	 * The feature id for the '<em><b>Underlying Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__UNDERLYING_PORT = SYMBOL__UNDERLYING_PORT;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_CHART = SYMBOL___GET_CHART;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.EventImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = SYMBOL__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ORIGINATOR_ID = SYMBOL__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = SYMBOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REFERENCE = SYMBOL__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = SYMBOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = SYMBOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SCOPE = SYMBOL__SCOPE;

	/**
	 * The feature id for the '<em><b>Underlying Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UNDERLYING_PORT = SYMBOL__UNDERLYING_PORT;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Chart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_CHART = SYMBOL___GET_CHART;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SYSTEMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DICTIONARIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DatatypeImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ID = MLInfraPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__ORIGINATOR_ID = MLInfraPackage.IDENTIFIED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__PARAMETERS = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__REFERENCE = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__NAME = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE__DESCRIPTION = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_OPERATION_COUNT = MLInfraPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BusImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ORIGINATOR_ID = DATATYPE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARAMETERS = DATATYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__REFERENCE = DATATYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__DESCRIPTION = DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Bus Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_ELEMENTS = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BusElementImpl <em>Bus Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BusElementImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBusElement()
	 * @generated
	 */
	int BUS_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BuiltIntypeImpl <em>Built Intype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BuiltIntypeImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBuiltIntype()
	 * @generated
	 */
	int BUILT_INTYPE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__ID = DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__ORIGINATOR_ID = DATATYPE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__PARAMETERS = DATATYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__REFERENCE = DATATYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE__DESCRIPTION = DATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Built Intype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built Intype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_INTYPE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.CustomTypeImpl <em>Custom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.CustomTypeImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getCustomType()
	 * @generated
	 */
	int CUSTOM_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__ID = DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__ORIGINATOR_ID = DATATYPE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__PARAMETERS = DATATYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__REFERENCE = DATATYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__DESCRIPTION = DATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Custom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DictionaryImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__DATATYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__FILE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Dictionaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__SUB_DICTIONARIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder <em>Port Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortHolder
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPortHolder()
	 * @generated
	 */
	int PORT_HOLDER = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_HOLDER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl <em>System Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSystemReference()
	 * @generated
	 */
	int SYSTEM_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__ORIGINATOR_ID = BLOCK__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__PARAMETERS = BLOCK__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__REFERENCE = BLOCK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__DESCRIPTION = BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__PORTS = BLOCK__PORTS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__DATATYPE = BLOCK__DATATYPE;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__DIAGRAM = BLOCK__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__SOURCE = BLOCK__SOURCE;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__SYSTEM = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE__REFERENCED_PORTS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE___GET_DIAGRAM = BLOCK___GET_DIAGRAM;

	/**
	 * The operation id for the '<em>Get Referenced Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE___GET_REFERENCED_PORT__PORT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REFERENCE_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder <em>Datatype Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDatatypeHolder()
	 * @generated
	 */
	int DATATYPE_HOLDER = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Datatype Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_HOLDER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.EnumerationImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ID = DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ORIGINATOR_ID = DATATYPE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PARAMETERS = DATATYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REFERENCE = DATATYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.LiteralImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ORIGINATOR_ID = NAMED_ELEMENT__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__PARAMETERS = NAMED_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SignalImpl
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Originator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ORIGINATOR_ID = DATATYPE__ORIGINATOR_ID;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PARAMETERS = DATATYPE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__REFERENCE = DATATYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DESCRIPTION = DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DATATYPE = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__INITIAL_VALUE = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__UNIT = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = DATATYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.PortKind <em>Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortKind
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPortKind()
	 * @generated
	 */
	int PORT_KIND = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Scope
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.JunctionType <em>Junction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.JunctionType
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getJunctionType()
	 * @generated
	 */
	int JUNCTION_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.capella.simulink.core.model.mlcore.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DecompositionType
	 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 34;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram <em>SL Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SL Diagram</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagram
	 * @generated
	 */
	EClass getSLDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getBlocks()
	 * @see #getSLDiagram()
	 * @generated
	 */
	EReference getSLDiagram_Blocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagram#getLines()
	 * @see #getSLDiagram()
	 * @generated
	 */
	EReference getSLDiagram_Lines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Block#getDiagram()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Diagram();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Block#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Block#getSource()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Line#getDiagram()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Diagram();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Line#getSource()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Line#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Line#getTarget()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Holder</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Port#getHolder()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Holder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Port#getKind()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Port#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Port#getIndex()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Index();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.System#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.System#getFileName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.System#isIsLibrary <em>Is Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Library</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.System#isIsLibrary()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_IsLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.System#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dictionary</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.System#getDictionary()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Dictionary();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagramElement <em>SL Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SL Diagram Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagramElement
	 * @generated
	 */
	EClass getSLDiagramElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.capella.simulink.core.model.mlcore.SLDiagramElement#getDiagram() <em>Get Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Diagram</em>' operation.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SLDiagramElement#getDiagram()
	 * @generated
	 */
	EOperation getSLDiagramElement__GetDiagram();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Chart#getTransitions()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Chart#getStates()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Chart#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Chart#getSymbols()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Symbols();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.SFChartElement <em>SF Chart Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SF Chart Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SFChartElement
	 * @generated
	 */
	EClass getSFChartElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.capella.simulink.core.model.mlcore.SFChartElement#getChart() <em>Get Chart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Chart</em>' operation.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SFChartElement#getChart()
	 * @generated
	 */
	EOperation getSFChartElement__GetChart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.AState <em>AState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AState</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.AState
	 * @generated
	 */
	EClass getAState();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.AState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.AState#getIncomingTransitions()
	 * @see #getAState()
	 * @generated
	 */
	EReference getAState_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.AState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.AState#getOutgoingTransitions()
	 * @see #getAState()
	 * @generated
	 */
	EReference getAState_OutgoingTransitions();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.capella.simulink.core.model.mlcore.AState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.AState#getParent()
	 * @see #getAState()
	 * @generated
	 */
	EReference getAState_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Action();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getDestination()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Destination();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Transition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Transition#getComment()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Symbol#getScope()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Scope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.Symbol#getUnderlyingPort <em>Underlying Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Underlying Port</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Symbol#getUnderlyingPort()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_UnderlyingPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Exit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Entry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getDuring <em>During</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>During</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State#getDuring()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_During();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State#getType()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.State#getSubStates <em>Sub States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub States</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.State#getSubStates()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_SubStates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Junction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Junction#getType()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Project#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Project#getSystems()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Systems();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Project#getDictionaries <em>Dictionaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dictionaries</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Project#getDictionaries()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Dictionaries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Bus#getBusElements <em>Bus Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Elements</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Bus#getBusElements()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_BusElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.BusElement <em>Bus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Element</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.BusElement
	 * @generated
	 */
	EClass getBusElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.BuiltIntype <em>Built Intype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built Intype</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.BuiltIntype
	 * @generated
	 */
	EClass getBuiltIntype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.CustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.CustomType
	 * @generated
	 */
	EClass getCustomType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getDatatypes()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Datatypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getFileName()
	 * @see #getDictionary()
	 * @generated
	 */
	EAttribute getDictionary_FileName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getSubDictionaries <em>Sub Dictionaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Dictionaries</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Dictionary#getSubDictionaries()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_SubDictionaries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder <em>Port Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Holder</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortHolder
	 * @generated
	 */
	EClass getPortHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortHolder#getPorts()
	 * @see #getPortHolder()
	 * @generated
	 */
	EReference getPortHolder_Ports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference <em>System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Reference</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SystemReference
	 * @generated
	 */
	EClass getSystemReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getSystem()
	 * @see #getSystemReference()
	 * @generated
	 */
	EReference getSystemReference_System();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getReferencedPorts <em>Referenced Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Ports</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getReferencedPorts()
	 * @see #getSystemReference()
	 * @generated
	 */
	EReference getSystemReference_ReferencedPorts();

	/**
	 * Returns the meta object for the '{@link org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getReferencedPort(org.eclipse.capella.simulink.core.model.mlcore.Port) <em>Get Referenced Port</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referenced Port</em>' operation.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.SystemReference#getReferencedPort(org.eclipse.capella.simulink.core.model.mlcore.Port)
	 * @generated
	 */
	EOperation getSystemReference__GetReferencedPort__Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder <em>Datatype Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Holder</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder
	 * @generated
	 */
	EClass getDatatypeHolder();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder#getDatatype()
	 * @see #getDatatypeHolder()
	 * @generated
	 */
	EReference getDatatypeHolder_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capella.simulink.core.model.mlcore.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capella.simulink.core.model.mlcore.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Signal#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Signal#getInitialValue()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.capella.simulink.core.model.mlcore.Signal#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Signal#getUnit()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Unit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.capella.simulink.core.model.mlcore.PortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Kind</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.PortKind
	 * @generated
	 */
	EEnum getPortKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.capella.simulink.core.model.mlcore.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.capella.simulink.core.model.mlcore.JunctionType <em>Junction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Junction Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.JunctionType
	 * @generated
	 */
	EEnum getJunctionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.capella.simulink.core.model.mlcore.DecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Type</em>'.
	 * @see org.eclipse.capella.simulink.core.model.mlcore.DecompositionType
	 * @generated
	 */
	EEnum getDecompositionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MLCoreFactory getMLCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl <em>SL Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSLDiagram()
		 * @generated
		 */
		EClass SL_DIAGRAM = eINSTANCE.getSLDiagram();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL_DIAGRAM__BLOCKS = eINSTANCE.getSLDiagram_Blocks();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SL_DIAGRAM__LINES = eINSTANCE.getSLDiagram_Lines();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BlockImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DIAGRAM = eINSTANCE.getBlock_Diagram();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__SOURCE = eINSTANCE.getBlock_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.LineImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__DIAGRAM = eINSTANCE.getLine_Diagram();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__SOURCE = eINSTANCE.getLine_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TARGET = eINSTANCE.getLine_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.PortImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__HOLDER = eINSTANCE.getPort_Holder();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__KIND = eINSTANCE.getPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__INDEX = eINSTANCE.getPort_Index();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SystemImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__FILE_NAME = eINSTANCE.getSystem_FileName();

		/**
		 * The meta object literal for the '<em><b>Is Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__IS_LIBRARY = eINSTANCE.getSystem_IsLibrary();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__DICTIONARY = eINSTANCE.getSystem_Dictionary();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SubsystemImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramElementImpl <em>SL Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SLDiagramElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSLDiagramElement()
		 * @generated
		 */
		EClass SL_DIAGRAM_ELEMENT = eINSTANCE.getSLDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Get Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SL_DIAGRAM_ELEMENT___GET_DIAGRAM = eINSTANCE.getSLDiagramElement__GetDiagram();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.NamedElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.ChartImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__TRANSITIONS = eINSTANCE.getChart_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__STATES = eINSTANCE.getChart_States();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__SYMBOLS = eINSTANCE.getChart_Symbols();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SFChartElementImpl <em>SF Chart Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SFChartElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSFChartElement()
		 * @generated
		 */
		EClass SF_CHART_ELEMENT = eINSTANCE.getSFChartElement();

		/**
		 * The meta object literal for the '<em><b>Get Chart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SF_CHART_ELEMENT___GET_CHART = eINSTANCE.getSFChartElement__GetChart();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.AStateImpl <em>AState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.AStateImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getAState()
		 * @generated
		 */
		EClass ASTATE = eINSTANCE.getAState();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTATE__INCOMING_TRANSITIONS = eINSTANCE.getAState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTATE__OUTGOING_TRANSITIONS = eINSTANCE.getAState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTATE__PARENT = eINSTANCE.getAState_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.TransitionImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DESTINATION = eINSTANCE.getTransition_Destination();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__COMMENT = eINSTANCE.getTransition_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SymbolImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__SCOPE = eINSTANCE.getSymbol_Scope();

		/**
		 * The meta object literal for the '<em><b>Underlying Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__UNDERLYING_PORT = eINSTANCE.getSymbol_UnderlyingPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.StateImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>During</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__DURING = eINSTANCE.getState_During();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TYPE = eINSTANCE.getState_Type();

		/**
		 * The meta object literal for the '<em><b>Sub States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUB_STATES = eINSTANCE.getState_SubStates();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.JunctionImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTION__TYPE = eINSTANCE.getJunction_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DataImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MessageImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.EventImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.ProjectImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SYSTEMS = eINSTANCE.getProject_Systems();

		/**
		 * The meta object literal for the '<em><b>Dictionaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DICTIONARIES = eINSTANCE.getProject_Dictionaries();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BusImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Bus Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__BUS_ELEMENTS = eINSTANCE.getBus_BusElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BusElementImpl <em>Bus Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BusElementImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBusElement()
		 * @generated
		 */
		EClass BUS_ELEMENT = eINSTANCE.getBusElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DatatypeImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.BuiltIntypeImpl <em>Built Intype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.BuiltIntypeImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getBuiltIntype()
		 * @generated
		 */
		EClass BUILT_INTYPE = eINSTANCE.getBuiltIntype();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.CustomTypeImpl <em>Custom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.CustomTypeImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getCustomType()
		 * @generated
		 */
		EClass CUSTOM_TYPE = eINSTANCE.getCustomType();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.DictionaryImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__DATATYPES = eINSTANCE.getDictionary_Datatypes();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY__FILE_NAME = eINSTANCE.getDictionary_FileName();

		/**
		 * The meta object literal for the '<em><b>Sub Dictionaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__SUB_DICTIONARIES = eINSTANCE.getDictionary_SubDictionaries();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.PortHolder <em>Port Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.PortHolder
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPortHolder()
		 * @generated
		 */
		EClass PORT_HOLDER = eINSTANCE.getPortHolder();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_HOLDER__PORTS = eINSTANCE.getPortHolder_Ports();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl <em>System Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SystemReferenceImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSystemReference()
		 * @generated
		 */
		EClass SYSTEM_REFERENCE = eINSTANCE.getSystemReference();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REFERENCE__SYSTEM = eINSTANCE.getSystemReference_System();

		/**
		 * The meta object literal for the '<em><b>Referenced Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REFERENCE__REFERENCED_PORTS = eINSTANCE.getSystemReference_ReferencedPorts();

		/**
		 * The meta object literal for the '<em><b>Get Referenced Port</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM_REFERENCE___GET_REFERENCED_PORT__PORT = eINSTANCE.getSystemReference__GetReferencedPort__Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder <em>Datatype Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDatatypeHolder()
		 * @generated
		 */
		EClass DATATYPE_HOLDER = eINSTANCE.getDatatypeHolder();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_HOLDER__DATATYPE = eINSTANCE.getDatatypeHolder_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.EnumerationImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.LiteralImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.SignalImpl
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__INITIAL_VALUE = eINSTANCE.getSignal_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__UNIT = eINSTANCE.getSignal_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.PortKind <em>Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.PortKind
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getPortKind()
		 * @generated
		 */
		EEnum PORT_KIND = eINSTANCE.getPortKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.Scope
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.JunctionType <em>Junction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.JunctionType
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getJunctionType()
		 * @generated
		 */
		EEnum JUNCTION_TYPE = eINSTANCE.getJunctionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.capella.simulink.core.model.mlcore.DecompositionType <em>Decomposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capella.simulink.core.model.mlcore.DecompositionType
		 * @see org.eclipse.capella.simulink.core.model.mlcore.impl.MLCorePackageImpl#getDecompositionType()
		 * @generated
		 */
		EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

	}

} //MLCorePackage
