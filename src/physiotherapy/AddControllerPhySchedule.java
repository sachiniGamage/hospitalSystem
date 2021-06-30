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
public class AddControllerPhySchedule {
    String date;
    String time;

    public AddControllerPhySchedule(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
