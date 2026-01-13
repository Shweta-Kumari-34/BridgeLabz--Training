package compartmentNavigationSystem;

public class Train {

	private CompartmentNode head;
	private CompartmentNode tail;

	// adding compartment at end
	public void addCompartment(String name, boolean pantry, boolean wifi) {
		CompartmentNode newNode = new CompartmentNode(name, pantry, wifi);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	// removing compartment by name
	public void removeCompartment(String name) {
		CompartmentNode curr = head;

		while (curr != null) {
			if (curr.name.equals(name)) {

				if (curr == head) {
					head = curr.next;
					if (head != null)
						head.prev = null;
				} else if (curr == tail) {
					tail = curr.prev;
					tail.next = null;
				} else {
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}

				System.out.println("Removed compartment: " + name);
				return;
			}
			curr = curr.next;
		}
	}

	// displaying forward
	public void displayForward() {
		CompartmentNode temp = head;
		while (temp != null) {
			System.out.println(temp.name);
			temp = temp.next;
		}
	}

	// display backward
	public void displayBackward() {
		CompartmentNode temp = tail;
		while (temp != null) {
			System.out.println(temp.name);
			temp = temp.prev;
		}
	}

	// Show adjacent compartments
	public void showAdjacent(String name) {
		CompartmentNode curr = head;

		while (curr != null) {
			if (curr.name.equals(name)) {
				System.out.println("Current: " + curr.name);
				System.out.println("Previous: " + (curr.prev != null ? curr.prev.name : "None"));
				System.out.println("Next: " + (curr.next != null ? curr.next.name : "None"));
				return;
			}
			curr = curr.next;
		}
	}

	// search for service
	public void findService(String service) {
		CompartmentNode temp = head;
		while (temp != null) {
			if (service.equalsIgnoreCase("pantry") && temp.hasPantry) {
				System.out.println("Pantry available in: " + temp.name);
				return;
			}
			if (service.equalsIgnoreCase("wifi") && temp.hasWifi) {
				System.out.println("WiFi available in: " + temp.name);
				return;
			}
			temp = temp.next;
		}
		System.out.println(service + " not available");
	}
}
