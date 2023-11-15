package com.example.employees;

// Initializing the Employees class. Hard-code in 3-4 example employees.
public class EmployeeManager {
    private static Employees eList = new Employees();

    // This static block is executed before executing the main block:
    static {
        eList.getEmployeeList().add(
                new Employee(
                        1,
                        "f1",
                        "l1",
                        "f1l1@gmail.com",
                        "title1"
                )
        );

        eList.getEmployeeList().add(
                new Employee(
                        2,
                        "f2",
                        "l2",
                        "f2l2@gmail.com",
                        "title2"
                )
        );

        eList.getEmployeeList().add(
                new Employee(
                        3,
                        "f3",
                        "l3",
                        "f3l3@gmail.com",
                        "title3"
                )
        );

        eList.getEmployeeList().add(
                new Employee(
                        4,
                        "f4",
                        "l4",
                        "f4l4@gmail.com",
                        "title4"
                )
        );

    }

    public Employees getEList() {
        return eList;
    }
}
