package vehicle_rental_application;

class Truck extends Vehicle {

    public Truck(int id, String brand) {
        super(id, brand, 2000);
    }

    public double calculateRent(int days) {
        double loadCharge = 500;
        return (baseRate * days) + loadCharge;
    }
}

