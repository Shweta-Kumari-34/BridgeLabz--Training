package emergencyPatientNavigation;

public class AmbulanceRoute {

	private UnitNode head = null;

	// adding unit to circular list
	public void addUnit(String name, boolean available) {
		UnitNode newNode = new UnitNode(name, available);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}

		UnitNode temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;
	}

	// finding nearest available unit
	public void findAvailableUnit() {
		if (head == null) {
			System.out.println("No units available");
			return;
		}

		UnitNode temp = head;
		do {
			if (temp.available) {
				System.out.println("Redirect patient to: " + temp.unitName);
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("No available unit found");
	}

	// remove unit under maintenance
	public void removeUnit(String unitName) {
		if (head == null)
			return;

		UnitNode curr = head;
		UnitNode prev = null;

		do {
			if (curr.unitName.equals(unitName)) {

				// single node case
				if (curr == head && curr.next == head) {
					head = null;
					return;
				}

				// removing head
				if (curr == head) {
					UnitNode last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				} else {
					prev.next = curr.next;
				}

				System.out.println(unitName + " removed (maintenance)");
				return;
			}
			prev = curr;
			curr = curr.next;

		} while (curr != head);
	}

	// displaying units
	public void displayUnits() {
		if (head == null)
			return;

		UnitNode temp = head;
		do {
			System.out.println(temp.unitName + " | Available: " + temp.available);
			temp = temp.next;
		} while (temp != head);
	}
}
