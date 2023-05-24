/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddAssetFilePanel.java
 *
 * Created on 24.10.2010, 04:15:22
 */
package com.jme3.gde.assetpack.project.wizards;

import java.awt.Dimension;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author normenhansen
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class SingleAssetFilePanel extends javax.swing.JPanel {

    FileDescription desc;

    /** Creates new form AddAssetFilePanel */
    public SingleAssetFilePanel(FileDescription desc) {
        initComponents();
        this.desc = desc;
        updateInfo();
    }

    public void setModelList(List<String> models){
        jComboBox2.removeAllItems();
        jComboBox2.addItem("default");
        for (Iterator<String> it = models.iterator(); it.hasNext();) {
            String string = it.next();
            jComboBox2.addItem(string);
        }
        jComboBox2.setPreferredSize(new Dimension(200,25));
    }

    public void updateInfo() {
        jTextField1.setText(desc.getPath());
        jTextField2.setText(desc.getName());
        jComboBox1.setSelectedItem(desc.getType());
        jCheckBox1.setSelected(desc.isMainFile());
        jComboBox2.setSelectedItem(desc.getMaterial());
        if (desc.isExisting()) {
            jTextField1.setEditable(false);
        } else {
            jTextField1.setEditable(true);
        }
        if(!"mesh".equals(desc.getType())&&!"scene".equals(desc.getType())){
            jToolBar2.setVisible(false);
            setPreferredSize(new Dimension(100, 25));
        }else{
            jToolBar2.setVisible(true);
            setPreferredSize(new Dimension(100, 50));
        }
    }

    public void saveInfo() {
        desc.setPath(jTextField1.getText());
        desc.setMainFile(jCheckBox1.isSelected());
        desc.setType((String) jComboBox1.getSelectedItem());
        desc.setMaterial((String) jComboBox2.getSelectedItem());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox();

        setMaximumSize(new java.awt.Dimension(32767, 50));
        setMinimumSize(new java.awt.Dimension(0, 50));
        setPreferredSize(new java.awt.Dimension(474, 50));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jTextField1.setText(org.openide.util.NbBundle.getMessage(SingleAssetFilePanel.class, "SingleAssetFilePanel.jTextField1.text")); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                saveInfo(evt);
            }
        });
        jToolBar1.add(jTextField1);

        jTextField2.setEditable(false);
        jTextField2.setText(org.openide.util.NbBundle.getMessage(SingleAssetFilePanel.class, "SingleAssetFilePanel.jTextField2.text")); // NOI18N
        jToolBar1.add(jTextField2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "scene", "mesh", "texture", "material", "materialdef", "shader", "skeleton", "other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfo2(evt);
            }
        });
        jToolBar1.add(jComboBox1);

        jButton1.setText(org.openide.util.NbBundle.getMessage(SingleAssetFilePanel.class, "SingleAssetFilePanel.jButton1.text")); // NOI18N
        jToolBar1.add(jButton1);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jCheckBox1.setText(org.openide.util.NbBundle.getMessage(SingleAssetFilePanel.class, "SingleAssetFilePanel.jCheckBox1.text")); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInfo3(evt);
            }
        });
        jToolBar2.add(jCheckBox1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "default" }));
        jComboBox2.setMaximumSize(new java.awt.Dimension(200, 30));
        jComboBox2.setPreferredSize(new java.awt.Dimension(200, 27));
        jToolBar2.add(jComboBox2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveInfo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveInfo
        saveInfo();
    }//GEN-LAST:event_saveInfo

    private void saveInfo2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfo2
        saveInfo();
    }//GEN-LAST:event_saveInfo2

    private void saveInfo3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInfo3
        saveInfo();
    }//GEN-LAST:event_saveInfo3
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
