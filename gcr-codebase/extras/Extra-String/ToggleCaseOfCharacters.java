import java.util.Scanner;
//creating a class with name as ToggleCaseOfCharacters
//to toggle uppercase to lowercase and viceversa
public class ToggleCaseOfCharacters{
public static String charactersToggle( String text){
StringBuilder ans = new StringBuilder();

for( int i=0;i<text.length();i++){
char ch =text.charAt(i);

if (Character.isUpperCase(ch)) {
ans.append(Character.toLowerCase(ch));
} 
else if (Character.isLowerCase(ch)) {
ans.append(Character.toUpperCase(ch));
}
 else {
ans.append(ch); // Non-alphabetic characters remain unchanged
}
}
return ans.toString();
}

public static void main(String []args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter the string word ");
String str= input.next();

//calling the method and storing the ans
String ans= charactersToggle( str);

//Displaying the result
System.out.println("After toggle case of characters the word is "+ans);
input.close();
}
}
