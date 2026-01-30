package com.lambdaexpressions.smarthomelightingautomation;

import java.util.function.Consumer;

public class LightAutomation {

	public static void main(String[] args) {

		// lambda for motion detection
		Consumer<String> motionTrigger = room -> System.out.println("motion detected in " + room + " → lights on");

		// lambda for time-based trigger
		Consumer<String> nightTrigger = room -> System.out.println("night time in " + room + " → dim lights");

		// lambda for voice command trigger
		Consumer<String> voiceTrigger = room -> System.out.println("voice command in " + room + " → colorful lights");

		// execute different light patterns dynamically
		activateLight("living room", motionTrigger);
		activateLight("bedroom", nightTrigger);
		activateLight("hall", voiceTrigger);
	}

	// method to activate lights using lambda behavior
	static void activateLight(String room, Consumer<String> action) {
		action.accept(room);
	}
}
