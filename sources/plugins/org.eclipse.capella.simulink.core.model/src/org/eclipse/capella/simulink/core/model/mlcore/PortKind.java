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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getPortKind()
 * @model
 * @generated
 */
public enum PortKind implements Enumerator {
	/**
	 * The '<em><b>Inport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPORT_VALUE
	 * @generated
	 * @ordered
	 */
	INPORT(0, "Inport", "Inport"),

	/**
	 * The '<em><b>Outport</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPORT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPORT(1, "Outport", "Outport"),

	/**
	 * The '<em><b>Enable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLE(2, "Enable", "Enable"),

	/**
	 * The '<em><b>Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(3, "Trigger", "Trigger"),

	/**
	 * The '<em><b>State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(4, "State", "State"),

	/**
	 * The '<em><b>LConn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LCONN_VALUE
	 * @generated
	 * @ordered
	 */
	LCONN(5, "LConn", "LConn"),

	/**
	 * The '<em><b>RConn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCONN_VALUE
	 * @generated
	 * @ordered
	 */
	RCONN(6, "RConn", "RConn"),

	/**
	 * The '<em><b>Ifaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IFACTION_VALUE
	 * @generated
	 * @ordered
	 */
	IFACTION(7, "Ifaction", "Ifaction"),

	/**
	 * The '<em><b>Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(8, "Reset", "Reset");

	/**
	 * The '<em><b>Inport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPORT
	 * @model name="Inport"
	 * @generated
	 * @ordered
	 */
	public static final int INPORT_VALUE = 0;

	/**
	 * The '<em><b>Outport</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPORT
	 * @model name="Outport"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPORT_VALUE = 1;

	/**
	 * The '<em><b>Enable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLE
	 * @model name="Enable"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLE_VALUE = 2;

	/**
	 * The '<em><b>Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER
	 * @model name="Trigger"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 3;

	/**
	 * The '<em><b>State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model name="State"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 4;

	/**
	 * The '<em><b>LConn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LCONN
	 * @model name="LConn"
	 * @generated
	 * @ordered
	 */
	public static final int LCONN_VALUE = 5;

	/**
	 * The '<em><b>RConn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCONN
	 * @model name="RConn"
	 * @generated
	 * @ordered
	 */
	public static final int RCONN_VALUE = 6;

	/**
	 * The '<em><b>Ifaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IFACTION
	 * @model name="Ifaction"
	 * @generated
	 * @ordered
	 */
	public static final int IFACTION_VALUE = 7;

	/**
	 * The '<em><b>Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model name="Reset"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 8;

	/**
	 * An array of all the '<em><b>Port Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortKind[] VALUES_ARRAY =
		new PortKind[] {
			INPORT,
			OUTPORT,
			ENABLE,
			TRIGGER,
			STATE,
			LCONN,
			RCONN,
			IFACTION,
			RESET,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortKind get(int value) {
		switch (value) {
			case INPORT_VALUE: return INPORT;
			case OUTPORT_VALUE: return OUTPORT;
			case ENABLE_VALUE: return ENABLE;
			case TRIGGER_VALUE: return TRIGGER;
			case STATE_VALUE: return STATE;
			case LCONN_VALUE: return LCONN;
			case RCONN_VALUE: return RCONN;
			case IFACTION_VALUE: return IFACTION;
			case RESET_VALUE: return RESET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PortKind
