package com.objectmodeling.companyanddepartments;

public class Employee {
	 String name;
	    String position;

	    public Employee(String name, String position) {
	        this.name = name;
	        this.position = position;
	    }

	    public void showEmployee() {
	        System.out.println("   Employee: " + name + " - " + position);
	    }
}
