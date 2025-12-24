import java.util.Scanner;
//creating a class with name as CharArrayComparison
public class CharArrayComparison {
//Method to return characters of a string using charAt()

public static char[] getCharactersUsingCharAt(String text) {
char[] chars = new char[text.length()];
for (int i = 0; i < text.length(); i++) {
chars[i] = text.charAt(i);
}
return chars;
}

// Method to compare two character arrays
public static boolean compareCharArrays(char[] arr1, char[] arr2) {
if (arr1.length != arr2.length) {
return false;     //if length are different
}

for (int i = 0; i < arr1.length; i++) {
if (arr1[i] != arr2[i]) {
return false;   //if both character are different
}
}
return true;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter the text: ");
String text = input.next();

//calling User-defined method and storing the result
char[] userChars = getCharactersUsingCharAt(text);

//calling Built-in method and storing the result
char[] builtInChars = text.toCharArray();

// Comparing both arrays
boolean result = compareCharArrays(userChars, builtInChars);

// Displaying characters
System.out.print("Characters using user-defined method are ");
for (char c : userChars) {
System.out.print(c + " ");
}
System.out.println();

System.out.print("Characters using toCharArray() are ");
for (char c : builtInChars) {
System.out.print(c + " ");
}
System.out.println();

// Displaying the result
if(result){
System.out.println("Both string character are equal: " + result);
}else{
System.out.println("Both string character are  different: "+result);
}

input.close();
}
}
