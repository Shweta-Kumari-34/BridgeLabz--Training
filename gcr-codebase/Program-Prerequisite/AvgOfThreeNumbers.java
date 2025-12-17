import java.util.Scanner;
//creating a class with name AvgOfThreeNumbers
public class AverageOfThreeNumbers{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring variable and reading the value from user
double first,second,third, result;
System.out.println("Enter the value of the First number");
first=input.nextDouble();
System.out.println("Enter the value of the Second number");
second=input.nextDouble();
System.out.println("Enter the value of the Third number");
third=input.nextDouble();

//calculating the average of three numbers
result=(first+second+third)/3; 

//Displaying the result
System.out.println("The Resultant Average Of Three Numbers is "+result);
}
}