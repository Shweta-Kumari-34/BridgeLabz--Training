import java.util.Scanner;
//creating a class with name as RemoveDuplicatesCharacters
public class RemoveDuplicatesCharacters {

// Method to remove duplicates from a string
public static String removeDuplicates(String str) {
StringBuilder result = new StringBuilder();
// ASCII character set for storing the seen characters 
boolean[] seen = new boolean[256];  

for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (!seen[ch]) {
result.append(ch); // Add character if not seen before
seen[ch] = true;   // Mark character as seen
}
}

return result.toString();
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading input from user
System.out.print("Enter a string: ");
String input = sc.nextLine();

//calling method and storing the result
String output = removeDuplicates(input);

//displaying the result
System.out.println("String after removing duplicates: " + output);

sc.close();
}
}
