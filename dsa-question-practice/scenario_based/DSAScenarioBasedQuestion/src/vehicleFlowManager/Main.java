package vehicleFlowManager;

public class Main {
	    public static void main(String[] args) {

	        TrafficManager tm = new TrafficManager();

	        tm.arrive("KA01");
	        tm.arrive("KA02");
	        tm.arrive("KA03");
	        tm.arrive("KA04");
	        tm.arrive("KA05");
	        tm.arrive("KA06"); // overflow

	        tm.enterRoundabout();
	        tm.enterRoundabout();
	        tm.enterRoundabout();

	        tm.printRoundabout();

	        tm.exitRoundabout("KA02");
	        tm.printRoundabout();

	        tm.enterRoundabout();
	        tm.enterRoundabout();
	        tm.enterRoundabout(); // underflow

	        tm.printRoundabout();
	    }
	}

