/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
/**
 *
 * @author ELCOT
 */import java.sql.*;
import javax.swing.*;
import lms.LMS_System;
import net.proteanit.sql.DbUtils;
 public class black extends javax.swing.JFrame {

    /**
     * Creates new form black
     */
    
    
    public black() {
        initComponents();
    }
    
    public void blacklist(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="insert into black  select reg_no,student_name,dept,book_id,book_name,author,type,regulations,publications,issue_date ,return_date,place,student_phone from issue where return_date<curdate()";
            PreparedStatement ip=con.prepareStatement(query);
        int count=ip.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
     public void delete(){
    String user="root";
            String pass="";
String path="jdbc:mysql://localhost:3306/library";
try{
   Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection(path,user,pass);
   String query="delete from issue where return_date<curdate()";
   PreparedStatement ip=con.prepareStatement(query);
   
   //ResultSet ps=ip.executeQuery();
   int count=ip.executeUpdate();
  // JOptionPane.showMessageDialog(null,"returned");
   //jTable1.setModel(DbUtils.resultSetToTableModel(ps));
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
    }
    public void view(){
         String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="Select*from black";
            PreparedStatement ip=con.prepareStatement(query);
            ResultSet ps=ip.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(ps));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void Return(){
         String user="root";
         String pass="";
         String path="jdbc:mysql://localhost:3306/library";
         try{
             int reg_no=Integer.parseInt(jTextField1.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="insert into last  select reg_no,student_name,dept,book_id,book_name,author,type,regulations,publications,issue_date ,return_date,place,student_phone from black where reg_no=?";
            PreparedStatement ip=con.prepareStatement(query);
           ip.setInt(1,reg_no);
          int count=ip.executeUpdate();
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
     }
    
    
    public void search(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
            int id=Integer.parseInt(jTextField1.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="select*from black where reg_no=?";
            PreparedStatement ip=con.prepareStatement(query);
            ip.setInt(1,id);
            ResultSet ps=ip.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(ps));
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    public void Delete(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
    try{
        int id=Integer.parseInt(jTextField1.getText());
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(path,user,pass);
        String query="Delete from black where reg_no=?";
        PreparedStatement ip=con.prepareStatement(query);
        ip.setInt(1,id);
        int count=ip.executeUpdate();
         JOptionPane.showMessageDialog(null,"Returned");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
    public void fine(){
        String user="root";
                String pass="";
                String path="jdbc:mysql://localhost:3306/library";
        try{
            int reg_no=Integer.parseInt(jTextField1.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="select datediff(curdate(),return_date)*5 as fine from black where reg_no=?";
            PreparedStatement ip=con.prepareStatement(query);
            ip.setInt(1,reg_no);
            ResultSet ps=ip.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(ps));
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Black List User");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 40, 220, 50);

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
        jTextField1.setBounds(60, 160, 200, 30);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\search.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 160, 120, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 160, 90, 30);

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
        jScrollPane1.setBounds(10, 240, 800, 170);

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Rewind-icon - Copy.png")); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 20, 120, 40);

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\return book png.png")); // NOI18N
        jButton4.setText("Return");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 160, 110, 30);

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\Linux\\Projects\\mini1.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(733, 20, 30, 30);

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\Linux\\Projects\\Button-Delete-icon - Copy.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(773, 20, 30, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fine"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(270, 440, 80, 70);

        jButton7.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\rupee-indian.png")); // NOI18N
        jButton7.setText("Fine");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(110, 433, 110, 40);

        jButton8.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\SMS-Message-icon.png")); // NOI18N
        jButton8.setText(" Notify");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(110, 480, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Background images\\pile-of-assorted-novel-books-694740 (1).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-160, -10, 2000, 540);

        setSize(new java.awt.Dimension(826, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ilist ip=new ilist();
ip.setVisible(true);
dispose();// TODO add your handling code here:
ip.iview();
ip.see();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Return();
Delete();
view();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
search();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jTextField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setExtendedState(black.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
fine();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   LMS_System lms=new LMS_System();
      lms.sendsms();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
if(jTextField1.getText().equals("Enter the reg_no")){
    jTextField1.setText("");

}    
jTextField1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
 if(jTextField1.getText().equals("")){
    jTextField1.setText("Enter the reg_no");

}    
jTextField1.setForeground(new Color(102,102,102));        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(black.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(black.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(black.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(black.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new black().setVisible(true);
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
