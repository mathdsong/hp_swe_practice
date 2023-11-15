package com.example.employees;

import java.util.ArrayList;

// This class maintains a list of employees and support getting and setting the employee list:
public class Employees {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
