package com.objectmodeling.hospitaldoctorsandpatients;
import java.util.ArrayList;
public class Hospital {
	private String hospitalName;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    // Add doctors & patients (Hospital manages but not owner)
    public void addDoctor(Doctor doctor) { doctors.add(doctor); }
    public void addPatient(Patient patient) { patients.add(patient); }

    public void showHospitalDetails() {
        System.out.println("\nHospital: " + hospitalName);

        System.out.println("\nDoctors List:");
        for(Doctor d : doctors) System.out.println("• Dr. " + d.getName());

        System.out.println("\nPatients List:");
        for(Patient p : patients) System.out.println("• " + p.getName());
    }
}
