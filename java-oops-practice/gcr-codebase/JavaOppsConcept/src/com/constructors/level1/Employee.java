package com.constructors.level1;

public class Employee {
	 public String employeeID;      // Public: accessible everywhere
	    protected String department;   // Protected: accessible in subclass and same package
	    private double salary;         // Private: accessible only within this class

	    // Constructor
	    public Employee(String employeeID, String department, double salary) {
	        this.employeeID = employeeID;
	        this.department = department;
	        this.salary = salary;
	    }
	    public void setSalary(double salary) {
	    	this.salary=salary;
	    }
	    public double getSalary(double salary) {
	    	return this.salary;
	    }
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
}
