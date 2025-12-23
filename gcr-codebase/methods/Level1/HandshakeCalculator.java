import java.util.Scanner;
//Creating a method with name as HandshakeCalculator
//find maximum number of handshakes among students
public class HandshakeCalculator{
public static int handshakes(int numberOfStudents ) {
//formula = (n * (n - 1)) / 2 ;
int maxHandshakes = (numberOfStudents * (numberOfStudents-1))/2;
return maxHandshakes;
}

public static void main(String[]args){
Scanner input=new Scanner(System.in);

//reading user input 
System.out.println("Enter number Of Students  ");
int numberOfStudents =input.nextInt();

//calculating maximum number of handshakes
int result = handshakes( numberOfStudents );

//displaying output
System.out.println("The number of possible handshakes is " + result);
input.close();
}
}

