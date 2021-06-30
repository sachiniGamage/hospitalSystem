/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 94712
 */
public class PatientReport {
    static int PatientID;
    public static  void Report(int pID) throws IOException{
        PreparedStatement pst=null;
        ResultSet rs = null;
        Connection conn = DBConnection.connect();
        
        
        PatientID = pID;
        String sql1 = "SELECT `Name`,`Age`,`Gender`,`Contact_number`,`email`,`ward` FROM `patient` WHERE `Reg_no` LIKE "+PatientID ;
        String sql2 = "SELECT `diagnosis` FROM `physio_plan` WHERE `Reg_no` LIKE "+PatientID; 
        
        
        
        String v="";
        String a="";

        try {               
            pst = conn.prepareStatement(sql1);
            rs = pst.executeQuery();
                
                String name = "";
                String age ="" ;
                String gender = "";
                String Contct ="";
                String email="";
                String ward ="";

                
                while(rs.next()){
                 System.out.println("ssdsds");
                    name = rs.getString("Name");
                    age = rs.getString("Age");
                    gender = rs.getString("Gender");
                    Contct = rs.getString("Contact_number");
                    email = rs.getString("email");
                    ward = rs.getString("ward");
                    
//                    System.out.println(""+rs.next());
                    v = "Name: "+name+"\n"+"Age: "+age+"\n"+"Gender: "+gender+"\n"+"Contact Number : "+Contct+"\n"+"Email : "+email+"\n"+"Ward : "+ward+"\n";
                    
                }
        } catch (SQLException ex) {
            Logger.getLogger(PatientReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {               
            pst = conn.prepareStatement(sql2);
            rs = pst.executeQuery();
                
                String diagnosis = "";
                

                
                while(rs.next()){
                 System.out.println("ssdsds");
                    diagnosis = rs.getString("diagnosis");
                    
                    
//                    System.out.println(""+rs.next());
                    a = "Diagnosis: "+diagnosis+"\n";
                    
                }
        } catch (SQLException ex) {
            Logger.getLogger(PatientReport.class.getName()).log(Level.SEVERE, null, ex);
        }
             FileWriter fw = new FileWriter("D:\\exelFiles\\"+ PatientID + "_Patienteport.txt",true);
        PrintWriter out = new PrintWriter(fw);   
        // Append the name of ocean to the file
        String s= v+a;
        out.println(s);

        // Close the file.
        out.close();
    }
}
