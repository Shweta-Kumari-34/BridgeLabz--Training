package com.foreachmethod.emailnotifications;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationApp {

	public static void main(String[] args) {

		// list of user email addresses
		List<String> emails = Arrays.asList("aman@gmail.com", "neha@yahoo.com", "ravi@outlook.com");

		// using forEach to send notification to each email
		emails.forEach(email -> sendEmailNotification(email));
	}

	// method to simulate sending email notification
	static void sendEmailNotification(String email) {
		System.out.println("Notification email sent to: " + email);
	}
}
