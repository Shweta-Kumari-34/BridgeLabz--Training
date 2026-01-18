package mobileGameDistributionPlatform;
import java.util.ArrayList;
import java.util.List;
public class User {
	
	    private String name;
	    private List<Game> ownedGames = new ArrayList<>();

	    public User(String name) {
	        this.name = name;
	    }

	    public void buyGame(Game game) {
	        ownedGames.add(game);
	        System.out.println(game.getTitle() + " added to library.");
	    }

	 
	    public List<Game> getOwnedGames() {
	        return new ArrayList<>(ownedGames);
	    }
	}




