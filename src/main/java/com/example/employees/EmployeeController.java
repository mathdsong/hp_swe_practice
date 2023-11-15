package com.example.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Add a resource controller that supports an HTTP GET request. This should return all user data:
@RestController
public class EmployeeController {
    private EmployeeManager eM;
    @GetMapping("/employees")
    public Employees getEmployees() {
        return eM.getEList();
    }
}

