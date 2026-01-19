package bagnballorganizer;

import java.util.ArrayList;

public class Bag implements Storable {

    private int id;
    private String color;
    private int capacity;

    private ArrayList<Ball> balls = new ArrayList<>();

    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getBallCount() {
        return balls.size();
    }

    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full. Cannot add ball.");
            return false;
        }
        balls.add(ball);
        System.out.println("Ball added to Bag " + id);
        return true;
    }

    public void removeBall(int ballId) {
        for (Ball b : balls) {
            if (b.getId() == ballId) {
                balls.remove(b);
                System.out.println("Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println("Ball not found in Bag " + id);
    }

    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag");
            return;
        }
        for (Ball b : balls) {
            b.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Bag ID: " + id +
                ", Color: " + color +
                ", Capacity: " + capacity +
                ", Current Balls: " + balls.size());
    }
}
