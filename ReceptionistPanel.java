package hospitalmanagementsystem;

public class ReceptionistPanel extends javax.swing.JFrame {

 private String userName;
 private int id;
 private String password;

 /**
  * Creates new form ReceptionistPanel
  */
 public ReceptionistPanel() {
  initComponents();
 }

 public ReceptionistPanel(int id, String username, String password) {
  this.userName = username;
  this.id = id;
  this.password = password;
  initComponents();
  ReceptionistName.setText(userName);
 }

 /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jPanel1 = new javax.swing.JPanel();
  ReceptionistName = new javax.swing.JLabel();
  AppointmentButton = new javax.swing.JButton();
  SettingsButton = new javax.swing.JButton();
  PatientGeneralInfoButton = new javax.swing.JButton();
  DoctorListButton = new javax.swing.JButton();
  PatientListButton = new javax.swing.JButton();
  PaymentButton = new javax.swing.JButton();
  AddPatientButton = new javax.swing.JButton();
  BackButton = new javax.swing.JButton();
  jLabel1 = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  getContentPane().setLayout(null);

  jPanel1.setBackground(new java.awt.Color(51, 102, 255));

  ReceptionistName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
  ReceptionistName.setText("Receptionist Name");

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap(418, Short.MAX_VALUE)
      .addComponent(ReceptionistName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(406, 406, 406))
    );
  jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(29, 29, 29)
      .addComponent(ReceptionistName)
      .addContainerGap(33, Short.MAX_VALUE))
    );

  getContentPane().add(jPanel1);
  jPanel1.setBounds(0, 31, 1000, 84);

  AppointmentButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  AppointmentButton.setText("Appointment");
  AppointmentButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    AppointmentButtonActionPerformed(evt);
   }
  });
  getContentPane().add(AppointmentButton);
  AppointmentButton.setBounds(578, 218, 220, 54);

  SettingsButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  SettingsButton.setText("Settings");
  SettingsButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    SettingsButtonActionPerformed(evt);
   }
  });
  getContentPane().add(SettingsButton);
  SettingsButton.setBounds(578, 304, 220, 54);

  PatientGeneralInfoButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PatientGeneralInfoButton.setText("Patient General Info");
  PatientGeneralInfoButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PatientGeneralInfoButtonActionPerformed(evt);
   }
  });
  getContentPane().add(PatientGeneralInfoButton);
  PatientGeneralInfoButton.setBounds(203, 133, 220, 54);

  DoctorListButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  DoctorListButton.setText("Doctor List");
  DoctorListButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    DoctorListButtonActionPerformed(evt);
   }
  });
  getContentPane().add(DoctorListButton);
  DoctorListButton.setBounds(203, 395, 220, 54);

  PatientListButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PatientListButton.setText("Patient List");
  PatientListButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PatientListButtonActionPerformed(evt);
   }
  });
  getContentPane().add(PatientListButton);
  PatientListButton.setBounds(203, 304, 220, 54);

  PaymentButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PaymentButton.setText("Payment");
  PaymentButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PaymentButtonActionPerformed(evt);
   }
  });
  getContentPane().add(PaymentButton);
  PaymentButton.setBounds(578, 133, 220, 54);

  AddPatientButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  AddPatientButton.setText("Add Patient");
  AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    AddPatientButtonActionPerformed(evt);
   }
  });
  getContentPane().add(AddPatientButton);
  AddPatientButton.setBounds(203, 218, 220, 54);

  BackButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  BackButton.setText("BACK");
  BackButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    BackButtonActionPerformed(evt);
   }
  });
  getContentPane().add(BackButton);
  BackButton.setBounds(712, 494, 86, 41);

  jLabel1.setIcon(new javax.swing.ImageIcon("C:\\\\arkaplan.jpg")); // NOI18N
  jLabel1.setText("jLabel1");
  getContentPane().add(jLabel1);
  jLabel1.setBounds(0, 0, 1000, 550);
  setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 575));
  setResizable(true);
  setSize(new java.awt.Dimension(1000, 575));
  setLocationRelativeTo(null);
  //     pack();
 }// </editor-fold>//GEN-END:initComponents

 /**
  * This button turn receptionistPanel page into PatientGeneralInfoPanel
  */
 private void PatientGeneralInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientGeneralInfoButtonActionPerformed
  new PatientGeneralInfoPanel().setVisible(true);
 }//GEN-LAST:event_PatientGeneralInfoButtonActionPerformed

 /**
  * This button activates the page for adding new patient
  */
 private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed
  new PatientAdd().setVisible(true);
 }//GEN-LAST:event_AddPatientButtonActionPerformed

 /**
  * This button turn current page into doctor list page
  */
 private void DoctorListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorListButtonActionPerformed
  new DoctorListPanel().setVisible(true);
 }//GEN-LAST:event_DoctorListButtonActionPerformed

 /**
  * This button turn current page into payment page
  */
 private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
  new PaymentPanel().setVisible(true);
 }//GEN-LAST:event_PaymentButtonActionPerformed

 /**
  * This button turn current page into settings page
  */
 private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
  setVisible(false);
  new Settings(id, userName, password, "Receptionist").setVisible(true);
 }//GEN-LAST:event_SettingsButtonActionPerformed

 /**
  * This button turn current page into appointment page
  */
 private void AppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentButtonActionPerformed
  new Chanel().setVisible(true);
 }//GEN-LAST:event_AppointmentButtonActionPerformed

 /**
  * This button turn current page into admin's page
  */
 private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
  setVisible(false);
  new AdminMain().setVisible(true);
 }//GEN-LAST:event_BackButtonActionPerformed

 /**
  * This button turn current page into patient list page
  */
 private void PatientListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientListButtonActionPerformed
  new PatientList().setVisible(true);
 }//GEN-LAST:event_PatientListButtonActionPerformed

 /**
  * @param args the command line arguments
  */
 public static void main(String args[]) {
  /* Set the Nimbus look and feel */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
  /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
   * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
   */
  try {
   for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
    }
   }
  } catch (ClassNotFoundException ex) {
   java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new ReceptionistPanel().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton AddPatientButton;
 private javax.swing.JButton AppointmentButton;
 private javax.swing.JButton BackButton;
 private javax.swing.JButton DoctorListButton;
 private javax.swing.JButton PatientGeneralInfoButton;
 private javax.swing.JButton PatientListButton;
 private javax.swing.JButton PaymentButton;
 private javax.swing.JLabel ReceptionistName;
 private javax.swing.JButton SettingsButton;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JPanel jPanel1;
 // End of variables declaration//GEN-END:variables
}