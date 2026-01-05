package com.linkedlist.singlylinkedlist.studentrecordmanagement;
import java.util.Scanner;

public class StudentRecord {
	    // Node class
	    static class Node {
	        int rollNumber;
	        String name;
	        int age;
	        char grade;
	        Node next;

	        Node(int rollNumber, String name, int age, char grade) {
	            this.rollNumber = rollNumber;
	            this.name = name;
	            this.age = age;
	            this.grade = grade;
	            this.next = null;
	        }
	    }

	    private Node head;

	    public StudentRecord() {
	        head = null;
	    }

	    // Add at beginning
	    public void addAtBeginning(int roll, String name, int age, char grade) {
	        Node newNode = new Node(roll, name, age, grade);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Add at end
	    public void addAtEnd(int roll, String name, int age, char grade) {
	        Node newNode = new Node(roll, name, age, grade);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }
	    public void addAtPosition(int roll, String name, int age, char grade, int position) {

	        if (position == 1) {
	            addAtBeginning(roll, name, age, grade);
	            return;
	        }

	        Node newNode = new Node(roll, name, age, grade);
	        Node current = head;

	        for (int i = 1; i < position - 1 && current != null; i++) {
	            current = current.next;
	        }

	        if (current != null) {
	            newNode.next = current.next;
	            current.next = newNode;
	        } else {
	            System.out.println("Invalid position!");
	        }
	    }

	    public void deleteByRollNumber(int roll) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        if (head.rollNumber == roll) {
	            head = head.next;
	            System.out.println("Student deleted");
	            return;
	        }

	        Node current = head;
	        while (current.next != null && current.next.rollNumber != roll) {
	            current = current.next;
	        }

	        if (current.next != null) {
	            current.next = current.next.next;
	            System.out.println("Student deleted");
	        } else {
	            System.out.println("Student not found");
	        }
	    }

	    public void searchByRollNumber(int roll) {
	        Node current = head;
	        while (current != null) {
	            if (current.rollNumber == roll) {
	                System.out.println(
	                        "Roll: " + current.rollNumber +
	                        ", Name: " + current.name +
	                        ", Age: " + current.age +
	                        ", Grade: " + current.grade
	                );
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Student not found");
	    }

	    public void updateGrade(int roll, char newGrade) {
	        Node current = head;
	        while (current != null) {
	            if (current.rollNumber == roll) {
	                current.grade = newGrade;
	                System.out.println("Grade updated");
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Student not found");
	    }

	    public void displayAll() {
	        if (head == null) {
	            System.out.println("No records found");
	            return;
	        }

	        Node current = head;
	        while (current != null) {
	            System.out.println(
	                    "Roll: " + current.rollNumber +
	                    ", Name: " + current.name +
	                    ", Age: " + current.age +
	                    ", Grade: " + current.grade
	            );
	            current = current.next;
	        }
	    }

}


