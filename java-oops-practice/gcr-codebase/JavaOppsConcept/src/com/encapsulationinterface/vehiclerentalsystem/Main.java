package com.encapsulationinterface.vehiclerentalsystem;
import java.util.ArrayList;
import java.util.List;
	public class Main {
	    public static void main(String[] args) {

	        List<Vehicle> rentals = new ArrayList<>();

	        rentals.add(new Car("CAR125", 2000, "POL98765"));
	        rentals.add(new Bike("BIK452", 500, "POL54321"));
	        rentals.add(new Truck("TRK889", 3500, "POL11223"));

	        int rentalDays = 5; // Example rental period

	        System.out.println("============= VEHICLE RENTAL REPORT =============");

	        for(Vehicle v : rentals){
	            v.displayDetails(rentalDays); 
	        }
	    }
	}


