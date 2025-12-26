import java.util.Scanner;
//creatingf a class with name as FindBMI
public class FindBMI {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Input number of persons
System.out.print("Enter number of persons: ");
int n = input.nextInt();

double[] height = new double[n];  // in meters
double[] weight = new double[n];  // in kg
double[] bmi = new double[n];
String[] status = new String[n];

// Input height and weight for each person
 for (int i = 0; i < n; i++) {
System.out.println(" Person " + (i + 1) +":");
System.out.print("Enter height in meters: ");
height[i] = input.nextDouble();

System.out.print("Enter weight in kg: ");
weight[i] = input.nextDouble();

// Calculating BMI
bmi[i] = weight[i] / (height[i] * height[i]);

 // checking the condition and storing the status
if (bmi[i] < 18.5)
status[i] = "Underweight";
else if (bmi[i] < 24.9)
status[i] = "Normal";
else if (bmi[i] < 29.9)
 status[i] = "Overweight";
else
status[i] = "Obese";
}

// Displaying the results
System.out.println("BMI STATUS IS ");
System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");

for (int i = 0; i < n; i++) {
System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmi[i], status[i]);
}

        
input.close();
}
}
