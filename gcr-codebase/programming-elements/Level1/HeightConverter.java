
//Creating a class with name as HeightConverter 
import java.util.Scanner;
public class HeightConverter{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//Declaring Variables, reading user input 
System.out.println("Enter your height in centimeters ");
double height = input.nextDouble();
//coonverting  cm to total inches
double totalInches = height /2.54;
//1 foot = 12 inches
int feet = (int) (totalInches / 12);
//calculating remaining inches
double heightInches = totalInches % 12 ;


//displaying the result
System.out.println(" Your Height in cm is " + height  +" while in feet is " + feet + " and inches is " + heightInches);
input.close();
}
}
