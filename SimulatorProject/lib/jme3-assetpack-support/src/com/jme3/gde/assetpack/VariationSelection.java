/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VariationSelection.java
 *
 * Created on 01.07.2011, 17:15:52
 */
package com.jme3.gde.assetpack;

import com.jme3.gde.assetpack.AssetPackLoader.SelectionEntry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import org.w3c.dom.Element;

/**
 *
 * @author normenhansen
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class VariationSelection extends javax.swing.JDialog {

    List<SelectionEntry> list;
    private boolean canceled = false;

    /** Creates new form VariationSelection */
    public VariationSelection(List<SelectionEntry> list) {
        super(new JFrame(), true);
        this.list = list;
        setLocationRelativeTo(null);
        initComponents();
        updateView();
    }

    private void updateView() {
        jPanel1.removeAll();
        for (Iterator<SelectionEntry> it = list.iterator(); it.hasNext();) {
            final SelectionEntry selectionEntry = it.next();
            final JComboBox box = new JComboBox();
            for (Element element : selectionEntry.names) {
                box.addItem(element.getAttribute("name"));
            }
            box.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    selectionEntry.setSelected(box.getSelectedIndex());
                }
            });
            jPanel1.add(box);
        }
        pack();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText(org.openide.util.NbBundle.getMessage(VariationSelection.class, "VariationSelection.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public boolean isCanceled() {
        return canceled;
    }
}
