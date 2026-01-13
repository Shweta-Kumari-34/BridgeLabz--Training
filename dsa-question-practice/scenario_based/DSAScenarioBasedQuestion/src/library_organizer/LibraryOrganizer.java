package library_organizer;

import java.util.*;

class LibraryOrganizer {

	// store list of books according to genre
	private HashMap<String, LinkedList<Book>> library = new HashMap<>();

	// to avoid duplicate books
	private HashSet<String> uniqueBooks = new HashSet<>();

	// add or return a book
	public void addBook(String genre, Book book) {

		// avoid duplication
		if (uniqueBooks.contains(book.isbn)) {
			System.out.println("Book already exists: " + book.title);
			return;
		}

		// if genre not present, create it
		library.putIfAbsent(genre, new LinkedList<>());

		library.get(genre).add(book);
		uniqueBooks.add(book.isbn);

		System.out.println("Added Book: " + book.title + " to " + genre);
	}

	// borrow or remove a book
	public void removeBook(String genre, String isbn) {

		if (!library.containsKey(genre)) {
			System.out.println("Genre not found");
			return;
		}

		LinkedList<Book> books = library.get(genre);

		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			if (b.isbn.equals(isbn)) {
				it.remove();
				uniqueBooks.remove(isbn);
				System.out.println("Borrowed Book is : " + b.title);
				return;
			}
		}

		System.out.println("Book not found in " + genre);
	}

	// display all books genre-wise
	public void displayLibrary() {
		for (String genre : library.keySet()) {
			System.out.println("\nGenre is : " + genre);
			for (Book b : library.get(genre)) {
				System.out.println("  " + b);
			}
		}
	}
}
