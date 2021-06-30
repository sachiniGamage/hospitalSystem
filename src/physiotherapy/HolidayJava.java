/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy;

/**
 *
 * @author 94712
 */
public class HolidayJava {
    String Name;
    String StartDate;
    String EndDate;

    public HolidayJava(String Name, String StartDate) {
        this.Name = Name;
        this.StartDate = StartDate;
    }

    public String getName() {
        return Name;
    }

    public String getEndDate() {
        return EndDate;
    }
    
    
    
}
