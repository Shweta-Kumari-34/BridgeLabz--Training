import java.util.Scanner;
//Creating a class with name as YoungestAndTallest
public class YoungestAndTallest{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input for Amar
System.out.println("Enter ages of Amar ");
int amarAge = input.nextInt();
System.out.println("Enter height of Amar ");
int amarHeight = input.nextInt();
//reading user input for Akbar
System.out.println("Enter ages of Akbar ");
int akbarAge = input.nextInt();
System.out.println("Enter height of Akbar ");
int akbarHeight = input.nextInt();
//reading user input for Anthony
System.out.println("Enter age of Anthony ");
int anthonyAge = input.nextInt();
System.out.println("Enter height of Anthony ");
int anthonyHeight = input.nextInt();
if( amarAge<akbarAge && amarAge<anthonyAge){
System.out.println("Amar is youngest among three ");
}
else if( akbarAge<amarAge && akbarAge<anthonyAge){
System.out.println("Akbar is youngest among three ");
}
else{
System.out.println("Anthony is youngest among three ");
}
if( amarHeight>akbarHeight && amarHeight>anthonyHeight){
System.out.println("Amar is tallest among three ");
}
else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight){
System.out.println("Akbar is tallest among three ");
}
else{
System.out.println("Anthony is tallest among three ");
input.close();
}
}
}



