import java.util.Scanner;
//Creating a class with name as SumUntilZeroOrNegative
public class SumUntilZeroOrNegative{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

double total = 0.0;
double value ;

//while loop run until user enters 0 or neagtive
while( true){
System.out.println("Enter  a number 0 or negative to stop ");
value =input.nextDouble();
if (value <=0){
break;
}
total+=value;
}

//displaying result
System.out.println("Total value is " +total);
input.close();
}
}

