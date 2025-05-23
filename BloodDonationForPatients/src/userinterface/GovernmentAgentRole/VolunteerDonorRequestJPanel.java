/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentAgentRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.BloodTypes.PersonBloodTypes;
import Business.People.Donor;
import Business.Requests.DonorRequest;
import Magic.Design.*;
import Magic.Design.MyTableFormat;
import Magic.Design.MyJLabel;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitin
 */
public class VolunteerDonorRequestJPanel extends javax.swing.JPanel {

  private  EcoSystem system;
  private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  //private DonorRequest donorRequest;
  
    VolunteerDonorRequestJPanel(EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.system = system;
        
        requestTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateRequestTable();
     }
   
     
        private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) requestTable.getModel();
        
        dtm.setRowCount(0);
          
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
        }
        
         for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donorRequest;
            row[1]= donorRequest.getName();
            row[2]= donorRequest.getContact();
            row[3]= donorRequest.getStatus();
              
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        hlaTypesTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        txtChronicPains = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtBrainInjury = new javax.swing.JTextField();
        txtBreathingProb = new javax.swing.JTextField();
        txtDiabitiesBP = new javax.swing.JTextField();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        emailText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1450, 830));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTable.setBackground(new java.awt.Color(0, 102, 102));
        requestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        requestTable.setForeground(new java.awt.Color(255, 255, 255));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requestTable.setFocusable(false);
        requestTable.setGridColor(new java.awt.Color(0, 0, 0));
        requestTable.setRowHeight(30);
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 170));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("UID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        uidText.setBackground(new java.awt.Color(0, 153, 153));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(204, 255, 204));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, -1));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("DOB");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        ageText.setBackground(new java.awt.Color(0, 153, 153));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(204, 255, 204));
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 180, -1));

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Gender");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        genderText.setBackground(new java.awt.Color(0, 153, 153));
        genderText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderText.setForeground(new java.awt.Color(204, 255, 204));
        add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 170, -1));

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("Status");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 30));

        streetText.setBackground(new java.awt.Color(0, 153, 153));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(204, 255, 204));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 176, -1));

        hlaTypesTextField.setBackground(new java.awt.Color(0, 153, 153));
        hlaTypesTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hlaTypesTextField.setForeground(new java.awt.Color(204, 255, 204));
        add(hlaTypesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 180, -1));

        jLabel13.setBackground(new java.awt.Color(0, 153, 153));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Street address");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 153, 153));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("City");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, 30));

        cityText.setBackground(new java.awt.Color(0, 153, 153));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(204, 255, 204));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 180, -1));

        jLabel15.setBackground(new java.awt.Color(0, 153, 153));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("State");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        stateText.setBackground(new java.awt.Color(0, 153, 153));
        stateText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateText.setForeground(new java.awt.Color(204, 255, 204));
        add(stateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 180, -1));

        jLabel16.setBackground(new java.awt.Color(0, 153, 153));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("ZipCode");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 153, 153));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(204, 255, 204));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 180, -1));

        jLabel17.setBackground(new java.awt.Color(0, 153, 153));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 204));
        jLabel17.setText("Contact Number");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 153, 153));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(204, 255, 204));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 170, -1));

        jLabel18.setBackground(new java.awt.Color(0, 153, 153));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 204));
        jLabel18.setText("Email ID");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        statusText.setBackground(new java.awt.Color(0, 153, 153));
        statusText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        statusText.setForeground(new java.awt.Color(204, 255, 204));
        add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 180, -1));

        txtChronicPains.setBackground(new java.awt.Color(0, 153, 153));
        txtChronicPains.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtChronicPains.setForeground(new java.awt.Color(204, 255, 204));
        txtChronicPains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChronicPainsActionPerformed(evt);
            }
        });
        add(txtChronicPains, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 640, 90, 30));

        jLabel20.setBackground(new java.awt.Color(0, 153, 153));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 204));
        jLabel20.setText("No History with severe brain injuries ");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 153, 153));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 204));
        jLabel21.setText("No history with Diabities and Blood Pressure");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 153, 153));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 255, 204));
        jLabel22.setText("Not suffering with any Chronic pains");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel24.setBackground(new java.awt.Color(0, 153, 153));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 255, 204));
        jLabel24.setText("No history with breathing problem");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        nameText.setBackground(new java.awt.Color(0, 153, 153));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 255, 204));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 180, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donor Request Handling");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, -1));

        txtBrainInjury.setBackground(new java.awt.Color(0, 153, 153));
        txtBrainInjury.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtBrainInjury.setForeground(new java.awt.Color(204, 255, 204));
        add(txtBrainInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 100, 30));

        txtBreathingProb.setBackground(new java.awt.Color(0, 153, 153));
        txtBreathingProb.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtBreathingProb.setForeground(new java.awt.Color(204, 255, 204));
        txtBreathingProb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreathingProbActionPerformed(evt);
            }
        });
        add(txtBreathingProb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 100, 30));

        txtDiabitiesBP.setBackground(new java.awt.Color(0, 153, 153));
        txtDiabitiesBP.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtDiabitiesBP.setForeground(new java.awt.Color(204, 255, 204));
        txtDiabitiesBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiabitiesBPActionPerformed(evt);
            }
        });
        add(txtDiabitiesBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 90, 30));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 130, 130));

        dobDateField.setBackground(new java.awt.Color(204, 255, 204));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(0, 153, 153));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 170, -1));

        emailText.setBackground(new java.awt.Color(0, 153, 153));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(204, 255, 204));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 180, -1));

        jLabel23.setBackground(new java.awt.Color(0, 153, 153));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 255, 204));
        jLabel23.setText("HLA Types");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 20));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Request Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Patient Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Address Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        btnApprove.setBackground(new java.awt.Color(0, 102, 102));
        btnApprove.setForeground(new java.awt.Color(204, 255, 204));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        btnReject.setBackground(new java.awt.Color(0, 102, 102));
        btnReject.setForeground(new java.awt.Color(204, 255, 204));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 180, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    
    
    
    private void txtChronicPainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChronicPainsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChronicPainsActionPerformed

    private void txtBreathingProbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreathingProbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreathingProbActionPerformed

    private void txtDiabitiesBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiabitiesBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiabitiesBPActionPerformed

    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        //ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
        // TODO add your handling code here:
        System.out.println("date");
        /*

        Date dob = dobDateField.getDate();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);

        Period p = Period.between(birthday, today);

        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);

        }

        */
        /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }

            */
    }//GEN-LAST:event_dobDateFielduDobKeyTyped

    private void populateRequestDetails(DonorRequest donorRequest){
            uidText.setText(donorRequest.getDonorID());
            nameText.setText(donorRequest.getName());
            dobDateField.setDate(donorRequest.getDob());
            ageText.setText(String.valueOf(donorRequest.getAge()));
            genderText.setText(donorRequest.getGender());
            hlaTypesTextField.setText(donorRequest.getBloodType().toString());
            streetText.setText(donorRequest.getStreetAddress());
            cityText.setText(donorRequest.getCity());
            stateText.setText(donorRequest.getState());
            zipText.setText(String.valueOf(donorRequest.getZipCode()));
            contactText.setText(String.valueOf(donorRequest.getContact()));
            emailText.setText(donorRequest.getEmailID());
            statusText.setText(donorRequest.getStatus());

            txtBrainInjury.setText(String.valueOf(donorRequest.isChronicConditions()));
            txtBreathingProb.setText(String.valueOf(donorRequest.isSelfDrugUse()));
            txtDiabitiesBP.setText(String.valueOf(donorRequest.isCurrentlyUnwell()));
            txtChronicPains.setText(String.valueOf(donorRequest.isContagiousDiseases()));

            if(donorRequest.getdP() !=null){
                //Working line
                byte[] JLabelpictureLabel = donorRequest.getdP();
                ImageIcon i = setPicturebyte(JLabelpictureLabel);
                lblProfilePicture.setIcon(i);
            }
            else{
                System.err.println("No Image");
            }

            uidText.setEditable(false);
            nameText.setEditable(false);
            ageText.setEditable(false);
            genderText.setEditable(false);
            hlaTypesTextField.setEditable(false);
            streetText.setEditable(false);
            cityText.setEditable(false);
            stateText.setEditable(false);
            zipText.setEditable(false);
            contactText.setEditable(false);
            statusText.setEditable(false);
            statusText.setEditable(false);
            txtBrainInjury.setEditable(false);
            txtBreathingProb.setEditable(false);
            txtDiabitiesBP.setEditable(false);
            txtChronicPains.setEditable(false);
            dobDateField.setEnabled(false);

    } 
    
    private void requestTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMousePressed
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow < 0){
        }
        else{
       //display the details 
            populateRequestDetails((DonorRequest) requestTable.getValueAt(selectedRow, 0));
            btnApprove.setEnabled(true);
            btnReject.setEnabled(true);
            
            if(Integer.parseInt(ageText.getText()) < 18) // AGE IS LESS THAN 18 YEARS
            {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
            }
            if(txtBrainInjury.getText().equals("false")) // Was your disease confirmed by Medical Practitioner?
            {
            txtBrainInjury.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtBrainInjury.setForeground(Color.red);
            }
            if(txtBreathingProb.getText().equals("false")) 
            {
            txtBreathingProb.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtBreathingProb.setForeground(Color.red);
            }
            if(txtDiabitiesBP.getText().equals("false")) // Currently you do NOT have any symptoms? 
            {
            txtDiabitiesBP.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtDiabitiesBP.setForeground(Color.red);
            }
            if(txtChronicPains.getText().equals("false")) // Has it been at least 14 days since the last day of your symptoms?
            {
            txtChronicPains.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtChronicPains.setForeground(Color.red);
            }

            
           dB4OUtil.storeSystem(system);
            
        }
    }//GEN-LAST:event_requestTableMousePressed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
               // TODO add your handling code here:
        if( !statusText.getText().equals("New Request"))
        {
            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request can not be approved!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        
        }
        
        else
        {
        Donor donor = new Donor();
        donor.setDonorID(uidText.getText()); // UID
        donor.setName(nameText.getText()); // Name
        donor.setDob(dobDateField.getDate()); // DOB 
        //donor.setCancerDiagnosedDate(diagnosedDateField.getDate());
        //donor.setLastDonationDate(lastDonationDateField.getDate()); // LastDonationDate
               
        donor.setAge(Integer.parseInt(ageText.getText())); // Age
        donor.setGender(genderText.getText()); // gender
        donor.setHLA(system.getPersonBloodTypes().findBloodType(hlaTypesTextField.getText()));
        donor.setStreetAddress(streetText.getText()); // streetAddress
        donor.setCity(cityText.getText()); // city
        donor.setState(stateText.getText()); // state
        donor.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        donor.setContact(Long.parseLong(contactText.getText())); // contact
        donor.setEmailID(statusText.getText()); // emailID
        donor.setStatus("Government Approved"); // status
    
        donor.setBrainInjury(true); //  labConfirmation
        donor.setDiabitiesBP(true); //  symptoms
        donor.setBreathingProb(true); //  followUpTest 
        system.getDonorDirectory().addDonor(donor);
             
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getDonorID().equals(uidText.getText())){
            donorRequest.setStatus("Government Approved");
            dB4OUtil.storeSystem(system);
            }
        }
        statusText.setText("Government Approved");
        
        dB4OUtil.storeSystem(system);
        populateRequestTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request approved successfully!</b></html>"));
           
        //JOptionPane.showMessageDialog(null,"Request Approved. New Donor added!");
        
        
        
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
                // TODO add your handling code here:
       if(!statusText.getText().equals("New Request"))
                  {
                      
       JOptionPane.showMessageDialog(null, new JLabel("<html><b>Request can not be rejected!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                      
                      //JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getName().equals(nameText.getText())){
            statusText.setText("Rejected");
            donorRequest.setStatus("Rejected");
            }}
        dB4OUtil.storeSystem(system);
        populateRequestTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>Request has been rejected!</b></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Request!");
        }
       dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField hlaTypesTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField stateText;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField txtBrainInjury;
    private javax.swing.JTextField txtBreathingProb;
    private javax.swing.JTextField txtChronicPains;
    private javax.swing.JTextField txtDiabitiesBP;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
