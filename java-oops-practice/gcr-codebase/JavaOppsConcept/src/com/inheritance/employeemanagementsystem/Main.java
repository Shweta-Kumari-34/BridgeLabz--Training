package com.inheritance.employeemanagementsystem;

public class Main {
	    public static void main(String[] args) {
	        Employee m = new Manager("Rahul", 101, 90000, 10);
	        Employee d = new Developer("Ayesha", 102, 70000, "Java");
	        Employee i = new Intern("Rohit", 103, 15000, "IIT Delhi");

	        m.displayDetails();
	        d.displayDetails();
	        i.displayDetails();
	    }
	}

