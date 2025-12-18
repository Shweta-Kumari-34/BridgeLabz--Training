import java.util.Scanner;
//Creating a class with name as SquareSide
public class SquareSide{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//taking user input
System.out.println("Enter perimeter of square ");
double perimeter =input.nextDouble();

//square perimeter =4*side;
double side= perimeter /4;

//displaying result
System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
input.close();
}
}
