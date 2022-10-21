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
    private ArrayList<Encounter> EncouterHistory;

    public EncounterHistory(ArrayList<Encounter> EncouterHistory) {
        this.EncouterHistory = EncouterHistory;
    }

    public ArrayList<Encounter> getEncouterHistory() {
        return EncouterHistory;
    }

    public void setEncouterHistory(ArrayList<Encounter> EncouterHistory) {
        this.EncouterHistory = EncouterHistory;
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncouterHistory.add(newEncounter);
        return newEncounter;
        
    }
}
