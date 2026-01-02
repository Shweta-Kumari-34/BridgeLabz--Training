package com.encapsulationinterface.librarymanagementsystem;


	class Magazine extends LibraryItem implements Reservable {

	    public Magazine(String id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 7; // 1 week
	    }

	    @Override
	    public void reserveItem(String borrowerName) {
	        if (checkAvailability()) {
	            setBorrower(borrowerName);
	            System.out.println("Magazine reserved successfully.");
	        } else {
	            System.out.println("Magazine is not available.");
	        }
	    }

	    @Override
	    public boolean checkAvailability() {
	        return isAvailable();
	    }
	}


