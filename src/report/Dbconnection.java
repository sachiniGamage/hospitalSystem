/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author kulani sithara
 */
public class Dbconnection {
    
    public static Connection connect ()
    {
        Connection conn = null;
        try{
            Class.forName ("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection ("jdbc:mysql://localhost:3308/physiotherapy","root","");
            
        } catch (Exception e){
            System.out.println("Inter.DBConnect.connect()");
            
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
}
