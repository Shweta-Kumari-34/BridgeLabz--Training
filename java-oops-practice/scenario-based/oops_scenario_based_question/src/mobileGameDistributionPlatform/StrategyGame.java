package mobileGameDistributionPlatform;

public class StrategyGame extends Game {

	    public StrategyGame(String title, double price, double rating) {
	        super(title, "Strategy", price, rating);
	    }

	    @Override
	    public void playDemo() {
	        System.out.println("Strategic demo with planning and tactics.");
	    }
	}

	

