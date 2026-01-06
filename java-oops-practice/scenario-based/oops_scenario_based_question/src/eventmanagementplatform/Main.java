package eventmanagementplatform;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Welcome to EventEase ===");
		System.out.print("Enter Organizer Name: ");
		String uname = sc.nextLine();
		System.out.print("Enter Organizer Email: ");
		String email = sc.nextLine();

		User user = new User(uname, email);

		System.out.print("Enter Event ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Event Name: ");
		String eventName = sc.nextLine();
		System.out.print("Enter Location: ");
		String location = sc.nextLine();
		System.out.print("Enter Date: ");
		String date = sc.nextLine();
		System.out.print("Enter Number of Attendees: ");
		int attendees = sc.nextInt();
		System.out.println("Select Event Type:");
		System.out.println("1. Birthday");
		System.out.println("2. Conference");
		int type = sc.nextInt();
		Event event = null;

		if (type == 1) {
			System.out.print("Decoration required? (true/false): ");
			boolean decor = sc.nextBoolean();
			event = new BirthdayEvent(id, eventName, location, date, attendees, decor);
		} else if (type == 2) {
			System.out.print("Catering required? (true/false): ");
			boolean catering = sc.nextBoolean();
			event = new ConferenceEvent(id, eventName, location, date, attendees, catering);
		} else {
			System.out.println("Invalid Event Type");
			System.exit(0);
		}

		int choice;
		do {
			System.out.println("\n--- Event Menu ---");
			System.out.println("1. Schedule Event");
			System.out.println("2. Reschedule Event");
			System.out.println("3. Cancel Event");
			System.out.println("4. View Details");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				event.schedule();
				break;

			case 2:
				System.out.print("Enter New Date: ");
				String newDate = sc.nextLine();
				event.reschedule(newDate);
				break;

			case 3:
				event.cancel();
				break;

			case 4:
				user.displayUser();
				event.displayEvent();
				break;

			case 5:
				System.out.println("Thank you for using EventEase!");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 5);

		sc.close();
	}

}
