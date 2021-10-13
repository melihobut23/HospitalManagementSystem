package hospitalmanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Chanel extends javax.swing.JFrame {

 private ArrayList<String> doctors = new ArrayList<String>();
 private ArrayList<String> patients = new ArrayList<String>();

 /**
  * Creates new form Chanel
  */
 public Chanel() {
  initComponents();
  connect();
  getAutoId();
  loadAll();
  appointmentTable();
 }

 public void appointmentTable() {
  try {
   pst = con.prepareStatement("select * from appointment");
   rs = pst.executeQuery();
   ResultSetMetaData Rsm = rs.getMetaData();
   int column = Rsm.getColumnCount();
   DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
   df.setRowCount(0);
   while (rs.next()) {
    Vector v = new Vector();

    for (int i = 0; i < column; i++) {
     v.add(rs.getString("appointmentno"));
     v.add(rs.getString("doctorname"));
     v.add(rs.getString("patientname"));
     v.add(rs.getInt("roomNo"));
     v.add(rs.getString("date"));
     v.add(rs.getString("time"));
    }

    df.addRow(v);

   }
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }

 private void loadAll() {
  try {
   pst = con.prepareStatement("select * from doctor");
   rs = pst.executeQuery();

   while (rs.next()) {
    System.out.println();
    doctors.add(rs.getString("name"));
   }

   for (String name : doctors) {
    // System.out.println("ikinci for "+name);
    txtDoctorName.addItem(name);
   }

  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

  try {
   pst = con.prepareStatement("select * from patient");
   rs = pst.executeQuery();

   while (rs.next()) {
    System.out.println();
    patients.add(rs.getString("namesurname"));
   }

   for (String name : patients) {
    // System.out.println("ikinci for "+name);
    txtPatientName.addItem(name);
   }

  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

  txtDoctorName.setSelectedIndex(-1);
  txtPatientName.setSelectedIndex(-1);
 }

 Connection con;
 PreparedStatement pst;
 ResultSet rs;


 /**
  * connect method establish the link between database and java codes
  */
 public void connect() {
  try {
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost/hospitalmanagementsystem", "root", "");
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }

 public void getAutoId() {
  try {
   java.sql.Statement s = con.createStatement();
   rs = s.executeQuery("select MAX(appointmentno) from appointment");
   rs.next();
   rs.getString("MAX(appointmentno)");

   if (rs.getString("MAX(appointmentno)") == null) {
    txtAppNoLabel.setText("CH001");
   } else {
    long id = Long.parseLong(rs.getString("MAX(appointmentno)").substring(2, rs.getString("MAX(appointmentno)").length()));
    id++;
    txtAppNoLabel.setText("CH" + String.format("%03d", id));
   }
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }

 /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
 private void initComponents() {

  jPanel1 = new javax.swing.JPanel();
  jPanel2 = new javax.swing.JPanel();
  appointmentNoLabel = new javax.swing.JLabel();
  doctorNameLabel = new javax.swing.JLabel();
  patientNameLabel = new javax.swing.JLabel();
  roomNumberLabel = new javax.swing.JLabel();
  appointmentDateLabel = new javax.swing.JLabel();
  txtAppNoLabel = new javax.swing.JLabel();
  txtDoctorName = new javax.swing.JComboBox<>();
  txtPatientName = new javax.swing.JComboBox<>();
  appTimeLabel = new javax.swing.JLabel();
  appointmentDateTextField = new javax.swing.JTextField();
  appointmentTimeTextField = new javax.swing.JTextField();
  txtRoomNumberLabel = new javax.swing.JLabel();
  jScrollPane1 = new javax.swing.JScrollPane();
  jTable1 = new javax.swing.JTable();
  appHeaderLabel = new javax.swing.JLabel();
  createButton = new javax.swing.JButton();
  cancelButton = new javax.swing.JButton();
  backButton = new javax.swing.JButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  jPanel1.setBackground(new java.awt.Color(51, 153, 255));

  jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APPOINTMENT REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

  appointmentNoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  appointmentNoLabel.setText("Appointment No");

  doctorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  doctorNameLabel.setText("Doctor Name");

  patientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  patientNameLabel.setText("Patient Name");

  roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  roomNumberLabel.setText("Room Number");

  appointmentDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  appointmentDateLabel.setText("Appointment Date");

  txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    txtDoctorNameActionPerformed(evt);

   }
  });

  txtPatientName.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    txtPatientNameActionPerformed(evt);
   }
  });

  appTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  appTimeLabel.setText("Appointment Time");

  appointmentDateTextField.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    appointmentDateTextFieldActionPerformed(evt);
   }
  });

  appointmentTimeTextField.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    appointmentTimeTextFieldActionPerformed(evt);
   }
  });

  txtRoomNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addGap(22, 22, 22)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(appointmentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(patientNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(doctorNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(appointmentNoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(txtAppNoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.TRAILING, 0, 237, Short.MAX_VALUE)
        .addComponent(txtDoctorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(appointmentTimeTextField)
        .addComponent(appointmentDateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(txtRoomNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addContainerGap())
    );
  jPanel2Layout.setVerticalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(appointmentNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(txtAppNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(14, 14, 14)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(doctorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(6, 6, 6)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(patientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(roomNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(txtRoomNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(appointmentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(appointmentDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(appointmentTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        .addComponent(appTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGap(46, 46, 46))
    );

  jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object[][]{},
    new String[]{
      "Appointment no", "Doctor Name", "Patient Name", "Room No", "Date", "Time"
    }
    ) {
   Class[] types = new Class[]{
     java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
   };

   public Class getColumnClass(int columnIndex) {
    return types[columnIndex];
   }
  });
  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    jTable1MouseClicked(evt);
   }
  });
  jScrollPane1.setViewportView(jTable1);

  appHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  appHeaderLabel.setText("APPOINTMENT");

  createButton.setBackground(new java.awt.Color(51, 102, 255));
  createButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  createButton.setText("CREATE");
  createButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    createButtonActionPerformed(evt);
   }
  });

  cancelButton.setBackground(new java.awt.Color(51, 102, 255));
  cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  cancelButton.setText("CANCEL");
  cancelButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    cancelButtonActionPerformed(evt);
    txtDoctorName.setSelectedIndex(-1);
    txtPatientName.setSelectedIndex(-1);
    txtRoomNumberLabel.setText("");
    appointmentDateTextField.setText("");
    appointmentTimeTextField.setText("");
   }
  });

  backButton.setBackground(new java.awt.Color(51, 102, 255));
  backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
  backButton.setText("BACK");
  backButton.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    backButtonActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
  jPanel1.setLayout(jPanel1Layout);
  jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(47, 47, 47)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addGap(444, 444, 444)
          .addComponent(appHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
      .addContainerGap(46, Short.MAX_VALUE))
    );
  jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(appHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(33, 33, 33))
    );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  //txtDoctorName.setSelectedIndex(-1);
  setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 550));
  setResizable(true);
  setSize(new java.awt.Dimension(1000, 575));
  setLocationRelativeTo(null);
 }// </editor-fold>                        

 private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
 }

 private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
  String apno = txtAppNoLabel.getText();
  String name = txtDoctorName.getSelectedItem().toString();
  String patientName = txtPatientName.getSelectedItem().toString();
  int roomNo = Integer.parseInt(txtRoomNumberLabel.getText());
  String appDate = appointmentDateTextField.getText();
  String appTime = appointmentTimeTextField.getText();

  try {
   pst = con.prepareStatement("insert into appointment(appointmentno, doctorname, patientname, roomno, date, time)values(?,?,?,?,?,?)");
   pst.setString(1, apno);
   pst.setString(2, name);
   pst.setString(3, patientName);
   pst.setInt(4, roomNo);
   pst.setString(5, appDate);
   pst.setString(6, appTime);
   pst.executeUpdate();

   JOptionPane.showMessageDialog(null, "appointment is ready!");

   getAutoId();
   txtAppNoLabel.setText("");
   txtDoctorName.setSelectedIndex(-1);
   txtPatientName.setSelectedIndex(-1);
   txtRoomNumberLabel.setText("");
   appointmentDateTextField.setText("");
   appointmentTimeTextField.setText("");
   txtAppNoLabel.requestFocus();
   appointmentTable();
   getAutoId();

  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }

 private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {

 }

 private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {
  int roomNo = 0;
  if (txtDoctorName.getSelectedItem() != null) {
   try {
    //System.out.println(txtDoctorName.getSelectedItem().toString());

    pst = con.prepareStatement("select * from doctor where name = " + "'" + txtDoctorName.getSelectedItem().toString() + "'");
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   try {
    rs = pst.executeQuery();
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }

   try {
    if (rs.next()) {
     roomNo = rs.getInt("room");
     System.out.println(roomNo);
    }
   } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
   if (roomNo != 0) {
    txtRoomNumberLabel.setText("" + roomNo);
   }
  }
 }

 private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {
  // TODO add your handling code here:
 }

 private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
  this.setVisible(false);
 }

 private void appointmentDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
  // TODO add your handling code here:
 }

 private void appointmentTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
  // TODO add your handling code here:
 }

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
   java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new Chanel().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify                     
 private javax.swing.JLabel appHeaderLabel;
 private javax.swing.JLabel appTimeLabel;
 private javax.swing.JLabel appointmentDateLabel;
 private javax.swing.JTextField appointmentDateTextField;
 private javax.swing.JLabel appointmentNoLabel;
 private javax.swing.JTextField appointmentTimeTextField;
 private javax.swing.JButton backButton;
 private javax.swing.JButton cancelButton;
 private javax.swing.JButton createButton;
 private javax.swing.JLabel doctorNameLabel;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTable jTable1;
 private javax.swing.JLabel patientNameLabel;
 private javax.swing.JLabel roomNumberLabel;
 private javax.swing.JLabel txtAppNoLabel;
 private javax.swing.JComboBox<String> txtDoctorName;
 private javax.swing.JComboBox<String> txtPatientName;
 private javax.swing.JLabel txtRoomNumberLabel;
 // End of variables declaration                   
}
