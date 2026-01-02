package com.encapsulationinterface.hospitalpatientmanagement;

	public class Main {
	    public static void main(String[] args) {

	        Patient inPatient = new InPatient(101, "Ramesh", 45, 5, 2000);
	        Patient outPatient = new OutPatient(102, "Anita", 30, 500, 1200);

	        MedicalRecord record1 = (MedicalRecord) inPatient;
	        record1.addRecord("Diagnosed with pneumonia");
	        record1.addRecord("Under antibiotic treatment");

	        MedicalRecord record2 = (MedicalRecord) outPatient;
	        record2.addRecord("Routine checkup");
	        record2.addRecord("Blood test advised");

	        BillingService.generateBill(inPatient);
	        BillingService.generateBill(outPatient);

	        record1.viewRecords();
	        record2.viewRecords();
	    }
	}


