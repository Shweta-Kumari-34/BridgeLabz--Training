import java.util.Scanner;
//Creating a class with name as CheckSmallestNumber
//to check the samllest number among three
public class CheckSmallestNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring variables and reading input from the user
int number1, number2,number3;
System.out.println("Enter the number1 value ");
number1=input.nextInt();
System.out.println("Enter the number2 value ");
number2=input.nextInt();
System.out.println("Enter the number3 value ");
number3=input.nextInt();

//Checking condition to find the smallest number among three
//And Displaying if number1 is smallest among three    
if( number1<number2 && number1 <number3){
System.out.println("Yes the number1 is the smallest among three ");
}else {
System.out.println("No the number1 is  not the smallest among three ");
}
 input.close();
}
}


