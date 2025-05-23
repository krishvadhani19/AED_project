/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabEmployeeRole;

/**
 *
 * @author balumullamuri
 */

import java.awt.Color;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LaboratoryOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.CommonPanels.DonorApplicationListJPanel;


public class LabEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabEmployeeWorkAreaJPanel
     */
    
    
    boolean a = true;
    private UserAccount userAccount;
    private LaboratoryOrganization medhTechOrg;
    private Enterprise enterprise;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network network;
    
    public LabEmployeeWorkAreaJPanel(UserAccount account, LaboratoryOrganization pathoorganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.medhTechOrg = pathoorganization;
        this.enterprise = enterprise;
        this.system = business;
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
            
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        Header = new javax.swing.JPanel();
        BtnManageRequest = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 102, 102));
        Header.setPreferredSize(new java.awt.Dimension(800, 70));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        BtnManageRequest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageRequest.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageRequest.setText("Appointment Handling");
        BtnManageRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageRequestMouseClicked(evt);
            }
        });
        Header.add(BtnManageRequest);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(0, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageRequestMouseClicked
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        DonorApplicationListJPanel panel = new DonorApplicationListJPanel(system, userAccount, network, userProcessContainer);
        userProcessContainer.add("DonorApplicationListJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_BtnManageRequestMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageRequest;
    private javax.swing.JPanel Header;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
