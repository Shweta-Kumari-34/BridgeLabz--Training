package com.objectmodeling.libraryandbooks;

import java.util.ArrayList;


class Library {
    private String name;
    ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        System.out.println("Books available:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}