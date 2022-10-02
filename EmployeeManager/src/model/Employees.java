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
public class Employees {
    private ArrayList<Employee> EmployeeList;
    
    public Employees(){
        this.EmployeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return EmployeeList;
    }

    public void setEmployeeList(ArrayList<Employee> EmployeeList) {
        this.EmployeeList = EmployeeList;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        EmployeeList.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee emp){
        EmployeeList.remove(emp);
    }
    
        
}
