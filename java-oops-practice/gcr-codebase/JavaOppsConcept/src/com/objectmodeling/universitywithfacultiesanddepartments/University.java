package com.objectmodeling.universitywithfacultiesanddepartments;
import java.util.ArrayList;
public class University {
	private String uniName;
    private ArrayList<Department> departments = new ArrayList<>(); // Composition
    private ArrayList<Faculty> faculties = new ArrayList<>();      // Aggregation

    public University(String uniName) {
        this.uniName = uniName;
    }

    // Composition: University owns Department life
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Aggregation: Faculty exists independently
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public void showDetails() {
        System.out.println("\nUniversity: " + uniName);

        System.out.println("\nDepartments (Composition):");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("\nFaculties (Aggregation):");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
    public void closeUniversity() {
        System.out.println("\nClosing University: " + uniName);
        for (Department d : departments) {
            d.destroyDepartment();
        }
        departments.clear();

        System.out.println("University closed! All departments removed.");
    }
}
