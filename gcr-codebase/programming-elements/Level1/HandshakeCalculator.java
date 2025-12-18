import java.util.Scanner;
//Creating a class with name as HandshakeCalculator
public class HandshakeCalculator{
public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input 
System.out.println("Enter number Of Students  ");
int numberOfStudents =input.nextInt();

//calculating maximum number of handshakes
//formula = (n * (n - 1)) / 2 
int maxHandshakes = (numberOfStudents * (numberOfStudents-1))/2;

//displaying output
System.out.println("The number of possible handshakes is " + maxHandshakes );
input.close();
}
}

