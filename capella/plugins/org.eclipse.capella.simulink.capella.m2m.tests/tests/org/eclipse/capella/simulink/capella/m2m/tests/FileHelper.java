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
package org.eclipse.capella.simulink.capella.m2m.tests;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.polarsys.capella.common.mdsofa.common.helper.ProjectHelper;

import com.google.common.io.Files;

/**
 * subset of org.polarsys.capella.test.framework.helpers.TestHelper
 *
 */
public class FileHelper {
	public static void copy(File sourceLocation, File targetLocation) throws IOException {
		if (sourceLocation.isDirectory()) {
			copyDirectory(sourceLocation, targetLocation);
		} else if (!targetLocation.isDirectory()) {
			Files.copy(sourceLocation, targetLocation);
		} else {
			File targetFile = new File(targetLocation.toString() + "/" + sourceLocation.getName()); //$NON-NLS-1$
			Files.copy(sourceLocation, targetFile);
		}
	}

	private static void copyDirectory(File source, File target) throws IOException {
		if (!target.exists()) {
			target.mkdir();
		}

		for (String f : source.list()) {
			copy(new File(source, f), new File(target, f));
		}
	}
	
	public static String getMlCoreFile(String modelName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		IProject project = workspace.getRoot().getProject(modelName);
		IFile file = project.getFile(modelName);
		return file.getLocation().toString()+".mlcore";
	}

	public static IProject createCapellaProject(String name) {
		// Get the workspace.
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// Get a project for given name.
		IProject project = workspace.getRoot().getProject(name);
		// Should not exist, workspace is supposed to be cleaned before the
		// tests execution.
		if (!project.exists()) {
			try {
				IProjectDescription description = workspace.newProjectDescription(name);
				// Add the project nature.
				description.setNatureIds(new String[] { "org.polarsys.capella.project.nature" });
				project.create(description, new NullProgressMonitor());
			} catch (CoreException exception) {
				fail(exception.getMessage());
			}
		}
		// Open the project.
		try {
			project.open(new NullProgressMonitor());
		} catch (CoreException exception) {
			fail(exception.getMessage());
		}
		return project;
	}

	public static IProject installProjectIntoWorkspace(String folder) {
	    File sourceFolder = new File(folder);
	    String projectName = sourceFolder.getName();
	    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	    File targetFolder = new File(root.getRawLocation().toString() + "/" + projectName + "/"); //$NON-NLS-1$ //$NON-NLS-2$
	    try {
	      FileHelper.copy(sourceFolder, targetFolder);
	    } catch (IOException e) {
	    	fail(e.getMessage());
	    }
	    IProject project = FileHelper.createCapellaProject(projectName);
	    ProjectHelper.refreshProject(project, new NullProgressMonitor());
	    return project;
	  }

}
