package com.lambdaexpressions.notificationfiltering;

public class Alert {

	String message;
	String type;
	boolean critical;

	public Alert(String message, String type, boolean critical) {
		this.message = message;
		this.type = type;
		this.critical = critical;
	}

	@Override
	public String toString() {
		return "Alert{" + "message='" + message + '\'' + ", type='" + type + '\'' + ", critical=" + critical + '}';
	}
}
