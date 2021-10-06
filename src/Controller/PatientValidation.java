/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 94712
 */
public class PatientValidation {
    //Name
    public static boolean validateName(String name){
         if((name == "") || (name == null) ){
             JOptionPane.showMessageDialog(null, "Please enter name");
             return false;
         }
         return true;
    }
    //Age
    public static boolean validateAge(String age){
         if((age == null) ||(age == "")){
             JOptionPane.showMessageDialog(null, "Please enter age again");
             return false;
         }
         return true;
    }
    
    //Contact number
    public static boolean validateContact(String contactNo){
        
         if((contactNo == "") || (contactNo==null) || (contactNo.length() != 10) ){
             JOptionPane.showMessageDialog(null, "Please enter Contact number again");
             return false;
         }
         return true;
    }
    
    
    //Email Address
    public static boolean validateEmail(String Email){
      
         String e = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
         Pattern emailPat = Pattern.compile(e,Pattern.CASE_INSENSITIVE);
         Matcher matcher = emailPat.matcher(Email);
         boolean isfind = matcher.find();
         if(!isfind){
         JOptionPane.showMessageDialog(null, "added");
         }
         return isfind;
          
    }
    
    
}
