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
package org.eclipse.capella.simulink.m2m.capella.rule.data.helper;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;

import org.eclipse.capella.simulink.core.model.mlcore.Datatype;

/**
 * @author 
 *
 */
public class PredefinedTypesHelper {

	private static final Map<String, String> predefinedTypes = new HashMap<>();
	static {
		predefinedTypes.put("Boolean", "library:/model/builtInTypes.mlcore#895807ab-63ff-4779-8bed-8ff8180aa13e");
		predefinedTypes.put("Byte", "library:/model/builtInTypes.mlcore#73495737-7776-4b32-bd60-679298ddd36b");
		predefinedTypes.put("Char", "library:/model/builtInTypes.mlcore#d386bdaf-8107-4db5-aada-ecdf042d8d1f");
		predefinedTypes.put("Double", "library:/model/builtInTypes.mlcore#af51b9eb-672c-4506-ac0a-3faefd6e01fc");
		predefinedTypes.put("Float", "library:/model/builtInTypes.mlcore#6a8cb80e-a3a8-4bce-b9f8-49dd1371a1c0");
//		predefinedTypes.put("Hexadecimal", "library:/model/builtInTypes.mlcore#");
		predefinedTypes.put("Integer", "library:/model/builtInTypes.mlcore#15c85f46-ad7f-4fc6-af4c-4b91579177b1");
		predefinedTypes.put("Long", "library:/model/builtInTypes.mlcore#00d92ac8-3b5d-44bb-89a8-cb71d44c1283");
		predefinedTypes.put("LongLong", "library:/model/builtInTypes.mlcore#2741be9b-8e19-48c0-baef-b109fdbd243c");
		predefinedTypes.put("Short", "library:/model/builtInTypes.mlcore#73495737-7776-4b32-bd60-679298ddd36b");
		predefinedTypes.put("String", "library:/model/builtInTypes.mlcore#6a508238-c18c-4e99-b021-21ef65851886");
		predefinedTypes.put("UnsignedInteger", "library:/model/builtInTypes.mlcore#cf2b84ed-a056-4d16-88f8-d79695dc36c0");
		predefinedTypes.put("UnsignedLong", "library:/model/builtInTypes.mlcore#dcb6921d-bf28-487f-a818-b47afcafae0b");
		predefinedTypes.put("UnsignedLongLong", "library:/model/builtInTypes.mlcore#24c1e089-50e4-4602-9325-4473125c0263");
		predefinedTypes.put("UnsignedShort", "library:/model/builtInTypes.mlcore#c429e0fa-20a6-40c9-ad40-9c443ff3e639");
	}

	public static boolean isManaged(String name) {
		return predefinedTypes.containsKey(name);
	}
	
	public static URI getUri(String name) {
		String uri = predefinedTypes.get(name);
		if (uri == null)
			return null;
		return URI.createURI(uri);
	}
	
	public static Datatype getType(IContext context, String name) {
		URI uri = getUri(name);
		if (uri == null)
			return null;
		ResourceSet set = (ResourceSet)context.get(ResourceUtil.TRANSPOSER_RESOURCE_SET);
		Datatype eObject = (Datatype)set.getEObject(PredefinedTypesHelper.getUri(name), true);
		return eObject;

	}
	
}
