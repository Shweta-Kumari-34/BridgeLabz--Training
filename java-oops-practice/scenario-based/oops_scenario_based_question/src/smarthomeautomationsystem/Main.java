package smarthomeautomationsystem;


	public class Main {
	    public static void main(String[] args) {

	        Appliance light = new Light("Living Room Light");
	        Appliance fan = new Fan("Bedroom Fan");
	        Appliance ac = new AC("Hall AC", 1500);

	        UserController controller = new UserController();

	        controller.operateDevice(light, true);
	        controller.operateDevice(fan, true);
	        controller.operateDevice(ac, true);

	        ac.compareEnergy(fan);

	        controller.operateDevice(light, false);
	    }
	}


