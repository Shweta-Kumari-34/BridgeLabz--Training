package personalmusiclibrarymanager;

import java.util.Objects;

/**
 * Represents a Song
 */
public class Song {
    private String title;
    private String artist;
    private String duration;
    private String genre;

    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getDuration() { return duration; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return title + " - " + artist + " [" + duration + "] (" + genre + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}
