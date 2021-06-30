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
public class PhyPlan {
    int PatientID;
    String diagnosis;
    String phyPlan;
    String MHistory;

    public PhyPlan(int PatientID,String diagnosis, String phyPlan, String MHistory) {
        this.PatientID = PatientID;
        this.diagnosis = diagnosis;
        this.phyPlan = phyPlan;
        this.MHistory = MHistory;
    }

    public int getPatientID() {
        return PatientID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getPhyPlan() {
        return phyPlan;
    }

    public String getMHistory() {
        return MHistory;
    }

    
    
    
}
