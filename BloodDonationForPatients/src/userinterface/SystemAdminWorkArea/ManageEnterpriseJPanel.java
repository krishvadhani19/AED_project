/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Magic.Design.*;
import Magic.Design.MyTableFormat;
import java.awt.Color;
import Magic.Design.MyJLabel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitin
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ManageEnterpriseJPanel2
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();        
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        tblEnterprises.getTableHeader().setDefaultRenderer(new MyTableFormat());
        
        populateNetworkTable(); 
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprises = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(1150, 720));

        tblEnterprises.setBackground(new java.awt.Color(0, 102, 102));
        tblEnterprises.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblEnterprises.setForeground(new java.awt.Color(255, 255, 255));
        tblEnterprises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Enterprise Type", "Network", "Phone", "Zip", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterprises.setRowHeight(30);
        tblEnterprises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEnterprisesMouseClicked(evt);
            }
        });
        tblEnterprises.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblEnterprisesPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblEnterprises);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        networkJComboBox.setBackground(new java.awt.Color(0, 102, 102));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        enterpriseTypeJComboBox.setBackground(new java.awt.Color(0, 102, 102));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(0, 102, 102));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setPreferredSize(new java.awt.Dimension(6, 30));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtZipCode.setBackground(new java.awt.Color(0, 102, 102));
        txtZipCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtZipCode.setPreferredSize(new java.awt.Dimension(6, 30));
        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(0, 102, 102));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(6, 30));

        txtContact.setBackground(new java.awt.Color(0, 102, 102));
        txtContact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContact.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Enterprise");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Network");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Zip Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Contact");

        createButton.setBackground(new java.awt.Color(0, 153, 153));
        createButton.setForeground(new java.awt.Color(204, 255, 204));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Create Enterprise");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enterpriseTypeJComboBox, networkJComboBox, txtContact, txtEmail, txtName, txtZipCode});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addComponent(btnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 503, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDelete)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }
     public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
    }
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        String check1 = "";

        
        if(networkJComboBox.getSelectedItem().equals(null)){
            
            
            //JOptionPane.showMessageDialog(null, "Select a Network Please!");
            networkJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            networkJComboBox.setForeground(Color.red);
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Select a Network please!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            check1 = "no";
        }
        
        if(enterpriseTypeJComboBox.getSelectedItem().equals(null)){
            //JOptionPane.showMessageDialog(null, "Select Enterprise Type Please!");
            enterpriseTypeJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            enterpriseTypeJComboBox.setForeground(Color.red);
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Select an Enterprise Type please!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            check1 = "no";
        }
        
        
        if(txtName.getText().isEmpty())
        {
        txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtName.setForeground(Color.red);
        } 
       
        if(txtContact.getText().isEmpty())
        {
        txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtContact.setForeground(Color.red);
        } 
        if(txtEmail.getText().isEmpty())
        {
        txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtEmail.setForeground(Color.red);
        } 
        if(txtZipCode.getText().isEmpty())
        {
        txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtZipCode.setForeground(Color.red);
        } 


        
        if(txtName.getText().isEmpty() || txtContact.getText().isEmpty() || txtEmail.getText().isEmpty() || txtZipCode.getText().isEmpty()
                || network == null || type == null){
            //JOptionPane.showMessageDialog(null, "All fields are mandatory!");
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            
            check1 = "no";
            //return;
        }

        
        else   if ( !phoneNumberValidator(txtContact.getText())  ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit " , "Error", JOptionPane.ERROR_MESSAGE);
           check1 = "no";
            txtContact.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContact.setForeground(Color.red);
            
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Contact Number should be 10 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            
       //    return;
        }
       
        else   if (  !zipCodeValidator(txtZipCode.getText()) ){
           //JOptionPane.showMessageDialog(null, " Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           check1 = "no";
           txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
           txtZipCode.setForeground(Color.red);
           
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Zip should be 5 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           
         //  return;
        }
        
        else   if ( !emailValidator(txtEmail.getText()) ){
           //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
           check1 = "no";
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmail.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Email ID must be in correct format!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

           //return;
        } 
         
        else {
         
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
       
                if (ent.getName().equals(txtName.getText())) {
                    JOptionPane.showMessageDialog(null, new JLabel("<html><b>Enterprise Name can not be same!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
                    check1 = "no";
                    txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
                    txtName.setForeground(Color.red);
                    return;
                }
            }
        
    // the main process after validation checks-
        if(check1.equals(""))
        {
            String name = txtName.getText();

            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            enterprise.setContact( (Long.parseLong(txtContact.getText())));
            enterprise.setZipcode(txtZipCode.getText());
            enterprise.setEmail(txtEmail.getText());

            populateNetworkTable();
        
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>New Enterprise created successfully!</b></html>"));
                    
            //JOptionPane.showMessageDialog(null, "New Enterprise Created Successfully!");
        
             dB4OUtil.storeSystem(system);
             
            txtName.setText("");
            txtContact.setText("");
            txtZipCode.setText("");
            txtEmail.setText("");
        
         }}
    }//GEN-LAST:event_createButtonActionPerformed

    private void tblEnterprisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEnterprisesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEnterprisesMouseClicked

    private void tblEnterprisesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEnterprisesPropertyChange
        
    }//GEN-LAST:event_tblEnterprisesPropertyChange

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblEnterprises.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("Select a Enterprise, to delete") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int input = JOptionPane.showConfirmDialog(null
                , "Are you sure, you want to delete?", "Confirmation"
                ,JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if (input == 0) {
            Network network = null;
            for(Network nw: system.getNetworkList()) {
                if(nw.getName().equals(tblEnterprises.getValueAt(selectedRow, 2))){
                    network = nw;
                    break;
                }
            }
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
       
                if (ent.getName().equals(tblEnterprises.getValueAt(selectedRow, 0))) {
                    JOptionPane.showMessageDialog(null, new JLabel(ent.getName() + " enterprise deleted Succesfully!!") , "Error", JOptionPane.ERROR_MESSAGE);
                    network.getEnterpriseDirectory().getEnterpriseList().remove(ent);
                    populateNetworkTable();
                    return;
                }
            }
        }
        else 
            return;
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>Network Name can not be found!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable tblEnterprises;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprises.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[6];
                row[0] = enterprise.getName();
                row[1] = enterprise.getEnterpriseType().getValue();
                row[2] = network.getName();
                row[5] = enterprise.getEmail();
                row[3] = enterprise.getContact();
                row[4] = enterprise.getZipcode();
   
                model.addRow(row);
            }
        }
    }//continue

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }
    }
}
