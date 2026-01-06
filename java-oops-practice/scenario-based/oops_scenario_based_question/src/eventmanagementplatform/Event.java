package eventmanagementplatform;

abstract class Event implements ISchedulable {
	private final int eventId;
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;
	private double venueCost;
	private double serviceCost;
	private double discount;

	Event(int eventId, String eventName, String location, String date, int attendees, double venueCost,
			double serviceCost, double discount) {

		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
		this.venueCost = venueCost;
		this.serviceCost = serviceCost;
		this.discount = discount;
	}

	protected double calculateTotalCost() {
		return venueCost + serviceCost - discount;
	}

	public int getEventId() {
		return eventId;
	}

	public void displayEvent() {
		System.out.println("\nEvent ID: " + eventId);
		System.out.println("Event Name: " + eventName);
		System.out.println("Location: " + location);
		System.out.println("Date: " + date);
		System.out.println("Attendees: " + attendees);
		System.out.println("Total Cost: ₹" + calculateTotalCost());
	}
}
