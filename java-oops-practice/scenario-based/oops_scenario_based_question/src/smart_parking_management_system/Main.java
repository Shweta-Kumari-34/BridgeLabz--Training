package smart_parking_management_system;

public class Main {

    public static void main(String[] args) {

        ParkingManager manager = new ParkingManager();

        manager.addSlot(new ParkingSlot("S1", "Car"));
        manager.addSlot(new ParkingSlot("S2", "Bike"));
        manager.addSlot(new ParkingSlot("S3", "Truck"));

        Vehicle car = new Car("CAR123");
        Vehicle bike = new Bike("BIKE456");
        Vehicle truck = new Truck("TRUCK789");

        manager.bookSlot(car);
        manager.bookSlot(bike);
        manager.bookSlot(truck);

        manager.releaseSlot("S1", 6); 
    }
}

