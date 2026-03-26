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
function import(varargin)
    %Import model into simulink
    %ModelPath  full file path of the model to be loaded
    %ProjectPath target project folder

    for k = 1:length(varargin)
        if strcmpi(varargin{k},'ModelPath')
            modelPath = varargin{k+1}; 
            varargin{k+1}=[]; 
            varargin{k}=[];
        end
        if strcmpi(varargin{k},'ProjectPath')
            projectPath = varargin{k+1}; 
            varargin{k+1}=[]; 
            varargin{k}=[];
        end
    end
    if not(exist('modelPath', 'var'))
        [FileName,MlcoreModelPath] = uigetfile('*.mlcore','Select the model file to import.');
        modelPath = fullfile([MlcoreModelPath FileName]);
    end
    if not(exist('projectPath', 'var'))
        importModel(modelPath)
    else
        importModel(modelPath, projectPath)
    end
end


%% Load an instance of the Simulink metamodel
%% in: a path char array
%% in: a filename char array
function importModel ( modelPath, projectPath)
    [pathName,name,ext] = fileparts(modelPath);
    fileName = strcat(name, ext);
    srcpath = fullfile(pathName, fileName);
    if ~isequal([0 0], srcpath)
        % Load the model
    	rs = org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
    	helper = org.eclipse.capella.simulink.transformation.launcher.GeneratorLauncher();
    	helper.configure(rs);
        
        %generate statements
        statements = helper.generate(rs, srcpath);
	    %disp(statements)
        
        %Write them into a m file
        [~, name, ~] = fileparts(fileName);
        newFile = [matlab.lang.makeValidName(name) '_fromCapella' '.m'];
        mFile=fopen(newFile,'w+');
        if exist('projectPath','var')
            fprintf(mFile,"project_path = '%s';\n", projectPath);
        end
        fprintf(mFile,'%s',statements);
        fclose(mFile);
        disp(['Writing statements in ' newFile ])
	    
        %execute the m file
        disp(['Running ' newFile ' ...'])
        run(newFile)
        clear name
    end
end

