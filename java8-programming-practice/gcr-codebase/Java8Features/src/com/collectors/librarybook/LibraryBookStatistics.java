package com.collectors.librarybook;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryBookStatistics {

	public static void main(String[] args) {

		// list of books
		List<Book> books = Arrays.asList(new Book("Java Basics", "Programming", 350),
				new Book("Advanced Java", "Programming", 500), new Book("Harry Potter", "Fiction", 400),
				new Book("Lord of Rings", "Fiction", 700), new Book("Maths 101", "Education", 300));

		// group books by genre and get statistics of pages
		// group by genre
		Map<String, IntSummaryStatistics> statsByGenre = books.stream().collect(Collectors.groupingBy(Book::getGenre,

				Collectors.summarizingInt(Book::getPages // pages statistics
				)));

		// print statistics for each genre
		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + stats.getSum());
			System.out.println("Average Pages: " + stats.getAverage());
			System.out.println("Maximum Pages: " + stats.getMax());
			System.out.println("----------------------");
		});
	}
}
