import java.util.Scanner;
//creating a class with name as NumberDivisible
//to check if the given number is divisible by 5?
public class NumberDivisible{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the variable with name as number and reading input from user
System.out.println("Enter the number ");
int number=input.nextInt();

//conditional Statement to check the divisibility of the number
//Displaying if the number is divisible by 5 0r not 
if(number%5==0){
System.out.println("Yes the given number is divisible by 5 ");
}
else {
System.out.println(" No the given number is not divisible by 5 ");
}
input.close();
}
}
