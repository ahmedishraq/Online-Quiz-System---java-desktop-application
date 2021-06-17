
//import static Question.state;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
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
public class qWindow extends javax.swing.JFrame {

    /**
     * Creates new form qWindow
     */
    // *************  For timer ****************
    static int second = 00;
    static int minute = 0;
    static String ddSecond, ddMinute;
    static DecimalFormat dFormat = new DecimalFormat("00");
    static boolean state = true;
    //*******************************************
    static int count = 1;
    String question [][] = new String[10][5];
    String answer [] = new String [5];
    String  a1, a2, a3, a4, a5;
    String student_id = null;
    int correct = 0;
    int wrong = 0;
    
    public qWindow() {
        initComponents();
        setTitle("Question Window");
        setLocationRelativeTo(null);
        time_label();
        submitB.setVisible(false);
        backB.setVisible(false);
        next_subB.setVisible(false);
        saveAnswer();
    }
    
    public void setQuestion(){
        question[0][0] = "Inventor of JAVA";
        question[0][1] = "Steve Jobs";
        question[0][2] = "Bill Gates";
        question[0][3] = "James Gosling";
        question[0][4] = "Sundar Pichai";
         
        
        question[1][0] = "Current SEO of Apple Inc.";
        question[1][1] = "Steve Jobs";
        question[1][2] = "Bill Gates";
        question[1][3] = "Tim Cook";
        question[1][4] = "Sundar Pichai";
         
        
        question[2][0] = "Current CEO of Google";
        question[2][1] = "Steve Jobs";
        question[2][2] = "Bill Gates";
        question[2][3] = "James Gosling";
        question[2][4] = "Sundar Pichai";
         
        
        question[3][0] = "Creator of Microsoft";
        question[3][1] = "Steve Jobs";
        question[3][2] = "Bill Gates";
        question[3][3] = "James Gosling";
        question[3][4] = "Sundar Pichai";
         
        
        question[4][0] = "Current CEO of Amazon";
        question[4][1] = "Jeff Bozes";
        question[4][2] = "Bill Gates";
        question[4][3] = "James Gosling";
        question[4][4] = "Sundar Pichai";
         
        
        
    }
    
    public void answer(){
             answer[0] = "James Gosling";
             answer[1] ="Tim Cook";
             answer[2] = "Sundar Pichai";
             answer[3] = "Bill Gates";
             answer[4] = "Jeff Bozes";
    }
    
    public void saveAnswer(){
        try{
             Database_conn c1 =new Database_conn();
             answer();
             String query = "insert into answer values('"+answer[0]+"', '"+answer[1]+"', '"+answer[2]+"', '"+answer[3]+"', '"+answer[4]+"')";
             c1.s.executeUpdate(query);
         }
         catch(Exception e){
              e.printStackTrace();
         }
    }
    
    public void startExam(int count){
//        setQuestion();
//        q_noL.setText("Q"+(count+1)+". ");
//        questionL.setText(question[count][0]);
//        aRB.setText(question[count][1]);
//        bRB.setText(question[count][2]);
//        cRB.setText(question[count][3]);
//        dRB.setText(question[count][4]);
          try{
              Database_conn c1 = new Database_conn();
              String q_no = String.valueOf(count);
              String fetch = "select * from question where ques_no='"+q_no+"'";
              ResultSet rs = c1.s.executeQuery(fetch);
              if(rs.next()){
                  q_noL.setText(rs.getString("ques_no"));
                  questionL.setText(rs.getString("question"));
                  aRB.setText(rs.getString("option_A"));
                  bRB.setText(rs.getString("option_B"));
                  cRB.setText(rs.getString("option_C"));
                  dRB.setText(rs.getString("option_D"));
              }
          }
          catch(Exception e){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        time_idP = new javax.swing.JPanel();
        timeP = new javax.swing.JPanel();
        timeL = new javax.swing.JLabel();
        minuteL = new javax.swing.JLabel();
        colonL = new javax.swing.JLabel();
        secondL = new javax.swing.JLabel();
        idP = new javax.swing.JPanel();
        student_idL = new javax.swing.JLabel();
        student_idTF = new javax.swing.JTextField();
        startB = new javax.swing.JButton();
        QuestionP = new javax.swing.JPanel();
        aRB = new javax.swing.JRadioButton();
        cRB = new javax.swing.JRadioButton();
        bRB = new javax.swing.JRadioButton();
        backB = new javax.swing.JButton();
        next_subB = new javax.swing.JButton();
        dRB = new javax.swing.JRadioButton();
        submitB = new javax.swing.JButton();
        q_noL = new javax.swing.JLabel();
        questionL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 632));

        timeP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        timeL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        timeL.setText("Time Left:");

