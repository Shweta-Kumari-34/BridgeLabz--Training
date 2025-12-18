import java.util.Scanner;
//Creating a class with name as CheckLargestNumber
//to check the largest number among three
public class CheckLargestNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring variables and reading input from the user
double number1, number2, number3;
System.out.println("Enter the first number value ");
number1=input.nextDouble();
System.out.println("Enter the second number value ");
number2=input.nextDouble();
System.out.println("Enter the third number value ");
number3=input.nextDouble();

//Checking condition to find the largest number among three
//And Displaying which is the largest among three    
if(number1>number2 && number1>number3){
System.out.println("The first number is the largest ");
}
else if(number2>number1 && number2 > number3){
System.out.println("The second number is the largest ");
}
else {
System.out.println("The third number is the largest ");
}
input.close();
}
}





