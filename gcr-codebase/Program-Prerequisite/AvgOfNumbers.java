import java.util.Scanner;
public class AvgOfNumbers{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
double first,second,third, result;
System.out.println("Enter the value of the First number");
first=input.nextDouble();
System.out.println("Enter the value of the Second number");
second=input.nextDouble();
System.out.println("Enter the value of the Third number");
third=input.nextDouble();
result=(first+second+third)/3; 
System.out.println("The Resultant Average Of Three Numbers is "+result);
}
}