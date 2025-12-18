import java.util.Scanner;
//Creating a class with name as SumOf NaturalNumber
//to calculate the sum of n natural number using formula n*(n+1)/2
public class SumOfNaturalNumber{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
double number, sum;
System.out.println("Enter the number ");
number=input.nextDouble();

//first check the given number is natural or not
//then calculating the sum of n natural number 
//displaying the result
if( number >=0){
sum=number*(number+1)/2;
System.out.println("The sum of "+number+" natural number is "+sum);
}
else {
System.out.println("The number "+number+"is not a natural number ");
}
input.close();
}
}




