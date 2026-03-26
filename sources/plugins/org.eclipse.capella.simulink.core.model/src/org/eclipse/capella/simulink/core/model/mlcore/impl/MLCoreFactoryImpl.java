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

import java.util.UUID;

import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.BuiltIntype;
import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.CustomType;
import org.eclipse.capella.simulink.core.model.mlcore.Data;
import org.eclipse.capella.simulink.core.model.mlcore.DecompositionType;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Enumeration;
import org.eclipse.capella.simulink.core.model.mlcore.Event;
import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.core.model.mlcore.JunctionType;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.Literal;
import org.eclipse.capella.simulink.core.model.mlcore.MLCoreFactory;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Message;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortKind;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.Scope;
import org.eclipse.capella.simulink.core.model.mlcore.Signal;
import org.eclipse.capella.simulink.core.model.mlcore.State;
import org.eclipse.capella.simulink.core.model.mlcore.Subsystem;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlcore.Transition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MLCoreFactoryImpl extends EFactoryImpl implements MLCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MLCoreFactory init() {
		try {
			MLCoreFactory theMLCoreFactory = (MLCoreFactory)EPackage.Registry.INSTANCE.getEFactory(MLCorePackage.eNS_URI);
			if (theMLCoreFactory != null) {
				return theMLCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MLCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MLCorePackage.BLOCK: return createBlock();
			case MLCorePackage.LINE: return createLine();
			case MLCorePackage.PORT: return createPort();
			case MLCorePackage.SYSTEM: return createSystem();
			case MLCorePackage.SUBSYSTEM: return createSubsystem();
			case MLCorePackage.CHART: return createChart();
			case MLCorePackage.TRANSITION: return createTransition();
			case MLCorePackage.STATE: return createState();
			case MLCorePackage.JUNCTION: return createJunction();
			case MLCorePackage.DATA: return createData();
			case MLCorePackage.MESSAGE: return createMessage();
			case MLCorePackage.EVENT: return createEvent();
			case MLCorePackage.PROJECT: return createProject();
			case MLCorePackage.BUS: return createBus();
			case MLCorePackage.BUS_ELEMENT: return createBusElement();
			case MLCorePackage.BUILT_INTYPE: return createBuiltIntype();
			case MLCorePackage.CUSTOM_TYPE: return createCustomType();
			case MLCorePackage.DICTIONARY: return createDictionary();
			case MLCorePackage.SYSTEM_REFERENCE: return createSystemReference();
			case MLCorePackage.ENUMERATION: return createEnumeration();
			case MLCorePackage.LITERAL: return createLiteral();
			case MLCorePackage.SIGNAL: return createSignal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MLCorePackage.PORT_KIND:
				return createPortKindFromString(eDataType, initialValue);
			case MLCorePackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case MLCorePackage.JUNCTION_TYPE:
				return createJunctionTypeFromString(eDataType, initialValue);
			case MLCorePackage.DECOMPOSITION_TYPE:
				return createDecompositionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MLCorePackage.PORT_KIND:
				return convertPortKindToString(eDataType, instanceValue);
			case MLCorePackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case MLCorePackage.JUNCTION_TYPE:
				return convertJunctionTypeToString(eDataType, instanceValue);
			case MLCorePackage.DECOMPOSITION_TYPE:
				return convertDecompositionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		block.setId(UUID.randomUUID().toString());
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Line createLine() {
		LineImpl line = new LineImpl();
		line.setId(UUID.randomUUID().toString());
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		port.setId(UUID.randomUUID().toString());
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public org.eclipse.capella.simulink.core.model.mlcore.System createSystem() {
		SystemImpl system = new SystemImpl();
		system.setId(UUID.randomUUID().toString());
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		subsystem.setId(UUID.randomUUID().toString());
		subsystem.setSource("simulink/Ports & Subsystems/Subsystem");
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		chart.setId(UUID.randomUUID().toString());
		chart.setSource("sflib/Chart");
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		state.setId(UUID.randomUUID().toString());
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		junction.setId(UUID.randomUUID().toString());
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		data.setId(UUID.randomUUID().toString());
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		message.setId(UUID.randomUUID().toString());
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		event.setId(UUID.randomUUID().toString());
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		project.setId(UUID.randomUUID().toString());
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		bus.setId(UUID.randomUUID().toString());
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BusElement createBusElement() {
		BusElementImpl busElement = new BusElementImpl();
		busElement.setId(UUID.randomUUID().toString());
		return busElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public BuiltIntype createBuiltIntype() {
		BuiltIntypeImpl builtIntype = new BuiltIntypeImpl();
		builtIntype.setId(UUID.randomUUID().toString());
		return builtIntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CustomType createCustomType() {
		CustomTypeImpl customType = new CustomTypeImpl();
		customType.setId(UUID.randomUUID().toString());
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		dictionary.setId(UUID.randomUUID().toString());
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SystemReference createSystemReference() {
		SystemReferenceImpl systemReference = new SystemReferenceImpl();
		systemReference.setId(UUID.randomUUID().toString());
		systemReference.setSource("simulink/Ports & Subsystems/Model");
		return systemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		enumeration.setId(UUID.randomUUID().toString());
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		literal.setId(UUID.randomUUID().toString());
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		signal.setId(UUID.randomUUID().toString());
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		transition.setId(UUID.randomUUID().toString());
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortKind createPortKindFromString(EDataType eDataType, String initialValue) {
		PortKind result = PortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunctionType createJunctionTypeFromString(EDataType eDataType, String initialValue) {
		JunctionType result = JunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType createDecompositionTypeFromString(EDataType eDataType, String initialValue) {
		DecompositionType result = DecompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLCorePackage getMLCorePackage() {
		return (MLCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MLCorePackage getPackage() {
		return MLCorePackage.eINSTANCE;
	}

} //MLCoreFactoryImpl
