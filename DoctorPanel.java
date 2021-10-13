package hospitalmanagementsystem;


public class DoctorPanel extends javax.swing.JFrame {

 /**
  * Creates new form DoctorPanel
  */
 public DoctorPanel() {
  initComponents();
 }

 private String userName;
 private int id;
 private String password;
 /**
  * Initialize new form of DoctorPanel
  */
 public DoctorPanel(int id, String userName, String password)
 {
  this.userName = userName;
  this.id = id;
  initComponents();
  this.password = password;
  DoctorNameLabel.setText(userName);
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
  DoctorNameLabel = new javax.swing.JLabel();
  PrescriptionButton = new javax.swing.JButton();
  PatientGeneralInfoButton = new javax.swing.JButton();
  SettingButton = new javax.swing.JButton();
  PatientHistoryButton = new javax.swing.JButton();
  TreatmentButton = new javax.swing.JButton();
  BackButton = new javax.swing.JButton();
  foto = new javax.swing.JLabel();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  getContentPane().setLayout(null);

  jPanel1.setBackground(new java.awt.Color(51, 102, 255));

  DoctorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
  DoctorNameLabel.setText("Doctor Name");

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(430, 430, 430)
      .addComponent(DoctorNameLabel)
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(29, 29, 29)
      .addComponent(DoctorNameLabel)
      .addContainerGap(31, Short.MAX_VALUE))
    );

  getContentPane().add(jPanel1);
  jPanel1.setBounds(0, 31, 1000, 82);

  PrescriptionButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PrescriptionButton.setText("Prescription");
  PrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PrescriptionButtonActionPerformed(evt);

   }
  });
  getContentPane().add(PrescriptionButton);
  PrescriptionButton.setBounds(570, 168, 220, 55);

  PatientGeneralInfoButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PatientGeneralInfoButton.setText("Patient General Info");
  PatientGeneralInfoButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PatientGeneralInfoButtonActionPerformed(evt);

   }
  });
  getContentPane().add(PatientGeneralInfoButton);
  PatientGeneralInfoButton.setBounds(208, 168, 220, 55);

  SettingButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  SettingButton.setText("Settings");
  SettingButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    SettingButtonActionPerformed(evt);
   }
  });
  getContentPane().add(SettingButton);
  SettingButton.setBounds(570, 269, 220, 55);

  PatientHistoryButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  PatientHistoryButton.setText("Patient History");
  PatientHistoryButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    PatientHistoryButtonActionPerformed(evt);

   }
  });
  getContentPane().add(PatientHistoryButton);
  PatientHistoryButton.setBounds(208, 269, 220, 55);

  TreatmentButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  TreatmentButton.setText("Treatment ");
  TreatmentButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    TreatmentButtonActionPerformed(evt);
   }
  });
  getContentPane().add(TreatmentButton);
  TreatmentButton.setBounds(208, 364, 220, 55);

  BackButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
  BackButton.setText("BACK");
  BackButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    BackButtonActionPerformed(evt);
    new AdminMain().setVisible(true);
   }
  });
  getContentPane().add(BackButton);
  BackButton.setBounds(705, 492, 85, 40);

  foto.setIcon(new javax.swing.ImageIcon("C:\\arkaplan.jpg"));
  foto.setText("jLabel1");
  getContentPane().add(foto);
  foto.setBounds(0, 0, 1000, 550);
  setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 575));
  setResizable(true);
  setSize(new java.awt.Dimension(1000, 575));
  setLocationRelativeTo(null);
  //     pack();
 }// </editor-fold>//GEN-END:initComponents

 private void PrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionButtonActionPerformed
  new Prescription().setVisible(true);
 }//GEN-LAST:event_PrescriptionButtonActionPerformed

 private void PatientGeneralInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientGeneralInfoButtonActionPerformed
  new PatientGeneralInfoPanel().setVisible(true);
 }//GEN-LAST:event_PatientGeneralInfoButtonActionPerformed

 private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
  setVisible(false);
  new Settings(id, userName, password, "Doctor").setVisible(true);
 }//GEN-LAST:event_SettingButtonActionPerformed

 private void PatientHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientHistoryButtonActionPerformed
  new PatientHistory().setVisible(true);
 }//GEN-LAST:event_PatientHistoryButtonActionPerformed

 private void TreatmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentButtonActionPerformed
  new TreatmentMethod().setVisible(true);
 }//GEN-LAST:event_TreatmentButtonActionPerformed

 private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
  setVisible(false);
  new AdminMain().setVisible(true);
 }//GEN-LAST:event_BackButtonActionPerformed

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
   java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new DoctorPanel().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton BackButton;
 private javax.swing.JLabel DoctorNameLabel;
 private javax.swing.JButton PatientGeneralInfoButton;
 private javax.swing.JButton PatientHistoryButton;
 private javax.swing.JButton PrescriptionButton;
 private javax.swing.JButton SettingButton;
 private javax.swing.JButton TreatmentButton;
 private javax.swing.JLabel foto;
 private javax.swing.JPanel jPanel1;
 // End of variables declaration//GEN-END:variables
}