/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author 94712
 */
public class controllerPhySchedule {
    public static boolean PhySchedule(AddControllerPhySchedule p){
    try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phy","root","");      


            String insert = "insert into physioshedule(date,time) values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(insert);
            
            pstmt.setString(1, p.getDate());
            pstmt.setString(2, p.getTime());
            ;
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
}
}
