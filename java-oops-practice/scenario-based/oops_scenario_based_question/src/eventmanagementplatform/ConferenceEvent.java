package eventmanagementplatform;

class ConferenceEvent extends Event {

	ConferenceEvent(int id, String name, String location, String date, int attendees, boolean catering) {
		super(id, name, location, date, attendees, 15000, catering ? 8000 : 0, 2000);
	}

	@Override
	public void schedule() {
		System.out.println("Conference Event scheduled with formal setup 📊");
	}

	@Override
	public void reschedule(String newDate) {
		this.date = newDate;
		System.out.println("Conference Event rescheduled to " + newDate);
	}

	@Override
	public void cancel() {
		System.out.println("Conference Event cancelled.");
	}
}
