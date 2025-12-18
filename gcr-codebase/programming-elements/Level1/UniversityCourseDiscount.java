//Creating a class with name as UniversityFeeDiscount 
import java.util.Scanner;
public class UniversityCourseDiscount{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring Variables, reading user input and calculating discount amount and final fee
System.out.println("Enter student fee ");
double fee=input.nextDouble();
System.out.println("Enter discount percentage ");
double discountPercent = input.nextDouble();
double discount=(fee *discountPercent ) /100;
double finalFee=fee-discount;

//displaying the result
System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
input.close();
}
}
