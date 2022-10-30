/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ananthakrishnan H
 */
public class Encounter {
    private int DocId;
    private int PatientId;
    private VitalSigns vitalSigns;

    public Encounter(Doctor doctor, Patient patient,VitalSigns vitalSigns) {
        this.DocId = doctor.getDoctorId();
        this.PatientId = patient.getPatientId();
        this.vitalSigns = vitalSigns;
    }
    
    
    
    
    public int getDocId() {
        return DocId;
    }

    public void setDocId(int DocId) {
        this.DocId = DocId;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
