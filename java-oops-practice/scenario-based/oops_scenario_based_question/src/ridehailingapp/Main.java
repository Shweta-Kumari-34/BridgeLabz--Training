package ridehailingapp;

public class Main {

	    public static void main(String[] args) {

	        Vehicle vehicle = new Sedan("UP32 AB 1234");  
	        Driver driver = new Driver("Rohit", "LIC12345", 4.8);

	        IRideService ride = new RideService(vehicle, driver);
	        ride.bookRide(10);   
	        ride.endRide();
	    }
	}


