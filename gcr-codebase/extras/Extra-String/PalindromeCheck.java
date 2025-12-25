import java.util.Scanner;
//creating a class with name as PalindromeCheck
public class PalindromeCheck {

// Method to check if a string is palindrome
public static boolean isPalindrome(String str) {
 int left = 0;
int right = str.length() - 1;
// Compare characters from both ends
while (left < right) {
if (str.charAt(left) != str.charAt(right)) {
return false; // Not a palindrome
 }
 left++;
right--;
}
return true; // It's a palindrome
}

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  
//reading input from user      
System.out.print("Enter a string: ");
String input = sc.nextLine();

// Remove spaces and convert to lowercase for uniform checking
input = input.replaceAll("\\s+", "").toLowerCase();

//checking conditions and displaying the result
if (isPalindrome(input)) {
System.out.println("The string is a palindrome.");
} else {
System.out.println("The string is not a palindrome.");
}

sc.close();
}
}
