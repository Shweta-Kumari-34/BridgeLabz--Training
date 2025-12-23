import java.util.Scanner;
//Creating a class with name as TrigonometricFunctions
public class TrigonometricFunctions {

//Method to calculate sine, cosine and tangent
public static double[] calculateTrigonometricFunctions(double angle) {

//Convert angle from degrees to radians
double radians = Math.toRadians(angle);
double sine = Math.sin(radians);
double cosine = Math.cos(radians);
double tangent = Math.tan(radians);

return new double[] { sine, cosine, tangent };
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Reading angle from user
System.out.println("Enter angle in degrees:");
double angle = input.nextDouble();

// Calling the method to calculate Trigonometric Functions
double [] result = calculateTrigonometricFunctions( angle);

//displaying the result
System.out.println("The sine value is "+result[0]);
System.out.println("The cosine value is "+result[1]);
System.out.println("The tangent value is "+result[2]);

input.close();
}
}