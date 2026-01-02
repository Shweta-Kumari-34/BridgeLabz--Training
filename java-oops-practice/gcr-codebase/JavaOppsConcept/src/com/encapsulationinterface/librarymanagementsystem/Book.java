package com.encapsulationinterface.librarymanagementsystem;


	class Book extends LibraryItem implements Reservable {

	    public Book(String id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 14; // 2 weeks
	    }

	    @Override
	    public void reserveItem(String borrowerName) {
	        if (checkAvailability()) {
	            setBorrower(borrowerName);
	            System.out.println("Book reserved successfully.");
	        } else {
	            System.out.println("Book is not available.");
	        }
	    }

	    @Override
	    public boolean checkAvailability() {
	        return isAvailable();
	    }
	}

