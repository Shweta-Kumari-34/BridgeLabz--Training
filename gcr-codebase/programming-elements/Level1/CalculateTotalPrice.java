import java.util.Scanner;
//Creating a class with name as CalculateTotalPrice
public class CalculateTotalPrice{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input 
System.out.println("Enter unit price ");
float unitPrice =input.nextFloat();
System.out.println("Enter quantity ");
int quantity =input.nextInt();

//calculating total price
float totalPrice = unitPrice * quantity ;

//displaying output
System.out.println("The total purchase price is INR " + totalPrice +  " if the quantity " + quantity + " and unit price is INR " + unitPrice );
input.close();
}
}

