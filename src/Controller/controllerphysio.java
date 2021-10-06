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
public class controllerphysio {
    public static boolean PhysRcptC(AddphysioRcpt p){
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phy","root","");
            String insert = "insert into physiotherapist(name,contctNo,email) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(insert);
            
            pstmt.setString(1, p.getPName());
            pstmt.setString(2, p.getPContct());
            pstmt.setString(3, p.getPEmail());
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
}
}
