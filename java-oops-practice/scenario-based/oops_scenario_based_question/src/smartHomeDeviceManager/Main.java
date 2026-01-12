package smartHomeDeviceManager;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int control;
	int unit;
	double bill;

	boolean running = true;
	while (running) {
		System.out.println("\n-----------------------------------");
		System.out.println("=====Welcome To HomeNest===== ");
		System.out.println("Select device  you want to register with");
		System.out.println("1. Camera");
		System.out.println("2. Light");
		System.out.println("3. Lock");
		System.out.println("4. Thermostat");
		System.out.println("5. Exit");
		System.out.println("---------------------------------------");
		System.out.print("Enter choice: ");
		int status = input.nextInt();

		switch (status) {
		case 1:
			System.out.println("Please select the status of device");
			System.out.println("1. turnOn");
			System.out.println("2. turnOff");
			System.out.println("3. reset");
			System.out.println("Enter the status you want ");
			 control =input.nextInt();
			if(control == 1) {
			Camera.modifyStatus( "turnOn");
			System.out.println("Please enter the number of unit of energyUsage");
			 unit =input.nextInt();
		bill=	Camera.geEnergyUsage(unit);
			System.out.println("Bill generated: "+bill);
			}
			else if(control == 2) {
				Camera.modifyStatus( "turnOff");
			}
			else {
				Camera.modifyStatus( "reset");
			}

break;
		case 2:
			
			System.out.println("Please select the status of device");
			System.out.println("1. turnOn");
			System.out.println("2. turnOff");
			System.out.println("3. reset");
			System.out.println("Enter the status you want ");
			 control =input.nextInt();
			if(control == 1) {
			Light.modifyStatus( "turnOn");
			System.out.println("Please enter the number of unit of energyUsage");
			 unit =input.nextInt();
	 bill=	Light.geEnergyUsage(unit);
			System.out.println("Bill generated: "+bill);
			}
			else if(control == 2) {
				Light.modifyStatus( "turnOff");
			}
			else {
				Light.modifyStatus( "reset");
			}
			break;
			
			
			

		case 3:
			
			System.out.println("Please select the status of device");
			System.out.println("1. turnOn");
			System.out.println("2. turnOff");
			System.out.println("3. reset");
			System.out.println("Enter the status you want ");
			 control =input.nextInt();
			if(control == 1) {
			Lock.modifyStatus( "turnOn");
			System.out.println("Please enter the number of unit of energyUsage");
			 unit =input.nextInt();
	 bill=	Lock.geEnergyUsage(unit);
			System.out.println("Bill generated: "+bill);
			}
			else if(control == 2) {
				Lock.modifyStatus( "turnOff");
			}
			else {
				Lock.modifyStatus( "reset");
			}
			break;	
			
			
		case 4:

			
			System.out.println("Please select the status of device");
			System.out.println("1. turnOn");
			System.out.println("2. turnOff");
			System.out.println("3. reset");
			System.out.println("Enter the status you want ");
			 control =input.nextInt();
			if(control == 1) {
				Thermostat.modifyStatus( "turnOn");
			System.out.println("Please enter the number of unit of energyUsage");
			 unit =input.nextInt();
	 bill=	Thermostat.geEnergyUsage(unit);
			System.out.println("Bill generated: "+bill);
			}
			else if(control == 2) {
				Thermostat.modifyStatus( "turnOff");
			}
			else {
				Thermostat.modifyStatus( "reset");
			}
			break;	
			
			
			
			
		case 5:	
			running = false;
			System.out.println("Thanks for visiting FoodLoop!");
			break;

		default:
			System.out.println("Invalid choice, try again.");
		}
	}
	input.close();
}
}
