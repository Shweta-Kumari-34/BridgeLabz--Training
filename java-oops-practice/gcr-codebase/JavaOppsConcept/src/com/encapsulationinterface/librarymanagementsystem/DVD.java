package com.encapsulationinterface.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {

	    public DVD(String id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 3; // 3 days
	    }

	    @Override
	    public void reserveItem(String borrowerName) {
	        if (checkAvailability()) {
	            setBorrower(borrowerName);
	            System.out.println("DVD reserved successfully.");
	        } else {
	            System.out.println("DVD is not available.");
	        }
	    }

	    @Override
	    public boolean checkAvailability() {
	        return isAvailable();
	    }
	}

