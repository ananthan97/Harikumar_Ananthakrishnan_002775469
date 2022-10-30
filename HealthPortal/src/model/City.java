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
    private ArrayList<Community> CommunityList = new ArrayList<Community>();

    public City(String CityName) {
        this.CityName = CityName;
        this.CommunityList = new ArrayList<Community>();
    }
    
    

    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void setCommunityList(ArrayList<Community> CommunityList) {
        this.CommunityList = CommunityList;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    
    public Community addNewCommunity(){
        Community NewCommunity = new Community();
        CommunityList.add(NewCommunity);
        return NewCommunity;
    }
    
    public void deleteCommunity(Community community){
        CommunityList.remove(community);
    }
    
}
