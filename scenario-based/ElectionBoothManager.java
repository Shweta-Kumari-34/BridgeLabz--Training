import java.util.Scanner;
//creating a class with name as ElectionBoothManager
public class ElectionBoothManager {
public static void main(String[] args) {

//reading input from user
Scanner input = new Scanner(System.in);

while (true) {
System.out.print("Enter age of voter (or -1 to exit): ");
int age = input.nextInt();

if (age == -1) {
System.out.println("Voting session ended.");
break;
}

//checking for voting eligibility
if (age >= 18) {
System.out.println("Eligible to vote!");
System.out.println("Choose your candidate: ");
System.out.println("1. Candidate A");
System.out.println("2. Candidate B");
System.out.println("3. Candidate C");

System.out.print("Enter your vote (1/2/3): ");
int vote = input.nextInt();

//checking the conditions and displaying the result
if (vote == 1 || vote == 2 || vote == 3) {
System.out.println("Vote recorded. Thank you!");
} else {
System.out.println("Invalid vote! Try again.");
}
} else {
System.out.println("Not eligible to vote.");
}
}
input.close();
}
}
