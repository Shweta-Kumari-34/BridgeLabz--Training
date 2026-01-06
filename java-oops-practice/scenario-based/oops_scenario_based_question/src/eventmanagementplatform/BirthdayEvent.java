package eventmanagementplatform;

class BirthdayEvent extends Event {

	BirthdayEvent(int id, String name, String location, String date, int attendees, boolean decoration) {
		super(id, name, location, date, attendees, 5000, decoration ? 3000 : 0, 500);
	}

	@Override
	public void schedule() {
		System.out.println("Birthday Event scheduled with fun activities 🎉");
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Birthday Event rescheduled to " + newDate);
	}

	@Override
	public void cancel() {
		System.out.println("Birthday Event cancelled.");
	}
}
