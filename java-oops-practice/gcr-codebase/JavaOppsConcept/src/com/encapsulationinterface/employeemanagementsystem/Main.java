package com.encapsulationinterface.employeemanagementsystem;
import java.util.*;
public class Main {

	    public static void main(String[] args) {

	        Employee emp1 = new FullTimeEmployee(101, "Alice", 10000, 15000);
	        emp1.assignDepartment("IT");

	        Employee emp2 = new PartTimeEmployee(102, "Rahul", 5000, 6, 400);
	        emp2.assignDepartment("Support");

	        List<Employee> employeeList = new ArrayList<>();
	        employeeList.add(emp1);
	        employeeList.add(emp2);

	        System.out.println("\n Employee Details \n");
	        for(Employee emp : employeeList){
	            emp.displayDetails();   
	        }
	    }
	}


