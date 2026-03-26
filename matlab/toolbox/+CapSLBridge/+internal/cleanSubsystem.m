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
function [] = cleanSubsystem(subSystem)
    lines = get_param(subSystem, 'Lines');
    if not(isempty(lines))
        delete_line(lines.Handle);
        for blk = Simulink.findBlocks( subSystem)
            delete_block(getfullname(blk));
        end
        
    end
end

