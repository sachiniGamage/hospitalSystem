/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author 94712
 */
public class DBConnection {
    
    public static Connection connect(){
               
        Connection connection = null;    
        
        try {            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/phy","root",""); 
        }
            catch (Exception e) {
                System.out.println(e);
        }        
        return connection;
    }
}
