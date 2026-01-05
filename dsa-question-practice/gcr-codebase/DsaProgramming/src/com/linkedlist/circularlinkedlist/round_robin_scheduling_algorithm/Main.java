package com.linkedlist.circularlinkedlist.round_robin_scheduling_algorithm;

public class Main {
	    public static void main(String[] args) {

	        ProcessNode scheduler = new ProcessNode();

	        // Adding processes
	        scheduler.addProcess(1, 5);
	        scheduler.addProcess(2, 8);
	        scheduler.addProcess(3, 6);

	        int timeQuantum = 3;

	        System.out.println("Round Robin Scheduling Started");
	        scheduler.roundRobin(timeQuantum);
	    }
	}


