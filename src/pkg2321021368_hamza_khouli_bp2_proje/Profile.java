/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg2321021368_hamza_khouli_bp2_proje;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonul
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
   }// here is the Profile frame where the user can see his infos, update them and delete them if he wants
      //this method is used in class login to send the username
    public void setUser(String name) {
        jLableUsername.setText(name);
        //after i got the username i can access the other infos
        Connection con;
        ResultSet rs;
        try {
            /* making another connection to access the other infos useing the 
            uniqe username wich was send from class Login by the method setUser
            */
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "1234");
            Statement st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM info WHERE USERNAME='" + jLableUsername.getText() + "'");
            while (rs.next()) {
                jTextFieldName.setText(rs.getString("NAME"));
                jTextFieldSurname.setText(rs.getString("SURNAME"));
                jLableUsername.setText(rs.getString("USERNAME"));
                jTextFieldPass.setText(rs.getString("PASSWORD"));
                jTextFieldAge.setText(rs.getString("AGE"));
                String test;
                // here i got all the other infos i need
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
       
       
       
       
       

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldSurname = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLableUsername = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Profile");

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldSurname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldSurname.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPass.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("Password");

        jLabel3.setText("Age");

        jLabel4.setText("Surname");

        jLabel5.setText("Name");

        jLabel6.setText("Username");

        jTextFieldAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldAge.setForeground(new java.awt.Color(102, 102, 102));

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setForeground(new java.awt.Color(255, 51, 51));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Delete My Account");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel8.setText("Gender");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("You cant Change Your Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8))
                                        .addGap(12, 12, 12))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLableUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPass)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSurname)
                                    .addComponent(jTextFieldName)))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelete)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLableUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDelete)
                                    .addComponent(jLabel7)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:i
        /* this is the update button action
        in this action the user wants to update his infos that he can change by changing the old infos
        in the textfields
        */
        
        //here a again iam checking if the infos enterd by the user to change them are correctly enterd
       int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to Update Your profile informations?", "Confirmation", JOptionPane.YES_NO_OPTION);
if (dialogResult == JOptionPane.YES_OPTION){
    if ("".equals(jTextFieldName.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!jTextFieldName.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(new JFrame(), "Name should only contain letters", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!jTextFieldName.getText().matches(".{3,}")) {
                JOptionPane.showMessageDialog(new JFrame(), "Name should atleast contain 3 letters", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(jTextFieldSurname.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Surname is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if (!jTextFieldSurname.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(new JFrame(), "Surname should only contain letters", "Error", JOptionPane.ERROR_MESSAGE);
            }else if (!jTextFieldSurname.getText().matches(".{3,}")) {
                JOptionPane.showMessageDialog(new JFrame(), "Surname should atleast contain 3 letters", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("".equals(jTextFieldPass.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!jTextFieldPass.getText().matches(".{8,}")) {
                JOptionPane.showMessageDialog(new JFrame(), "Password must be at least 8 characters", "Error", JOptionPane.ERROR_MESSAGE);
            }else if ("".equals(jTextFieldAge.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Age is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!jTextFieldAge.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(new JFrame(), "Age should only contain numbers", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(Integer.parseInt(jTextFieldAge.getText().toString()) >= 120 || Integer.parseInt(jTextFieldAge.getText().toString()) <= 17){
                                JOptionPane.showMessageDialog(new JFrame(), "Age should only be between 18 and 120", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
        Connection con;
        Statement st;
        PreparedStatement pst;
        // after checking we can start the updating procces
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "1234");
                        st = con.createStatement();

            String sql = "UPDATE info SET NAME = '"+jTextFieldName.getText().toString()+"', SURNAME= '"+jTextFieldSurname.getText().toString()+"',AGE='"+Integer.parseInt(jTextFieldAge.getText().toString())+"' ,PASSWORD = '"+jTextFieldPass.getText().toString()+"',GENDER='"+jComboBox1.getSelectedItem().toString()+"' WHERE USERNAME ='"+jLableUsername.getText()+"';";
         pst = con.prepareStatement(sql);
         //useing UPDATE statment in sql i can update the infos of the user in the database
         pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:/
        
        /* in this Delete button action we know that the user wants to delete his account fullsy
        first i show the user a msg useing joptionpane if hes sure that wants to delete his account
                after i make sure i can start the delete procces
                */

        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your account?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Connection con;
            ResultSet rs;
            PreparedStatement pst;
            Statement st;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "1234");
                st = con.createStatement();
                String n = jLableUsername.getText().toString();
                String sql = "DELETE FROM info WHERE USERNAME='" + n + "'";
                // useing DELETE statment in sql i can delete the row of the users fully
                int n1 = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Your account has been Deleted");
                // showing a msg that the account has been delete/d
                // after the account is deleted the frame automaticlly gets back to the login frame
                Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);
                this.dispose();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } 
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this is the back button to get back to the main frame
        Home HomeFrame = new Home();
                HomeFrame.setUser(jLableUsername.getText());

        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLableUsername;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}
