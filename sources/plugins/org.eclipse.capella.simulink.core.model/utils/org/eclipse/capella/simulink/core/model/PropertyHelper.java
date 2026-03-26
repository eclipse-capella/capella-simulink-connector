/*******************************************************************************
 * Copyright (c) 2020, 2026 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.capella.simulink.core.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;

import org.eclipse.capella.simulink.core.model.mlcore.NamedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.MLInfraFactory;
import org.eclipse.capella.simulink.core.model.mlinfra.MultipleValue;
import org.eclipse.capella.simulink.core.model.mlinfra.ParameterizedElement;
import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mlinfra.Value;

public class PropertyHelper {
// on blocks
	/*
	 * the value is multiple value which contains 4 four scalars (  x y width height)
	 */
	private static final String BOUNDS = "bounds";
	
// on links
	/*
	 * the value is multiple value which contains a single scalar ( O'Clock value) or two scalars ( x & y values)
	 */
	private static final String SOURCE_END_POSITION = "position.source";
	/*
	 * the value is multiple value which contains a single scalar ( O'Clock value) or two scalars ( x & y values)
	 */
	private static final String DESTINATION_END_POSITION = "position.destination"; 

//  Level of System elements
	private static final String LAYER = "capella.layer";
	
	private static final String ROOT_OF_LAYER = "capella.layer.root";
	
	//   list bridge's keys
	private static final Set<String> BRIDGE_KEYS = Stream.of(BOUNDS, SOURCE_END_POSITION, DESTINATION_END_POSITION, LAYER).collect(Collectors.toCollection(HashSet::new));
	

	public static Map<String, String> getMatlabParameters(ParameterizedElement elt) {
		Map<String, String> result = new HashMap<String, String>();
		for (Entry<String, Value> entry : elt.getParameters().entrySet()) {
			if (BRIDGE_KEYS.contains(entry.getKey()))
				continue;
			String value = null;
			if (entry.getValue() instanceof PrimitiveValue)
				value = ((PrimitiveValue) entry.getValue()).getSpecification();
			else if (entry.getValue() instanceof MultipleValue)
				value = toString((MultipleValue) entry.getValue());
			if (value != null)
				result.put(entry.getKey(), value );
		}
		return result;
	}
	
	public static boolean hasLayerRootMark(ParameterizedElement elt) {
		Value value = elt.getParameters().get(ROOT_OF_LAYER);
		if (value instanceof PrimitiveValue) {
			String specification = ((PrimitiveValue)value).getSpecification();
			return "True".equals(specification) || "true".equals(specification);
		}
		return false;
	}
	
	public static void markAsLayerRoot(ParameterizedElement elt) {
		PrimitiveValue value = MLInfraFactory.eINSTANCE.createPrimitiveValue();
		value.setSpecification("True");
		elt.getParameters().put(ROOT_OF_LAYER, value);
	}
	
	public static void setBounds(ParameterizedElement elt, int x, int y, int width, int height) {
		MultipleValue bounds = MLInfraFactory.eINSTANCE.createMultipleValue();
		addValue(bounds, x);
		addValue(bounds, y);
		addValue(bounds, width);
		addValue(bounds, height);
		elt.getParameters().put(BOUNDS, bounds);
	}
	
	public static void setLayer(ParameterizedElement elt, String value) {
		PrimitiveValue bounds = MLInfraFactory.eINSTANCE.createPrimitiveValue();
		bounds.setSpecification(value);
		elt.getParameters().put(LAYER, bounds);
	}
	
	public static String getLayer(ParameterizedElement elt) {
		Value value = getValue(elt, LAYER, false);
		if (value instanceof PrimitiveValue) {
			return ((PrimitiveValue) value).getSpecification();
		}
		return null;
	}

	public static void setSimpleProperty(ParameterizedElement elt, String name, String value) {
		name = name.trim();
		Value existing = getValue(elt, name, false);
		if (existing == null) {
			existing = MLInfraFactory.eINSTANCE.createPrimitiveValue();
			elt.getParameters().put(name, existing);
		}
		if (existing instanceof PrimitiveValue) {
			((PrimitiveValue) existing).setSpecification(value);
			return ;
		}
		throw new IllegalStateException("Value is not an instance of PrimitiveValue: "+value.getClass().getName());
	}
	
	public static String getSimpleProperty(ParameterizedElement elt, String name) {
		Value value = getValue(elt, name, false);
		if (value == null)
			return null;
		if (value instanceof PrimitiveValue) {
			return ((PrimitiveValue) value).getSpecification();
		}
		throw new IllegalStateException("Value is not an instance of PrimitiveValue: "+value.getClass().getName());
	}
	
	public static String getBoundsForStateFlow(ParameterizedElement elt) {
		MultipleValue value = (MultipleValue)getValue(elt, BOUNDS);
		EList<Value> values = value.getValues();
		if (values.size() != 4)
			throw new IllegalStateException("Bounds must have 4 scalars. id:"+elt.getId());
		return toString(value);
	}

	public static String toString(MultipleValue mvalue) {
		StringBuilder sb = new StringBuilder(100);
		sb.append('[');
		for (Value value : mvalue.getValues()) {
			if (value instanceof PrimitiveValue)
				sb.append(((PrimitiveValue) value).getSpecification());
			else
				sb.append('?');
			sb.append(' ');
		}
		if (sb.length() > 1)
			sb.deleteCharAt(sb.length()-1);
		sb.append(']');
		return sb.toString();
	}

	public static boolean hasBounds(ParameterizedElement elt) {
		Value value = elt.getParameters().get(BOUNDS);
		return value != null;
	}
	
	public static boolean hasBoundsInChilds(ParameterizedElement elt) {
		if (hasBounds(elt))
			return true;
		return elt.eContents().stream().anyMatch(o -> o instanceof ParameterizedElement && hasBounds((ParameterizedElement) o));
	}
	
	public static String getBoundsForSimulink(ParameterizedElement elt) {
		MultipleValue value = (MultipleValue)getValue(elt, BOUNDS);
		EList<Value> values = value.getValues();
		if (values.size() != 4)
			throw new IllegalStateException("Bounds must have 4 scalars. id:"+elt.getId());
		StringBuilder sb = new StringBuilder(100);
		int x = Integer.parseInt(((PrimitiveValue) values.get(0)).getSpecification());
		int y = Integer.parseInt(((PrimitiveValue) values.get(1)).getSpecification());
		int width = Integer.parseInt(((PrimitiveValue) values.get(2)).getSpecification());
		int height = Integer.parseInt(((PrimitiveValue) values.get(3)).getSpecification());
		sb.append('[');
		sb.append(x);
		sb.append(' ');
		sb.append(y);
		sb.append(' ');
		sb.append(x+width);
		sb.append(' ');
		sb.append(y+height);
		sb.append(']');
		return sb.toString();
	}

	public static String getCenter(ParameterizedElement elt) {
		String bounds = getBoundsForStateFlow(elt);
		String[] split = bounds.substring(1, bounds.length()-1).split("\\s+");
		int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
		StringBuilder sb = new StringBuilder(100);
		sb.append('[');
		sb.append(array[0]+array[2]/2);
		sb.append(' ');
		sb.append(array[1]+array[3]/2);
		sb.append(']');
		return sb.toString();
	}

	public static String getRadius(ParameterizedElement elt) {
		String bounds = getBoundsForStateFlow(elt);
		String[] split = bounds.substring(1, bounds.length()-1).split("\\s+");
		int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
		return ""+((array[3]+array[2])/4);
	}

	/**
	 * @param location  the value is a single scalar ( O'Clock value)
	 */
	public static void setSourceLocation(ParameterizedElement elt, double scalar) {
		MultipleValue value = MLInfraFactory.eINSTANCE.createMultipleValue();
		addValue(value, scalar);
		elt.getParameters().put(SOURCE_END_POSITION, value);
	}

	/**
	 * @param location  the value is two scalars ( x & y values)
	 */
	public static void setSourceLocation(ParameterizedElement elt, int x, int y) {
		MultipleValue value = MLInfraFactory.eINSTANCE.createMultipleValue();
		addValue(value, x);
		addValue(value, y);
		elt.getParameters().put(SOURCE_END_POSITION, value);
	}

	public static String getSourceLocation(ParameterizedElement elt) {
		return getLocation(elt, SOURCE_END_POSITION);
	}

	/**
	 * @param location  the value is a single scalar ( O'Clock value)
	 */
	public static void setDestinationLocation(ParameterizedElement elt, double scalar) {
		MultipleValue value = MLInfraFactory.eINSTANCE.createMultipleValue();
		addValue(value, scalar);
		elt.getParameters().put(DESTINATION_END_POSITION, value);
	}

	/**
	 * @param location  the value is two scalars ( x & y values)
	 */
	public static void setDestinationLocation(ParameterizedElement elt, int x, int y) {
		MultipleValue value = MLInfraFactory.eINSTANCE.createMultipleValue();
		addValue(value, x);
		addValue(value, y);
		elt.getParameters().put(DESTINATION_END_POSITION, value);
	}

	public static String getDestinationLocation(ParameterizedElement elt) {
		return getLocation(elt, DESTINATION_END_POSITION);
	}
	
	public static boolean isOClockLocation(String location) {
		return !location.trim().contains(" ");
	}

	// to handle int and double in the same way without conversions
	private static void addValue(MultipleValue value, Object scalar) {
		PrimitiveValue scalarValue = MLInfraFactory.eINSTANCE.createPrimitiveValue();
		scalarValue.setSpecification(""+scalar);
		value.getValues().add(scalarValue);
	}
	
	private static String getLocation(ParameterizedElement elt, String key) {
		Value val = getValue(elt, key);
		if (val instanceof PrimitiveValue)
			return ((PrimitiveValue) val).getSpecification();
		if (val instanceof MultipleValue) {
			MultipleValue value = (MultipleValue) val;
			EList<Value> values = value.getValues();
			if (values.size() == 1)
				return ((PrimitiveValue) values.get(0)).getSpecification();
			if (values.size() == 2) {
				StringBuilder sb = new StringBuilder(100);
				sb.append(((PrimitiveValue) values.get(0)).getSpecification());
				sb.append(' ');
				sb.append(((PrimitiveValue) values.get(1)).getSpecification());
				return sb.toString();
			} 
		}
		throw new IllegalStateException("Location must have 1 or 2 scalars. id:"+elt.getId());
	}

	private static Value getValue(ParameterizedElement elt, String key) {
		return getValue(elt, key, true);
	}
	
	private static Value getValue(ParameterizedElement elt, String key, boolean enforceExistence) {
		Value value = elt.getParameters().get(key);
		if (value == null && enforceExistence) {
			String name = elt.getId();
			if (elt instanceof NamedElement)
				name = ((NamedElement)elt).getName() + " / " + name;
			throw new IllegalStateException(String.format("There is no key '%s' on object %s", key, name));
		}
		return value;
	}

}
