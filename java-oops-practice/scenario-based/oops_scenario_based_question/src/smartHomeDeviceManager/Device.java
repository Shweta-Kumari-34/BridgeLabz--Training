package smartHomeDeviceManager;

public class Device {
protected int deviceId;
private String status = "OFF";
protected double energyUsage;

Device(  int deviceId, double energyUsage){
	this.deviceId=deviceId;
	this.energyUsage=energyUsage;
	
}
}
