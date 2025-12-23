import java.util.Scanner;
// Creating class with name as StudentVoteChecker
public class StudentVoteChecker {
//Method to check whether a student can vote
public static boolean canStudentVote(int age) {
//for negative return false
if (age < 0) {
return false;
}

// Check voting eligibility
if (age >= 18) {
return true;
} else {
return false;
}
}

// Main method
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//Array to store ages of 10 students
int[] ages = new int[10];

// Taking user input and checking voting eligibility
for (int i = 0; i < ages.length; i++) {
System.out.println("Enter age of student " + (i + 1));
ages[i] = input.nextInt();
// Calling canStudentVote method and store result
boolean canVote =canStudentVote(ages[i]);

// Displaying result
if (canVote) {
System.out.println("Student " + (i + 1) + " can vote.");
} else {
System.out.println("Student " + (i + 1) + " cannot vote.");
}
}

input.close();
}
}

