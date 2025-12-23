import java.util.Scanner;

// Creating class with name as Quadratic
public class Quadratic {
// Method to find roots of quadratic equation
// Returns an array of roots
public static double[] findRoots(double a, double b, double c) {

// Calculate delta (discriminant)
double delta = Math.pow(b, 2) - (4 * a * c);
//If delta is negative, return empty array
if (delta < 0) {
return new double[0];
}

// If delta is zero, only one root
if (delta == 0) {
double root = -b / (2 * a);
return new double[]{root};
}

// If delta is positive, two roots
double root1 = (-b + Math.sqrt(delta)) / (2 * a);
double root2 = (-b - Math.sqrt(delta)) / (2 * a);
return new double[]{root1, root2};
}

// Main method
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input values
System.out.print("Enter value of a: ");
double a = input.nextDouble();
System.out.print("Enter value of b: ");
double b = input.nextDouble();
System.out.print("Enter value of c: ");
double c = input.nextDouble();

// Calling method to find roots
double[] roots = findRoots(a, b, c);

// Displaying result
if (roots.length == 0) {
System.out.println("No real roots Delta is negative.");
} else if (roots.length == 1) {
System.out.println("Only one root: " + roots[0]);
} else {
System.out.println("Root 1: " + roots[0]);
System.out.println("Root 2: " + roots[1]);
}
input.close();
}
}
