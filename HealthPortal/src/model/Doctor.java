/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ananthakrishnan H
 */
public class Doctor {
    private int PersonId;
    private int DoctorId;
    private EncounterHistory encounterHistory;
    
    public Doctor(Person person) {
        this.PersonId = person.getPersonId();
        this.encounterHistory = new EncounterHistory();
    }
    
    
    
    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int PersonId) {
        this.PersonId = PersonId;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    
}
