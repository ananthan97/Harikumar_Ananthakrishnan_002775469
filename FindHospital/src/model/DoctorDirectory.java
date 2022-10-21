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
    private ArrayList<Doctor> DoctorList;

    public DoctorDirectory(ArrayList<Doctor> DoctorList) {
        this.DoctorList = DoctorList;
    }

    
    public ArrayList<Doctor> getDoctorList() {
        return DoctorList;
    }

    public void setDoctorList(ArrayList<Doctor> DoctorList) {
        this.DoctorList = DoctorList;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        DoctorList.add(newDoctor);
        return newDoctor;
    }
    public void DeleteDoctor(Doctor doctor){
        DoctorList.remove(doctor);
    }
    
}
