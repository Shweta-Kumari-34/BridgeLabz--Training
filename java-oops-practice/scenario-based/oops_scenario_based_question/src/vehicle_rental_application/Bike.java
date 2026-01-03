package vehicle_rental_application;

class Bike extends Vehicle {

    public Bike(int id, String brand) {
        super(id, brand, 300);
    }

    public double calculateRent(int days) {
        return baseRate * days; 
    }
}
