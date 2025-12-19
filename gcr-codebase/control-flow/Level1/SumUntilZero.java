import java.util.Scanner;
//Creating a class with name as SumUntilZero
public class SumUntilZero{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//reading input from user
double total = 0.0;
double value ;
System.out.println("Enter  a number to stop enter 0 ");
value = input.nextDouble();

//while loop run until user enters 0
while( value !=0){
total+=value;
System.out.println("Enter  a number again  to stop enter 0");
value =input.nextDouble();
}

//displaying result
System.out.println("Total value is " +total);
input.close();
}
}

