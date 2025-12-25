import java.util.Scanner;
//creating a class with name as SubstringOccurrences
public class SubstringOccurrences {

//method to count the occurrence of substring 
public static int countOccurrences(String str, String sub) {
int index = 0;
int count=0;
//while loop runs till substring contain in string
while ((index = str.indexOf(sub, index)) != -1) {
count++;
index += sub.length(); // Move past this occurrence
}

return count;
}

public static void main(String []args){
Scanner input = new Scanner(System.in);

//reading the user input
System.out.println("Enter the main string ");
String mainStr = input.nextLine();
System.out.print("Enter the substring to search: ");
String subString = input.nextLine();

//calling the method and storing the result
int occurrences = countOccurrences(mainStr, subString);

//displaying the result 
System.out.println("The substring occurs " + occurrences + " times.");

input.close();
}
}
