package com.objectmodeling.libraryandbooks;


public class Main {
	   public static void main(String[] args) {

	        // Creating book objects (Books can exist independently)
	        Book b1 = new Book("The Alchemist", "Paulo Coelho");
	        Book b2 = new Book("Harry Potter", "J.K. Rowling");
	        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");

	        // Creating libraries
	        Library lib1 = new Library("City Library");
	        Library lib2 = new Library("School Library");

	        // Adding same books to different libraries (Book reused)
	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b2);  // Shared book (Aggregation)
	        lib2.addBook(b3);

	        // Display books in each library
	        lib1.showLibraryBooks();
	        lib2.showLibraryBooks();
	    }
}
