package personalmusiclibrarymanager;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/**
 * SongVault – Music Library Manager
 */
public class SongVault<T extends Song> {

    private List<T> songs = new ArrayList<>();
    private Map<String, List<T>> genreMap = new HashMap<>();
    private Set<String> uniqueArtists = new HashSet<>();

    // Regex patterns
    private Pattern titlePattern = Pattern.compile("Title:\\s*(.*)");
    private Pattern artistPattern = Pattern.compile("Artist:\\s*(.*)");
    private Pattern durationPattern = Pattern.compile("Duration:\\s*(.*)");
    private Pattern genrePattern = Pattern.compile("Genre:\\s*(.*)");

    /**
     * Reads song files from folder
     */
    public void loadSongs(String folderPath) {
        try {
            Files.list(Paths.get(folderPath))
                .filter(p -> p.toString().endsWith(".txt"))
                .forEach(this::readSongFile);
        } catch (IOException e) {
            System.out.println("Folder error: " + e.getMessage());
        }
    }

    /**
     * Reads a single song file
     */
    private void readSongFile(Path filePath) {
        String title = "", artist = "", duration = "", genre = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher m;
                if ((m = titlePattern.matcher(line)).matches()) title = m.group(1);
                if ((m = artistPattern.matcher(line)).matches()) artist = m.group(1);
                if ((m = durationPattern.matcher(line)).matches()) duration = m.group(1);
                if ((m = genrePattern.matcher(line)).matches()) genre = m.group(1);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }

        if (!title.isEmpty() && !artist.isEmpty()) {
            Song song = new Song(title, artist, duration, genre);
            songs.add((T) song);  // unchecked cast for simplicity
            uniqueArtists.add(artist);

            genreMap.putIfAbsent(genre, new ArrayList<>());
            genreMap.get(genre).add((T) song);
        }
    }

    // Display all songs
    public void printAllSongs() {
        songs.forEach(System.out::println);
    }

    // Display songs grouped by genre
    public void printSongsByGenre() {
        for (String genre : genreMap.keySet()) {
            System.out.println("Genre: " + genre);
            genreMap.get(genre).forEach(song -> System.out.println("  " + song));
        }
    }

    // Display unique artists
    public void printUniqueArtists() {
        System.out.println("Unique Artists:");
        uniqueArtists.forEach(System.out::println);
    }

    // Filter songs by genre using Streams
    public void filterByGenre(String genre) {
        System.out.println("\nSongs in genre: " + genre);
        songs.stream()
             .filter(s -> s.getGenre().equalsIgnoreCase(genre))
             .forEach(System.out::println);
    }

    // Sort songs by title using Streams
    public void sortByTitle() {
        System.out.println("\nSongs sorted by title:");
        songs.stream()
             .sorted(Comparator.comparing(Song::getTitle))
             .forEach(System.out::println);
    }

    // Main
    public static void main(String[] args) {
        SongVault<Song> vault = new SongVault<>();
        vault.loadSongs("songs"); // folder containing .txt files

        vault.printAllSongs();
        vault.printUniqueArtists();
        vault.printSongsByGenre();
        vault.filterByGenre("Rock");
        vault.sortByTitle();
    }
}

