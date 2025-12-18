import java.util.Scanner;
//Creating a class with name as NaturalNumberSum
//to calculate the sum of n natural number using formula n*(n+1)/2 as well as while loop
public class NaturalNumberSum{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the Variables and reading input from user
int number;
double sum1=0.0;
double sum2=0.0;
System.out.println("Enter the number ");
number=input.nextInt();
int n=number;

//first check the given number is natural or not
//then calculating the sum of n natural number using both ways
//comparing the sum1 and sum2 result and displaying the result
if(number>=0){
sum1=number*(number+1)/2;

while( number >=0){
sum2=sum2+number;
number--;
}
}
if(sum1==sum2){
System.out.println("The sum of "+n+" natural number is "+sum1);
}
input.close();
}
}


