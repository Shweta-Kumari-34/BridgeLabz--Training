package com.linkedlist.circularlinkedlist.task_scheduler;

import java.util.Scanner;

public class TaskScheduler {

	static class Node {
		int taskId;
		String taskName;
		String priority;
		String dueDate;
		Node next;

		Node(int taskId, String taskName, String priority, String dueDate) {
			this.taskId = taskId;
			this.taskName = taskName;
			this.priority = priority;
			this.dueDate = dueDate;
			this.next = null;
		}
	}

	private Node head;
	private Node current; 

	public TaskScheduler() {
		head = null;
		current = null;
	}

	public void addAtBeginning(int id, String name, String priority, String date) {
		Node newNode = new Node(id, name, priority, date);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			newNode.next = head;
			temp.next = newNode;
			head = newNode;
		}
		current = head;
	}

	public void addAtEnd(int id, String name, String priority, String date) {
		Node newNode = new Node(id, name, priority, date);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
		current = head;
	}

	public void addAtPosition(int id, String name, String priority, String date, int position) {
		if (position == 1) {
			addAtBeginning(id, name, priority, date);
			return;
		}

		Node newNode = new Node(id, name, priority, date);
		Node temp = head;

		for (int i = 1; i < position - 1 && temp.next != head; i++) {
			temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void removeByTaskId(int id) {
		if (head == null) {
			System.out.println("Task list is empty");
			return;
		}

		//for single node case
		if (head.taskId == id && head.next == head) {
			head = null;
			current = null;
			System.out.println("Task removed");
			return;
		}

		Node temp = head;
		Node prev = null;

		do {
			if (temp.taskId == id) {
				if (temp == head) {
					Node last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				} else {
					prev.next = temp.next;
				}
				System.out.println("Task removed");
				return;
			}
			prev = temp;
			temp = temp.next;
		} while (temp != head);

		System.out.println("Task not found");
	}

	// View current task and move to next
	public void viewCurrentTask() {
		if (current == null) {
			System.out.println("No tasks available");
			return;
		}

		System.out.println("Task ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: "
				+ current.priority + ", Due Date: " + current.dueDate);

		current = current.next;
	}

	//display all tasks
	public void displayAll() {
		if (head == null) {
			System.out.println("No tasks available");
			return;
		}

		Node temp = head;
		do {
			System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority
					+ ", Due Date: " + temp.dueDate);
			temp = temp.next;
		} while (temp != head);
	}

	//search by priority
	public void searchByPriority(String priority) {
		if (head == null) {
			System.out.println("No tasks available");
			return;
		}

		Node temp = head;
		boolean found = false;

		do {
			if (temp.priority.equalsIgnoreCase(priority)) {
				System.out.println(
						"Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No task found with given priority");
		}
	}

}
