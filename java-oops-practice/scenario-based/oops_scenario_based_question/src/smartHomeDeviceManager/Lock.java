package smartHomeDeviceManager;

public class Lock extends Device{
	static int rate =30;
	private static  String status="OFF";

Lock(int deviceId, double energyUsage){
		super(deviceId, energyUsage);
	}
	
	public static double geEnergyUsage(int unit) {
		return rate*unit;
	}
	public static void modifyStatus(String status) {
		Lock.status= status;
	}
	public static String Status(String status) {
	return	status;
	}
}
