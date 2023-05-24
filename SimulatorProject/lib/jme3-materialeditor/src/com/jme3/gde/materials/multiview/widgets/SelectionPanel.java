/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SelectionPanel.java
 *
 * Created on 14.06.2010, 16:52:22
 */

package com.jme3.gde.materials.multiview.widgets;

import com.jme3.gde.materials.MaterialProperty;

/**
 *
 * @author normenhansen
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class SelectionPanel extends MaterialPropertyWidget {

    /** Creates new form SelectionPanel */
    public SelectionPanel() {
        initComponents();
    }

    public void setSelectionList(final String[] strings){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MaterialProperty prop=property;
                property=null;
                jComboBox1.removeAllItems();
                jComboBox1.addItem("");
                for (int i = 0; i < strings.length; i++) {
                    String string = strings[i];
                    jComboBox1.addItem(string);
                }
                property=prop;
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jComboBox1 = new javax.swing.JComboBox();

        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentY(0.5F);
        jToolBar1.setMinimumSize(new java.awt.Dimension(80, 32));
        jToolBar1.setPreferredSize(new java.awt.Dimension(385, 32));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(SelectionPanel.class, "SelectionPanel.jLabel1.text")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));
        jToolBar1.add(jLabel1);
        jToolBar1.add(filler1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(200, 32767));
        jComboBox1.setMinimumSize(new java.awt.Dimension(30, 0));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 27));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTexture(evt);
            }
        });
        jToolBar1.add(jComboBox1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectTexture(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTexture
        if(property!=null){
            property.setValue((String)jComboBox1.getSelectedItem());
            fireChanged();
        }
    }//GEN-LAST:event_selectTexture

    @Override
    protected void readProperty() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jLabel1.setText(property.getName());
                jLabel1.setToolTipText(property.getName());
                MaterialProperty prop=property;
                property=null;
                jComboBox1.setSelectedItem(prop.getValue());
                property=prop;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}