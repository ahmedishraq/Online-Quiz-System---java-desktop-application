
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmed_ishraq
 */
public class answer extends javax.swing.JFrame {

    /**
     * Creates new form answer
     */
    String correct = null;
    String wrong = null;
    int c = 0;
    int w = 0;
    String std_id = null;
    String course_code = null;

    public answer() {
        initComponents();
        setTitle("Answer Window");
        setLocationRelativeTo(null);
        //showAnswer();
        c_ansPB.setVisible(false);
        w_ansPB.setVisible(false);
        c_ansL.setVisible(false);
        w_ansL.setVisible(false);
        finishB.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ansP = new javax.swing.JPanel();
        q1L = new javax.swing.JLabel();
        ans1L = new javax.swing.JLabel();
        q2L = new javax.swing.JLabel();
        ans2L = new javax.swing.JLabel();
        ans3L = new javax.swing.JLabel();
        q3L = new javax.swing.JLabel();
        ans4L = new javax.swing.JLabel();
        q4L = new javax.swing.JLabel();
        ans5L = new javax.swing.JLabel();
        q5L = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        c_ansL = new javax.swing.JLabel();
        w_ansL = new javax.swing.JLabel();
        c_ansPB = new javax.swing.JProgressBar();
        w_ansPB = new javax.swing.JProgressBar();
        scoreB = new javax.swing.JButton();
        finishB = new javax.swing.JButton();
        coreectL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ansP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        q1L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ans1L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        q2L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ans2L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        ans3L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        q3L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ans4L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        q4L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ans5L.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        q5L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Q1:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("ANS:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Q2:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("ANS:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Q3:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ANS:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Q4:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ANS:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Q5:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ANS:");

        javax.swing.GroupLayout ansPLayout = new javax.swing.GroupLayout(ansP);
        ansP.setLayout(ansPLayout);
        ansPLayout.setHorizontalGroup(
            ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ansPLayout.createSequentialGroup()
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ansPLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(q1L, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ansPLayout.createSequentialGroup()
                        .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ansPLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ansPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(18, 18, 18)
                        .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q2L, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans1L)
                            .addComponent(ans2L, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q3L, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans3L, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q4L, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans4L, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q5L, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans5L, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        ansPLayout.setVerticalGroup(
            ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ansPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1L)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans1L)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2L)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans2L)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3L)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans3L)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4L)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans4L)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5L)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(ansPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans5L)
                    .addComponent(jLabel10))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        c_ansL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        c_ansL.setText("Correct Answer: ");

        w_ansL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        w_ansL.setText("Wrong Answer:");

        c_ansPB.setStringPainted(true);

        w_ansPB.setStringPainted(true);

        scoreB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        scoreB.setText("My Score");
        scoreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_ansL)
                    .addComponent(w_ansL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_ansPB, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(w_ansPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreB)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_ansL)
                    .addComponent(c_ansPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(scoreB)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(w_ansL)
                    .addComponent(w_ansPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        finishB.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        finishB.setText("Finish");
        finishB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBActionPerformed(evt);
            }
        });

        coreectL.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        coreectL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coreectL.setText("Correct Answers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ansP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finishB)
                        .addGap(196, 196, 196))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(coreectL, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(coreectL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ansP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(finishB)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreBActionPerformed
        scoreB.setVisible(false);
        std_id = JOptionPane.showInputDialog("Enter your student ID");
        showAnswer();
        try {
            Database_conn c1 = new Database_conn();
            String query = "select * from score where student_id = '" + std_id + "'";
            ResultSet rs = c1.s.executeQuery(query);
            while (rs.next()) {
                correct = rs.getString("correct");
                wrong = rs.getString("wrong");
            }
            c = Integer.parseInt(correct) * 20;
            w = Integer.parseInt(wrong) * 20;

        } catch (Exception e) {
            e.printStackTrace();
        }
        c_ansL.setVisible(true);
        w_ansL.setVisible(true);
        c_ansPB.setVisible(true);
        w_ansPB.setVisible(true);
        c_ansPB.setValue(c);
        w_ansPB.setValue(w);
        finishB.setVisible(true);
    }//GEN-LAST:event_scoreBActionPerformed

    private void finishBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_finishBActionPerformed

    public void showScore() {

    }

    public void showAnswer() {
        try {
            Database_conn c1 = new Database_conn();
            String search_course = "select * from score where student_id = '" + std_id + "'";
            ResultSet rss = c1.s.executeQuery(search_course);
            if (rss.next()) {
                course_code = rss.getString("course_code");
            }
            if (course_code.equals("CSE101")) {
                for (int i = 1; i <= 5; i++) {
                    String question = null;
                    String answer = null;
                    String q_no = String.valueOf(i);
                    //Database_conn c1 = new Database_conn();
                    String retrive = "select * from cse101_question where ques_no='" + q_no + "'";
                    ResultSet rs = c1.s.executeQuery(retrive);
                    while (rs.next()) {
                        question = rs.getString("question");
                        answer = rs.getString("answer");
                    }
                    if (i == 1) {
                        q1L.setText(question);
                        ans1L.setText(answer);
                    }
                    if (i == 2) {
                        q2L.setText(question);
                        ans2L.setText(answer);
                    }
                    if (i == 3) {
                        q3L.setText(question);
                        ans3L.setText(answer);
                    }
                    if (i == 4) {
                        q4L.setText(question);
                        ans4L.setText(answer);
                    }
                    if (i == 5) {
                        q5L.setText(question);
                        ans5L.setText(answer);
                    }
                }
            }
            else if(course_code.equals("CSE102")){
                 for (int i = 1; i <= 5; i++) {
                    String question = null;
                    String answer = null;
                    String q_no = String.valueOf(i);
                    //Database_conn c1 = new Database_conn();
                    String retrive = "select * from cse102_question where ques_no='" + q_no + "'";
                    ResultSet rs = c1.s.executeQuery(retrive);
                    while (rs.next()) {
                        question = rs.getString("question");
                        answer = rs.getString("answer");
                    }
                    if (i == 1) {
                        q1L.setText(question);
                        ans1L.setText(answer);
                    }
                    if (i == 2) {
                        q2L.setText(question);
                        ans2L.setText(answer);
                    }
                    if (i == 3) {
                        q3L.setText(question);
                        ans3L.setText(answer);
                    }
                    if (i == 4) {
                        q4L.setText(question);
                        ans4L.setText(answer);
                    }
                    if (i == 5) {
                        q5L.setText(question);
                        ans5L.setText(answer);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(answer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new answer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans1L;
    private javax.swing.JLabel ans2L;
    private javax.swing.JLabel ans3L;
    private javax.swing.JLabel ans4L;
    private javax.swing.JLabel ans5L;
    private javax.swing.JPanel ansP;
    private javax.swing.JLabel c_ansL;
    private javax.swing.JProgressBar c_ansPB;
    private javax.swing.JLabel coreectL;
    private javax.swing.JButton finishB;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel q1L;
    private javax.swing.JLabel q2L;
    private javax.swing.JLabel q3L;
    private javax.swing.JLabel q4L;
    private javax.swing.JLabel q5L;
    private javax.swing.JButton scoreB;
    private javax.swing.JLabel w_ansL;
    private javax.swing.JProgressBar w_ansPB;
    // End of variables declaration//GEN-END:variables
}
