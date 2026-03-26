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
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.FileURIHandlerImpl;


/**
 * 
 * @author 
 *
 */
public class StandaloneLibraryURIHandlerImpl extends FileURIHandlerImpl  implements LibraryURIHandler {

	private String libFolder;

	public StandaloneLibraryURIHandlerImpl(String libFolder) {
		this.libFolder = libFolder;
	}

	@Override
	public boolean canHandle(URI uri) {
		return SCHEME.equals(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		URI uri2 = URI.createFileURI(libFolder+uri.path());
		return super.createInputStream(uri2, options);
	}

}
