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
import java.sql.*;

public class set_question extends javax.swing.JFrame {

    /**
     * Creates new form set_question
     */
    String question_set = null;
    String course_code = null;

    public set_question() {
        initComponents();
        setLocationRelativeTo(null);
        hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        set_questionL = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ques_noL = new javax.swing.JLabel();
        ques_noTF = new javax.swing.JTextField();
        questionL = new javax.swing.JLabel();
        questionTF = new javax.swing.JTextField();
        optionAL = new javax.swing.JLabel();
        optionBL = new javax.swing.JLabel();
        optionCL = new javax.swing.JLabel();
        optionDL = new javax.swing.JLabel();
        OptionATF = new javax.swing.JTextField();
        OptionBTF = new javax.swing.JTextField();
        OptionCTF = new javax.swing.JTextField();
        OptionDTF = new javax.swing.JTextField();
        timeL = new javax.swing.JLabel();
        timeTF = new javax.swing.JTextField();
        setL = new javax.swing.JLabel();
        setCB = new javax.swing.JComboBox<>();
        minL = new javax.swing.JLabel();
        submitB = new javax.swing.JButton();
        course_codeL = new javax.swing.JLabel();
        finishB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        set_questionB = new javax.swing.JButton();
        set_backB = new javax.swing.JButton();
        answerL = new javax.swing.JLabel();
        answerTF = new javax.swing.JTextField();
        course_codeCB = new javax.swing.JComboBox<>();
        secTF = new javax.swing.JTextField();
        secL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        set_questionL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        set_questionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        set_questionL.setText("Set Question");
        set_questionL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ques_noL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ques_noL.setText("Ques NO.");

        ques_noTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        questionL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        questionL.setText("Question:");

        questionTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        optionAL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        optionAL.setText("Option A:");

        optionBL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        optionBL.setText("Option B:");

        optionCL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        optionCL.setText("Option C:");

        optionDL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        optionDL.setText("Option D:");

        OptionATF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        OptionBTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        OptionCTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        OptionDTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        timeL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        timeL.setText("Time:");

        timeTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        timeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTFActionPerformed(evt);
            }
        });

        setL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        setL.setText("Question Set:");

        setCB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        setCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SET", "A", "B", "C", "D" }));

        minL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minL.setText("MIN");

        submitB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitB.setText("Submit");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        course_codeL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        course_codeL.setText("Course Code:");

        finishB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finishB.setText("Finish");
        finishB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBActionPerformed(evt);
            }
        });

        backB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        set_questionB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        set_questionB.setText("Set Question");
        set_questionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_questionBActionPerformed(evt);
            }
        });

        set_backB.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        set_backB.setText("Back");
        set_backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_backBActionPerformed(evt);
            }
        });

        answerL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        answerL.setText("Answer:");

        answerTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        course_codeCB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        course_codeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Code", "CSE101", "CSE102" }));

        secTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        secL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        secL.setText("SEC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ques_noL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ques_noTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(timeL)
                                .addGap(31, 31, 31)
                                .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(minL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(secL)
                                .addGap(29, 29, 29)
                                .addComponent(setL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(setCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(course_codeL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(course_codeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(questionL)
                                    .addComponent(optionAL)
                                    .addComponent(optionBL)
                                    .addComponent(optionCL)
                                    .addComponent(optionDL)
                                    .addComponent(answerL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(questionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(OptionDTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                                            .addComponent(OptionCTF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OptionBTF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OptionATF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(answerTF, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(submitB)
                                            .addComponent(finishB)
                                            .addComponent(backB))
                                        .addGap(27, 27, 27))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(set_questionB)
                        .addGap(183, 183, 183)
                        .addComponent(set_backB)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ques_noL)
                    .addComponent(ques_noTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeL)
                    .addComponent(timeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setL)
                    .addComponent(setCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minL)
                    .addComponent(course_codeL)
                    .addComponent(course_codeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secL))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionL)
                    .addComponent(questionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionAL)
                    .addComponent(OptionATF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(submitB)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionBL)
                    .addComponent(OptionBTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(finishB)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optionCL)
                            .addComponent(OptionCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(optionDL)
                                    .addComponent(OptionDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerL)
                                    .addComponent(answerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(backB)))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(set_questionB)
                            .addComponent(set_backB))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(set_questionL, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(set_questionL)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTFActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        hide();
        set_questionB.setVisible(true);
        timeL.setVisible(true);
        timeTF.setVisible(true);
        minL.setVisible(true);
        secTF.setVisible(true);
        secL.setVisible(true);
        course_codeL.setVisible(true);
        course_codeCB.setVisible(true);
        setL.setVisible(true);
        setCB.setVisible(true);
        set_backB.setVisible(true);

    }//GEN-LAST:event_backBActionPerformed

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        String ques_no = ques_noTF.getText();
        String question = questionTF.getText();
        String optionA = OptionATF.getText();
        String optionB = OptionBTF.getText();
        String optionC = OptionCTF.getText();
        String optionD = OptionDTF.getText();
        String answer = answerTF.getText();
        course_code = (String)course_codeCB.getSelectedItem();
        if(course_code.equals("CSE101")){
        try {
            Database_conn c1 = new Database_conn();
            String insert = "insert into cse101_question values('" + ques_no + "' , '" + question + "' , '" + optionA + "' , '" + optionB + "' , '" + optionC + "' , '" + optionD + "' , '" + answer + "')";
            c1.s.executeUpdate(insert);
            ques_noTF.setText("");
            questionTF.setText("");
            OptionATF.setText("");
            OptionBTF.setText("");
            OptionCTF.setText("");
            OptionDTF.setText("");
            answerTF.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        else if(course_code.equals("CSE102")){
            try {
            Database_conn c1 = new Database_conn();
            String insert = "insert into cse102_question values('" + ques_no + "' , '" + question + "' , '" + optionA + "' , '" + optionB + "' , '" + optionC + "' , '" + optionD + "' , '" + answer + "')";
            c1.s.executeUpdate(insert);
            ques_noTF.setText("");
            questionTF.setText("");
            OptionATF.setText("");
            OptionBTF.setText("");
            OptionCTF.setText("");
            OptionDTF.setText("");
            answerTF.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_submitBActionPerformed

    private void set_questionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_questionBActionPerformed
        String minute = timeTF.getText();
        String second = secTF.getText();
        String set = (String) setCB.getSelectedItem();
        String course_code = (String) course_codeCB.getSelectedItem();
        if (minute.equals("") || second.equals("") || set.equals("SET") || course_code.equals("Course Code")) {
            JOptionPane.showMessageDialog(null, "Please fill up all the info about the question");
        } else {
            set_questionB.setVisible(false);
            timeL.setVisible(false);
            timeTF.setVisible(false);
            minL.setVisible(false);
            secTF.setVisible(false);
            secL.setVisible(false);
            course_codeL.setVisible(false);
            course_codeCB.setVisible(false);
            setL.setVisible(false);
            setCB.setVisible(false);
            set_backB.setVisible(false);
            // ******* show other sections *********
            ques_noL.setVisible(true);
            ques_noTF.setVisible(true);
            questionL.setVisible(true);
            questionTF.setVisible(true);
            optionAL.setVisible(true);
            OptionATF.setVisible(true);
            optionBL.setVisible(true);
            OptionBTF.setVisible(true);
            optionCL.setVisible(true);
            OptionCTF.setVisible(true);
            optionDL.setVisible(true);
            OptionDTF.setVisible(true);
            answerL.setVisible(true);
            answerTF.setVisible(true);
            submitB.setVisible(true);
            finishB.setVisible(true);
            backB.setVisible(true);
            //**************************

            try {
                Database_conn c1 = new Database_conn();
                String insert = "insert into question_info values('" + course_code + "' , '" + set + "' , '" + minute + "' , '"+second+"')";
                c1.s.executeUpdate(insert);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_set_questionBActionPerformed

    private void set_backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_backBActionPerformed
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_set_backBActionPerformed

    private void finishBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBActionPerformed
        this.dispose();
        new Admin().setVisible(true);
    }//GEN-LAST:event_finishBActionPerformed
    public void hide() {
        ques_noL.setVisible(false);
        ques_noTF.setVisible(false);
        questionL.setVisible(false);
        questionTF.setVisible(false);
        optionAL.setVisible(false);
        OptionATF.setVisible(false);
        optionBL.setVisible(false);
        OptionBTF.setVisible(false);
        optionCL.setVisible(false);
        OptionCTF.setVisible(false);
        optionDL.setVisible(false);
        OptionDTF.setVisible(false);
        answerL.setVisible(false);
        answerTF.setVisible(false);
        answerTF.setVisible(false);
        submitB.setVisible(false);
        finishB.setVisible(false);
        backB.setVisible(false);
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
            java.util.logging.Logger.getLogger(set_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(set_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(set_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(set_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new set_question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OptionATF;
    private javax.swing.JTextField OptionBTF;
    private javax.swing.JTextField OptionCTF;
    private javax.swing.JTextField OptionDTF;
    private javax.swing.JLabel answerL;
    private javax.swing.JTextField answerTF;
    private javax.swing.JButton backB;
    private javax.swing.JComboBox<String> course_codeCB;
    private javax.swing.JLabel course_codeL;
    private javax.swing.JButton finishB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minL;
    private javax.swing.JLabel optionAL;
    private javax.swing.JLabel optionBL;
    private javax.swing.JLabel optionCL;
    private javax.swing.JLabel optionDL;
    private javax.swing.JLabel ques_noL;
    private javax.swing.JTextField ques_noTF;
    private javax.swing.JLabel questionL;
    private javax.swing.JTextField questionTF;
    private javax.swing.JLabel secL;
    private javax.swing.JTextField secTF;
    private javax.swing.JComboBox<String> setCB;
    private javax.swing.JLabel setL;
    private javax.swing.JButton set_backB;
    private javax.swing.JButton set_questionB;
    private javax.swing.JLabel set_questionL;
    private javax.swing.JButton submitB;
    private javax.swing.JLabel timeL;
    private javax.swing.JTextField timeTF;
    // End of variables declaration//GEN-END:variables
}
