/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Ngo;

import Funding.Donation.Donation;
import Funding.PublicUser.PublicUser;
import Ngo.Budget.Budget;
import System.Directories.DB4OUtil;
import System.Directories.DataValidation;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author chinm
 */
public class PublicUserWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form PublicUserWorkspace
     */
    private JPanel cardPanel;
    private PublicUser user;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private final String FILENAME = "ProjectDataBank.db4o";
    private NgoAdminWorkspace ngoAdmin;
    private DataValidation data;
    
    public PublicUserWorkspace(PublicUser user, JPanel cardPanel,MainSystem system,DB4OUtil dB4OUtil) {
        initComponents();
        this.user = user;
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.data = new DataValidation();
        
        txtName.setText(user.getName());
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPanePerson = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelDonate = new javax.swing.JPanel();
        lblNgo = new javax.swing.JLabel();
        lblAmt = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        txtNgo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComm = new javax.swing.JTextArea();
        lblComm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        panelControl.setBackground(new java.awt.Color(51, 51, 51));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDonate.setText("Donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btnDonate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnHome)
                .addGap(32, 32, 32)
                .addComponent(btnDonate)
                .addContainerGap(545, Short.MAX_VALUE))
        );

        SplitPanePerson.setLeftComponent(panelControl);

        panelWork.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("NGO Public User Workspace");
        panelHome.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 555, -1));

        lblRole.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblRole.setText("Role: Person (Public)");
        panelHome.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 106, 139, -1));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        panelHome.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 128, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UiImagesssss/NGO manager.png"))); // NOI18N
        panelHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1160, 580));

        panelWork.add(panelHome, "card2");

        panelDonate.setBackground(new java.awt.Color(249, 249, 249));
        panelDonate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNgo.setText("NGO:");
        panelDonate.add(lblNgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lblAmt.setText("Amount:");
        panelDonate.add(lblAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        panelDonate.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 234, -1));

        lblTitle.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Donations");
        panelDonate.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 920, -1));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        panelDonate.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        txtNgo.setEditable(false);
        txtNgo.setText("NGO");
        panelDonate.add(txtNgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 234, -1));

        lblName.setText("From:");
        panelDonate.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panelDonate.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 234, -1));

        txtComm.setColumns(20);
        txtComm.setRows(5);
        jScrollPane1.setViewportView(txtComm);

        panelDonate.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        lblComm.setText("Comment:");
        panelDonate.add(lblComm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UiImagesssss/funds.png"))); // NOI18N
        panelDonate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 530, 650));

        panelWork.add(panelDonate, "card4");

        SplitPanePerson.setRightComponent(panelWork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanePerson)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPanePerson)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        //        CardLayout cardLayout = (CardLayout) panelWork.getLayout();
        //        panelWork.add("NgoHome", panelHome);
        //        cardLayout.next(panelWork);
        panelWork.removeAll();
        panelWork.add(panelHome);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelDonate);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        String ngo = txtNgo.getText();
        
        
        String from = txtName.getText();
        
        if(data.numcheck(txtAmount.getText())==false){
            JOptionPane.showMessageDialog(this, "Enter valid Amount");
            return;
        }
        Integer amt = Integer.valueOf(txtAmount.getText());
        
        
        String comm = txtComm.getText();
        if(comm.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Comments");
            return;
        }
        
        
        Donation d = system.getDonationList().addDonation();
        
        d.setNgo(ngo);
        d.setName(from);
        d.setAmt(amt);
        d.setComment(comm);
        
        JOptionPane.showMessageDialog(this, "Donation sent successfully");
        
        Integer donation = Integer.valueOf(system.getBudgetList().getMoney().getDonation());
//        if(system.getBudgetList()==null){
//            Budget b = system.getBudgetList().addBudget();
            
//        b.setDonation(Integer.valueOf(txtDonation.getText()));
       
        system.getBudgetList().getMoney().setDonation(amt+donation);
        txtName.setText("");
        txtAmount.setText("");
        txtComm.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPanePerson;
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmt;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNgo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelDonate;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtComm;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgo;
    // End of variables declaration//GEN-END:variables
}