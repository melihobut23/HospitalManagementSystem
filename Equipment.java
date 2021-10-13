package hospitalmanagementsystem;
   
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

public class Equipment extends javax.swing.JFrame {


 /**
  * Creates new form Equipment
  */
 public Equipment()
 {
  initComponents();
  connect();
  getAutoId();
  equipmentTable();
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
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }

 /**
  * this metod take id number from database which starts from zero
  */
 public void getAutoId()
 {
  try {
   java.sql.Statement s = con.createStatement();
   rs = s.executeQuery("select MAX(equipment_code) from equipments");
   rs.next();
   rs.getString("MAX(equipment_code)");

   if(rs.getString("MAX(equipment_code)") == null)
   {
    equipmentCodeTxt.setText("EQ001");
   }else
   {
    long id = Long.parseLong(rs.getString("MAX(equipment_code)").substring(2, rs.getString("MAX(equipment_code)").length()));
    id++;
    equipmentCodeTxt.setText("EQ" + String.format("%03d", id));
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
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
 private void initComponents() {

  jPanel1 = new javax.swing.JPanel();
  equipmentHeaderLabel = new javax.swing.JLabel();
  jPanel2 = new javax.swing.JPanel();
  jPanel3 = new javax.swing.JPanel();
  equipmentCodeLabel = new javax.swing.JLabel();
  equipmentTypeLabel = new javax.swing.JLabel();
  equipmentCountLabel = new javax.swing.JLabel();
  equipmentCodeTxt = new javax.swing.JLabel();
  equipmentTypeComboBox = new javax.swing.JComboBox<>();
  equipmentCountText = new javax.swing.JTextField();
  jButton1 = new javax.swing.JButton();
  jButton2 = new javax.swing.JButton();
  jButton3 = new javax.swing.JButton();
  jScrollPane1 = new javax.swing.JScrollPane();
  jTable1 = new javax.swing.JTable();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  setPreferredSize(new java.awt.Dimension(1000, 550));

  jPanel1.setBackground(new java.awt.Color(0, 153, 255));

  equipmentHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
  equipmentHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  equipmentHeaderLabel.setText("Equipment");

  jPanel2.setBackground(new java.awt.Color(0, 153, 255));

  jPanel3.setBackground(new java.awt.Color(0, 153, 255));
  jPanel3.setPreferredSize(new java.awt.Dimension(470, 367));

  equipmentCodeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  equipmentCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  equipmentCodeLabel.setText("Equipment Code");

  equipmentTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  equipmentTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  equipmentTypeLabel.setText("Equipment Type");

  equipmentCountLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  equipmentCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  equipmentCountLabel.setText("Equipment Count");

  equipmentTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stretcher", "Defibrillator", "Anesthesia Machine", "Patient Monitor", "Sterilizer", "ECG Machine", "Surgical Light" }));
  equipmentTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    equipmentTypeComboBoxActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
  jPanel3.setLayout(jPanel3Layout);
  jPanel3Layout.setHorizontalGroup(
    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(equipmentCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(equipmentCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(equipmentTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGap(10, 10, 10)
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        .addComponent(equipmentCountText, javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(equipmentTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
        .addComponent(equipmentCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGap(35, 35, 35))
    );
  jPanel3Layout.setVerticalGroup(
    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
      .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(equipmentCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(equipmentCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(equipmentTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(equipmentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(equipmentCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(equipmentCountText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(42, 42, 42))
    );

  jButton1.setBackground(new java.awt.Color(51, 102, 255));
  jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jButton1.setText("ADD");
  jButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton1ActionPerformed(evt);
   }
  });

  jButton2.setBackground(new java.awt.Color(51, 102, 255));
  jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jButton2.setText("DELETE");
  jButton2.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton2ActionPerformed(evt);
   }
  });

  jButton3.setBackground(new java.awt.Color(51, 102, 255));
  jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
  jButton3.setText("Back");
  jButton3.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton3ActionPerformed(evt);
   }
  });
  jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
   public void mouseClicked(java.awt.event.MouseEvent evt) {
    jTable1MouseClicked(evt);

   }
  });

  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
  jPanel2.setLayout(jPanel2Layout);
  jPanel2Layout.setHorizontalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
      .addContainerGap())
    );
  jPanel2Layout.setVerticalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addContainerGap(38, Short.MAX_VALUE))
    );

  jTable1.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {

    },
    new String [] {
      "Equipment Code", "Equipment Type", "Equipment Count"
    }
    ) {
   Class[] types = new Class [] {
     java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
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
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap(363, Short.MAX_VALUE)
      .addComponent(equipmentHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(323, 323, 323))
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(28, 28, 28))
    );
  jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(equipmentHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGap(0, 29, Short.MAX_VALUE))
    );

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 550));
  setResizable(true);
  setSize(new java.awt.Dimension(1000, 575));
  setLocationRelativeTo(null);
 }// </editor-fold>//GEN-END:initComponents
 /**
  * Method that show equipments which stands in equipmentTable
  */
 public  void equipmentTable() {
  try {
   pst = con.prepareStatement("select * from equipments");
   rs = pst.executeQuery();

   ResultSetMetaData Rsm = rs.getMetaData();
   int c;
   c = Rsm.getColumnCount();

   DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
   df.setRowCount(0);

   while(rs.next()){
    Vector v2 = new Vector();

    for (int i = 1; i <= c; i++){
     v2.add(rs.getString("equipment_code"));
     v2.add(rs.getString("equipment_type"));
     v2.add(rs.getString("equipment_count"));
    }
    df.addRow(v2);
   }
  }catch (SQLException ex){
   System.out.println("CANNOT DISPLAY");
  }
 }

 /**
  * Method that update the equipment 
  */

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  String equipment_type = equipmentTypeComboBox.getSelectedItem().toString();
  int equipment_count = Integer.parseInt(equipmentCountText.getText());
  String code = equipmentCodeTxt.getText();
  connect();

  try{
   pst = con.prepareStatement("insert into equipments(equipment_code, equipment_type, equipment_count) values(?,?,?)");
   pst.setString(1, code);
   pst.setString(2, equipment_type);
   pst.setInt(3, equipment_count);
   pst.executeUpdate();
  }catch (SQLException ex){
   System.out.println("CANNOT ADDED");
  }
  getAutoId();
  equipmentTypeComboBox.setSelectedIndex(-1);
  equipmentCountText.setText("");
  equipmentTable();
 }//GEN-LAST:event_jButton1ActionPerformed



 private void equipmentTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipmentTypeComboBoxActionPerformed
  // TODO add your handling code here:
 }//GEN-LAST:event_equipmentTypeComboBoxActionPerformed

 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  String id = equipmentCodeTxt.getText();             
  try {
   pst = con.prepareStatement("delete from equipments where equipment_code=?");
   pst.setString(1, id);
   pst.executeUpdate();
   JOptionPane.showMessageDialog(null, "equipments deleted");
   getAutoId();
   equipmentTypeComboBox.setSelectedIndex(-1);
   equipmentCountText.setText("");
   equipmentTable();
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }//GEN-LAST:event_jButton2ActionPerformed

 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  this.setVisible(false);
 }//GEN-LAST:event_jButton3ActionPerformed

 private void jTable1MouseClicked(java.awt.event.MouseEvent evt){
  DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
  int index = jTable1.getSelectedRow();
  equipmentCodeTxt.setText(d1.getValueAt(index, 0).toString());
  equipmentTypeComboBox.setSelectedItem(d1.getValueAt(index, 1).toString());
  equipmentCountText.setText(d1.getValueAt(index, 2).toString());
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
   java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new Equipment().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify//GEN-BEGIN:variables
 private javax.swing.JLabel equipmentCodeLabel;
 private javax.swing.JLabel equipmentCodeTxt;
 private javax.swing.JLabel equipmentCountLabel;
 private javax.swing.JTextField equipmentCountText;
 private javax.swing.JLabel equipmentHeaderLabel;
 private javax.swing.JComboBox<String> equipmentTypeComboBox;
 private javax.swing.JLabel equipmentTypeLabel;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JPanel jPanel1;
 private javax.swing.JPanel jPanel2;
 private javax.swing.JPanel jPanel3;
 private javax.swing.JScrollPane jScrollPane1;
 private javax.swing.JTable jTable1;
 // End of variables declaration//GEN-END:variables
}

