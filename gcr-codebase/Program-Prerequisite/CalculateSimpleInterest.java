import java.util.Scanner;
//creating a class with name CalculateSimpleInterest 
public class CalculateSimpleInterest{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring the variable and reading input from the user 
double Principal, Rate, Time, Result;
System.out.println("Enter the Principal Amount");
Principal=input.nextDouble();
System.out.println("Enter the Rate");
Rate=input.nextDouble();
System.out.println("Enter the Time");
Time=input.nextDouble();

//calculating the Simple Interest value
Result=((Principal*Rate*Time)/100);

//Displaying the result
System.out.println("The resultant Simple Interest is "+Result);
input.close();
}
}