import java.util.Scanner;
//Creating a class with name as SmallestLargest
//finding the smallest and largest among three number
public class SmallestLargest{
public static int[] findSmallestAndLargest(int number1, int number2, int number3){
int smallest, largest;

//checking the condition to find the smallest and largest
if(number1 >= number2 && number1 >= number3){
largest= number1;
}
else if(number2 >= number1 && number2 >= number3){
largest = number2;
}
else {
 largest = number3;
}

if(number1 <= number2 && number1 <= number3){
smallest = number1;
}
else if(number2 <= number1 && number2 <= number3){
 smallest = number2;
}
else {
smallest = number3;
}
return new int[]{ smallest, largest } ;
}

public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring variables and reading input from the user
int number1, number2, number3;
System.out.println("Enter the first number value ");
number1=input.nextInt();
System.out.println("Enter the second number value ");
number2=input.nextInt();
System.out.println("Enter the third number value ");
number3=input.nextInt();

  
//calling the method 
int []ans= findSmallestAndLargest( number1, number2, number3);

//displaying result 
System.out.println(" smallest " + ans[0]);
System.out.println("Largest " + ans[1]  ); 
input.close();
}
}

