import java.util.Scanner;
//Creating a class with name as Factorial 
//calculating the factorial of given number
public class Factorial{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
int factorial=1;
System.out.println("Enter the number ");
number=input.nextInt();

//first check the given number is positive or not
//calculating the factorial of number in while loop
//displaying the result
int count=number;
if(number>=0){
System.out.println("user enter positive number ");
while(count>=1){
factorial=factorial*count;
count--;
}
}
System.out.println("The factorial of " + number + " is " + factorial);
input.close();
}
}
