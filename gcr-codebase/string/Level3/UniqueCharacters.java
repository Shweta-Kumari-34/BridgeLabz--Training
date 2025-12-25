import java.util.Scanner;
//creating a class with name as UniqueCharacters
public class UniqueCharacters {

// Method to find the length of a string without using length()
public static int getLength(String str) {
int count = 0;
try {
 while (true) {
str.charAt(count); // will throw exception when index exceeds
count++;
}
} catch (StringIndexOutOfBoundsException e) {
// End of string reached
}
return count;
}

// find unique characters in a string using charAt()
public static char[] findUniqueCharacters(String str) {
int len = getLength(str);
char[] unique = new char[len]; // temporary array to store unique chars
int uniqueCount = 0;

for (int i = 0; i < len; i++) {
char current = str.charAt(i);
boolean isUnique = true;

// Check if current character already exists in unique array
for (int j = 0; j < uniqueCount; j++) {
if (unique[j] == current) {
isUnique = false;
 break;
 }
}

// If unique, add to array
if (isUnique) {
unique[uniqueCount] = current;
uniqueCount++;
}
}

// Create an array of exact size to return
char[] result = new char[uniqueCount];
for (int i = 0; i < uniqueCount; i++) {
result[i] = unique[i];
}

return result;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//reading user input
System.out.print("Enter a string: ");
String input = sc.nextLine();

//calling method and storing the result
char[] uniqueChars = findUniqueCharacters(input);

//displaying the result
System.out.print("Unique characters are: ");
for (char c : uniqueChars) {
System.out.print(c + " ");
}

  sc.close();
 }
}
