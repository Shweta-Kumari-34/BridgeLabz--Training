package com.inheritance.vehicletransportsystem;

class Motorcycle extends Vehicle {
    boolean hasABS;

    Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    
    void displayInfo() {
        super.displayInfo();
        System.out.println("ABS Available: " + (hasABS ? "Yes" : "No"));
        System.out.println("--------------------------------");
    }
}