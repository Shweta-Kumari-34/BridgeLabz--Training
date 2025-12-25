import java.util.Scanner;
//creating a class with name as RemoveSpecificCharacter
public class RemoveSpecificCharacter {

public static String removeCharacter(String str, char chToRemove) {
return str.replace(String.valueOf(chToRemove), "");
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading input from user
System.out.print("Enter a string: ");
String text = input.nextLine();
System.out.print("Enter the character to remove: ");
char ch = input.next().charAt(0);

//displaying the result
String result = removeCharacter(text, ch);
System.out.println("Modified String is " + result);

input.close();
}
}
