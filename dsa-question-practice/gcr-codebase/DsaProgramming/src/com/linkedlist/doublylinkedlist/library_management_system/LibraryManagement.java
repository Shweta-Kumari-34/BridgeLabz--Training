package com.linkedlist.doublylinkedlist.library_management_system;

import java.util.Scanner;

public class LibraryManagement {

	static class BookNode {
		int bookId;
		String title;
		String author;
		String genre;
		boolean isAvailable;
		BookNode next;
		BookNode prev;

		BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.isAvailable = isAvailable;
			this.next = null;
			this.prev = null;
		}
	}

	private BookNode head;
	private BookNode tail;

	public LibraryManagement() {
		head = null;
		tail = null;
	}

	public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
		BookNode newNode = new BookNode(id, title, author, genre, status);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addAtEnd(int id, String title, String author, String genre, boolean status) {
		BookNode newNode = new BookNode(id, title, author, genre, status);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void addAtPosition(int id, String title, String author, String genre, boolean status, int pos) {
		if (pos == 1) {
			addAtBeginning(id, title, author, genre, status);
			return;
		}

		BookNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null || temp == tail) {
			addAtEnd(id, title, author, genre, status);
		} else {
			BookNode newNode = new BookNode(id, title, author, genre, status);
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}
	}

	public void removeById(int id) {
		BookNode temp = head;

		while (temp != null) {
			if (temp.bookId == id) {

				if (temp == head) {
					head = head.next;
					if (head != null)
						head.prev = null;
				} else if (temp == tail) {
					tail = tail.prev;
					tail.next = null;
				} else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				System.out.println("Book removed successfully");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	public void searchByTitle(String title) {
		BookNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("Book not found");
	}

	public void searchByAuthor(String author) {
		BookNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.author.equalsIgnoreCase(author)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("Book not found");
	}

	public void updateStatus(int id, boolean status) {
		BookNode temp = head;

		while (temp != null) {
			if (temp.bookId == id) {
				temp.isAvailable = status;
				System.out.println("Availability status updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	public void displayForward() {
		if (head == null) {
			System.out.println("Library empty");
			return;
		}

		BookNode temp = head;
		while (temp != null) {
			displayBook(temp);
			temp = temp.next;
		}
	}

	public void displayReverse() {
		if (tail == null) {
			System.out.println("Library empty");
			return;
		}

		BookNode temp = tail;
		while (temp != null) {
			displayBook(temp);
			temp = temp.prev;
		}
	}

	public void countBooks() {
		int count = 0;
		BookNode temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		System.out.println("Total Books in Library: " + count);
	}

	private void displayBook(BookNode b) {
		System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre
				+ ", Available: " + (b.isAvailable ? "Yes" : "No"));
	}

}