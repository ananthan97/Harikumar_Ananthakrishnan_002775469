/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ananthakrishnan H
 */
public class PatientDirectory {
    private ArrayList<Patient> PatientList;

    public PatientDirectory(ArrayList<Patient> PatientList) {
        this.PatientList = PatientList;
    }

    public ArrayList<Patient> getPatientList() {
        return PatientList;
    }

    public void setPatientList(ArrayList<Patient> PatientList) {
        this.PatientList = PatientList;
    }
    
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        PatientList.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient patient){
        PatientList.remove(patient);
    }
}
