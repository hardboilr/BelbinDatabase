/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belbindatabase;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Tobias
 */
public class GUI extends javax.swing.JFrame {

    DefaultListModel listModel = new DefaultListModel();
    ControlEngine controlEngine;

    public GUI() {
        initComponents();
        jList_personList.setModel(listModel);
        controlEngine = new ControlEngine();
        controlEngine.load();
        addToList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Clear = new javax.swing.JButton();
        jTextField_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_addPerson = new javax.swing.JButton();
        jButton_deleteFromList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_personList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Adm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Ana = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Fin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Crea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(530, 600));
        setPreferredSize(new java.awt.Dimension(530, 600));
        setResizable(false);

        jButton_Clear.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_Clear.setText("CLEAR LIST");
        jButton_Clear.setToolTipText("this will clear the whole list");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jTextField_Name.setToolTipText("input name");
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton_addPerson.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_addPerson.setText("create");
        jButton_addPerson.setToolTipText("add person to list");
        jButton_addPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addPersonActionPerformed(evt);
            }
        });

        jButton_deleteFromList.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_deleteFromList.setText("Delete from list");
        jButton_deleteFromList.setToolTipText("select a name from the list first");
        jButton_deleteFromList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteFromListActionPerformed(evt);
            }
        });

        jList_personList.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(jList_personList);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Administrator");

        jTextField_Adm.setToolTipText("input name");
        jTextField_Adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AdmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Analyst");

        jTextField_Ana.setToolTipText("input name");
        jTextField_Ana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AnaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("Creative");

        jTextField_Fin.setToolTipText("input name");
        jTextField_Fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FinActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("Finisher");

        jTextField_Crea.setToolTipText("input name");
        jTextField_Crea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CreaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("Create person");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Person list");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jButton_addPerson)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField_Adm, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_Ana, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_Crea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_deleteFromList))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Ana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Crea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_addPerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jButton_deleteFromList, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_deleteFromListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteFromListActionPerformed
        deleteFromList();
        controlEngine.save();
    }//GEN-LAST:event_jButton_deleteFromListActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        clearList();
        controlEngine.clearFile();
        controlEngine.save();

    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_addPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addPersonActionPerformed
        createPerson();
        clearList();
        controlEngine.load();
        addToList();
    }//GEN-LAST:event_jButton_addPersonActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_AdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AdmActionPerformed

    private void jTextField_AnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AnaActionPerformed

    private void jTextField_FinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FinActionPerformed

    private void jTextField_CreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    public void clearList() {
        listModel.removeAllElements();

    }

    public void addToList() {
        for (int i = 0; i < controlEngine.personList.size(); i++) {
            listModel.addElement(controlEngine.personList.get(i));
            System.out.println("Added to list: " + controlEngine.personList.get(i));
        }
        jTextField_Name.setText("");
        jTextField_Adm.setText("");
        jTextField_Fin.setText("");
        jTextField_Crea.setText("");
        jTextField_Ana.setText("");
    }

    public void createPerson() {
        String name = jTextField_Name.getText();
        int admin = Integer.parseInt(jTextField_Adm.getText());
        int finalizer = Integer.parseInt(jTextField_Fin.getText());
        int creator = Integer.parseInt(jTextField_Crea.getText());
        int analyst = Integer.parseInt(jTextField_Ana.getText());
        controlEngine.makeNewPerson(name, admin, finalizer, creator, analyst);
    }

    public void deleteFromList() {
        int index = jList_personList.getSelectedIndex();
        listModel.remove(index);
        controlEngine.personList.remove(index);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_addPerson;
    private javax.swing.JButton jButton_deleteFromList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList_personList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_Adm;
    private javax.swing.JTextField jTextField_Ana;
    private javax.swing.JTextField jTextField_Crea;
    private javax.swing.JTextField jTextField_Fin;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
