package com.inheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

   
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
        System.out.println("--------------------------------");
    }
}
