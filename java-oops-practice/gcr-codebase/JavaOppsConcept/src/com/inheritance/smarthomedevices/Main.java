package com.inheritance.smarthomedevices;

public class Main {
	public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T-1001", "ON", 24.5);
        t1.displayStatus();
    }
}
