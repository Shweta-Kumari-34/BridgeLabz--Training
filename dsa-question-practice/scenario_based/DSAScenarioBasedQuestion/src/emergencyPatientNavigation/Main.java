package emergencyPatientNavigation;

public class Main {
	    public static void main(String[] args) {

	        AmbulanceRoute route = new AmbulanceRoute();

	        route.addUnit("Emergency", false);
	        route.addUnit("Radiology", false);
	        route.addUnit("Surgery", true);
	        route.addUnit("ICU", true);

	        System.out.println("Hospital Units:");
	        route.displayUnits();

	        System.out.println("\nAmbulance arriving...");
	        route.findAvailableUnit();

	        route.removeUnit("Surgery");

	        System.out.println("\nAfter Maintenance:");
	        route.displayUnits();

	        System.out.println("\nNext Ambulance:");
	        route.findAvailableUnit();
	    }
	}


