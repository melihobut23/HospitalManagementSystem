package hospitalmanagementsystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class PatientHistory extends javax.swing.JFrame {
 /**
  * Creates new form TreatmentMethod
  */
 public PatientHistory()
 {
  connect();
  initComponents();
  displayOnTable();
 }

 Connection con;
 PreparedStatement pst;
 ResultSet rs;


 /**
  * connect method establish the link between database and java codes
  */
 public void connect()
 {
  try {
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagementsystem", "root", "");
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (SQLException e){
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }

 /**
  * Show which treatments are made in table
  */
 public void displayOnTable(){

  try {
   pst = con.prepareStatement("select * from treatment");
   rs = pst.executeQuery();
   ResultSetMetaData rsmd = rs.getMetaData();
   int columns = rsmd.getColumnCount();

   DefaultTableModel def = (DefaultTableModel)jTable1.getModel();
   def.setRowCount(0);
   double totals = 0;
   while(rs.next()){

    Vector vec2 = new Vector();
    for(int i = 1; i <= columns; i++)
    {
     vec2.add(rs.getString("patientno"));
     vec2.add(rs.getString("doctorno"));
     vec2.add(rs.getString("diseasename"));
     vec2.add(rs.getString("treatmentmethods"));
     vec2.add(rs.getString("medicinename"));
     vec2.add(rs.getInt("frequency"));
     vec2.add(rs.getString("comment"));
    }
    def.addRow(vec2);
   } 
  } catch (SQLException ex) {
   Logger.getLogger(ExpencesAndIncomes.class.getName()).log(Level.SEVERE, null, ex);
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
  button1 = new java.awt.Button();
  jPanel1 = new javax.swing.JPanel();
  backButton = new javax.swing.JButton();
  patientHistoryHeaderLabel = new javax.swing.JLabel();
  jScrollPane1 = new javax.swing.JScrollPane();
  jTable1 = new javax.swing.JTable();

  button1.setLabel("button1");

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  jPanel1.setBackground(new java.awt.Color(51, 153, 255));

  backButton.setBackground(new java.awt.Color(51, 102, 255));
  backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  backButton.setText("BACK");
  backButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    backButtonActionPerformed(evt);
   }
  });

  patientHistoryHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
  patientHistoryHeaderLabel.setText("PATIENT HISTORY");

  jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
      "Patient No", "Doctor Name", "Disease Name", "Treatment Method", "Medicine Name", "Frequency", "Comments"
    }
    ) {
   Class[] types = new Class [] {
     java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
   };

   public Class getColumnClass(int columnIndex) {
    return types [columnIndex];
   }
  });
  jScrollPane1.setViewportView(jTable1);

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(486, 486, 486)
      .addComponent(patientHistoryHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addGap(79, 79, 79)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
      .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(58, 58, 58))
    );
  jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(21, 21, 21)
      .addComponent(patientHistoryHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(186, 186, 186)
          .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(18, 18, 18)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addContainerGap(40, Short.MAX_VALUE))
    );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 575));
  setResizable(true);
  setSize(new java.awt.Dimension(1000, 575));
  setLocationRelativeTo(null);
  pack();
 }// </editor-fold>//GEN-END:initComponents

 private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
  setVisible(false);
 }//GEN-LAST:event_backButtonActionPerformed

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
   java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new PatientHistory().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JButton backButton;
 private java.awt.Button button1;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTable jTable1;
 private javax.swing.JLabel patientHistoryHeaderLabel;
 // End of variables declaration//GEN-END:variables
}
