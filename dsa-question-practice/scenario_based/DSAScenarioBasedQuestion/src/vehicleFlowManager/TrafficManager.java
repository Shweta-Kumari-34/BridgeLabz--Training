package vehicleFlowManager;

import java.util.*;

public class TrafficManager {

	private VehicleNode head = null;
	private Queue<String> waitingQueue = new LinkedList<>();
	private int maxQueueSize = 5;

	// vehicle arrives
	public void arrive(String vehicleNumber) {

		if (waitingQueue.size() >= maxQueueSize) {
			System.out.println("Queue Overflow! Vehicle " + vehicleNumber + " cannot enter.");
			return;
		}

		waitingQueue.offer(vehicleNumber);
		System.out.println("Vehicle waiting: " + vehicleNumber);
	}

	// allowing vehicle to enter roundabout
	public void enterRoundabout() {

		if (waitingQueue.isEmpty()) {
			System.out.println("Queue Underflow! No vehicles waiting.");
			return;
		}

		String vehicle = waitingQueue.poll();
		VehicleNode newNode = new VehicleNode(vehicle);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			VehicleNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}

		System.out.println("Vehicle entered roundabout: " + vehicle);
	}

	// vehicle exits roundabout
	public void exitRoundabout(String vehicleNumber) {

		if (head == null) {
			System.out.println("Roundabout empty");
			return;
		}

		VehicleNode curr = head;
		VehicleNode prev = null;

		do {
			if (curr.vehicleNumber.equals(vehicleNumber)) {

				// single vehicle case
				if (curr == head && curr.next == head) {
					head = null;
				}
				// removing head
				else if (curr == head) {
					VehicleNode last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				}
				// removing non-head
				else {
					prev.next = curr.next;
				}

				System.out.println("Vehicle exited: " + vehicleNumber);
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Vehicle not found in roundabout");
	}

	// printing roundabout state
	public void printRoundabout() {

		if (head == null) {
			System.out.println("Roundabout is empty");
			return;
		}

		System.out.print("Roundabout Vehicles: ");
		VehicleNode temp = head;
		do {
			System.out.print(temp.vehicleNumber + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to start)");
	}
}
