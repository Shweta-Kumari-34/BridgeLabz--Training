package com.functionalinterfaces.smartdevicecontrol;

//TV implements SmartDevice interface
public class TV implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("TV is turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV is turned OFF");
	}
}
