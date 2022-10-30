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
public class PersonDirectory {
    private ArrayList<Person> PersonList = new ArrayList<Person>();

    public PersonDirectory() {
        this.PersonList = new ArrayList<Person>();
    }
    
    

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        PersonList.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person person){
        PersonList.remove(person);
    }
}
