package com.streamapi.trendingmovies;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("Parasite", 8.6, 2019),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Joker", 8.5, 2019),
            new Movie("The Godfather", 9.2, 1972),
            new Movie("Tenet", 7.5, 2020),
            new Movie("1917", 8.3, 2019)
        );

        // Find top 5 trending movies
        List<Movie> top5 = movies.stream()
            .filter(m -> m.getReleaseYear() >= 2000) // optional: recent movies only
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed()
                              .thenComparing(Movie::getReleaseYear).reversed())
            .limit(5)
            .collect(Collectors.toList());

        // Print top 5 movies
        top5.forEach(System.out::println);
    }
}

