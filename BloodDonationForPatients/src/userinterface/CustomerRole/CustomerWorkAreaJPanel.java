/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

/**
 *
 * @author maka
 */


import userinterface.SystemCoordinatorRole.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LogisticsOrganization;
import Business.People.DonorDirectory;
import Business.UserAccount.UserAccount;
import HomePages.LoginJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemCoordinatorWorkAreaJPanel
     */
    EcoSystem system;
    JPanel mainProcessContainer;
    
    
    public CustomerWorkAreaJPanel(EcoSystem system, JPanel mainProcessContainer) {
        initComponents();
        this.system = system;
        this.mainProcessContainer = mainProcessContainer;
        
        this.setSize(1280, 800);
        
        customerProcessContainer.add("PickCustomerActionJPanel",new PickCustomerActionJPanel(system, customerProcessContainer));
        CardLayout layout = (CardLayout) customerProcessContainer.getLayout();
        layout.next(customerProcessContainer);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        actionPanel = new javax.swing.JPanel();
        signInButton = new javax.swing.JButton();
        customerProcessContainer = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        splitPane.setDividerLocation(50);
        splitPane.setDividerSize(3);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPane.setMaximumSize(new java.awt.Dimension(1280, 720));
        splitPane.setMinimumSize(new java.awt.Dimension(1280, 720));
        splitPane.setPreferredSize(new java.awt.Dimension(1280, 720));

        actionPanel.setBackground(new java.awt.Color(0, 102, 102));

        signInButton.setBackground(new java.awt.Color(0, 153, 153));
        signInButton.setForeground(new java.awt.Color(204, 255, 204));
        signInButton.setText("Sign-in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(1127, Short.MAX_VALUE)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(signInButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(actionPanel);

        customerProcessContainer.setBackground(new java.awt.Color(0, 153, 153));
        customerProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(customerProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        mainProcessContainer.add("LoginJPanel",new LoginJPanel(system, mainProcessContainer));
        CardLayout layout = (CardLayout) mainProcessContainer.getLayout();
        layout.next(mainProcessContainer);
        
        
    }//GEN-LAST:event_signInButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel customerProcessContainer;
    private javax.swing.JButton signInButton;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
