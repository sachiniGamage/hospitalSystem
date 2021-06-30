/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 94712
 */
public class view {
    public class LinkedList {
        private Patient_Reg first;
        
        public LinkedList(){
            first = null;
        }
    public Patient_Reg find(int id){
            Patient_Reg current = first;
            while(current != null){
                if(current.reg == id){
                    return current;
                }else{
                    current = current.next;
                }
            }
            
            return null;
        }
}
    
    
}
