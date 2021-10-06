/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 94712
 */
public class MonthlyPatient {
    static FileWriter pw;
    public static String getHeader(){
     
            StringBuilder sb = new StringBuilder();
        
            sb.append("Name");
            sb.append(",");
            sb.append("Age");
            sb.append(",");
            sb.append("Gender");
            sb.append(",");
            sb.append("Address");
            sb.append(",");
            sb.append("Occupation");
            sb.append(",");
            sb.append("Contact_number");
            sb.append(",");
            sb.append("email");
            sb.append(",");
            sb.append("admit");
            sb.append(",");
            sb.append("ward");
            sb.append(",");
            sb.append("date");
            sb.append("\r\n");
           
            System.out.println("Finished");
            
            return sb.toString();
    }
    
    //CSV file
    public static void WriteCSV(String value){
        
        try {
            if (pw == null){
                pw = new FileWriter("D:\\exelFiles\\test.csv");
            } 
            
            String completePayload = getHeader()+value;
                pw.write(completePayload);
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MonthlyPatient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MonthlyPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
