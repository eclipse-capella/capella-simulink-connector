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
package org.eclipse.capella.simulink.core.model.mlcore.util;

import org.eclipse.capella.simulink.core.model.mlcore.AState;
import org.eclipse.capella.simulink.core.model.mlcore.Block;
import org.eclipse.capella.simulink.core.model.mlcore.BuiltIntype;
import org.eclipse.capella.simulink.core.model.mlcore.Bus;
import org.eclipse.capella.simulink.core.model.mlcore.BusElement;
import org.eclipse.capella.simulink.core.model.mlcore.Chart;
import org.eclipse.capella.simulink.core.model.mlcore.CustomType;
import org.eclipse.capella.simulink.core.model.mlcore.Data;
import org.eclipse.capella.simulink.core.model.mlcore.Datatype;
import org.eclipse.capella.simulink.core.model.mlcore.DatatypeHolder;
import org.eclipse.capella.simulink.core.model.mlcore.Dictionary;
import org.eclipse.capella.simulink.core.model.mlcore.Enumeration;
import org.eclipse.capella.simulink.core.model.mlcore.Event;
import org.eclipse.capella.simulink.core.model.mlcore.Junction;
import org.eclipse.capella.simulink.core.model.mlcore.Line;
import org.eclipse.capella.simulink.core.model.mlcore.Literal;
import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.mlcore.Message;
import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlcore.Port;
import org.eclipse.capella.simulink.core.model.mlcore.PortHolder;
import org.eclipse.capella.simulink.core.model.mlcore.Project;
import org.eclipse.capella.simulink.core.model.mlcore.SFChartElement;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagram;
import org.eclipse.capella.simulink.core.model.mlcore.SLDiagramElement;
import org.eclipse.capella.simulink.core.model.mlcore.Signal;
import org.eclipse.capella.simulink.core.model.mlcore.State;
import org.eclipse.capella.simulink.core.model.mlcore.Subsystem;
import org.eclipse.capella.simulink.core.model.mlcore.Symbol;
import org.eclipse.capella.simulink.core.model.mlcore.SystemReference;
import org.eclipse.capella.simulink.core.model.mlcore.Transition;

import org.eclipse.capella.simulink.core.model.mlinfra.IdentifiedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage
 * @generated
 */
