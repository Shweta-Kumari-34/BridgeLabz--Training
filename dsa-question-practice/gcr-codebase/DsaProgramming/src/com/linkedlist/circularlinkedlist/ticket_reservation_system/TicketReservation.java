package com.linkedlist.circularlinkedlist.ticket_reservation_system;

public class TicketReservation {

	//node class for each ticket
	class TicketNode {
		int ticketId;
		String customerName;
		String movieName;
		String seatNumber;
		String bookingTime;
		TicketNode next;

		TicketNode(int id, String customerName, String movieName, String seatNumber, String bookingTime) {
			this.ticketId = id;
			this.customerName = customerName;
			this.movieName = movieName;
			this.seatNumber = seatNumber;
			this.bookingTime = bookingTime;
			this.next = null;
		}
	}

	TicketNode head = null;
	TicketNode tail = null;
	int totalTickets = 0;

	// add ticket at end
	void addTicket(int id, String customer, String movie, String seat, String time) {
		TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

		if (head == null) {
			head = tail = newNode;
			tail.next = head; // circular link
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		totalTickets++;
		System.out.println("Ticket booked successfully for " + customer);
	}

	// remove ticket by Ticket ID
	void removeTicket(int id) {
		if (head == null) {
			System.out.println("No tickets booked");
			return;
		}

		TicketNode curr = head;
		TicketNode prev = tail;
		boolean found = false;

		do {
			if (curr.ticketId == id) {
				found = true;
				if (curr == head && curr == tail) { // only one node
					head = tail = null;
				} else if (curr == head) { // first node
					head = head.next;
					tail.next = head;
				} else if (curr == tail) { // last node
					prev.next = head;
					tail = prev;
				} else { // middle node
					prev.next = curr.next;
				}
				totalTickets--;
				System.out.println("Ticket ID " + id + " removed successfully");
				break;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		if (!found)
			System.out.println("Ticket ID not found");
	}
	
	void displayTickets() {
		if (head == null) {
			System.out.println("No tickets booked");
			return;
		}

		TicketNode temp = head;
		System.out.println("Current Tickets:");
		do {
			System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: "
					+ temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
			temp = temp.next;
		} while (temp != head);
	}

	//search by customer name or movie Name
	void searchTicket(String keyword) {
		if (head == null) {
			System.out.println("No tickets booked");
			return;
		}

		TicketNode temp = head;
		boolean found = false;
		do {
			if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
				System.out.println("Ticket Found -> ID: " + temp.ticketId + ", Customer: " + temp.customerName
						+ ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found)
			System.out.println("No ticket found for: " + keyword);
	}

	void totalTicketsBooked() {
		System.out.println("Total Tickets Booked: " + totalTickets);
	}
}
