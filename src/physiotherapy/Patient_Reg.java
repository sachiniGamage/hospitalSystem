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
public class Patient_Reg {
    
    public int reg;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String occupation;
    private String contactNo;
    private String email;
    private String admit;
    private String ward;
    
    public Patient_Reg next;

    public Patient_Reg( String name, int age, String gender, String address, String occupation, String contactNo, String email, String admit, String ward) {
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.occupation = occupation;
        this.contactNo = contactNo;
        this.email = email;
        this.admit = admit;
        this.ward = ward;
        
    }

    

    public int getReg() {
        return reg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAdmit() {
        return admit;
    }

    public String getWard() {
        return ward;
    }

    
 
    
    
}

