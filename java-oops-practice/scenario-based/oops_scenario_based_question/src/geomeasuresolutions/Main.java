package geomeasuresolutions;

/*
 * You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.
 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("====================================================");
		System.out.println("Welcome To GeoMeasure Solutions App");
		System.out.println("Please enter the co-ordinate of two line segments");
		System.out.println("Enter the co-ordinate of line first:");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		double x2 = input.nextInt();
		double y2 = input.nextInt();
		
		double length1 = LineSegmentComparison.calculateLength1(x1, y1, x2, y2);
		
		System.out.println("Enter the co-ordinate of line second:");
		double a1 = input.nextInt();
		double b1 = input.nextInt();
		double a2 = input.nextInt();
		double b2 = input.nextInt();
		double length2 = LineSegmentComparison.calculateLength2(a1, b1, a2, b2);

		LineSegmentComparison.lineComparision(length1, length2);
		System.out.println("Thank You!!!");
		System.out.println("Visit Again");
		
		System.out.println("====================================================");

	}

}
