package compartmentNavigationSystem;

public class Main {
	    public static void main(String[] args) {

	        Train train = new Train();

	        train.addCompartment("C1", false, false);
	        train.addCompartment("C2", true, false);
	        train.addCompartment("C3", false, true);
	        train.addCompartment("C4", false, false);

	        System.out.println("Forward traversal:");
	        train.displayForward();

	        System.out.println("\nBackward traversal:");
	        train.displayBackward();

	        System.out.println("\nAdjacent compartments for C3:");
	        train.showAdjacent("C3");

	        train.findService("pantry");

	        train.removeCompartment("C2");

	        System.out.println("\nAfter removal:");
	        train.displayForward();
	    }
	}


