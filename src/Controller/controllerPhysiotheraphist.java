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
import physiotherapy.*;

/**
 *
 * @author 94712
 */
public class controllerPhysiotheraphist {
    public static boolean PhysiotherapyC(PhyPlan p){
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phy","root","");              

            String insert = "insert into physio_plan(Reg_no,diagnosis,plan,history) values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(insert);
            pstmt.setString(1, String.valueOf(p.getPatientID()));
            pstmt.setString(2, p.getDiagnosis());
            pstmt.setString(3, p.getPhyPlan());
            System.out.println("aa");
            pstmt.setString(4, p.getMHistory());
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            con.close();
 
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
}
}
