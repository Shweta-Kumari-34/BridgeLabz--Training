package com.encapsulationinterface.librarymanagementsystem;

	import java.util.*;

	public class Main {
	    public static void main(String[] args) {

	        List<LibraryItem> items = new ArrayList<>();

	        items.add(new Book("B101", "Java Programming", "James Gosling"));
	        items.add(new Magazine("M202", "Tech Today", "Editorial Board"));
	        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

	        System.out.println("\n====== LIBRARY ITEMS ======\n");

	        // Polymorphism in action
	        for (LibraryItem item : items) {
	            item.getItemDetails();
	        }

	        System.out.println("\n====== RESERVATION ======\n");

	        Reservable r1 = (Reservable) items.get(0);
	        r1.reserveItem("Shweta");

	        items.get(0).getItemDetails();
	    }
	}


