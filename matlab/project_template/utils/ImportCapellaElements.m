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
function ImportCapellaElements()

disp('### Cap2SL: Import Capella elements from *.mlcore file')
disp('### Cap2SL: Looking in ./capellaData folder for compatible *.mlcore files')
[filePath, error] = helperSelectMLCoreFile();
if ~error && ~isempty(filePath)
    currentProject = slproject.getCurrentProject;
    helperSaveAndCloseDataDictionaries(currentProject);
    helperSaveAndCloseModels();
    CapSLBridge.import('ModelPath', filePath, 'ProjectPath', currentProject.RootFolder)
end
if ~error && isempty(filePath)
    errordlg('Import cancelled');
else
    disp('Import terminated with success! You are ready to go!')
end

end

%% Helper function
function [filePath, error] = helperSelectMLCoreFile()
currentProject = slproject.getCurrentProject;
mlcoreList = dir(fullfile(currentProject.RootFolder, 'capellaData','*.mlcore'));
error = false;
filePath = '';

if numel(mlcoreList) >= 1
    fileName = {mlcoreList.name};
    indx = 1;
    if numel(mlcoreList) > 1
    [indx,~] = listdlg('PromptString',{'Select a file.',...
        'All the models and Data Dictionaries will be saved & closed before the import',''},...
        'SelectionMode','single',...
        'ListString',fileName,...
        'ListSize',[400,15*numel(fileName)+50]);
    end
else
    indx = 0;
    errordlg('No import file found in the capellaData Project folder','Import file not found');
    error = true;
end

if indx > 0
    filePath = fullfile(mlcoreList(indx).folder, mlcoreList(indx).name);
elseif ~error
    errordlg('No import file selected','Empty selection');
    error = true;
end

end

function helperSaveAndCloseDataDictionaries(currentProject)
disp('### Cap2SL: Saving & Closing all data dictionaries...')
ddList = dir(fullfile(currentProject.RootFolder, 'data', '**/*.sldd'));
for ii = 1:numel(ddList)
    dd = Simulink.data.dictionary.open(ddList(ii).name);
    dd.saveChanges;
end
Simulink.data.dictionary.closeAll;
disp('### Cap2SL: All data dictionaries saved & closed')
end

function helperSaveAndCloseModels()

%     slxList = dir(fullfile(currentProject.RootFolder, 'models', '**/*.slx'));
if isempty(gcs)
    
else
    disp('### Cap2SL: Saving & Closing all models...')
    while ~any(strcmp(gcs, {'simulink', 'sflib', ''}))
%         disp("Closing """ + string(gcs) + """" );
        save_system(gcs, '',  'SaveDirtyReferencedModels', 'on');
        close_system(gcs);
%         disp("Next to close: """ + string(gcs) + """" );
    end
    disp('### Cap2SL: All models saved & closed')
end


end