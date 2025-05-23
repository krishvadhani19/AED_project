/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemCoordinatorRole;

/**
 *
 * @author maka
 */


import Business.DB4OUtil.DB4OUtil;
import Magic.Design.MyJLabel;
import Business.EcoSystem;
import userinterface.DoctorRole.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.People.DonorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;
import userinterface.GovernmentAgentRole.ManageGovernmentCoordinatorProfile;
import Magic.Design.*;


public class SystemCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemCoordinatorWorkAreaJPanel
     */
    
    
    private UserAccount userAccount;
    boolean a=true;
    private LogisticsOrganization systorganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private DonorDirectory donorDirectory;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public SystemCoordinatorWorkAreaJPanel(UserAccount account, LogisticsOrganization systorganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.systorganization = systorganization;
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
        BtnDonorList = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 102, 102));
        Header.setPreferredSize(new java.awt.Dimension(1150, 70));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        BtnDonorList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDonorList.setForeground(new java.awt.Color(204, 255, 204));
        BtnDonorList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDonorList.setText("Donors List");
        BtnDonorList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDonorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDonorListMouseClicked(evt);
            }
        });
        Header.add(BtnDonorList);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(0, 153, 153));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(1400, 720));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDonorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDonorListMouseClicked
        // TODO add your handling code here:
        DonorListJPanel donorListJPanel = new DonorListJPanel(userAccount, system, network);
        userProcessContainer.add("DonorListJPanel",donorListJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnDonorListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnDonorList;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
