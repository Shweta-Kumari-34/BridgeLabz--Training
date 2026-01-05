package com.linkedlist.singlylinkedlist.inventory_management_system;

import java.util.Scanner;

public class InventoryManagement{
	static class Node {
		int itemId;
		String itemName;
		int quantity;
		double price;
		Node next;

		Node(int itemId, String itemName, int quantity, double price) {
			this.itemId = itemId;
			this.itemName = itemName;
			this.quantity = quantity;
			this.price = price;
			this.next = null;
		}
	}

	private Node head;

	public InventoryManagement() {
		head = null;
	}

	public void addAtBeginning(int id, String name, int qty, double price) {
		Node newNode = new Node(id, name, qty, price);
		newNode.next = head;
		head = newNode;
	}

	public void addAtEnd(int id, String name, int qty, double price) {
		Node newNode = new Node(id, name, qty, price);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void addAtPosition(int id, String name, int qty, double price, int pos) {
		if (pos == 1) {
			addAtBeginning(id, name, qty, price);
			return;
		}

		Node newNode = new Node(id, name, qty, price);
		Node temp = head;

		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp != null) {
			newNode.next = temp.next;
			temp.next = newNode;
		} else {
			System.out.println("Invalid position");
		}
	}

	public void removeById(int id) {
		if (head == null) {
			System.out.println("Inventory empty");
			return;
		}

		if (head.itemId == id) {
			head = head.next;
			System.out.println("Item removed");
			return;
		}

		Node temp = head;
		while (temp.next != null && temp.next.itemId != id) {
			temp = temp.next;
		}

		if (temp.next != null) {
			temp.next = temp.next.next;
			System.out.println("Item removed");
		} else {
			System.out.println("Item not found");
		}
	}

	public void updateQuantity(int id, int newQty) {
		Node temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				temp.quantity = newQty;
				System.out.println("Quantity updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	public void searchById(int id) {
		Node temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				displayItem(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	public void searchByName(String name) {
		Node temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.itemName.equalsIgnoreCase(name)) {
				displayItem(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("Item not found");
		}
	}

	public void calculateTotalValue() {
		double total = 0;
		Node temp = head;

		while (temp != null) {
			total += temp.price * temp.quantity;
			temp = temp.next;
		}

		System.out.println("Total Inventory Value: ₹" + total);
	}

	public void sortByName(boolean ascending) {
		for (Node i = head; i != null; i = i.next) {
			for (Node j = i.next; j != null; j = j.next) {
				if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0)
						|| (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
					swapData(i, j);
				}
			}
		}
		System.out.println("Sorted by Item Name");
	}

	public void sortByPrice(boolean ascending) {
		for (Node i = head; i != null; i = i.next) {
			for (Node j = i.next; j != null; j = j.next) {
				if ((ascending && i.price > j.price) || (!ascending && i.price < j.price)) {
					swapData(i, j);
				}
			}
		}
		System.out.println("Sorted by Price");
	}

	private void swapData(Node a, Node b) {
		int id = a.itemId;
		String name = a.itemName;
		int qty = a.quantity;
		double price = a.price;

		a.itemId = b.itemId;
		a.itemName = b.itemName;
		a.quantity = b.quantity;
		a.price = b.price;

		b.itemId = id;
		b.itemName = name;
		b.quantity = qty;
		b.price = price;
	}

	public void displayAll() {
		if (head == null) {
			System.out.println("Inventory empty");
			return;
		}

		Node temp = head;
		while (temp != null) {
			displayItem(temp);
			temp = temp.next;
		}
	}

	private void displayItem(Node i) {
		System.out
				.println("ID: " + i.itemId + ", Name: " + i.itemName + ", Qty: " + i.quantity + ", Price: " + i.price);
	}

}
