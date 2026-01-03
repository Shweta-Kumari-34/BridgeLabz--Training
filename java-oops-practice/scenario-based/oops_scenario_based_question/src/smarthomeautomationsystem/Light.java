package smarthomeautomationsystem;


	public class Light extends Appliance {

	    public Light(String name) {
	        super(name, 60);
	    }

	    public void turnOn() {
	        setOn(true);
	        System.out.println("Light turned ON with soft brightness");
	    }

	    public void turnOff() {
	        setOn(false);
	        System.out.println("Light turned OFF");
	    }
	}


