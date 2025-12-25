import java.util.Scanner;
//creating a class with name as FindStringLength
public class FindStringLength {

//find length of string without using length() method
public static int findLength(String str) {
int count = 0;

try {
for (;; count++) {         // Infinite loop
str.charAt(count);     // Access characters one by one
}
} catch (Exception e) {
// When out of range exception occurs, return count
return count;
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.print("Enter a string: ");
String str = input.next();     

// Calling user-defined method
int customLength = findLength(str);
// Using built-in method for verification
int actualLength = input.length();
// Displaying output
System.out.println("\nLength using custom method : " + customLength);
System.out.println("Length using length() method: " + actualLength);

input.close();
 }
}
