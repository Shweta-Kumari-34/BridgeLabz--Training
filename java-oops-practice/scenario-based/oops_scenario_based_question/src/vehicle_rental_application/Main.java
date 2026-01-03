package vehicle_rental_application;


	public class Main {
	    public static void main(String[] args) {

	        Customer c1 = new Customer(1, "Amit");

	        Vehicle bike = new Bike(101, "Honda");
	        Vehicle car = new Car(102, "Hyundai");
	        Vehicle truck = new Truck(103, "Tata");

	        c1.displayCustomer();

	        System.out.println("Bike Rent (3 days): ₹" + bike.calculateRent(3));
	        System.out.println("Car Rent (3 days): ₹" + car.calculateRent(3));
	        System.out.println("Truck Rent (3 days): ₹" + truck.calculateRent(3));
	    }
	}


