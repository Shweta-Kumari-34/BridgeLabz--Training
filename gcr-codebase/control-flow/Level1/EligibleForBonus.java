import java.util.Scanner;
//Creating a class with name as EligibleForBonus
public class EligibleForBonus{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input
System.out.println("Enter a employee salary ");
double salary = input.nextDouble();
System.out.println("Enter year of service ");
int year = input.nextInt();
double bonus=0;

//if service year greater than 5 eligible for bonus
if(year >5){
bonus =salary *0.05;
System.out.println("Bonus amount is " + bonus );
}
else {
System.out.println(" No Bonus amount " );
}
 input .close();
}
}
