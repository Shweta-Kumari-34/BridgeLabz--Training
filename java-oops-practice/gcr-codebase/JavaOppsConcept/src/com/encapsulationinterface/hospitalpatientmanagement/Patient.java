package com.encapsulationinterface.hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;
public abstract class Patient {


	    private int patientId;
	    private String name;
	    private int age;

	    private String diagnosis;
	    private List<String> medicalHistory = new ArrayList<>();

	    public Patient(int patientId, String name, int age) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	    }

	    public int getPatientId() {
	        return patientId;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    protected void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	    }

	    protected void addHistory(String history) {
	        medicalHistory.add(history);
	    }

	    protected List<String> getMedicalHistory() {
	        return medicalHistory;
	    }

	    public abstract double calculateBill();

	    public void getPatientDetails() {
	        System.out.println("Patient ID: " + patientId);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}


