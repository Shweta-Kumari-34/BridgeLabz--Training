package sortingAlgorithms.fitnesstrackerapp;

public class User implements Comparable<User> {

    private String name;
    private int dailySteps;

    public User(String name, int dailySteps) {
        this.name = name;
        this.dailySteps = dailySteps;
    }

    public String getName() {
        return name;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.dailySteps, other.dailySteps);
    }
}



