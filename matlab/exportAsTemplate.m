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
copyfile project_template exportedProject
%%
listEmptyFile = dir("exportedProject\**\.empty")
%%
currentDir = pwd;
open("exportedProject\Project_template.prj")
proj = currentProject;
%%
for ii = 1:length(listEmptyFile)
    proj.removeFile([listEmptyFile(ii).folder, '\.empty'])
end

cd(currentDir)
Simulink.exportToTemplate(proj, ".\toolbox\templates\Capella_Simulink_Connector.sltx", ...
    "Author",       "Eclipse.org",...
    "Description",  "This template is the standard project template used by the Connector for Capella and Simulink®. It intends to implement and standardize best practices structuring MATLAB project.",...
    "ThumbnailFile", ".\toolbox\logo\Capella_logo.png",...
    "Title", "Capella - Simulink Project")
proj.close()