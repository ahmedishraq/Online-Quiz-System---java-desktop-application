/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed_ishraq
 */
import java.sql.*;
import javax.swing.*;
public class Database_conn {
    
    Connection conn = null;
    Statement s = null;
    
    public Database_conn(){
    try{
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_quiz", "root", "");
            s = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        e.printStackTrace();
        }
    }
}
