import java.util.Scanner;
//creating  a class with name as BMIMultiDimensional
public class BMIMultiDimensional {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

// Input number of persons
System.out.print("Enter number of persons: ");
int n = input.nextInt();

//0 index-height, 1 index-weight, 2 index-status
 double[][] personData = new double[n][3];  
String[] weightStatus = new String[n];

// Input height and weight with validation
for (int i = 0; i < n; i++) {
System.out.println("Person " + (i + 1) + " ");

// Height input - must be positive
while (true) {
System.out.print("Enter height (meters): ");
personData[i][0] = input.nextDouble();
if (personData[i][0] > 0) break;
System.out.println("Height must be positive. Enter again.");
}

// Weight input - must be positive
while (true) {
System.out.print("Enter weight (kg): ");
personData[i][1] = input.nextDouble();
if (personData[i][1] > 0) break;
System.out.println("Weight must be positive. Enter again.");
}

// Calculate BMI = weight / (height^2)
personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
// Determine Weight Status based on BMI
double bmi = personData[i][2];

if (bmi < 18.5)
weightStatus[i] = "Underweight";
else if (bmi < 24.9)
weightStatus[i] = "Normal";
else if (bmi < 29.9)
weightStatus[i] = "Overweight";
else
weightStatus[i] = "Obese";
}

// Displaying the data
System.out.println(" BMI STATUS IS ");
System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");

for (int i = 0; i < n; i++) {
System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
}

input.close();
}
}
