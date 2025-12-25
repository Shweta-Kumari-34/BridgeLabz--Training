import java.util.Scanner;
//creating a class with name as FirstNonRepeatingCharacter
public class FirstNonRepeatingCharacter {

// Method to find the first non-repeating character
public static char findFirstNonRepeating(String str) {
int[] freq = new int[256]; // Array to store frequency of ASCII characters

// Calculate frequency of each character
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
freq[ch]++;
}

 // Find the first character with frequency 1
 for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (freq[ch] == 1) {
return ch;
 }
 }

// If no non-repeating character found
return '\0'; // Null character indicates none found
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a string: ");
String input = sc.nextLine();

//calling the method and storing the result
char firstNonRepeating = findFirstNonRepeating(input);

//displaying the result
if (firstNonRepeating != '\0') {
System.out.println("First non-repeating character is " + firstNonRepeating);
} else {
System.out.println("No non-repeating character found in the string.");
}

sc.close();
}
}
