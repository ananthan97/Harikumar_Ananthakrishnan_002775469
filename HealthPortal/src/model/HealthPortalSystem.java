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
public class HealthPortalSystem {
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private DoctorDirectory doctorDirectory;
    private ArrayList<City> cityDirectory;

    public HealthPortalSystem() {
        this.patientDirectory = new PatientDirectory();
        this.personDirectory = new PersonDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.cityDirectory = new ArrayList<City>();
    }

    
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    public City addNewCity(String CityName){
        City newCity = new City(CityName);
        cityDirectory.add(newCity);
        return newCity;
    }
    
    public void deleteCity(City city){
        cityDirectory.remove(city);
    }
    
    
}
