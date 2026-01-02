package com.encapsulationinterface.hospitalpatientmanagement;

	class OutPatient extends Patient implements MedicalRecord {

	    private double consultationFee;
	    private double testCharges;

	    public OutPatient(int patientId, String name, int age, double consultationFee, double testCharges) {
	        super(patientId, name, age);
	        this.consultationFee = consultationFee;
	        this.testCharges = testCharges;
	    }

	  
	    public double calculateBill() {
	        return consultationFee + testCharges;
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

