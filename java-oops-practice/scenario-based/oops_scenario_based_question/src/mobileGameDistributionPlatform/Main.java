package mobileGameDistributionPlatform;

public class Main {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Racer", 299, 4.5);
        Game g2 = new StrategyGame("War Tactics", 499, 4.7);

        g1.download();
        g1.playDemo();   

        g2.playDemo();

        g2.applySeasonalOffer(20);  

        User user = new User("Shweta");
        user.buyGame(g1);
        user.buyGame(g2);
    }
}

