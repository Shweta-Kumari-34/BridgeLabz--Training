import java.util.Scanner;
//creating a class with name as StudentVotingEligibility
public class StudentVotingEligibility {

//take user input for ages of n students
public static int[] getAges(int n, Scanner sc) {
 int[] ages = new int[n];

for (int i = 0; i < n; i++) {
System.out.print("Enter age of student " + (i + 1) + ": ");
ages[i] = sc.nextInt();
 }
return ages;
}

//check voting eligibility and return  result in 2D array
public static String[][] checkVotingEligibility(int[] ages) {
String[][] result = new String[ages.length][2];
for (int i = 0; i < ages.length; i++) {
 int age = ages[i];

result[i][0] = String.valueOf(age); // store age

if (age < 0) {
result[i][1] = "false"; // negative age cannot vote
} else if (age >= 18) {
 result[i][1] = "true"; // can vote
} else {
result[i][1] = "false"; // cannot vote
}
}

return result;
}

// Method to display 2D array in tabular format
public static void displayEligibilityTable(String[][] table) {
System.out.println("\nAge\tCan Vote");
System.out.println("-----------------");
for (int i = 0; i < table.length; i++) {
System.out.println(table[i][0] + "\t" + table[i][1]);
}
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int n = 10; // number of students

// Take ages as input
int[] ages = getAges(n, sc);

// Check voting eligibility
 String[][] eligibilityTable = checkVotingEligibility(ages);

// Displaying the result
displayEligibilityTable(eligibilityTable);

}
}
