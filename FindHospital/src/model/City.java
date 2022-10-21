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
public class City {
    private String CityName;
    private ArrayList<Community> CommunityList;
    private HospitalDirectory hospitalDirectory;

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void setCommunityList(ArrayList<Community> CommunityList) {
        this.CommunityList = CommunityList;
    }
    
}