public class MLCoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MLCorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLCoreSwitch() {
		if (modelPackage == null) {
			modelPackage = MLCorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MLCorePackage.SL_DIAGRAM: {
				SLDiagram slDiagram = (SLDiagram)theEObject;
				T result = caseSLDiagram(slDiagram);
				if (result == null) result = casePortHolder(slDiagram);
				if (result == null) result = caseNamedElement(slDiagram);
				if (result == null) result = caseParameterizedElement(slDiagram);
				if (result == null) result = caseIdentifiedElement(slDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseSLDiagramElement(block);
				if (result == null) result = casePortHolder(block);
				if (result == null) result = caseDatatypeHolder(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = caseParameterizedElement(block);
				if (result == null) result = caseIdentifiedElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseSLDiagramElement(line);
				if (result == null) result = caseNamedElement(line);
				if (result == null) result = caseParameterizedElement(line);
				if (result == null) result = caseIdentifiedElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseSLDiagramElement(port);
				if (result == null) result = caseDatatypeHolder(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseParameterizedElement(port);
				if (result == null) result = caseIdentifiedElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SYSTEM: {
				org.eclipse.capella.simulink.core.model.mlcore.System system = (org.eclipse.capella.simulink.core.model.mlcore.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseSLDiagram(system);
				if (result == null) result = casePortHolder(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = caseParameterizedElement(system);
				if (result == null) result = caseIdentifiedElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = caseSLDiagram(subsystem);
				if (result == null) result = caseBlock(subsystem);
				if (result == null) result = casePortHolder(subsystem);
				if (result == null) result = caseSLDiagramElement(subsystem);
				if (result == null) result = caseDatatypeHolder(subsystem);
				if (result == null) result = caseNamedElement(subsystem);
				if (result == null) result = caseParameterizedElement(subsystem);
				if (result == null) result = caseIdentifiedElement(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SL_DIAGRAM_ELEMENT: {
				SLDiagramElement slDiagramElement = (SLDiagramElement)theEObject;
				T result = caseSLDiagramElement(slDiagramElement);
				if (result == null) result = caseNamedElement(slDiagramElement);
				if (result == null) result = caseParameterizedElement(slDiagramElement);
				if (result == null) result = caseIdentifiedElement(slDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseParameterizedElement(namedElement);
				if (result == null) result = caseIdentifiedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.CHART: {
				Chart chart = (Chart)theEObject;
				T result = caseChart(chart);
				if (result == null) result = caseBlock(chart);
				if (result == null) result = caseSLDiagramElement(chart);
				if (result == null) result = casePortHolder(chart);
				if (result == null) result = caseDatatypeHolder(chart);
				if (result == null) result = caseNamedElement(chart);
				if (result == null) result = caseParameterizedElement(chart);
				if (result == null) result = caseIdentifiedElement(chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SF_CHART_ELEMENT: {
				SFChartElement sfChartElement = (SFChartElement)theEObject;
				T result = caseSFChartElement(sfChartElement);
				if (result == null) result = caseNamedElement(sfChartElement);
				if (result == null) result = caseParameterizedElement(sfChartElement);
				if (result == null) result = caseIdentifiedElement(sfChartElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.ASTATE: {
				AState aState = (AState)theEObject;
				T result = caseAState(aState);
				if (result == null) result = caseSFChartElement(aState);
				if (result == null) result = caseNamedElement(aState);
				if (result == null) result = caseParameterizedElement(aState);
				if (result == null) result = caseIdentifiedElement(aState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseSFChartElement(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseParameterizedElement(transition);
				if (result == null) result = caseIdentifiedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SYMBOL: {
				Symbol symbol = (Symbol)theEObject;
				T result = caseSymbol(symbol);
				if (result == null) result = caseSFChartElement(symbol);
				if (result == null) result = caseNamedElement(symbol);
				if (result == null) result = caseParameterizedElement(symbol);
				if (result == null) result = caseIdentifiedElement(symbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseAState(state);
				if (result == null) result = caseSFChartElement(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseParameterizedElement(state);
				if (result == null) result = caseIdentifiedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseAState(junction);
				if (result == null) result = caseSFChartElement(junction);
				if (result == null) result = caseNamedElement(junction);
				if (result == null) result = caseParameterizedElement(junction);
				if (result == null) result = caseIdentifiedElement(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseSymbol(data);
				if (result == null) result = caseSFChartElement(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = caseParameterizedElement(data);
				if (result == null) result = caseIdentifiedElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseSymbol(message);
				if (result == null) result = caseSFChartElement(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseParameterizedElement(message);
				if (result == null) result = caseIdentifiedElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseSymbol(event);
				if (result == null) result = caseSFChartElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = caseParameterizedElement(event);
				if (result == null) result = caseIdentifiedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseNamedElement(project);
				if (result == null) result = caseParameterizedElement(project);
				if (result == null) result = caseIdentifiedElement(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseDatatype(bus);
				if (result == null) result = caseNamedElement(bus);
				if (result == null) result = caseParameterizedElement(bus);
				if (result == null) result = caseIdentifiedElement(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.BUS_ELEMENT: {
				BusElement busElement = (BusElement)theEObject;
				T result = caseBusElement(busElement);
				if (result == null) result = caseDatatypeHolder(busElement);
				if (result == null) result = caseNamedElement(busElement);
				if (result == null) result = caseParameterizedElement(busElement);
				if (result == null) result = caseIdentifiedElement(busElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseNamedElement(datatype);
				if (result == null) result = caseParameterizedElement(datatype);
				if (result == null) result = caseIdentifiedElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.BUILT_INTYPE: {
				BuiltIntype builtIntype = (BuiltIntype)theEObject;
				T result = caseBuiltIntype(builtIntype);
				if (result == null) result = caseDatatype(builtIntype);
				if (result == null) result = caseNamedElement(builtIntype);
				if (result == null) result = caseParameterizedElement(builtIntype);
				if (result == null) result = caseIdentifiedElement(builtIntype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.CUSTOM_TYPE: {
				CustomType customType = (CustomType)theEObject;
				T result = caseCustomType(customType);
				if (result == null) result = caseDatatype(customType);
				if (result == null) result = caseNamedElement(customType);
				if (result == null) result = caseParameterizedElement(customType);
				if (result == null) result = caseIdentifiedElement(customType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.DICTIONARY: {
				Dictionary dictionary = (Dictionary)theEObject;
				T result = caseDictionary(dictionary);
				if (result == null) result = caseNamedElement(dictionary);
				if (result == null) result = caseParameterizedElement(dictionary);
				if (result == null) result = caseIdentifiedElement(dictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.PORT_HOLDER: {
				PortHolder portHolder = (PortHolder)theEObject;
				T result = casePortHolder(portHolder);
				if (result == null) result = caseNamedElement(portHolder);
				if (result == null) result = caseParameterizedElement(portHolder);
				if (result == null) result = caseIdentifiedElement(portHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SYSTEM_REFERENCE: {
				SystemReference systemReference = (SystemReference)theEObject;
				T result = caseSystemReference(systemReference);
				if (result == null) result = caseBlock(systemReference);
				if (result == null) result = caseSLDiagramElement(systemReference);
				if (result == null) result = casePortHolder(systemReference);
				if (result == null) result = caseDatatypeHolder(systemReference);
				if (result == null) result = caseNamedElement(systemReference);
				if (result == null) result = caseParameterizedElement(systemReference);
				if (result == null) result = caseIdentifiedElement(systemReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.DATATYPE_HOLDER: {
				DatatypeHolder datatypeHolder = (DatatypeHolder)theEObject;
				T result = caseDatatypeHolder(datatypeHolder);
				if (result == null) result = caseNamedElement(datatypeHolder);
				if (result == null) result = caseParameterizedElement(datatypeHolder);
				if (result == null) result = caseIdentifiedElement(datatypeHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseDatatype(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = caseParameterizedElement(enumeration);
				if (result == null) result = caseIdentifiedElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseNamedElement(literal);
				if (result == null) result = caseParameterizedElement(literal);
				if (result == null) result = caseIdentifiedElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MLCorePackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseDatatype(signal);
				if (result == null) result = caseDatatypeHolder(signal);
				if (result == null) result = caseNamedElement(signal);
				if (result == null) result = caseParameterizedElement(signal);
				if (result == null) result = caseIdentifiedElement(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SL Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SL Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLDiagram(SLDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.eclipse.capella.simulink.core.model.mlcore.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SL Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SL Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLDiagramElement(SLDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SF Chart Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SF Chart Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFChartElement(SFChartElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAState(AState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusElement(BusElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built Intype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built Intype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltIntype(BuiltIntype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomType(CustomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionary(Dictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortHolder(PortHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemReference(SystemReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeHolder(DatatypeHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedElement(ParameterizedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MLCoreSwitch