        minuteL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minuteL.setText("00");

        colonL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        colonL.setText(":");

        secondL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        secondL.setText("30");

        javax.swing.GroupLayout timePLayout = new javax.swing.GroupLayout(timeP);
        timeP.setLayout(timePLayout);
        timePLayout.setHorizontalGroup(
            timePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(timeL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(minuteL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colonL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timePLayout.setVerticalGroup(
            timePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(timePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeL)
                    .addComponent(minuteL)
                    .addComponent(colonL)
                    .addComponent(secondL))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        idP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        student_idL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        student_idL.setText("Enter your student ID:");

        student_idTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        startB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        startB.setText("Start My Timed Exam");
        startB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout idPLayout = new javax.swing.GroupLayout(idP);
        idP.setLayout(idPLayout);
        idPLayout.setHorizontalGroup(
            idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPLayout.createSequentialGroup()
                .addGroup(idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idPLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(student_idL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(student_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idPLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(startB)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        idPLayout.setVerticalGroup(
            idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idPLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_idL)
                    .addComponent(student_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(startB)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout time_idPLayout = new javax.swing.GroupLayout(time_idP);
        time_idP.setLayout(time_idPLayout);
        time_idPLayout.setHorizontalGroup(
            time_idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, time_idPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(time_idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        time_idPLayout.setVerticalGroup(
            time_idPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(time_idPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(timeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(idP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(aRB);

        buttonGroup1.add(cRB);

        buttonGroup1.add(bRB);

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        next_subB.setText("Next");
        next_subB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_subBActionPerformed(evt);
            }
        });

        buttonGroup1.add(dRB);

        submitB.setText("Submit");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        q_noL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        questionL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout QuestionPLayout = new javax.swing.GroupLayout(QuestionP);
        QuestionP.setLayout(QuestionPLayout);
        QuestionPLayout.setHorizontalGroup(
            QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionPLayout.createSequentialGroup()
                        .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestionPLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(submitB))
                            .addComponent(aRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bRB)
                            .addComponent(next_subB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dRB))
                        .addGap(110, 110, 110))
                    .addGroup(QuestionPLayout.createSequentialGroup()
                        .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestionPLayout.createSequentialGroup()
                                .addComponent(q_noL)
                                .addGap(18, 18, 18)
                                .addComponent(questionL, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cRB))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        QuestionPLayout.setVerticalGroup(
            QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPLayout.createSequentialGroup()
                .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(QuestionPLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q_noL)
                            .addComponent(questionL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aRB))
                    .addGroup(QuestionPLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(bRB)))
                .addGap(48, 48, 48)
                .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cRB)
                    .addComponent(dRB))
                .addGap(98, 98, 98)
                .addGroup(QuestionPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backB)
                    .addComponent(next_subB)
                    .addComponent(submitB))
                .addContainerGap(463, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(time_idP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuestionP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_idP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBActionPerformed
        student_id = student_idTF.getText();
        if(student_id.equals("")){
            JOptionPane.showMessageDialog(null," Write your Student ID to start your exam");
        }
        else{
            startExam(1);
            next_subB.setVisible(true);
            timer();
        }
    }//GEN-LAST:event_startBActionPerformed

    private void next_subBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_subBActionPerformed
        backB.setVisible(true);
        checkAnswer();
        count++;
        startExam(count);
        checkAnswer();
        showButton();
    }//GEN-LAST:event_next_subBActionPerformed
// ******* Testing new method for check answer **********
    public void checkAnswer(){
    if(count == 1){
        if(aRB.isSelected()){
            a1 = aRB.getText();
        }
        else if(bRB.isSelected()){
            a1 = bRB.getText();
        }
        else if(cRB.isSelected()){
            a1 = cRB.getText();
        }
        else if(dRB.isSelected()){
            a1 = dRB.getText();
        }
    }
    if(count == 2){
        if(aRB.isSelected()){
            a2 = aRB.getText();
        }
        else if(bRB.isSelected()){
            a2 = bRB.getText();
        }
        else if(cRB.isSelected()){
            a2 = cRB.getText();
        }
        else if(dRB.isSelected()){
            a2 = dRB.getText();
        }
    }
    if(count == 3){
        if(aRB.isSelected()){
            a3 = aRB.getText();
        }
        else if(bRB.isSelected()){
            a3 = bRB.getText();
        }
        else if(cRB.isSelected()){
            a3 = cRB.getText();
        }
        else if(dRB.isSelected()){
            a3 = dRB.getText();
        }
    }
    if(count == 4){
        if(aRB.isSelected()){
            a4 = aRB.getText();
        }
        else if(bRB.isSelected()){
            a4 = bRB.getText();
        }
        else if(cRB.isSelected()){
            a4 = cRB.getText();
        }
        else if(dRB.isSelected()){
            a4 = dRB.getText();
        }
    }
    }
    // *********************************
    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
         if(count == 5){
        if(aRB.isSelected()){
            a5 = aRB.getText();
        }
        else if(bRB.isSelected()){
            a5 = bRB.getText();
        }
        else if(cRB.isSelected()){
            a5 = cRB.getText();
        }
        else if(dRB.isSelected()){
            a5 = dRB.getText();
        }
    }
        state =false;
        try{
            Database_conn c1 = new Database_conn();
            String query = "insert into check_answer values('"+student_id+"', '"+a1+"', '"+a2+"', '"+a3+"', '"+a4+"', '"+a5+"')";
            c1.s.executeUpdate(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        score();
        saveScore();
        new answer().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_submitBActionPerformed

    public void saveScore(){
        String c = String.valueOf(correct);
        String w = String.valueOf(wrong);
        try{
            Database_conn c1 = new Database_conn();
            String query = "insert into score values('"+student_id+"', '"+c+"', '"+w+"')";
            c1.s.executeUpdate(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        count--;
        startExam(count);
        showButton();
    }//GEN-LAST:event_backBActionPerformed

    public void showButton(){
        if(count == 5){
            submitB.setVisible(true);
            next_subB.setVisible(false);
        }
        else{
            submitB.setVisible(false);
            next_subB.setVisible(true);
        }
        if(count == 1){
            backB.setVisible(false);
        }
    }
    
    public void score(){
        try{
            Database_conn c1 = new Database_conn();
            String query = "select * from answer"; 
            ResultSet rs = c1.s.executeQuery(query);
            while(rs.next()){
                String ans1 = rs.getString("q_1");
                String ans2 = rs.getString("q_2");
                String ans3 = rs.getString("q_3");
                String ans4 = rs.getString("q_4");
                String ans5 = rs.getString("q_5");
                if(a1.equals(ans1)){
                    correct++;
                }
                else{
                    wrong++;
                }
                if(a2.equals(ans2)){
                    correct++;
                }
                else{
                    wrong++;
                }
                if(a3.equals(ans3)){
                    correct++;
                }
                else{
                    wrong++;
                }
                if(a4.equals(ans4)){
                    correct++;
                }
                else{
                    wrong++;
                }
                if(a5.equals(ans5)){
                    correct++;
                }
                else{
                    wrong++;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void timer(){
        String somoy = null;
       try{
           Database_conn c1 = new Database_conn();
           String course_code = "CSE101";
           String query ="select time from question_info where course_code='"+course_code+"'";
           ResultSet rs =c1.s.executeQuery(query);
           if(rs.next()){
               // formula to get info from database
               // String something = rs.getString("column name of particular database")
               somoy = rs.getString("time");
               minute = Integer.parseInt(somoy);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
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
                          secondL.setText(""+ddSecond);
                          if(second == -1){
                              second = 59;
                              minute--;
                              ddSecond = dFormat.format(second);
                              ddMinute = dFormat.format(minute);
                              minuteL.setText(""+ddMinute);
                              secondL.setText(""+ddSecond);
                          }
                          if(minute == 0 && second == 0){
                              state = false;
                             JOptionPane.showMessageDialog(null,"Times up for your exam");
                              setVisible(false);
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
    
    // *********To set the time lable from database ********* 
    public void time_label(){
        String somoy = null;
       try{
           Database_conn c1 = new Database_conn();
           String course_code = "CSE101";
           String query ="select time from question_info where course_code='"+course_code+"'";
           ResultSet rs =c1.s.executeQuery(query);
           if(rs.next()){
               somoy = rs.getString("time");
               secondL.setText("00");
               minuteL.setText(somoy);
               //minute = Integer.parseInt(somoy);
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    // *****************************
    
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
            java.util.logging.Logger.getLogger(qWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuestionP;
    private javax.swing.JRadioButton aRB;
    private javax.swing.JRadioButton bRB;
    private javax.swing.JButton backB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cRB;
    private javax.swing.JLabel colonL;
    private javax.swing.JRadioButton dRB;
    private javax.swing.JPanel idP;
    private javax.swing.JLabel minuteL;
    private javax.swing.JButton next_subB;
    private javax.swing.JLabel q_noL;
    private javax.swing.JLabel questionL;
    private javax.swing.JLabel secondL;
    private javax.swing.JButton startB;
    private javax.swing.JLabel student_idL;
    private javax.swing.JTextField student_idTF;
    private javax.swing.JButton submitB;
    private javax.swing.JLabel timeL;
    private javax.swing.JPanel timeP;
    private javax.swing.JPanel time_idP;
    // End of variables declaration//GEN-END:variables
}
