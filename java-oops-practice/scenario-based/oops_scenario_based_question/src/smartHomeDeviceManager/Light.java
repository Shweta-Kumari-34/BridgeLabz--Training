package smartHomeDeviceManager;

public class Light extends Device {
	static int rate =10;
	private static String status="OFF";
	Light(int deviceId, double energyUsage){
		super(deviceId, energyUsage);
	}
	
	public static double geEnergyUsage(int unit) {
		return rate*unit;
	}
	
	public static void modifyStatus(String status) {
		Light.status= status;
	}
	public static String Status(String status) {
	return	status;
	}
}
