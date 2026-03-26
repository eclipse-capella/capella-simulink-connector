/*******************************************************************************
 * Copyright (c) 2021-2026 THALES GLOBAL SERVICES.
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
package org.eclipse.capella.simulink.m2m.capella.common;

/**
 * @author 
 */
public interface IConstants {
	
	/** Pivot resource identifier used in Transposer Context **/
	static final String PIVOT_ROOT_CONTAINER = "pivot.root.container"; //$NON-NLS-1$
	static final String DICTIONARIES = "dictionaries.container"; //$NON-NLS-1$

	static final String CURRENT_OPERATION = "current.operation"; //$NON-NLS-1$
	
	/** Pivot file extension **/
	static final String PIVOT_EXTENSION 	= "mlcore"; //$NON-NLS-1$
	
	/** Capella file extension **/
	static final String CAPELLA_EXTENSION = "capella"; //$NON-NLS-1$
	
	/** Capella elements to transform **/
	static final String CAPELLA_ELEMENTS_SET = "capella.elements.set"; //$NON-NLS-1$
	
	
	/** Transformation properties **/
	static final String TRANSFORMATION_GRAPHICAL_INFORMATIONS = "capella.graphical.informations"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_GENERIC_ACTIVITY_ID = "org.eclipse.capella.simulink.m2m.capella.activity.transformation.initialize.generic"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_SM_ACTIVITY_ID = "org.eclipse.capella.simulink.m2m.capella.activity.transformation.initialize.sm"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_DATA_ACTIVITY_ID = "org.eclipse.capella.simulink.m2m.capella.activity.transformation.initialize.data"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_INIT_COLLECT_GRAPHICAL_DATA_ID = "org.eclipse.capella.simulink.m2m.capella.activity.transformation.graphical.data.collect"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_DICTIONARY_DEPENDENCY_ID = "org.eclipse.capella.simulink.m2m.capella.to.pivot.dictionary.dependency"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_TO_PIVOT_POST_ACTIVITY_ID = "org.eclipse.capella.simulink.m2m.capella.to.pivot.transformation.post"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_SM_TO_PIVOT_MAPPING = "org.eclipse.capella.simulink.m2m.capella.to.pivot.mapping.sm"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_SM_TO_PIVOT_PURPOSE = "org.eclipse.capella.simulink.m2m.capella.to.pivot.purpose.sm"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_DATA_TO_PIVOT_MAPPING = "org.eclipse.capella.simulink.m2m.capella.to.pivot.mapping.data"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_DATA_TO_PIVOT_PURPOSE = "org.eclipse.capella.simulink.m2m.capella.to.pivot.purpose.data"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_FUNCTION_TO_PIVOT_MAPPING = "org.eclipse.capella.simulink.m2m.capella.to.pivot.mapping.function"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_FUNCTION_TO_PIVOT_PURPOSE = "org.eclipse.capella.simulink.m2m.capella.to.pivot.purpose.function"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_FUNCTIONALCHAIN_TO_PIVOT_MAPPING = "org.eclipse.capella.simulink.m2m.capella.to.pivot.mapping.fc"; //$NON-NLS-1$
	static final String TRANSFORMATION_CAPELLA_FUNCTIONALCHAIN_TO_PIVOT_PURPOSE = "org.eclipse.capella.simulink.m2m.capella.to.pivot.purpose.fc"; //$NON-NLS-1$
}
