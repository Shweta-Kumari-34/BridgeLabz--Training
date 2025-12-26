import java.util.Random;
import java.util.Scanner;
//creating a class with name as NumberGuessingGame
public class NumberGuessingGame {

//generate a random guess between min and max
public static int generateGuess(int min, int max) {
Random rand = new Random();
return rand.nextInt(max - min + 1) + min;
}

//get user feedback
public static String getFeedback(int guess, Scanner sc) {
System.out.println("Is your number " + guess + "?");
System.out.print("Enter 'high', 'low', or 'correct': ");
return sc.nextLine().toLowerCase();
 }

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int min = 1, max = 100;
String feedback;
int guess;

System.out.println("Think of a number between 1 and 100 ");

do {
guess = generateGuess(min, max);
feedback = getFeedback(guess, input);

if (feedback.equals("high")) {
max = guess - 1;
} else if (feedback.equals("low")) {
min = guess + 1;
} else if (!feedback.equals("correct")) {
System.out.println("Invalid input. Please enter 'high', 'low', or 'correct' ");
}

} while (!feedback.equals("correct"));

System.out.println("Hooray! The computer guessed your number: " + guess);
input.close();
}
}
