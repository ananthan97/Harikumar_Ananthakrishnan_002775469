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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorsList = new ArrayList<Doctor>();

    public DoctorDirectory() {
        this.doctorsList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(ArrayList<Doctor> doctorsList) {
        this.doctorsList = doctorsList;
    }
    
    public Doctor addNewDoctor(int personId, int doctorId){
        Doctor newDoctor = new Doctor(personId, doctorId);
        doctorsList.add(newDoctor);
        return newDoctor;
        
    }
    
    public void deleteDoctor(Doctor doctor){
        doctorsList.remove(doctor);
    }
    
    
}
