package mobileGameDistributionPlatform;


public class Game implements IDownloadable {
    private String title;
    private String genre;
    protected double price;   
    private double rating;

    public Game(String title, String genre) {
        this(title, genre, 0.0, 0.0);
    }

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public void applySeasonalOffer(double discountPercent) {
        price *= (1 - discountPercent / 100);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing demo of game...");
    }
}


