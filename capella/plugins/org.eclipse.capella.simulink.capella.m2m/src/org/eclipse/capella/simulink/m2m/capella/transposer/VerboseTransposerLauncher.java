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
package org.eclipse.capella.simulink.m2m.capella.transposer;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.kitalpha.transposer.analyzer.exceptions.AnalysisException;
import org.polarsys.kitalpha.transposer.api.ITransposer;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;

public class VerboseTransposerLauncher {

	public VerboseTransposerLauncher() {
	}

	/**
	 * Allows to launch Transposer.
	 * @param selection_p the current selection
	 * @param purpose_p the selected purpose
	 * @param mappingId_p the selected mapping id
	 * @param configuration_p the transposer configuration
	 * @param monitor_p ProgressMonitor
	 * @throws RuleExecutionException 
	 * @throws AnalysisException 
	 */
	public static void launch(final Collection<Object> selection_p, final String purpose_p, final String mappingId_p,
			final TransposerConfiguration configuration_p,final IProgressMonitor monitor_p) throws Exception {

		VerboseGenericTransposer transposer = new VerboseGenericTransposer(purpose_p, mappingId_p);
		try {
			transposer.verboseTranspose(selection_p, configuration_p, null, monitor_p);
		} finally {
			transposer.dispose();
		}
	}


}
