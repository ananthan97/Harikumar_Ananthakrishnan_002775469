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
public class Community {
    private String CommunityName;
    private ArrayList<House> HouseList = new ArrayList<House>();
    private HospitalDirectory hospitalList;
    private String cityName;

    public Community() {
        this.HouseList = new ArrayList<House>();
        this.hospitalList = new HospitalDirectory();
    }

    
    

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public ArrayList<House> getHouseList() {
        return HouseList;
    }

    public void setHouseList(ArrayList<House> HouseList) {
        this.HouseList = HouseList;
    }

    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
    
    public House addNewHouse(){
        House newHouse = new House();
        HouseList.add(newHouse);
        return newHouse;
    }
    
    public void DeleteHouse(House house){
        HouseList.remove(house);
    }
    
    
}
