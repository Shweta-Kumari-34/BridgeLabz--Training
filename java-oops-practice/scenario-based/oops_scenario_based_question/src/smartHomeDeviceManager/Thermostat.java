package smartHomeDeviceManager;

public class Thermostat extends Device {
	static int rate =100;
	private static String status="OFF";

	Thermostat(int deviceId, double energyUsage){
		super(deviceId, energyUsage);
	}
	
	public static double geEnergyUsage(int unit) {
		return rate*unit;
	}
	
	public static void modifyStatus(String status) {
		Thermostat.status= status;
	}
	public static String Status(String status) {
	return	status;
	}
}
