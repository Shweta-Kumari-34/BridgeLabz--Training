package com.linkedlist.doublylinkedlist.movie_management_system;

import java.util.Scanner;

public class MovieManagement {


	static class Node {
		String title;
		String director;
		int year;
		double rating;
		Node next;
		Node prev;

		Node(String title, String director, int year, double rating) {
			this.title = title;
			this.director = director;
			this.year = year;
			this.rating = rating;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;
	private Node tail;

	public MovieManagement() {
		head = null;
		tail = null;
	}

	
	public void addAtBeginning(String title, String director, int year, double rating) {
		Node newNode = new Node(title, director, year, rating);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addAtEnd(String title, String director, int year, double rating) {
		Node newNode = new Node(title, director, year, rating);

		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void addAtPosition(String title, String director, int year, double rating, int position) {
		if (position == 1) {
			addAtBeginning(title, director, year, rating);
			return;
		}

		Node current = head;
		for (int i = 1; i < position - 1 && current != null; i++) {
			current = current.next;
		}

		if (current == null || current.next == null) {
			addAtEnd(title, director, year, rating);
		} else {
			Node newNode = new Node(title, director, year, rating);
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		}
	}

	public void removeByTitle(String title) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node current = head;

		while (current != null) {
			if (current.title.equalsIgnoreCase(title)) {

				if (current == head) {
					head = head.next;
					if (head != null)
						head.prev = null;
				} else if (current == tail) {
					tail = tail.prev;
					tail.next = null;
				} else {
					current.prev.next = current.next;
					current.next.prev = current.prev;
				}

				System.out.println("Movie removed successfully");
				return;
			}
			current = current.next;
		}

		System.out.println("Movie not found");
	}

	public void searchByDirector(String director) {
		Node current = head;
		boolean found = false;

		while (current != null) {
			if (current.director.equalsIgnoreCase(director)) {
				displayMovie(current);
				found = true;
			}
			current = current.next;
		}

		if (!found) {
			System.out.println("No movies found for this director");
		}
	}

	public void searchByRating(double rating) {
		Node current = head;
		boolean found = false;

		while (current != null) {
			if (current.rating >= rating) {
				displayMovie(current);
				found = true;
			}
			current = current.next;
		}

		if (!found) {
			System.out.println("No movies found with this rating");
		}
	}

	public void updateRating(String title, double newRating) {
		Node current = head;

		while (current != null) {
			if (current.title.equalsIgnoreCase(title)) {
				current.rating = newRating;
				System.out.println("Rating updated successfully");
				return;
			}
			current = current.next;
		}

		System.out.println("Movie not found");
	}

	public void displayForward() {
		if (head == null) {
			System.out.println("No movie records available");
			return;
		}

		Node current = head;
		while (current != null) {
			displayMovie(current);
			current = current.next;
		}
	}

	public void displayReverse() {
		if (tail == null) {
			System.out.println("No movie records available");
			return;
		}

		Node current = tail;
		while (current != null) {
			displayMovie(current);
			current = current.prev;
		}
	}

	private void displayMovie(Node m) {
		System.out.println(
				"Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
	}

}
