package com.encapsulationinterface.hospitalpatientmanagement;

	class InPatient extends Patient implements MedicalRecord {

	    private int daysAdmitted;
	    private double dailyCharge;

	    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
	        super(patientId, name, age);
	        this.daysAdmitted = daysAdmitted;
	        this.dailyCharge = dailyCharge;
	    }
   
	    public double calculateBill() {
	        return daysAdmitted * dailyCharge + 1500; // room + service charge
	    }
	   
	    public void addRecord(String record) {
	        addHistory(record);
	    }
	   
	    public void viewRecords() {
	        System.out.println("Medical History:");
	        for (String record : getMedicalHistory()) {
	            System.out.println("- " + record);
	        }
	    }
	}


