package com.objectmodeling.companyanddepartments;
import java.util.ArrayList;
public class Department {
	 String deptName;
	    ArrayList<Employee> employees = new ArrayList<>();

	    public Department(String deptName) {
	        this.deptName = deptName;
	    }

	    public void addEmployee(String name, String position) {
	        employees.add(new Employee(name, position));
	    }

	    public void showDepartment() {
	        System.out.println("\n Department: " + deptName);
	        for (Employee e : employees) {
	            e.showEmployee();
	        }
	    }
	    public void destroyDepartment() {
	        System.out.println("   -> Removing Department: " + deptName);
	        employees.clear();
	    }
}
