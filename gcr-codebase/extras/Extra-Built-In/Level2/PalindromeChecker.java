import java.util.Scanner;
//creating a class with name as PalindromeChecker
public class PalindromeChecker {

//check if string is palindrome
public static boolean isPalindrome(String str) {
str = str.replaceAll("\\s+", "").toLowerCase();
int left = 0, right = str.length() - 1;
 while (left < right) {
 if (str.charAt(left) != str.charAt(right)) return false;
left++;
right--;
 }
return true;
}

//getting input from user
public static String getInput(Scanner sc) {
System.out.print("Enter a string: ");
return sc.nextLine();
}

// displaying result
public static void displayResult(String str, boolean result) {
if (result) System.out.println("\"" + str + "\" is a palindrome.");
else System.out.println("\"" + str + "\" is not a palindrome.");
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = getInput(sc);
boolean result = isPalindrome(input);
displayResult(input, result);
sc.close();
}
}
