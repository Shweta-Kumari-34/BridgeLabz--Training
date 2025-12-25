import java.util.Arrays;
//Creating a class with name as EmployeeBonus
public class EmployeeBonus {

// Method to generate salaries and years of service for 10 employees
public static int[][] generateEmployeeData(int numEmployees) {
int[][] employeeData = new int[numEmployees][2]; 
// Column 0: Salary, Column 1: Years of Service
for (int i = 0; i < numEmployees; i++) {
// Random 5-digit salary (10000 to 99999)
employeeData[i][0] = (int)(Math.random() * 90000) + 10000;
// Random years of service (1 to 10)
employeeData[i][1] = (int)(Math.random() * 10) + 1;
}
return employeeData;
}

// Method to calculate new salary and bonus
public static double[][] calculateNewSalaryAndBonus(int[][] data) {
double[][] result = new double[data.length][2];
 // Column 0: New Salary, Column 1: Bonus
for (int i = 0; i < data.length; i++) {
 int salary = data[i][0];
int years =data[i][1];
double bonusPercent = (years > 5) ? 0.05 : 0.02;
double bonus = salary * bonusPercent;
double newSalary = salary + bonus;
result[i][0] = newSalary;
result[i][1] = bonus;
}
return result;
}

// Method to calculate totals and display table
public static void displayResults(int[][] oldData, double[][] newData) {
double totalOldSalary = 0;
double totalNewSalary = 0;
double totalBonus = 0;

System.out.println("Employee\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

for (int i = 0; i < oldData.length; i++) {
int oldSalary = oldData[i][0];
int years = oldData[i][1];
double bonus = newData[i][1];
double newSalary = newData[i][0];

totalOldSalary += oldSalary;
totalNewSalary += newSalary;
totalBonus += bonus;

System.out.printf("%d\t\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
 }

        System.out.println("---------------------------------------------------------------");
System.out.printf("Total\t\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
}

// Main method
public static void main(String[] args) {
int numEmployees = 10;

// Generate salaries and years of service
int[][] employeeData = generateEmployeeData(numEmployees);

// Calculate new salary and bonus
double[][] newData = calculateNewSalaryAndBonus(employeeData);

//method calling  to displaying the result
displayResults(employeeData, newData);
}
}
