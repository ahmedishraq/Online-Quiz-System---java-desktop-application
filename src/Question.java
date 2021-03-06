
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed_ishraq
 */
public class Question extends javax.swing.JFrame {

    /**
     * Creates new form Question
     */
    static int second = 30;
    static int minute = 0;
    static String ddSecond, ddMinute;
    static DecimalFormat dFormat = new DecimalFormat("00");
    int wright = 0;
    int wrong = 0;
    
    static boolean state = true;
    public Question() {
        initComponents();
        timer();
        setLocationRelativeTo(null);
        setTitle("Question Window");
    }
    public void timer(){
    state = true;
        Thread t = new Thread(){
          public void run(){
              for(;;){
                  if(state == true){
                      try{
                          sleep(1000);
                          second--;
                          ddSecond = dFormat.format(second);
                          ddMinute = dFormat.format(minute);
                          minuteL.setText(""+ddMinute);
                          secondL.setText(" : "+ddSecond);
                          if(second == -1){
                              second = 59;
                              minute--;
                              ddSecond = dFormat.format(second);
                              ddMinute = dFormat.format(minute);
                              minuteL.setText(""+ddMinute);
                              secondL.setText(" : "+ddSecond);
                          }
                          if(minute == 0 && second == 0){
                              state = false;
                              calculateScore();
                              JOptionPane.showMessageDialog(null,"Times up for your exam");
                              setVisible(false);
                              JOptionPane.showMessageDialog(null,"Correct Answer: "+wright+"\n Wrong Answer: "+wrong);
                          }
                      }
                      catch(Exception e){
                        e.printStackTrace();
                      }
                  }
                  else{
                      break;
                  }
              }
          }  
        };
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        time_leftL = new javax.swing.JLabel();
        secondL = new javax.swing.JLabel();
        minuteL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        q5L2 = new javax.swing.JLabel();
        q1_aRB = new javax.swing.JRadioButton();
        q3_aRB = new javax.swing.JRadioButton();
        q3_cRB = new javax.swing.JRadioButton();
        q3L = new javax.swing.JLabel();
        q1_dRB = new javax.swing.JRadioButton();
        q3_bRB = new javax.swing.JRadioButton();
        q4_bRB = new javax.swing.JRadioButton();
        q5_cRB = new javax.swing.JRadioButton();
        q2_dRB = new javax.swing.JRadioButton();
        q1_bRB = new javax.swing.JRadioButton();
        q3_dRB = new javax.swing.JRadioButton();
        q5_bRB = new javax.swing.JRadioButton();
        q4_aRB = new javax.swing.JRadioButton();
        q4L1 = new javax.swing.JLabel();
        q2_aRB = new javax.swing.JRadioButton();
        q5_aRB = new javax.swing.JRadioButton();
        q2L = new javax.swing.JLabel();
        q1L = new javax.swing.JLabel();
        q1_cRB = new javax.swing.JRadioButton();
        q2_bRB = new javax.swing.JRadioButton();
        q4_cRB = new javax.swing.JRadioButton();
        q4_dRB = new javax.swing.JRadioButton();
        q5_dRB = new javax.swing.JRadioButton();
        q2_cRB = new javax.swing.JRadioButton();
        submitB = new javax.swing.JButton();
        end_my_examB = new javax.swing.JButton();
        saveB = new javax.swing.JButton();
        write_student_idL = new javax.swing.JLabel();
        write_student_idTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        time_leftL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_leftL.setText("Time Left:");

        secondL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        secondL.setText("60");

        minuteL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minuteL.setText("01 :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time_leftL)
                .addGap(76, 76, 76)
                .addComponent(minuteL)
                .addGap(6, 6, 6)
                .addComponent(secondL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minuteL)
                        .addComponent(time_leftL))
                    .addComponent(secondL))
                .addContainerGap())
        );

        q5L2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q5L2.setText("Q5:  Current CEO of Amazon");

        buttonGroup1.add(q1_aRB);
        q1_aRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q1_aRB.setText("Steve Jobs");

        buttonGroup3.add(q3_aRB);
        q3_aRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q3_aRB.setText("Steve Jobs");

        buttonGroup3.add(q3_cRB);
        q3_cRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q3_cRB.setText("Tim Cook");

        q3L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q3L.setText("Q3:  Current CEO of Google");

        buttonGroup1.add(q1_dRB);
        q1_dRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q1_dRB.setText("Sundar Pichai");

        buttonGroup3.add(q3_bRB);
        q3_bRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q3_bRB.setText("Bill Gates");

        buttonGroup4.add(q4_bRB);
        q4_bRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q4_bRB.setText("Bill Gates");

        buttonGroup5.add(q5_cRB);
        q5_cRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q5_cRB.setText("Jamos Gosling");

        buttonGroup2.add(q2_dRB);
        q2_dRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q2_dRB.setText("Sundor Pichai");

        buttonGroup1.add(q1_bRB);
        q1_bRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q1_bRB.setText("Bill Gates");

        buttonGroup3.add(q3_dRB);
        q3_dRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q3_dRB.setText("Sundor Pichai");

        buttonGroup5.add(q5_bRB);
        q5_bRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q5_bRB.setText("Bill Gates");

        buttonGroup4.add(q4_aRB);
        q4_aRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q4_aRB.setText("Steve Jobs");

        q4L1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q4L1.setText("Q4:  Creator of Microsoft");

        buttonGroup2.add(q2_aRB);
        q2_aRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q2_aRB.setText("Steve Jobs");

        buttonGroup5.add(q5_aRB);
        q5_aRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q5_aRB.setText("Jeff Bozes");

        q2L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q2L.setText("Q2:  What is the victory day of Bangladesh?");

        q1L.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q1L.setText("Q1:  Inventor of JAVA  ");

        buttonGroup1.add(q1_cRB);
        q1_cRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q1_cRB.setText("James Gosling");

        buttonGroup2.add(q2_bRB);
        q2_bRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q2_bRB.setText("Bill Gates");

        buttonGroup4.add(q4_cRB);
        q4_cRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q4_cRB.setText("James Gosling");

        buttonGroup4.add(q4_dRB);
        q4_dRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q4_dRB.setText("Sundor Pichai");

        buttonGroup5.add(q5_dRB);
        q5_dRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q5_dRB.setText("Sundar Pichai");

        buttonGroup2.add(q2_cRB);
        q2_cRB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        q2_cRB.setText("Tim Cook");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(q2L, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(q1L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(q1_aRB)
                                        .addComponent(q1_cRB))
                                    .addGap(176, 176, 176)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(q1_dRB)
                                        .addComponent(q1_bRB)))
                                .addComponent(q3L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(q4L1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                                .addComponent(q5L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q2_aRB)
                                    .addComponent(q2_cRB)
                                    .addComponent(q3_aRB)
                                    .addComponent(q3_cRB)
                                    .addComponent(q4_aRB)
                                    .addComponent(q4_cRB)
                                    .addComponent(q5_aRB)
                                    .addComponent(q5_cRB))
                                .addGap(196, 196, 196)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q2_dRB)
                                    .addComponent(q2_bRB)
                                    .addComponent(q3_bRB)
                                    .addComponent(q3_dRB)
                                    .addComponent(q4_bRB)
                                    .addComponent(q4_dRB)
                                    .addComponent(q5_bRB)
                                    .addComponent(q5_dRB))))
                        .addGap(128, 128, 128))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(q1L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1_aRB)
                    .addComponent(q1_bRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1_cRB)
                    .addComponent(q1_dRB))
                .addGap(29, 29, 29)
                .addComponent(q2L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2_aRB)
                    .addComponent(q2_bRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2_cRB)
                    .addComponent(q2_dRB))
                .addGap(29, 29, 29)
                .addComponent(q3L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3_aRB)
                    .addComponent(q3_bRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3_cRB)
                    .addComponent(q3_dRB))
                .addGap(29, 29, 29)
                .addComponent(q4L1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4_aRB)
                    .addComponent(q4_bRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q4_cRB)
                    .addComponent(q4_dRB))
                .addGap(29, 29, 29)
                .addComponent(q5L2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5_aRB)
                    .addComponent(q5_bRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5_cRB)
                    .addComponent(q5_dRB))
                .addGap(120, 120, 120))
        );

        jScrollPane1.setViewportView(jPanel2);

        submitB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        submitB.setText("Submit");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        end_my_examB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        end_my_examB.setText("End My Exam");
        end_my_examB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_my_examBActionPerformed(evt);
            }
        });

        saveB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        saveB.setText("Save");
        saveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBActionPerformed(evt);
            }
        });

        write_student_idL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        write_student_idL.setText("Write your student ID:");

        write_student_idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                write_student_idTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(submitB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveB)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(write_student_idL)
                .addGap(32, 32, 32)
                .addComponent(write_student_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_my_examB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(end_my_examB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(write_student_idL)
                        .addComponent(write_student_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitB)
                    .addComponent(saveB))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void end_my_examBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_my_examBActionPerformed
        calculateScore();
        setVisible(false);
        JOptionPane.showMessageDialog(null,"Correct Answer: "+wright+"\n Wrong Answer: "+wrong);
    }//GEN-LAST:event_end_my_examBActionPerformed

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        state = false;
        calculateScore();
        JOptionPane.showMessageDialog(null,"You submitted your timed exam successfully!");
        setVisible(false);
        try{
        Database_conn c1 = new Database_conn();
        String id = write_student_idTF.getText();
        String q1 = "insert into score values('"+id+ "','" +wright+ "') ";
        c1.s.executeUpdate(q1);
        JOptionPane.showMessageDialog(null,"Correct Answer: "+wright+"\n Wrong Answer: "+wrong);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitBActionPerformed

    private void saveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBActionPerformed

    }//GEN-LAST:event_saveBActionPerformed

    private void write_student_idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_write_student_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_write_student_idTFActionPerformed
    public void calculateScore(){
        if(q1_bRB.isSelected()){
            wright++;
        }
        if(q2_cRB.isSelected()){
            wright++;
        }
        if(q3_aRB.isSelected()){
            wright++;
        }
        if(q4_dRB.isSelected()){
            wright++;
        }
        if(q5_aRB.isSelected()){
            wright++;
        }
            wrong = 5 - wright;
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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton end_my_examB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minuteL;
    private javax.swing.JLabel q1L;
    private javax.swing.JRadioButton q1_aRB;
    private javax.swing.JRadioButton q1_bRB;
    private javax.swing.JRadioButton q1_cRB;
    private javax.swing.JRadioButton q1_dRB;
    private javax.swing.JLabel q2L;
    private javax.swing.JRadioButton q2_aRB;
    private javax.swing.JRadioButton q2_bRB;
    private javax.swing.JRadioButton q2_cRB;
    private javax.swing.JRadioButton q2_dRB;
    private javax.swing.JLabel q3L;
    private javax.swing.JRadioButton q3_aRB;
    private javax.swing.JRadioButton q3_bRB;
    private javax.swing.JRadioButton q3_cRB;
    private javax.swing.JRadioButton q3_dRB;
    private javax.swing.JLabel q4L1;
    private javax.swing.JRadioButton q4_aRB;
    private javax.swing.JRadioButton q4_bRB;
    private javax.swing.JRadioButton q4_cRB;
    private javax.swing.JRadioButton q4_dRB;
    private javax.swing.JLabel q5L2;
    private javax.swing.JRadioButton q5_aRB;
    private javax.swing.JRadioButton q5_bRB;
    private javax.swing.JRadioButton q5_cRB;
    private javax.swing.JRadioButton q5_dRB;
    private javax.swing.JButton saveB;
    private javax.swing.JLabel secondL;
    private javax.swing.JButton submitB;
    private javax.swing.JLabel time_leftL;
    private javax.swing.JLabel write_student_idL;
    private javax.swing.JTextField write_student_idTF;
    // End of variables declaration//GEN-END:variables
}
