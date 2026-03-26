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

import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 
 *
 */
public class FileUtils {

	public static void writeFileContent(String srcpath, List<String> content) {
	    try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(srcpath))) {
	    	content.stream().forEach(line -> {
				try {
					bw.append(line);
					bw.newLine();
				} catch (IOException e) {
					fail("Cannot write "+srcpath, e);
				}
			});
	    	bw.flush();
	    } catch (IOException e) {
	        fail("Cannot write "+srcpath, e);
	    }
	}

	public static List<String> readFileContent(String srcpath, boolean alternateFile)  {
		List<String> list = new ArrayList<>();
	
	    try (BufferedReader br = Files.newBufferedReader(Paths.get(srcpath))) {
	
	        list = br.lines().filter(l -> !l.isEmpty()).collect(Collectors.toList());
	
	    } catch (IOException e) {
	    	if (!alternateFile)
	    		fail("Cannot read "+srcpath, e);
	    }
	    return list;
	}

}
