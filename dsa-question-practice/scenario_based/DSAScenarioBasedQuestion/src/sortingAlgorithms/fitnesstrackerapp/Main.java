/*
 * FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting
 */

package sortingAlgorithms.fitnesstrackerapp;

public class Main {

    public static void main(String[] args) {

        System.out.println("******** Fitness Tracker Leaderboard ********");

        User[] users = {
                new User("Aarav", 8200),
                new User("Riya", 10450),
                new User("Ananya", 7600),
                new User("Rohan", 9800),
                new User("Kunal", 6900),
                new User("Neha", 9100)
        };

        BubbleSort.printLeaderboard(users, "Before Sorting");
        BubbleSort.bubbleSort(users);
        BubbleSort.printLeaderboard(users, "Daily Step Rankings");

        System.out.println("******** End of Day ********");
    }
}
