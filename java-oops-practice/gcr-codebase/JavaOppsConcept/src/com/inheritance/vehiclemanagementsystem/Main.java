package com.inheritance.vehiclemanagementsystem;

public class Main {
	 public static void main(String[] args) {

	        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
	        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

	        ev.showDetails();
	        ev.charge();

	        pv.showDetails();
	        pv.refuel();
	    }
	}
	
