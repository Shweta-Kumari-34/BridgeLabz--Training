package mobileGameDistributionPlatform;

public class ArcadeGame extends Game {

	    public ArcadeGame(String title, double price, double rating) {
	        super(title, "Arcade", price, rating);
	    }

	    @Override
	    public void playDemo() {
	        System.out.println("Quick-action arcade demo with high speed!");
	    }
	}


