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
package org.eclipse.capella.simulink.transformation.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import org.eclipse.capella.simulink.transformation.launcher.GeneratorLauncher;

/**
 * @author 
 *
 */
public class TransformationTests {

	
	@TestFactory
	public Stream<DynamicTest> testFiles() {
		new File("results").mkdir();
		return Arrays.asList(new File("expected").list())
	            .stream()
	            .sorted()
	            .map((file) -> dynamicTest(
	                    "Testing file: " + file,
	                    () -> { testModel(file); }));
	}

	private void testModel(String expectedFile) throws IOException {
		String modelFile = getRadix(expectedFile); 
		modelFile += ".mlcore";
		File modelPath = new File("../org.eclipse.capella.simulink.transformation/examples/pivot/");
		String mlCoreFile = new File(modelPath, modelFile).getAbsolutePath();
        testStatementGeneration(expectedFile, mlCoreFile);
	}

	protected String getRadix(String expectedFile) {
		// strip ".m" extension or ".m.X"
		int index = expectedFile.lastIndexOf(".m");
		return expectedFile.substring(0, index);
	}

	protected void testStatementGeneration(String expectedFile, String mlCoreFile) {
		int nb = 0;
		boolean result = true;
		List<String> errors = new ArrayList<>();
		while (result) {
			String suffix = "";
			if (nb > 0)
				suffix = "."+nb;
			try {
				result = doTestStatementGeneration(expectedFile+suffix, mlCoreFile, nb++ != 0);
				if (result)
					return ;
			} catch (Exception e) {
				errors.add(e.getMessage());
			}
		}
		if (!errors.isEmpty())
			fail(String.join("\n", errors));
	}
	protected boolean doTestStatementGeneration(String expectedFile, String mlCoreFile, boolean alternateFile) throws Exception {
		List<String> expectedContent = FileUtils.readFileContent("./expected/"+expectedFile, alternateFile);
		assertNotNull(expectedContent);
		if (expectedContent.isEmpty())
			return false;
        assertFalse(expectedContent.isEmpty());
		List<String> generated = getStatements(mlCoreFile);
		FileUtils.writeFileContent("./results/"+expectedFile, generated);
		assertNotNull(generated);
		assertFalse(generated.isEmpty());
			
		for (int i = 0; i < generated.size();i ++  ) {
			if (expectedContent.size() == i)
				throw new Exception("File:"+expectedFile+" Got "+(generated.size()-expectedContent.size())+ " additional line(s)");
			if (!generated.get(i).equals(expectedContent.get(i)))
				throw new Exception("File:"+expectedFile+" Line:"+(i+1)+" EXPECTING '"+expectedContent.get(i)+"' GOT '"+generated.get(i)+"'");
		}
		assertTrue(generated.size() == expectedContent.size(), "Expecting more lines...");
		return true;
	}

	protected List<String> getStatements(String srcpath)  {
		ResourceSet rs = new ResourceSetImpl();
		GeneratorLauncher helper = new GeneratorLauncher();
		helper.configure(rs);
		String generate = null;
		try {
			generate = helper.generate(rs, srcpath);
		} catch (Exception e) {
			generate = e.getMessage();
		}
		rs.getResources().stream().forEach(r -> r.unload());
		rs.getResources().clear();
		return Arrays.asList( generate.split("\\R"));
	}
	
}
