package sortingAlgorithms.fitnesstrackerapp;

public class BubbleSort {

    public static void bubbleSort(User[] users) {
        int n = users.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Descending order: more steps = higher rank
                if (users[j].compareTo(users[j + 1]) < 0) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }

    public static void printLeaderboard(User[] list, String text) {
        System.out.println(text + ":");
        System.out.println("=====================================================");
        System.out.println("Rank            User Name               Daily Steps");
        System.out.println("=====================================================");

        for (int i = 0; i < list.length; i++) {
            User u = list[i];
            System.out.printf("%-15d %-22s %d%n",
                    (i + 1), u.getName(), u.getDailySteps());
        }

        System.out.println("=====================================================");
    }
}
