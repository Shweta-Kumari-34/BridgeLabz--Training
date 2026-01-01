package com.objectmodeling.hospitaldoctorsandpatients;
import java.util.ArrayList;
public class Patient {
	private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Relationship from Patient → Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void viewConsultedDoctors() {
        System.out.println("\nPatient: " + name + " consulted with:");
        if(doctors.isEmpty()) {
            System.out.println("No doctors consulted yet.");
        } else {
            for(Doctor d : doctors) {
                System.out.println("- Dr. " + d.getName());
            }
        }
    }
}
