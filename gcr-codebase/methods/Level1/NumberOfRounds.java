
import java.util.Scanner;
//Creating a class with name as NumberOfRounds
public class NumberOfRounds {
//calculate number of rounds 
public static double totalRound(double perimeter) {
double rounds = 5000 / perimeter;
return rounds;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter 1st triangle side in meters");
double side1 = input.nextDouble();
System.out.println("Enter 2nd triangle side in meters");
double side2 = input.nextDouble();
System.out.println("Enter 3rd triangle side in meters");
double side3 = input.nextDouble();

//calculating the perimeter of triangle
double perimeter = side1 +side2 + side3; 
double ans = totalRound(perimeter);

// displaying output
System.out.println("The number of rounds is " + ans);

input.close();
}
}


