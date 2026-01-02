package com.encapsulationinterface.librarymanagementsystem;


	abstract class LibraryItem {

	    // Encapsulated fields
	    private String itemId;
	    private String title;
	    private String author;

	    // Sensitive borrower data (secured)
	    private String borrowerName;
	    private boolean isAvailable = true;

	    public LibraryItem(String itemId, String title, String author) {
	        this.itemId = itemId;
	        this.title = title;
	        this.author = author;
	    }

	    // Getters (no direct field access)
	    public String getItemId() {
	        return itemId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    protected boolean isAvailable() {
	        return isAvailable;
	    }

	    protected void setBorrower(String borrowerName) {
	        this.borrowerName = borrowerName;
	        this.isAvailable = false;
	    }

	    protected void clearBorrower() {
	        this.borrowerName = null;
	        this.isAvailable = true;
	    }

	    // Abstract method
	    public abstract int getLoanDuration(); // in days

	    // Concrete method
	    public void getItemDetails() {
	        System.out.println("-----------------------------------");
	        System.out.println("Item ID: " + itemId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Loan Duration: " + getLoanDuration() + " days");
	        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	    }
	}


