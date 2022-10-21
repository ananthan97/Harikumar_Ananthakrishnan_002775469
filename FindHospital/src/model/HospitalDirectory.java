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
public class HospitalDirectory {
    ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public Hospital addHospital(){
        Hospital newHospital = new Hospital();
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital hospital){
        hospitalList.remove(hospital);
    }
}
