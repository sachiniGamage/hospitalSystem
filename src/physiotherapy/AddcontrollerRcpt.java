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
public class AddcontrollerRcpt {
     String RName;
    String RContct;
    String REmail;

    public AddcontrollerRcpt(String RName, String RContct, String REmail) {
        this.RName = RName;
        this.RContct = RContct;
        this.REmail = REmail;
    }

    public String getRName() {
        return RName;
    }

    public String getRContct() {
        return RContct;
    }

    public String getREmail() {
        return REmail;
    }
    
    
}
