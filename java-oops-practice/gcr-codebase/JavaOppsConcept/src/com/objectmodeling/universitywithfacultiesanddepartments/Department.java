package com.objectmodeling.universitywithfacultiesanddepartments;

public class Department {
	private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }

    // Called when University deleted
    public void destroyDepartment() {
        System.out.println("   -> Removing Department: " + deptName);
    }
}
