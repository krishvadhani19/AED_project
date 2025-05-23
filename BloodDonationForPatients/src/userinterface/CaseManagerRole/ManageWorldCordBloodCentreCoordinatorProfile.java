/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CaseManagerRole;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalClinicOrganization;
import Business.Organization.GovernmentOrganization;
import Business.Organization.HeadquarterOrganization;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyJLabel;
import Magic.Design.*;
import java.awt.CardLayout;
import java.util.Date;

/**
 *
 * @author nitin
 */
public class ManageWorldCordBloodCentreCoordinatorProfile extends javax.swing.JPanel {

  

     private UserAccount userAccount;
     private Enterprise enterprise ;
     private GovernmentOrganization govtOrganization;
     private HeadquarterOrganization bloodBankOrganization;
    


    ManageWorldCordBloodCentreCoordinatorProfile(UserAccount userAccount, HeadquarterOrganization bloodBankOrganization, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.bloodBankOrganization = bloodBankOrganization;
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 49, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Contact:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 78, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 107, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 136, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("State:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 165, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 195, -1, -1));

        comboGender.setBackground(new java.awt.Color(0, 102, 102));
        comboGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboGender.setForeground(new java.awt.Color(204, 255, 204));
        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 192, 150, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("DOB:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 230, -1, -1));

        txtName.setBackground(new java.awt.Color(0, 102, 102));
        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 255, 204));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 146, -1));

        txtContact.setBackground(new java.awt.Color(0, 102, 102));
        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(204, 255, 204));
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 146, -1));

        txtAddress.setBackground(new java.awt.Color(0, 102, 102));
        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(204, 255, 204));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 102, 146, -1));

        txtCity.setBackground(new java.awt.Color(0, 102, 102));
        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCity.setForeground(new java.awt.Color(204, 255, 204));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 131, 146, -1));

        txtState.setBackground(new java.awt.Color(0, 102, 102));
        txtState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtState.setForeground(new java.awt.Color(204, 255, 204));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 146, -1));

        txtDOB.setBackground(new java.awt.Color(0, 102, 102));
        txtDOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDOB.setForeground(new java.awt.Color(204, 255, 204));
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 227, 146, -1));

        btnSave.setBackground(new java.awt.Color(0, 153, 153));
        btnSave.setForeground(new java.awt.Color(204, 255, 204));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 329, 77, 43));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(txtCity.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(txtContact.getText()));
        userAccount.getEmployee().setDateOfBirth(new Date(txtDOB.getText()));
        userAccount.getEmployee().setGender((String) comboGender.getSelectedItem());
        userAccount.getEmployee().setAddress(txtAddress.getText());
        userAccount.getEmployee().setState(txtCity.getText());

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
