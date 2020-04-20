import java.awt.Color;
import javax.swing.*;
import java.sql.*;
public class registeration extends javax.swing.JFrame {
public registeration() {
        initComponents();
    }
public void register(){
    String  user="root";
    String pass="";
    String path="jdbc:mysql://localhost:3306/library";
try{
        int regno=Integer.parseInt(jTextField1.getText());
        String name=jTextField2.getText();
        String department=jComboBox1.getSelectedItem().toString();
        String place=jTextField3.getText();
        String phone=jTextField4.getText();
        String password=jPasswordField1.getText();
        
         if(department=="Select"){
           JOptionPane.showMessageDialog(null,"Select the Depart");
       }
         else{
             if(place.equals("")){
                  JOptionPane.showMessageDialog(null,"place not enterd");
             }
             else{
             
         if(name.equals("")){
            JOptionPane.showMessageDialog(null,"name not enterd");
       }
         else{
             
         
        if(password.equals("")){
JOptionPane.showMessageDialog(null,"insert password");
       }
       
       else{
           Class.forName("com.mysql.jdbc.Driver");
       
        Connection con=DriverManager.getConnection(path,user,pass);
        String query="insert into login(reg_no,name,dept,phone,place,password) values(?,?,?,?,?,?)";
        PreparedStatement ip=con.prepareStatement(query);
        ip.setInt(1,regno);
        ip.setString(2,name);
        ip.setString(3,department);
        ip.setString(4,phone);
        ip.setString(5,place);
        ip.setString(6,password);
        int count=ip.executeUpdate();
        JOptionPane.showMessageDialog(null, "Created");
        list ps=new list();
        ps.setVisible(true);
        ps.view();
        dispose();
       }
      }
             }
         }
         }           
    
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }


}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Linux\\Projects\\IMG-20200328-WA0040.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Registeration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 180, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Reg_No");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 70, 80, 40);

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 130, 60, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Dept");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 190, 60, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 300, 50, 40);

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Place");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 250, 60, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 350, 90, 40);

        jButton1.setBackground(new java.awt.Color(255, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Dialog-Apply-32.png")); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 390, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 51, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 390, 90, 30);

        jTextField1.setBackground(new java.awt.Color(255, 51, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 80, 190, 30);

        jTextField2.setBackground(new java.awt.Color(255, 51, 255));
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 130, 190, 30);

        jComboBox1.setBackground(new java.awt.Color(255, 51, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CSE", "CIVIL", "MECH", "EEE", "ECE", "B.TECH" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(300, 190, 190, 30);

        jTextField3.setBackground(new java.awt.Color(255, 51, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 240, 190, 30);

        jTextField4.setBackground(new java.awt.Color(255, 51, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 300, 190, 30);

        jPasswordField1.setBackground(new java.awt.Color(255, 51, 255));
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 255));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 350, 190, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\mini1.jpg")); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 10, 30, 30);

        jButton4.setBackground(new java.awt.Color(255, 51, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Delete-icon - Copy.png")); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(757, 10, 33, 30);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Icons\\Button-Rewind-icon - Copy.png")); // NOI18N
        jButton5.setText("Back");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(200, 390, 90, 30);

        jLabel9.setText("or login");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 420, 80, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Library management\\Background images\\IMG-20200328-WA0040.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -70, 820, 590);

        setSize(new java.awt.Dimension(799, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
startup ip=new startup(); 
ip.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       register();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jTextField1.setText("");
         jTextField2.setText("");
          jTextField3.setText("");
           jTextField4.setText("");
           jPasswordField1.setText("");
          jComboBox1.setSelectedItem(""); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setExtendedState(registeration.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
login ip=new login();
ip.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
jLabel9.setForeground(Color.blue);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
jLabel9.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

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
            java.util.logging.Logger.getLogger(registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
