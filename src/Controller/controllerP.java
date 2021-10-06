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
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            conn.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
}
    
    
}
