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
public class EncounterHistory {
    private ArrayList<Encounter> EncounterList;

    public EncounterHistory() {
        this.EncounterList = new ArrayList<Encounter>();
    }

    
    public ArrayList<Encounter> getEncounterList() {
        return EncounterList;
    }

    public void setEncounterList(ArrayList<Encounter> EncounterList) {
        this.EncounterList = EncounterList;
    }
    
    public Encounter addNewEncounter(Doctor doctor, Patient patient,VitalSigns vitalSigns){
        Encounter newEncounter = new Encounter(doctor,patient,vitalSigns);
        EncounterList.add(newEncounter);
        return newEncounter;
        
    }
    
    public void deleteEncounter(Encounter encounter){
        EncounterList.remove(encounter);
    }
    
}
