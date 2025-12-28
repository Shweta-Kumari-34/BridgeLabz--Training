package com.constructors.level1;
//creating a class with name as Vehicle
class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

   
    static double registrationFee = 1500.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ram", "Two Wheeler");
       
        v1.displayVehicleDetails();
        System.out.println();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("After updating registration fee:");
        System.out.println();

        v1.displayVehicleDetails();
        System.out.println();

       
    }
}
