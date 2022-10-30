/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ananthakrishnan H
 */
public class Patient {
    private int PersonId;
    private int PatientId;
    private EncounterHistory encounterHistory;

    
    
    public Patient(Person person) {
        this.PersonId = person.getPersonId();
        this.encounterHistory = new EncounterHistory();
    }
    
    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int PersonId) {
        this.PersonId = PersonId;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
    
    
}
