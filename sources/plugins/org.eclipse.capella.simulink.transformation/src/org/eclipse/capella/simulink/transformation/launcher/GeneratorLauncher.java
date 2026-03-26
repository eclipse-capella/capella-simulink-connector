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
package org.eclipse.capella.simulink.transformation.launcher;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.capella.simulink.core.model.mlcore.MLCorePackage;
import org.eclipse.capella.simulink.core.model.urihandlers.BundledLibraryURIHandlerImpl;
import org.eclipse.capella.simulink.core.model.urihandlers.LibraryURIHandler;
import org.eclipse.capella.simulink.transformation.ProjectGenerator;
import org.eclipse.capella.simulink.transformation.utils.ValidationHelper;
/**
 * 
 * @author 
 *
 */
public class GeneratorLauncher {

    public void configure(ResourceSet rs)  {

        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        Registry pr = rs.getPackageRegistry();
        pr.put(MLCorePackage.eNS_URI, MLCorePackage.eINSTANCE);
        if (! rs.getURIConverter().getURIHandlers().stream().anyMatch(h -> h instanceof LibraryURIHandler))
        	rs.getURIConverter().getURIHandlers().add(0, new BundledLibraryURIHandlerImpl());
    }
    
    public String generate(ResourceSet rs, String path) throws Exception {
    	URI uri = org.eclipse.emf.common.util.URI.createFileURI(path );
    	return generate(rs, uri);
    }
    public String generate(ResourceSet rs, URI uri) throws Exception {
        Resource res = rs.createResource(uri);
        res.load(new HashMap<>());
        EcoreUtil.resolveAll(res);
        // check loading errors
        ValidationHelper helper = new ValidationHelper();
        List<String> errors = res.getContents().stream().flatMap(elt -> helper.processValidation(elt).stream()).map(diag -> diag.getMessage()).collect( Collectors.toList() );
        if (!errors.isEmpty() ) {
        	errors.add(0, "Model validation failed:");
        	throw new IllegalStateException( String.join("\n", errors));
			
        }
        return generate(res);
        
    }

	public String generate(Resource res) {
		ProjectGenerator gen = new ProjectGenerator();
        res.getContents().stream().forEach(model -> gen.doSwitch(model));
        return gen.getScript();
    }
}