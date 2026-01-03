package smarthomeautomationsystem;


	public class AC extends Appliance {

	    public AC(String name, int power) {
	        super(name, power);
	    }

	    @Override
	    public void turnOn() {
	        setOn(true);
	        System.out.println("AC turned ON with cooling mode");
	    }

	    @Override
	    public void turnOff() {
	        setOn(false);
	        System.out.println("AC turned OFF");
	    }
	}

