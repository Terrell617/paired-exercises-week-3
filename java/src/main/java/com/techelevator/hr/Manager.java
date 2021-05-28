package com.techelevator.hr;

public class Manager extends com.techelevator.hr.Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Manager(String firstName, String lastName, String title, double salary) {
        super(firstName, lastName, title, salary);
    }

    public com.techelevator.hr.Employee hireEmployee(String first, String last, String title, double salary) {
        com.techelevator.hr.Employee newEmployee = new com.techelevator.hr.Employee(first,last,title,salary);
        newEmployee.setEmail( first.substring(0,1).toLowerCase() + last.toLowerCase() + "@petelevator.com");
        newEmployee.setDepartment(this.getDepartment());
        newEmployee.getDepartment().getDepartmentEmployees().add(newEmployee);

        return newEmployee;
    }
}
