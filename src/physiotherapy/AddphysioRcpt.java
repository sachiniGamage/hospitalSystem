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
public class AddphysioRcpt {
    String PName;
    String PContct;
    String PEmail;

    public AddphysioRcpt(String PName, String PContct, String PEmail) {
        this.PName = PName;
        this.PContct = PContct;
        this.PEmail = PEmail;
    }

    public String getPName() {
        return PName;
    }

    public String getPContct() {
        return PContct;
    }

    public String getPEmail() {
        return PEmail;
    }
    
    
}
