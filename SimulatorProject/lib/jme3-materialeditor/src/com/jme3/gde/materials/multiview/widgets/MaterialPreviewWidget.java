/*
 *  Copyright (c) 2009-2023 jMonkeyEngine
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
/*
 * MaterialPreviewWidget.java
 *
 * Created on 1 août 2011, 10:27:05
 */
package com.jme3.gde.materials.multiview.widgets;

import com.jme3.gde.core.assets.ProjectAssetManager;
import com.jme3.gde.core.scene.SceneApplication;
import com.jme3.gde.core.scene.SceneRequest;
import com.jme3.gde.materials.MaterialPreviewRenderer;
import com.jme3.gde.materials.multiview.widgets.icons.Icons;

/**
 *
 * @author Nehon
 */
public class MaterialPreviewWidget extends javax.swing.JPanel {

    private boolean init=false;
    private MaterialPreviewRenderer matRenderer;
    /** Creates new form MaterialPreviewWidget */
    public MaterialPreviewWidget() {
        initComponents();        
    }

    private  void initWidget() {
        sphereButton.setSelected(true);
        matRenderer = new MaterialPreviewRenderer(previewLabel);
        init=true;
    }

    @SuppressWarnings("unchecked")
    public void showMaterial(ProjectAssetManager assetManager, String materialFileName) {
        if(!init){
            initWidget();
        }        
        matRenderer.showMaterial(assetManager, materialFileName);
    }

    public void clear() {
        previewLabel.setIcon(null);
    }

    public void sceneOpened(SceneRequest request) {
    }

    public void sceneClosed(SceneRequest request) {
    }

    public void cleanUp(){
         matRenderer.cleanUp();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toggleButtonGroup = new javax.swing.ButtonGroup();
        previewLabel = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        cubeButton = new javax.swing.JToggleButton();
        planeButton = new javax.swing.JToggleButton();
        sphereButton = new javax.swing.JToggleButton();
        teapotButton = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        togglePbrEnvButton = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(244, 200));
        setMinimumSize(new java.awt.Dimension(244, 200));
        setPreferredSize(new java.awt.Dimension(244, 200));

        previewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previewLabel.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.previewLabel.text")); // NOI18N
        previewLabel.setMaximumSize(new java.awt.Dimension(200, 200));
        previewLabel.setMinimumSize(new java.awt.Dimension(200, 200));

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(80, 50));
        jToolBar1.setMinimumSize(new java.awt.Dimension(80, 50));
        jToolBar1.setPreferredSize(new java.awt.Dimension(80, 50));

        toggleButtonGroup.add(cubeButton);
        cubeButton.setIcon(Icons.cube);
        cubeButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.cubeButton.text")); // NOI18N
        cubeButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.cubeButton.toolTipText")); // NOI18N
        cubeButton.setFocusable(false);
        cubeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cubeButton.setMaximumSize(new java.awt.Dimension(40, 40));
        cubeButton.setMinimumSize(new java.awt.Dimension(40, 40));
        cubeButton.setPreferredSize(new java.awt.Dimension(40, 40));
        cubeButton.setSelectedIcon(Icons.cubeOn);
        cubeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cubeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(cubeButton);

        toggleButtonGroup.add(planeButton);
        planeButton.setIcon(Icons.plane);
        planeButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.planeButton.text")); // NOI18N
        planeButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.planeButton.toolTipText")); // NOI18N
        planeButton.setFocusable(false);
        planeButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        planeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        planeButton.setMaximumSize(new java.awt.Dimension(40, 40));
        planeButton.setMinimumSize(new java.awt.Dimension(40, 40));
        planeButton.setPreferredSize(new java.awt.Dimension(40, 40));
        planeButton.setSelectedIcon(Icons.planeOn);
        planeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        planeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(planeButton);

        toggleButtonGroup.add(sphereButton);
        sphereButton.setIcon(Icons.sphere);
        sphereButton.setSelected(true);
        sphereButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.sphereButton.text")); // NOI18N
        sphereButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.sphereButton.toolTipText")); // NOI18N
        sphereButton.setFocusable(false);
        sphereButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sphereButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sphereButton.setMaximumSize(new java.awt.Dimension(40, 40));
        sphereButton.setMinimumSize(new java.awt.Dimension(40, 40));
        sphereButton.setPreferredSize(new java.awt.Dimension(40, 40));
        sphereButton.setSelectedIcon(Icons.sphereOn);
        sphereButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sphereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphereButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sphereButton);

        toggleButtonGroup.add(teapotButton);
        teapotButton.setIcon(Icons.teapotOff);
        teapotButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.teapotButton.text")); // NOI18N
        teapotButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.teapotButton.toolTipText")); // NOI18N
        teapotButton.setFocusable(false);
        teapotButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        teapotButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teapotButton.setMaximumSize(new java.awt.Dimension(40, 40));
        teapotButton.setMinimumSize(new java.awt.Dimension(40, 40));
        teapotButton.setPreferredSize(new java.awt.Dimension(40, 40));
        teapotButton.setSelectedIcon(Icons.teapotOn);
        teapotButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        teapotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teapotButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(teapotButton);
        jToolBar1.add(jSeparator1);

        togglePbrEnvButton.setIcon(Icons.lightOff);
        togglePbrEnvButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.togglePbrEnvButton.toolTipText")); // NOI18N
        togglePbrEnvButton.setFocusable(false);
        togglePbrEnvButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        togglePbrEnvButton.setLabel(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.togglePbrEnvButton.label")); // NOI18N
        togglePbrEnvButton.setMaximumSize(new java.awt.Dimension(40, 40));
        togglePbrEnvButton.setMinimumSize(new java.awt.Dimension(40, 40));
        togglePbrEnvButton.setName("togglePbrEnvButton"); // NOI18N
        togglePbrEnvButton.setPreferredSize(new java.awt.Dimension(40, 40));
        togglePbrEnvButton.setPressedIcon(Icons.lightOn);
        togglePbrEnvButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        togglePbrEnvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePbrEnvButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(togglePbrEnvButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(previewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

private void sphereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphereButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Sphere);
}//GEN-LAST:event_sphereButtonActionPerformed

private void cubeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Box);
}//GEN-LAST:event_cubeButtonActionPerformed

private void planeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Quad);
}//GEN-LAST:event_planeButtonActionPerformed

    private void togglePbrEnvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePbrEnvButtonActionPerformed
        SceneApplication.getApplication().enablePreviewLighting(togglePbrEnvButton.isSelected());
        matRenderer.refreshOnly();
    }//GEN-LAST:event_togglePbrEnvButtonActionPerformed

    private void teapotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teapotButtonActionPerformed
        matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Teapot);
    }//GEN-LAST:event_teapotButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cubeButton;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToggleButton planeButton;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JToggleButton sphereButton;
    private javax.swing.JToggleButton teapotButton;
    private javax.swing.ButtonGroup toggleButtonGroup;
    private javax.swing.JToggleButton togglePbrEnvButton;
    // End of variables declaration//GEN-END:variables
}
