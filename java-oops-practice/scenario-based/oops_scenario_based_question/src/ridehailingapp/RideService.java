package ridehailingapp;


	public class RideService implements IRideService {

	    private Vehicle vehicle;
	    private Driver driver;
	    private double fare;   // hidden using encapsulation
	    private final double baseFare = 50;

	    public RideService(Vehicle vehicle, Driver driver) {
	        this.vehicle = vehicle;
	        this.driver = driver;
	    }

	   
	    


		public void bookRide(double distance) {
	        fare = baseFare + (distance * vehicle.getRatePerKm());
	        System.out.println("Ride booked with " + vehicle.getType());
	        System.out.println("Driver: " + driver.getName());
	    }

	   
	    public void endRide() {
	        System.out.println("Ride ended");
	        System.out.println("Total Fare: ₹" + fare);
	    }

	    public double getFare() {
	        return fare;
	    }
	}


