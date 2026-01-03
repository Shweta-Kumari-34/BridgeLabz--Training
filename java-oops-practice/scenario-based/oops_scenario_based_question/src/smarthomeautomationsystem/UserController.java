package smarthomeautomationsystem;


	public class UserController {

	    public void operateDevice(Controllable device, boolean status) {
	        if (status) {
	            device.turnOn();
	        } else {
	            device.turnOff();
	        }
	    }
	}


