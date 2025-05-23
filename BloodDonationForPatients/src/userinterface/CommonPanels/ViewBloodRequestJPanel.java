/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommonPanels;

import Business.BloodTypes.PersonBloodTypes;
import userinterface.CustomerRole.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Requests.PatientRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nitin
 */
public class ViewBloodRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodRequestJPanel
     */
    private EcoSystem system;
    private byte[] tempdP;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private boolean emailValid;
    private int yesno;
    private ButtonGroup radioGroup1;
    private JPanel userProcessContainer;
    PatientRequest requestToView;

    public ViewBloodRequestJPanel(EcoSystem system, PatientRequest requestToView, JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.requestToView = requestToView;
        
        this.radioGroup1 = new ButtonGroup();
        // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(buttonYes);
        radioGroup1.add(buttonNo);

        disableAllFields();
        
        populateGenderComboBox();
        populateStateComboBox();
        populatebloodTypeComboBox();
        populatePatientInformation();

    }

    private void populateGenderComboBox() {
        genderJComboBox.addItem("Male");
        genderJComboBox.addItem("Female");
        genderJComboBox.addItem("Other");

    }

    private void populateStateComboBox() {
        // Add all states to the JComboBox using a loop
        String[] states = {
            "Canada", "United States", "India", "Georgia", "South Africa"
        };

        for (String state : states) {
            stateJComboBox.addItem(state);
        }
    }

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

    private void disableAllFields() {

        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        ageText.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderJComboBox.setEnabled(false);

//        bloodType.setEnabled(false);
        bloodTypeComboBox.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateJComboBox.setEnabled(false);
        zipText.setEnabled(false);
        buttonYes.setEnabled(false);
        buttonNo.setEnabled(false);
    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonYes = new javax.swing.JRadioButton();
        buttonNo = new javax.swing.JRadioButton();
        dobDateField = new com.toedter.calendar.JDateChooser();
        titlePanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        stateJComboBox = new javax.swing.JComboBox();
        genderJComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        hlaTypesText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodTypeComboBox = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(1350, 718));
        setPreferredSize(new java.awt.Dimension(1350, 718));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setText("Street address:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("State:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        cityText.setBackground(new java.awt.Color(0, 153, 153));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(204, 255, 204));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 210, -1));

        nameText.setBackground(new java.awt.Color(0, 153, 153));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 255, 204));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 180, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Country:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("ZipCode:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 153, 153));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(204, 255, 204));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 210, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("Phone:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("DOB:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 153, 153));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(204, 255, 204));
        contactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextActionPerformed(evt);
            }
        });
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 170, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 204));
        jLabel17.setText("Email:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        emailText.setBackground(new java.awt.Color(0, 153, 153));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(204, 255, 204));
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 176, -1));

        ageText.setBackground(new java.awt.Color(0, 153, 153));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(204, 255, 204));
        ageText.setEnabled(false);
        ageText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageTextMouseClicked(evt);
            }
        });
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 170, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Gender:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 255, 204));
        jLabel19.setText("\"If yes, Please explain.\"     ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Volume In Units:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        streetText.setBackground(new java.awt.Color(0, 153, 153));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(204, 255, 204));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 210, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, -1, -1));

        buttonYes.setBackground(new java.awt.Color(0, 153, 153));
        buttonYes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonYes.setForeground(new java.awt.Color(204, 255, 204));
        buttonYes.setText("Yes");
        add(buttonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, -1));

        buttonNo.setBackground(new java.awt.Color(0, 153, 153));
        buttonNo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonNo.setForeground(new java.awt.Color(204, 255, 204));
        buttonNo.setText("No");
        add(buttonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        dobDateField.setBackground(new java.awt.Color(0, 153, 153));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(204, 255, 204));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 180, -1));

        titlePanel.setBackground(new java.awt.Color(0, 102, 102));
        titlePanel.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setBackground(new java.awt.Color(0, 102, 102));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 255, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Blood Request Form ");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 527, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 255, 204));
        jLabel20.setText("Age:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        stateJComboBox.setBackground(new java.awt.Color(0, 153, 153));
        stateJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateJComboBox.setForeground(new java.awt.Color(204, 255, 204));
        stateJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 210, -1));

        genderJComboBox.setBackground(new java.awt.Color(0, 153, 153));
        genderJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderJComboBox.setForeground(new java.awt.Color(204, 255, 204));
        genderJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboBoxActionPerformed(evt);
            }
        });
        add(genderJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 180, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 630, 110, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 980, 10));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Patient Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 150, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 30, 250));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Address Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 150, -1));

        hlaTypesText.setBackground(new java.awt.Color(0, 153, 153));
        hlaTypesText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hlaTypesText.setForeground(new java.awt.Color(204, 255, 204));
        hlaTypesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hlaTypesTextActionPerformed(evt);
            }
        });
        add(hlaTypesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 570, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 204));
        jLabel21.setText("Have you ever experienced any complications after recieving blood? ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, 30));

        uidText.setBackground(new java.awt.Color(0, 153, 153));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(204, 255, 204));
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 170, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("PIN:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        bloodTypeComboBox.setBackground(new java.awt.Color(0, 153, 153));
        bloodTypeComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodTypeComboBox.setForeground(new java.awt.Color(204, 255, 204));
        bloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeComboBoxActionPerformed(evt);
            }
        });
        add(bloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 170, 40));

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setForeground(new java.awt.Color(204, 255, 204));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 180, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setText("Blood Group:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon setPicture(String carImageLocation, JLabel carImage) {

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);

        return selectedCarPicture;
    }


    private void contactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed

    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void genderJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderJComboBoxActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));

    }//GEN-LAST:event_formMouseClicked

    private void ageTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTextMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear() - dob.getYear())));

    }//GEN-LAST:event_ageTextMouseClicked

    public void populatePatientInformation(){
         // TODO add your handling code here:
//        radioGroup1.clearSelection();
        // buttonYes.setSelected(false);
        // buttonYes.resetKeyboardActions();
//        uidText.setEnabled(true);
//        nameText.setEnabled(true);
//        dobDateField.setEnabled(true);
//        ageText.setEnabled(false);
//        emailText.setEnabled(true);
//        contactText.setEnabled(true);
//        genderJComboBox.setEnabled(true);

//        bloodType.setEnabled(true);
//        bloodTypeComboBox.setEnabled(true);
//        streetText.setEnabled(true);
//        cityText.setEnabled(true);
//        stateJComboBox.setEnabled(true);
//        zipText.setEnabled(true);
//        buttonYes.setEnabled(true);
//        buttonNo.setEnabled(true);

        // uidText.setTeboBox.setSelectedItem("");

        genderJComboBox.setSelectedItem(requestToView.getGender());

        stateJComboBox.setSelectedItem(requestToView.getState());

        dobDateField.setDate(requestToView.getDob());
        nameText.setText(requestToView.getName());
        uidText.setText(requestToView.getReceiverID());
        ageText.setText(String.valueOf(requestToView.getAge()));
        emailText.setText(requestToView.getEmailID());
        contactText.setText(String.valueOf(requestToView.getContact()));
        streetText.setText(requestToView.getStreetAddress());
        cityText.setText(requestToView.getCity());
        zipText.setText(String.valueOf(requestToView.getZipCode()));
//        bloodType.setText("");
        bloodTypeComboBox.setSelectedItem(requestToView.getBloodType());
        buttonNo.setSelected(true);
        genderJComboBox.setSelectedItem(requestToView.getGender());

    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        returnToWorkArea();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:

        if (!emailValidator(emailText.getText())) {
            emailValid = false;
        } else {
            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailValid = true;
            int delay = 2500; //milliseconds
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                }
            };
            javax.swing.Timer tick = new javax.swing.Timer(delay, taskPerformer);
            tick.setRepeats(false);
            tick.start();
        }


    }//GEN-LAST:event_uEmailKeyTyped

    private void bloodTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }

    private void populatebloodTypeComboBox() {
        
        bloodTypeComboBox.removeAllItems();
        for (String bloodTypeName : system.getPersonBloodTypes().getBloodTypeValuesList()){
            bloodTypeComboBox.addItem(bloodTypeName);
        }
    }//GEN-LAST:event_bloodTypeComboBoxActionPerformed

    private void hlaTypesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hlaTypesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hlaTypesTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox<String> bloodTypeComboBox;
    private javax.swing.JRadioButton buttonNo;
    private javax.swing.JRadioButton buttonYes;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JTextField hlaTypesText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    private void returnToWorkArea() {
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

}
