package com.objectmodeling.companyanddepartments;
import java.util.ArrayList;
public class Company {
	String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyStructure() {
        System.out.println("\nCompany: " + companyName + " Structure:");
        for (Department d : departments) {
            d.showDepartment();
        }
    }
    public void closeCompany() {
        System.out.println("\nClosing Company: " + companyName);
        for (Department d : departments) {
            d.destroyDepartment();
        }
        departments.clear();
        System.out.println("Company closed — All departments and employees removed.");
    }
}

