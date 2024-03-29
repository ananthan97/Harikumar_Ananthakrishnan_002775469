/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ananthakrishnan H
 */
public class Hospital {
    private String HospitalName;
    private DoctorDirectory DoctorsList;
    private PatientDirectory patientDirectory;

    public Hospital() {
        this.DoctorsList = new DoctorDirectory();
        this.patientDirectory = new PatientDirectory();
    }

    

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }


    public DoctorDirectory getDoctorsList() {
        return DoctorsList;
    }

    public void setDoctorsList(DoctorDirectory DoctorsList) {
        this.DoctorsList = DoctorsList;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
}
