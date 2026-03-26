% =============================================================================
% Copyright (c) 2020, 2026 THALES GLOBAL SERVICES.
% 
% This program and the accompanying materials are made available under the
% terms of the Eclipse Public License 2.0 which is available at
% http://www.eclipse.org/legal/epl-2.0
% 
% SPDX-License-Identifier: EPL-2.0
% 
% Contributors:
%    Thales - initial API and implementation
% =============================================================================
function blkStruct = slblocks
%SLBLOCKS Defines the Simulink library block representation
%   for the Capella - Simulink bridge.

blkStruct.Name    = sprintf('Cap2SL\nToolbox');
blkStruct.OpenFcn = 'CapellaElements';
% blkStruct.MaskInitialization = '';

blkStruct.MaskDisplay = ['image(''Capella_logo.png'');' ...
         'text(0.6,0.75,''Cap2SL'');'];

% Define the library list for the Simulink Library browser.
% Return the name of the library model and the name for it
Browser.Library = 'CapellaElements';
Browser.Name    = 'Cap2SL Toolbox';
Browser.IsFlat  = 0;% Is this library "flat" (i.e. no subsystems)?

blkStruct.Browser = Browser;
