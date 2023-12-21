/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Main;

import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.LoginPage.MedStoreLoginPage;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class PMS extends javax.swing.JPanel {

    /**
     * Creates new form PMS
     */
    private MainSystem system;
    private JPanel cardPanel;
    private DB4OUtil dB4OUtil;
    
    public PMS(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel=cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack1 = new javax.swing.JButton();
        btnMedicalStore = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setBackground(new java.awt.Color(204, 204, 204));
        btnBack1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 74, -1, -1));

        btnMedicalStore.setBackground(new java.awt.Color(204, 204, 204));
        btnMedicalStore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMedicalStore.setText("Medical Store");
        btnMedicalStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalStoreActionPerformed(evt);
            }
        });
        add(btnMedicalStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 136, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UiImagesssss/pharmacy.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 1010, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnMedicalStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalStoreActionPerformed
        // TODO add your handling code here:
        MedStoreLoginPage schoolloginJPanel = new MedStoreLoginPage(cardPanel, system, dB4OUtil);
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.add("loginJPanel",schoolloginJPanel);
        cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnMedicalStoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnMedicalStore;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}