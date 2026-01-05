package com.linkedlist.doublylinkedlist.undo_redo_functionality;

public class TextEditor {

	    class StateNode {
	        String text;
	        StateNode prev;
	        StateNode next;

	        StateNode(String text) {
	            this.text = text;
	        }
	    }

	    private StateNode head = null;
	    private StateNode tail = null;
	    private StateNode current = null;
	    private int size = 0;
	    private final int MAX_SIZE = 10;

	    void addState(String text) {
	        StateNode newNode = new StateNode(text);

	        if (current != null && current.next != null) {
	            current.next.prev = null;
	            current.next = null;
	            tail = current;
	        }

	        if (head == null) {
	            head = tail = current = newNode;
	            size = 1;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	            current = newNode;
	            size++;

	            if (size > MAX_SIZE) {
	                head = head.next;
	                head.prev = null;
	                size--;
	            }
	        }
	    }

	    void undo() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	        } else {
	            System.out.println("Nothing to undo");
	        }
	    }

	    void redo() {
	        if (current != null && current.next != null) {
	            current = current.next;
	        } else {
	            System.out.println("Nothing to redo");
	        }
	    }

	    void displayCurrentState() {
	        if (current != null) {
	            System.out.println("Current Text: " + current.text);
	        } else {
	            System.out.println("Editor is empty");
	        }
	    }
	}


