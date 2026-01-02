package com.encapsulationinterface.hospitalpatientmanagement;

public class BillingService {

	    public static void generateBill(Patient patient) {
	        patient.getPatientDetails();
	        System.out.println("Total Bill Amount: ₹" + patient.calculateBill());
	       
	    }
	}


