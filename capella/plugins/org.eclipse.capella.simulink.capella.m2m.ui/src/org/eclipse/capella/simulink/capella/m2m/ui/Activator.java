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
package org.eclipse.capella.simulink.capella.m2m.ui;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author 
 *
 */
public class Activator extends AbstractUIPlugin {

	public static final String ICON_MLCORE = "MlCore"; // $NON-NLS-1$
	public static final String ICON_MLCORE_X2 = "big.MlCore"; // $NON-NLS-1$
	private static Activator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry imageRegistry) {
		super.initializeImageRegistry(imageRegistry);
        String symbolicName = getBundle().getSymbolicName();

        imageRegistry.put(ICON_MLCORE, AbstractUIPlugin.imageDescriptorFromPlugin(symbolicName, "resources/icons/MlCore.png")); // $NON-NLS-1$
        imageRegistry.put(ICON_MLCORE_X2, AbstractUIPlugin.imageDescriptorFromPlugin(symbolicName, "resources/icons/MlCore@2x.png")); // $NON-NLS-1$
	}

	public static Activator getDefault() {
		return plugin;
	}
	
}
