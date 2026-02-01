package com.collectors.employeesalary;

//Employee class to store employee details
public class Employee {

	private String name;
	private String department;
	private double salary;

	// constructor
	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	// getter for department
	public String getDepartment() {
		return department;
	}

	// getter for salary
	public double getSalary() {
		return salary;
	}
}
