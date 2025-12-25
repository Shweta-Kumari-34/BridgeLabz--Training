import java.util.Scanner;
//creating a class with name as ReverseString
public class ReverseString {

//reverse string 
 public static String reverse(String text) {
String rev = "";

for (int i = text.length() - 1; i >= 0; i--) {
rev = rev + text.charAt(i);   // adding characters in reverse order
}
return rev;
}

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a string: ");
String string = input.nextLine();
String reversed = reverse(string);

//displaying the results
System.out.println("Reversed String: " + reversed);

input.close();
}
}


