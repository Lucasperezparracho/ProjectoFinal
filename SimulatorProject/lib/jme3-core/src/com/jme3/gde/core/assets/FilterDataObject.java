/*
 *  Copyright (c) 2009-2010 jMonkeyEngine
 *  All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 * 
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 *  * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *  PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.gde.core.assets;

import com.jme3.gde.core.filters.FilterPostProcessorNode;
import com.jme3.gde.core.icons.IconList;
import com.jme3.post.FilterPostProcessor;
import java.io.IOException;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiFileLoader;

/**
 *
 * @author normenhansen
 */
@MIMEResolver.ExtensionRegistration(
        displayName = "FilterPostProcessor Files",
        mimeType = "application/jme3filterpostprocessor",
        extension = {"j3f"}
)
@DataObject.Registration(iconBase = IconList.FILTER, displayName = "jME3 FilterPostProcessor", mimeType = "application/jme3filterpostprocessor")
@ActionReferences({
    @ActionReference(id = @ActionID(category = "Edit", id = "org.openide.actions.CutAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 200, separatorBefore = 100),
    @ActionReference(id = @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 300, separatorAfter = 400),
    @ActionReference(id = @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 500),
    @ActionReference(id = @ActionID(category = "System", id = "org.openide.actions.RenameAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 600, separatorAfter = 700),
    @ActionReference(id = @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 800, separatorAfter = 900),
    @ActionReference(id = @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 1000, separatorAfter = 1100),
    @ActionReference(id = @ActionID(category = "System", id = "org.openide.actions.ToolsAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 1200),
    @ActionReference(id = @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"), path = "Loaders/application/jme3filterpostprocessor/Actions", position = 1300)
})
public class FilterDataObject extends AssetDataObject {

    public FilterDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(pf, loader);
        getLookupContents().add(new FilterPostProcessorNode(this));
        saveExtension = "j3f";
    }

    @Override
    public FilterPostProcessor loadAsset() {
        return (FilterPostProcessor) super.loadAsset();
    }
}
