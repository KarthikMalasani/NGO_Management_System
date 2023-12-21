/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.LoginPage;

import Pharmacy.DeliveryMan.DeliveryMan;
import Pharmacy.Pharmacist.Pharmacist;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.MedStore.DeliveryManWorkspace;
import Ui.MedStore.MedAdminWorkspace;
import Ui.MedStore.PharmacistWorkspace;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class MedStoreLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form MedStoreLoginPage
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    
    public MedStoreLoginPage(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
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

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Login Page");

        lblUsername.setText("Username:");

        lblPass.setText("Password:");

        lblRole.setText("Role:");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MedStore Admin", "Pharmacist", "Delivery Man" }));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblPass)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblRole)
                        .addGap(45, 45, 45)
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblUsername))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPass))
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblRole))
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnLogin)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPass.getText();
        String role = String.valueOf(cmbRole.getSelectedItem());
        Pharmacist pharm = system.getPharmlist().findPharmacist(username, password);
        DeliveryMan delMan = system.getDeliveryManlist().findDeliveryMan(username, password);

        try{
//            if(role.equals("MedStore Admin")){
            if(role.equals("MedStore Admin")&&(username.equals("Admin") && password.equals("pass"))){
                    MedAdminWorkspace adminJPanel = new MedAdminWorkspace(cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("adminJPanel",adminJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Pharmacist")){
            else if(role.equals("Pharmacist")&&(username.equals(pharm.getUsername()) && password.equals(pharm.getPassword()))){
                    PharmacistWorkspace ngoManJPanel = new PharmacistWorkspace(pharm,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("ngoManagerJPanel",ngoManJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Delivery Man")){
            else if(role.equals("Delivery Man")&&(username.equals(delMan.getUsername()) && password.equals(delMan.getPassword()))){
                    DeliveryManWorkspace caretakerJPanel = new DeliveryManWorkspace(delMan,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("caretakerJPanel",caretakerJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
            else{
                JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
            }
        }
        catch(NullPointerException n){
            JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
        }

        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
