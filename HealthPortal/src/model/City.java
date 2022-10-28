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
    private int CityId;
    private ArrayList<Community> CommunityList = new ArrayList<Community>();

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int CityId) {
        this.CityId = CityId;
    }

    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void setCommunityList(ArrayList<Community> CommunityList) {
        this.CommunityList = CommunityList;
    }
    
}
