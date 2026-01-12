package smartHomeDeviceManager;

public class Camera extends Device {
	static int rate =50;
	private static String status="OFF";

	Camera(int deviceId, double energyUsage){
		super(deviceId, energyUsage);
	}
	
	public static double geEnergyUsage(int unit) {
		return rate*unit;
	}
	
	public static void modifyStatus(String status) {
		Camera.status= status;
	}
	public static String Status(String status) {
	return	status;
	}
}
