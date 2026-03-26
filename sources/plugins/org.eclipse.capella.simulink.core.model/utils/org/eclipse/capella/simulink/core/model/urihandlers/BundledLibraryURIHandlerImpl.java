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
package org.eclipse.capella.simulink.core.model.urihandlers;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

/**
 * 
 * @author 
 *
 */
public class BundledLibraryURIHandlerImpl extends URIHandlerImpl implements LibraryURIHandler {

	@Override
	public boolean canHandle(URI uri) {
		return SCHEME.equals(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		ClassLoader loader = getClass().getClassLoader();
		String path = uri.path();
		if (path.startsWith("/"))
			path = path.substring(1);
		InputStream input = loader.getResourceAsStream(path);
		return input;
	}
	
	  public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		  Map<String, Object> attributes = new HashMap<>();
		  attributes.put(URIConverter.ATTRIBUTE_READ_ONLY, Boolean.TRUE);
		  return attributes;
	  }


}
