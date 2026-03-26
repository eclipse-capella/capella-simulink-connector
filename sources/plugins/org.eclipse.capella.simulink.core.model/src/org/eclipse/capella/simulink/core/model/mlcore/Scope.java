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
 * A representation of the literals of the enumeration '<em><b>Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage#getScope()
 * @model
 * @generated
 */
public enum Scope implements Enumerator {
	/**
	 * The '<em><b>Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT(0, "Input", "Input"),

	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(1, "Local", "Local"),

	/**
	 * The '<em><b>Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT(2, "Output", "Output"),

	/**
	 * The '<em><b>Constant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(9, "Constant", "Constant"),

	/**
	 * The '<em><b>Data Store Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STORE_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_STORE_MEMORY(3, "DataStoreMemory", "Data Store Memory"),

	/**
	 * The '<em><b>Temporary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARY(4, "Temporary", "Temporary"),

	/**
	 * The '<em><b>Imported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORTED(5, "Imported", "Imported"),

	/**
	 * The '<em><b>Exported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPORTED(6, "Exported", "Exported"),

	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(10, "Parameter", "Parameter");

	/**
	 * The '<em><b>Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT
	 * @model name="Input"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_VALUE = 0;

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="Local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 1;

	/**
	 * The '<em><b>Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT
	 * @model name="Output"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_VALUE = 2;

	/**
	 * The '<em><b>Constant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model name="Constant"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 9;

	/**
	 * The '<em><b>Data Store Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STORE_MEMORY
	 * @model name="DataStoreMemory" literal="Data Store Memory"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_STORE_MEMORY_VALUE = 3;

	/**
	 * The '<em><b>Temporary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY
	 * @model name="Temporary"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARY_VALUE = 4;

	/**
	 * The '<em><b>Imported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTED
	 * @model name="Imported"
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTED_VALUE = 5;

	/**
	 * The '<em><b>Exported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORTED
	 * @model name="Exported"
	 * @generated
	 * @ordered
	 */
	public static final int EXPORTED_VALUE = 6;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scope[] VALUES_ARRAY =
		new Scope[] {
			INPUT,
			LOCAL,
			OUTPUT,
			CONSTANT,
			DATA_STORE_MEMORY,
			TEMPORARY,
			IMPORTED,
			EXPORTED,
			PARAMETER,
		};

	/**
	 * A public read-only list of all the '<em><b>Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scope get(int value) {
		switch (value) {
			case INPUT_VALUE: return INPUT;
			case LOCAL_VALUE: return LOCAL;
			case OUTPUT_VALUE: return OUTPUT;
			case CONSTANT_VALUE: return CONSTANT;
			case DATA_STORE_MEMORY_VALUE: return DATA_STORE_MEMORY;
			case TEMPORARY_VALUE: return TEMPORARY;
			case IMPORTED_VALUE: return IMPORTED;
			case EXPORTED_VALUE: return EXPORTED;
			case PARAMETER_VALUE: return PARAMETER;
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
	private Scope(int value, String name, String literal) {
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
	
} //Scope
