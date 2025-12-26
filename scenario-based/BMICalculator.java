import java.util.Scanner;
//creating a class with name as BMICalculator
public class BMICalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// reading input from user
System.out.print("Enter weight in kilograms: ");
double weight = input.nextDouble();

System.out.print("Enter height in meters: ");
double height = input.nextDouble();

// Calculating BMI using the formula
double bmi = weight / (height * height);
// Displaying the calculated BMI
System.out.println("Your BMI is: " + bmi);

// Checking BMI conditions and displaying the results
if (bmi < 18.5) {
System.out.println("Category: Underweight");
} else if (bmi >= 18.5 && bmi <= 24.9) {
System.out.println("Category: Normal");
} else {
System.out.println("Category: Overweight");
}

input.close();
}
}
