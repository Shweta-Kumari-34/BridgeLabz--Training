package com.collectors.librarybook;

//Book class to store book details
public class Book {

	private String title;
	private String genre;
	private int pages;

	// constructor
	public Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	// getter for genre
	public String getGenre() {
		return genre;
	}

	// getter for pages
	public int getPages() {
		return pages;
	}
}
