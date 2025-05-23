/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package userinterface.CaseManagerRole;


import userinterface.CommonPanels.BloodRequestsListJPanel;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HeadquarterOrganization;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.CommonPanels.DonorApplicationListJPanel;


/**
 *
 * @author maka
 */
public class CaseManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorldCordBlood_Centre_Coordinator_WorkAreaJPanel
     * 
     */
    boolean a = true;
    private UserAccount userAccount;
    HeadquarterOrganization bloodBankOrganization;
    Enterprise enterprise;
    EcoSystem system;
    PatientDirectory patientDirectory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network network;
    
    
    public CaseManagerWorkAreaJPanel(UserAccount account,HeadquarterOrganization bloodBankOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.bloodBankOrganization = bloodBankOrganization;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnManageInventory = new javax.swing.JLabel();
        btnPrepareOrder = new javax.swing.JLabel();
        btnReceiveRequests = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 102, 102));
        Header.setForeground(new java.awt.Color(204, 255, 204));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        Header.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 100, 50));

        btnManageInventory.setBackground(new java.awt.Color(204, 255, 204));
        btnManageInventory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageInventory.setForeground(new java.awt.Color(204, 255, 204));
        btnManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnManageInventory.setText("Manage Inventory");
        btnManageInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageInventoryMouseClicked(evt);
            }
        });
        Header.add(btnManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 170, 50));

        btnPrepareOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPrepareOrder.setForeground(new java.awt.Color(204, 255, 204));
        btnPrepareOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrepareOrder.setText("Prepare Request");
        btnPrepareOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrepareOrderMouseClicked(evt);
            }
        });
        Header.add(btnPrepareOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 180, 50));

        btnReceiveRequests.setBackground(new java.awt.Color(31, 31, 31));
        btnReceiveRequests.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReceiveRequests.setForeground(new java.awt.Color(204, 255, 204));
        btnReceiveRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReceiveRequests.setText("Prepare Donor Order");
        btnReceiveRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReceiveRequestsMouseClicked(evt);
            }
        });
        Header.add(btnReceiveRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 50));

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(0, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceiveRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceiveRequestsMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        DonorApplicationListJPanel panel = new DonorApplicationListJPanel(system, userAccount, network, userProcessContainer);
        userProcessContainer.add("DonorApplicationListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReceiveRequestsMouseClicked

    private void btnManageInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageInventoryMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        ManageInventoryJPanel panel = new ManageInventoryJPanel(system, userProcessContainer);
        userProcessContainer.add("ManageInventoryJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryMouseClicked

    private void btnPrepareOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrepareOrderMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        BloodRequestsListJPanel panel = new BloodRequestsListJPanel(system, userAccount, network, userProcessContainer);
        userProcessContainer.add("BloodRequestsListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPrepareOrderMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel btnManageInventory;
    private javax.swing.JLabel btnPrepareOrder;
    private javax.swing.JLabel btnReceiveRequests;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
