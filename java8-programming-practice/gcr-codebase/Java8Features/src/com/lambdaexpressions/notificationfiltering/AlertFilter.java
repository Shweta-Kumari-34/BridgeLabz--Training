package com.lambdaexpressions.notificationfiltering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AlertFilter {

	public static void main(String[] args) {

		List<Alert> alerts = new ArrayList<>();

		alerts.add(new Alert("Doctor appointment today", "APPOINTMENT", false));
		alerts.add(new Alert("Blood test report ready", "REPORT", false));
		alerts.add(new Alert("Payment pending", "BILL", false));
		alerts.add(new Alert("Heart rate critical!", "EMERGENCY", true));

		// user preference: show only critical alerts
		Predicate<Alert> criticalAlerts = alert -> alert.critical;

		System.out.println("critical alerts:");
		filterAlerts(alerts, criticalAlerts);

		// user preference: show only emergency alerts
		Predicate<Alert> emergencyAlerts = alert -> alert.type.equals("EMERGENCY");

		System.out.println("\nemergency alerts:");
		filterAlerts(alerts, emergencyAlerts);
	}

	// reusable filter method
	public static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {

		for (Alert alert : alerts) {
			if (condition.test(alert)) {
				System.out.println(alert);
			}
		}
	}
}
