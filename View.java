import java.awt.Color;
 import java.sql.*;
 import net.proteanit.sql.DbUtils;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class View extends javax.swing.JFrame {

    
    
    public View() {
        initComponents();
    }
public void view(){
   
    try{
         String user="root";
    String pass="";
    String path="jdbc:mysql://localhost:3306/library";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(path,user,pass);
        String query="Select * from login";
        PreparedStatement ip=con.prepareStatement(query);
        ResultSet ps=ip.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(ps));
    }
    catch(Exception e ){
        JOptionPane.showMessageDialog(null,e);
    }
}
    
    
    
public void search(){
    String user="root";
    String pass="";
    String path="jdbc:mysql://localhost:3306/library";
    try{
        String search=jTextField1.getText();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(path,user,pass);
        String query="select * from login where reg_no=?";
        PreparedStatement ip=con.prepareStatement(query);
 ip.setString(1,search);
ResultSet ps=ip.executeQuery();
         JOptionPane.showMessageDialog(null,"searched");
          jTable1.setModel(DbUtils.resultSetToTableModel(ps));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("VIEW");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 70, 110, 40);

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Enter the reg_no");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 160, 230, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\search.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(371, 160, 90, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 160, 90, 30);

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\mini1.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(820, 0, 30, 30);

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Delete-icon - Copy.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(860, 0, 30, 30);

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Rewind-icon - Copy.png")); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 10, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Registeration Student");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 220, 220, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 260, 820, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Background images\\library-high-angle-photro-159775.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 900, 480);

        setSize(new java.awt.Dimension(890, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   view();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setExtendedState(login.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Menu ip=new Menu();
ip.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
   // TODO add your handling code here:
   if(jTextField1.getText().equals("Enter the reg_no")){
       jTextField1.setText("");
   }
   jTextField1.setForeground(Color.black);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
 if(jTextField1.getText().equals("")){
     jTextField1.setText("Enter the reg_no");
     
 }
 jTextField1.setForeground(new Color(102,102,102));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
