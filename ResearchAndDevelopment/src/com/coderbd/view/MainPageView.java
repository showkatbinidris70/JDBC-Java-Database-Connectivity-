/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.view;

import com.coderbd.dao.GetOrderDao1;
import com.coderbd.daoImpl.GetOrderDao1Impl;
import com.coderbd.pojo.GetOrder1;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MainPageView extends javax.swing.JFrame {

    /**
     * Creates new form GetOrder
     */
    public MainPageView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmitOrder = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnUpdateOrder = new javax.swing.JButton();
        btnUpdateOrder1 = new javax.swing.JButton();
        btnSubmitOrder1 = new javax.swing.JButton();
        btnSubmitOrder2 = new javax.swing.JButton();
        btnSubmitOrder3 = new javax.swing.JButton();
        btnSubmitOrder4 = new javax.swing.JButton();
        btnSubmitOrder5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("                       Research & Development (RND) Department                                    1");

        btnSubmitOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder.setText("Buying Thread");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("                                                                           Copyright : 2019 Round - 39, J2EE, CCSL");

        btnUpdateOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateOrder.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdateOrder.setText("Finishing Section");
        btnUpdateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrderActionPerformed(evt);
            }
        });

        btnUpdateOrder1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdateOrder1.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdateOrder1.setText("Back");
        btnUpdateOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrder1ActionPerformed(evt);
            }
        });

        btnSubmitOrder1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder1.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder1.setText("Buying Chemical");
        btnSubmitOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrder1ActionPerformed(evt);
            }
        });

        btnSubmitOrder2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder2.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder2.setText("Dyeing Section");
        btnSubmitOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrder2ActionPerformed(evt);
            }
        });

        btnSubmitOrder3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder3.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder3.setText("Knitting Section");
        btnSubmitOrder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrder3ActionPerformed(evt);
            }
        });

        btnSubmitOrder4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder4.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder4.setText("Summary");
        btnSubmitOrder4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrder4ActionPerformed(evt);
            }
        });

        btnSubmitOrder5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmitOrder5.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmitOrder5.setText("Receive Order");
        btnSubmitOrder5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrder5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmitOrder5)
                            .addComponent(btnSubmitOrder1)
                            .addComponent(btnSubmitOrder2))
                        .addGap(252, 252, 252)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateOrder)
                            .addComponent(btnSubmitOrder3)
                            .addComponent(btnSubmitOrder)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnUpdateOrder1)
                        .addGap(263, 263, 263)
                        .addComponent(btnSubmitOrder4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitOrder)
                    .addComponent(btnSubmitOrder5))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitOrder1)
                    .addComponent(btnSubmitOrder3))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateOrder)
                    .addComponent(btnSubmitOrder2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitOrder4)
                    .addComponent(btnUpdateOrder1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrder1ActionPerformed
        // TODO add your handling code here:
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateOrder1ActionPerformed

    private void btnUpdateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrderActionPerformed
        // TODO add your handling code here:
        new FabricFinishingView6().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateOrderActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        // TODO add your handling code here:
        new BuyingThreadView2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitOrderActionPerformed

    private void btnSubmitOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrder1ActionPerformed
        // TODO add your handling code here:
        new BuyingChemicalView3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitOrder1ActionPerformed

    private void btnSubmitOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrder2ActionPerformed
        // TODO add your handling code here:
        new FabricDyeingView5().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitOrder2ActionPerformed

    private void btnSubmitOrder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrder3ActionPerformed
        // TODO add your handling code here:
        new FabricKnittingView4().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitOrder3ActionPerformed

    private void btnSubmitOrder4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrder4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitOrder4ActionPerformed

    private void btnSubmitOrder5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrder5ActionPerformed
        // TODO add your handling code here:
        new GetOrderView1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubmitOrder5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JButton btnSubmitOrder1;
    private javax.swing.JButton btnSubmitOrder2;
    private javax.swing.JButton btnSubmitOrder3;
    private javax.swing.JButton btnSubmitOrder4;
    private javax.swing.JButton btnSubmitOrder5;
    private javax.swing.JButton btnUpdateOrder;
    private javax.swing.JButton btnUpdateOrder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
