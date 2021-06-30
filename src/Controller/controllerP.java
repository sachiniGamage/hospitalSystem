/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import GUI.PatientReg;
import javax.swing.JOptionPane;


/**
 *
 * @author 94712
 */
public class controllerP {
    public static boolean patientC(Patient_Reg p){
        try{
            
            Connection conn = DBConnection.connect();
//             Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phy","root","");      
//            String insert = "insert into patient values('"+regNo+"'," + name + "',"+age+"', " +addr+"'," +occupation+ "'," +email+"'," +contactNo+")";
                     

            String insert = "insert into patient(Reg_no,Name,Age,Gender,Address,Occupation,Contact_number,email,admit,ward) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            
            pstmt.setInt(1, p.getReg());
            pstmt.setString(2, p.getName());
            pstmt.setInt(3, p.getAge());
            pstmt.setString(4, p.getGender());
            pstmt.setString(5, p.getAddress());
            pstmt.setString(6, p.getOccupation());
            pstmt.setString(7, p.getContactNo());
            pstmt.setString(8, p.getEmail());
            
            pstmt.setString(9, p.getAdmit());
            
            pstmt.setString(10, p.getWard());
            
//            pstmt.setString(11, p.getDate());
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            conn.close();
                       
                     
                        
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
}
    
    
}
