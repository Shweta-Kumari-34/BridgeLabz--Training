package com.objectmodeling.companyanddepartments;

public class Main {
	public static void main(String[] args) {

        Company company = new Company("Tech Innovators Pvt Ltd");

        // Creating departments INSIDE company
        Department d1 = new Department("IT");
        d1.addEmployee("Rahul", "Software Engineer");
        d1.addEmployee("Sneha", "Backend Developer");

        Department d2 = new Department("HR");
        d2.addEmployee("Kavita", "HR Manager");
        d2.addEmployee("Vivek", "Recruiter");

        company.addDepartment(d1);
        company.addDepartment(d2);

        // Displaying Structure
        company.showCompanyStructure();

        // Closing company (Composition effect)
        company.closeCompany();
    }
}











