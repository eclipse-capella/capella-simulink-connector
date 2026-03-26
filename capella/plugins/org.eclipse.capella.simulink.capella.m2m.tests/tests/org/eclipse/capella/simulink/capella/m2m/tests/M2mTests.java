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
package org.eclipse.capella.simulink.capella.m2m.tests;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import org.eclipse.capella.simulink.core.model.mlinfra.PrimitiveValue;
import org.eclipse.capella.simulink.core.model.mlinfra.Value;
import org.eclipse.capella.simulink.core.model.mloperation.MloperationFactory;
import org.eclipse.capella.simulink.core.model.mloperation.Operation;
import org.eclipse.capella.simulink.m2m.capella.CatalogHelper;
import org.eclipse.capella.simulink.m2m.capella.launcher.OperationRunnable;
import org.eclipse.capella.simulink.transformation.tests.TransformationTests;

/**
 * @author 
 *
 */
public class M2mTests extends TransformationTests {
	private static final String PROJECT_KEY ="project";
	private static final String STRATEGY_KEY ="strategy";
	private static final String ELEMENTS_KEY ="elements";

	@TestFactory
	public Stream<DynamicTest> testFiles() {
		new File("results").mkdir();
		return Arrays.asList(new File("expected").list((dir, name) -> name.endsWith(".m")))
	            .stream()
	            .sorted()
	            .map((file) -> dynamicTest(
	                    "Testing file: " + file,
	                    () -> { performTest(file); }));
	}

	private void performTest(String expectedFile) { 
		String radix = getRadix(expectedFile);  
		Properties props = loadProperties(radix);
		Session session = getSession(props.getProperty(PROJECT_KEY));
		try { 
			List<Object> userSelection = getElements(session, props.getProperty(ELEMENTS_KEY));
			org.eclipse.capella.simulink.core.model.mloperation.description.Operation operationDesc = CatalogHelper.HELPER.getCatalog().getOperation(props.getProperty(STRATEGY_KEY));
			Operation operation = MloperationFactory.eINSTANCE.createOperation();
			operation.setKind(operationDesc.getOperationkind().getId());
			CatalogHelper.HELPER.setDefaultOptions(operation);
			//init options
			for (Entry<String, Value> entry : operation.getMainConfiguration().getParameters()) {
				Object value = props.get(entry.getKey());
				if (value instanceof String) {
					((PrimitiveValue)entry.getValue()).setSpecification((String) value);
				}
					
			}
			
			// init selection
        	userSelection.stream().map(EObject.class::cast).forEach(obj -> operation.getTargets().add(obj));
			toMlcore(operation);
			String mlCoreFile = FileHelper.getMlCoreFile(props.getProperty(PROJECT_KEY));
	        
			testStatementGeneration(expectedFile, mlCoreFile);
		}
		finally {
			try {
			SessionManager.INSTANCE.remove(session);
		}
			catch (ConcurrentModificationException e ) {
				// occures randomly in tests
			}
	}
	}

	private List<Object> getElements(Session session, String ids) {
		return Pattern.compile("\\s").splitAsStream(ids).filter(id -> !id.trim().isEmpty()).map(id -> (Object)getElementByID(session, id.trim())).collect(Collectors.toList());
	}

	private Properties loadProperties(String radix) {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("org/eclipse/capella/simulink/capella/m2m/tests/configurations/"+radix+".properties"));
		} catch (IOException e) {
			fail(e);
		}
		return properties;
	}

	private Session getSession(String folder) {
		IProject project = FileHelper.installProjectIntoWorkspace("resources/" + folder);
		Session session = SessionManager.INSTANCE.getSession(URI.createPlatformResourceURI(project.getFile(folder+".aird").getFullPath().toString(), false), new NullProgressMonitor());
		session.open(new NullProgressMonitor());
		return session;
	}

	  private EObject getElementByID(Session session, String id) {
		  for (Resource res :session.getSemanticResources()) {
			  EObject eObject = res.getEObject(id);
			  if (eObject != null)
				  return eObject;
		  }
		  throw new IllegalStateException("Cannot find element: "+id);
	}

	private void toMlcore(Operation operation) {
		// apply transformation to mlcore
		OperationRunnable runnable = new OperationRunnable(operation);
		try {
			runnable.run(new NullProgressMonitor());
		} catch (InvocationTargetException e) {
			fail(e.getTargetException());
		} catch (InterruptedException e) {
			fail(e);
		}
	}
}
