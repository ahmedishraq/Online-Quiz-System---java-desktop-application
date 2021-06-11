/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed_ishraq
 */
import javax.swing.*;
public class Admin_Signup extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Signup
     */
    public Admin_Signup() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faculty_regL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameL = new javax.swing.JLabel();
        usernameL = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        EmailL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        passwordPF = new javax.swing.JPasswordField();
        emailTF = new javax.swing.JTextField();
        registerB = new javax.swing.JButton();
        backB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        faculty_regL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        faculty_regL.setText("Faculty Registration");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nameL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameL.setText("Name:");

        usernameL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        usernameL.setText("Username:");

        passwordL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        passwordL.setText("Password:");

        EmailL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EmailL.setText("Email:");

        nameTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        usernameTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        passwordPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPFActionPerformed(evt);
            }
        });

        emailTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EmailL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTF)
                    .addComponent(usernameTF)
                    .addComponent(passwordPF)
                    .addComponent(emailTF, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameL)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordL)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        registerB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registerB.setText("Register");
        registerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBActionPerformed(evt);
            }
        });

        backB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(faculty_regL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(registerB)
                        .addGap(183, 183, 183)
                        .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(faculty_regL)
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerB)
                    .addComponent(backB))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordPFActionPerformed

    private void registerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBActionPerformed
        JOptionPane.showMessageDialog(null,"Registered Successfully!");
        new Admin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registerBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        new Admin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailL;
    private javax.swing.JButton backB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel faculty_regL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passwordL;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JButton registerB;
    private javax.swing.JLabel usernameL;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
