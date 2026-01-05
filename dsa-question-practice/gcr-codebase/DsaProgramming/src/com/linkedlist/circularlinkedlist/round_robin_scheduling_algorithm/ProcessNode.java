package com.linkedlist.circularlinkedlist.round_robin_scheduling_algorithm;

public class ProcessNode {

	//node structure
	class Node {
		int pid;
		int burstTime;
		int remainingTime;
		Node next;

		Node(int pid, int bt) {
			this.pid = pid;
			this.burstTime = bt;
			this.remainingTime = bt;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	//add process at end
	void addProcess(int pid, int burstTime) {
		Node newNode = new Node(pid, burstTime);

		if (head == null) {
			head = tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	//display circular list
	void display() {
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		}

		Node temp = head;
		do {
			System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(Back to Head)");
	}

	//round robin scheduling
	void roundRobin(int timeQuantum) {
		int time = 0;
		int totalWT = 0;
		int totalTAT = 0;
		int count = 0;

		Node curr = head;
		Node prev = tail;

		while (head != null) {
			System.out.println("\nCurrent Queue:");
			display();

			if (curr.remainingTime > timeQuantum) {
				curr.remainingTime -= timeQuantum;
				time += timeQuantum;
			} else {
				time += curr.remainingTime;
				int waitingTime = time - curr.burstTime;
				int turnAroundTime = time;

				totalWT += waitingTime;
				totalTAT += turnAroundTime;
				count++;

				System.out.println("Process P" + curr.pid + " completed");

				//remove node
				if (curr == head && curr == tail) {
					head = tail = null;
				} else if (curr == head) {
					head = head.next;
					tail.next = head;
				} else if (curr == tail) {
					prev.next = head;
					tail = prev;
				} else {
					prev.next = curr.next;
				}
			}

			prev = curr;
			curr = curr.next;
		}

		System.out.println("\nAll processes finished");
		System.out.println("Average Waiting Time = " + (float) totalWT / count);
		System.out.println("Average Turnaround Time = " + (float) totalTAT / count);
	}
}
