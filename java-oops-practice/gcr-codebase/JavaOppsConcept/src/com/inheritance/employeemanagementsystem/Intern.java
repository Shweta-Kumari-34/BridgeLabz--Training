package com.inheritance.employeemanagementsystem;

class Intern extends Employee {
    String collegeName;

    Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        this.collegeName = collegeName;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + collegeName);
        System.out.println("----------------------------------");
    }
}
