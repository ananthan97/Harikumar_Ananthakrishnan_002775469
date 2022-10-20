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
public class House {
    private int HouseNumber;
    private String CommunityName;
    private String CityName;
    private int ZipCode;
    private ArrayList<Person> PersonList;

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int HouseNumber) {
        this.HouseNumber = HouseNumber;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    
    public Person addNewMember(){
        Person newMember = new Person();
        PersonList.add(newMember);
        return newMember;
    }
    
    public void deleteMember(Person member){
        PersonList.remove(member);
    }
    
}
