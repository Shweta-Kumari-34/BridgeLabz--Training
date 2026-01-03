package smarthomeautomationsystem;


	public class Fan extends Appliance {

	    public Fan(String name) {
	        super(name, 75);
	    }

	    public void turnOn() {
	        setOn(true);
	        System.out.println("Fan turned ON at medium speed");
	    }

	    public void turnOff() {
	        setOn(false);
	        System.out.println("Fan turned OFF");
	    }
	}


