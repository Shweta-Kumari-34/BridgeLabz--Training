package com.linkedlist.circularlinkedlist.ticket_reservation_system;

public class Main {
	    public static void main(String[] args) {

	        TicketReservation system = new TicketReservation();

	        system.addTicket(101, "Alice", "Avengers", "A1", "10:00 AM");
	        system.addTicket(102, "Bob", "Avengers", "A2", "10:05 AM");
	        system.addTicket(103, "Charlie", "Inception", "B1", "10:10 AM");

	        system.displayTickets();

	        system.searchTicket("Avengers");
	        system.searchTicket("Charlie");

	        system.removeTicket(102);
	        system.displayTickets();

	        system.totalTicketsBooked();
	    }
	}


