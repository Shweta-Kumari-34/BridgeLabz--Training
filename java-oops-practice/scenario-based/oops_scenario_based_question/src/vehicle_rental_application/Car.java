package vehicle_rental_application;

public class Car extends Vehicle {

    public Car(int id, String brand) {
        super(id, brand, 1000);
    }

    public double calculateRent(int days) {
        double insurance = 200;
        return (baseRate * days) + insurance;
    }
}

