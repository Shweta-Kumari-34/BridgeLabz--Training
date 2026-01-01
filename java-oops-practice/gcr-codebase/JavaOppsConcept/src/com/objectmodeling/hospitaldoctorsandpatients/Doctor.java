package com.objectmodeling.hospitaldoctorsandpatients;
import java.util.ArrayList;
public class Doctor {
	 private String name;
	    private String specialization;
	    private ArrayList<Patient> patients = new ArrayList<>();

	    public Doctor(String name, String specialization) {
	        this.name = name;
	        this.specialization = specialization;
	    }

	    public String getName() {
	        return name;
	    }
	    public void consult(Patient patient) {
	        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());

	        // Many-to-many association update
	        patients.add(patient);
	        patient.addDoctor(this);
	    }
	    public void viewPatients() {
	        System.out.println("\nDoctor: Dr. " + name + " (" + specialization + ") treated:");
	        if(patients.isEmpty()) {
	            System.out.println("No patients consulted yet.");
	        } else {
	            for(Patient p : patients) {
	                System.out.println("- " + p.getName());
	            }
	        }
	    }
}
