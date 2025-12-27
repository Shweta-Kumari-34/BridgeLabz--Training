package com.constructors.level1;

public class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean available;
    LibraryBookSystem( String title, String author, double price, boolean availability){
    	this.title = title;
    	this.author = author;
    	this.price = price;
    	this.available = available;
    }
    void borrowBook(boolean available) {
    	if(available) {
    		System.out.println("Successfully Book Borrowed");
    	}else {
    		System.out.println(" Currently unavailable");
    	}
    }
    void displayBookDetails() {
    	System.out.println(" title:" +title);
    	System.out.println(" author:" +author);
    	System.out.println(" price:" +price);
    	/*if(available) {
          System.out.println("Available: YES");	
        	
    	}else {
    		System.out.println("Available: No");		
    	}
    	*/
    }
    public static void main(String[] args) {
    	LibraryBookSystem book1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 345.0, true);
    	book1.borrowBook(true);
    	book1.displayBookDetails();
    }
}
