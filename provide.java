
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCOT
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;

public class provide extends javax.swing.JFrame {

    /**
     * Creates new form provide
     */
    public provide() {
        initComponents();
    }
    java.util.Date idate;
    java.sql.Date sql_idate;
    java.util.Date rdate;
     java.sql.Date sql_rdate;
    public void book(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
           int id=Integer.parseInt(jTextField1.getText());
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection(path,user,pass);
            String query="select*from whole where book_id=?";
            PreparedStatement ip=con.prepareStatement(query);
            ip.setInt(1,id);
            ResultSet ps=ip.executeQuery();
            while(ps.next()){
                jTextField2.setText(ps.getString("name"));
                        jTextField3.setText(ps.getString("author"));
                                jComboBox1.setSelectedItem(ps.getString("type"));
                                jComboBox2.setSelectedItem(ps.getString("regulations"));
                                jTextField4.setText(ps.getString("publications"));
                
                        JOptionPane.showMessageDialog(null,"ok");
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
    public void student(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
            int id=Integer.parseInt(jTextField5.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="select* from login where reg_no=?";
            PreparedStatement ip=con.prepareStatement(query);
            ip.setInt(1,id);
            ResultSet ps=ip.executeQuery();
            while(ps.next()){
                jTextField6.setText(ps.getString("name"));
                jTextField7.setText(ps.getString("phone"));
                jTextField8.setText(ps.getString("place"));
                jComboBox3.setSelectedItem(ps.getString("dept"));
               }
        }
        catch(Exception e){
            
        }
    }
    public void issue(){
        String user="root";
        String pass="";
        String path="jdbc:mysql://localhost:3306/library";
        try{
             int book_id=Integer.parseInt(jTextField1.getText());
            String book_name=jTextField2.getText();
            String author=jTextField3.getText();
            String type=jComboBox1.getSelectedItem().toString();
             String regulations=jComboBox2.getSelectedItem().toString();
              String publications=jTextField4.getText();
              
              SimpleDateFormat op=new SimpleDateFormat("dd-MM-yyyy");
              idate=jDateChooser1.getDate();
              sql_idate=new java.sql.Date(idate.getTime());
            rdate=jDateChooser2.getDate();
            sql_rdate=new java.sql.Date(rdate.getTime());
            int reg_no=Integer.parseInt(jTextField5.getText());
           String student_name=jTextField6.getText();
           String phone=jTextField7.getText();
           String dept=jComboBox3.getSelectedItem().toString();
            String place=jTextField8.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(path,user,pass);
            String query="insert into issue(reg_no,student_name,dept,book_id,book_name,author,type,regulations,publications,issue_date ,return_date,place,student_phone )values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ip=con.prepareStatement(query);
            ip.setInt(1,reg_no);
            ip.setString(2,student_name);
            ip.setString(3,dept);
             ip.setInt(4,book_id);
            ip.setString(5,book_name);
            ip.setString(6,author);
            ip.setString(7,type);
            ip.setString(8,regulations);
            ip.setString(9,publications);
            ip.setDate(10,sql_idate);
            ip.setDate(11,sql_rdate);
            ip.setString(12,place);
            ip.setString(13,phone);
            int coun=ip.executeUpdate();
            JOptionPane.showMessageDialog(null,"Book Added");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Proviede Books");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 10, 184, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 0, 0));
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(176, 120, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 0, 0));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 170, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 0, 0));
        jLabel4.setText("Author");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 210, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 0, 0));
        jLabel6.setText("Regulations");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 300, 100, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(250, 0, 0));
        jLabel7.setText("Type");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 260, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 0, 0));
        jLabel8.setText("Publication");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 350, 100, 19);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 0, 0));
        jLabel9.setText("issuedDate");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 400, 100, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 0, 0));
        jLabel5.setText("Return Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 440, 90, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 120, 160, 30);

        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 170, 160, 30);

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(280, 210, 160, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Magazine", "Story", "Experiment", "Network", "CSE", "language", "Computer science" }));
        jComboBox1.setEnabled(false);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(280, 260, 160, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2017", "2018", "2019", "2020", "2021", "2022", " ", " ", " " }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(280, 300, 160, 20);

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(280, 350, 160, 30);

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Student  List");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(720, 50, 112, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 0, 0));
        jLabel11.setText("Reg_no");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 110, 60, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 0, 0));
        jLabel12.setText("Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(640, 160, 50, 19);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 0, 0));
        jLabel13.setText("Phone");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(640, 190, 63, 34);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 0, 0));
        jLabel14.setText("Dept");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(640, 240, 44, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(250, 0, 0));
        jLabel15.setText("Place");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(640, 300, 70, 19);

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\search.png")); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 120, 100, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\search.png")); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(840, 110, 100, 30);

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\issue book.png")); // NOI18N
        jButton3.setText("issue");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(680, 360, 100, 30);

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(800, 360, 90, 30);

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\mini1.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(860, 10, 30, 29);

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Delete-icon - Copy.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(900, 10, 30, 29);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(710, 110, 120, 28);

        jTextField6.setEnabled(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(710, 160, 120, 28);

        jTextField7.setEnabled(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(710, 210, 120, 28);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CSE", "CIVIL", "MECH", "EEE", "ECE", "B.TECH", " ", " " }));
        jComboBox3.setEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(710, 250, 120, 29);

        jTextField8.setEnabled(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(710, 300, 120, 28);

        jButton7.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Rewind-icon - Copy.png")); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 10, 120, 40);

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Book Details");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(260, 60, 130, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(280, 400, 160, 30);
        getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(280, 440, 160, 30);

        setSize(new java.awt.Dimension(941, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jComboBox1.setSelectedItem(null);
jComboBox2.setSelectedItem(null);
jTextField4.setText("");
jDateChooser1.setDate(null);
jDateChooser2.setDate(null);
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jComboBox3.setSelectedItem(null);
jTextField8.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.setExtendedState(provide.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
book();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
student();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
issue();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Menu sp=new Menu();
sp.setVisible(true);
dispose();
sp.time();
sp.date();

dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(provide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(provide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(provide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(provide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new provide().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}