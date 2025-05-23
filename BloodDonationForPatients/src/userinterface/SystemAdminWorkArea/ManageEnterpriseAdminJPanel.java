/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJLabel;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import Magic.Design.*;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balumullamuri
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        enterpriseJTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblAdminUserName.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateTable();
       
    }
private boolean checkUserIdExists(String userName) {
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                for (Network network : system.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                            if (enterprise.getOrganizationDirectory().getOrganizationList().size() > 0) {
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                    if (organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                                        return true;

                                    } else {
                                        return false;
                                    }

                                }
                            } else {
                                return true;
                            }
                        } else {
                            return false;

                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                
                Object[] row = new Object[6];
                row[0] = enterprise;
                row[1] = enterprise.getEnterpriseType().getValue();
                row[2] = network.getName();
                row[5] = enterprise.getEmail();
                row[3] = enterprise.getContact();
                row[4] = enterprise.getZipcode();
             
                model.addRow(row);
                
            }
        }
    }

        private void populateAdminTable(Enterprise enterprise1) {
     
            DefaultTableModel model = (DefaultTableModel) tblAdminUserName.getModel();

            model.setRowCount(0);
       
            for (UserAccount user : enterprise1.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = user.getEmployee().getName();
                row[2] = user.getUsername();
                model.addRow(row);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAdminUserName = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAdminName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCreateAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(1150, 770));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(1550, 70));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Admin for Enterprise");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        tblAdminUserName.setBackground(new java.awt.Color(0, 102, 102));
        tblAdminUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        tblAdminUserName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblAdminUserName.setForeground(new java.awt.Color(255, 255, 255));
        tblAdminUserName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Admin Name", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdminUserName.setGridColor(new java.awt.Color(0, 0, 0));
        tblAdminUserName.setRowHeight(30);
        jScrollPane3.setViewportView(tblAdminUserName);
        if (tblAdminUserName.getColumnModel().getColumnCount() > 0) {
            tblAdminUserName.getColumnModel().getColumn(0).setResizable(false);
            tblAdminUserName.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblAdminUserName.getColumnModel().getColumn(1).setResizable(false);
            tblAdminUserName.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 640, 190));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel2.setForeground(new java.awt.Color(204, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Admin");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Enterprise:");

        txtName.setBackground(new java.awt.Color(0, 102, 102));
        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtName.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Admin Name:");

        txtAdminName.setBackground(new java.awt.Color(0, 102, 102));
        txtAdminName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtAdminName.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Username:");

        txtUserName.setBackground(new java.awt.Color(0, 102, 102));
        txtUserName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtUserName.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Password:");

        txtPassword.setBackground(new java.awt.Color(0, 102, 102));
        txtPassword.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPassword.setEnabled(false);

        btnCreateAdmin.setBackground(new java.awt.Color(0, 153, 153));
        btnCreateAdmin.setForeground(new java.awt.Color(204, 255, 204));
        btnCreateAdmin.setText("Create Admin");
        btnCreateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnCreateAdmin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCreateAdmin)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 400));

        enterpriseJTable.setBackground(new java.awt.Color(0, 102, 102));
        enterpriseJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        enterpriseJTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Enterprise Type", "Network", "Contact", "Zipcode", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setRowHeight(30);
        enterpriseJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            enterpriseJTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            enterpriseJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            enterpriseJTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            enterpriseJTable.getColumnModel().getColumn(4).setPreferredWidth(80);
            enterpriseJTable.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 720, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTableMouseClicked
        // TODO add your handling code here:
        int row = enterpriseJTable.getSelectedRow();
        if (row < 0) {
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the Table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            //JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Enterprise enterprise2 = (Enterprise) enterpriseJTable.getValueAt(row, 0);
        enterprise = enterprise2 ;

       txtName.setText(enterprise2.getName());
       txtAdminName.setEnabled(true);
       txtUserName.setEnabled(true);
       txtPassword.setEnabled(true);
       
       populateAdminTable(enterprise2);
        
    }//GEN-LAST:event_enterpriseJTableMouseClicked

    private void btnCreateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdminActionPerformed
        
        int selectedRow = enterpriseJTable.getSelectedRow();
        
        if(txtAdminName.getText().isEmpty())
        {
        txtAdminName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtAdminName.setForeground(Color.red);
        } 
        
        if(txtUserName.getText().isEmpty())
        {
        txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtUserName.setForeground(Color.red);
        } 
        
        if(txtPassword.getText().isEmpty())
        {
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
        txtPassword.setForeground(Color.red);
        } 
        
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row to Process" ,"Warning" , JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row to process! </b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            return;
        }
        
        else if (txtUserName.getText().isEmpty() || txtAdminName.getText().isEmpty() || txtPassword.getText().isEmpty()    )
        {
           //JOptionPane.showMessageDialog(null, "All fields are mandatory!","Warning",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        
        else if (!checkUserIdExists(txtUserName.getText())){
            txtUserName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUserName.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>User name already present!</b></html>"),"Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
         
        else if (txtPassword.getText().length() < 4 ){
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPassword.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Password should be more than 4 digit!!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Password should be more than 4 characters","Warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
        
        
        
        else    
        {
        
        String username = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
       
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtAdminName.getText());       
        
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        populateAdminTable(enterprise);
        
        populateAdminTable(enterprise);
          
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>New Admin credentials created!</b></html>"));
        
        dB4OUtil.storeSystem(system);
        
          txtAdminName.setText("");
          txtUserName.setText("");
          txtPassword.setText("");
          txtName.setText("");  
          txtAdminName.setEnabled(false);
          txtUserName.setEnabled(false);
          txtPassword.setEnabled(false);
          txtName.setEnabled(false);  
        }
             
    }//GEN-LAST:event_btnCreateAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAdmin;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAdminUserName;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
