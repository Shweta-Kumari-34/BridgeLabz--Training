import java.util.Scanner;
//creating a class with name as EmployeeBonus 
public class EmployeeBonus {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
int n = 10;
double[] salary = new double[n];
int[] years = new int[n];
double[] bonus = new double[n];
double totalBonus = 0;
double totalOldSalary = 0;
double totalNewSalary = 0;

//reading positive value from user
for( int i = 0;i<n;i++) {
System.out.println("Employee " + (i + 1) + " salary");
salary[i] = input.nextInt();
System.out.println("Employee " + (i + 1) + " year of service");
years[i] = input.nextInt();

if (salary[i] <= 0 || years[i] < 0) {
System.out.println("Enter again");
i--;
continue;
 }

//calculating the bonus amount and storing 
if (years[i] > 5) {
bonus[i] = salary[i] * 0.05;
} else {
bonus[i] = salary[i] * 0.02;
}
//calculating values
totalBonus += bonus[i];
totalOldSalary += salary[i];
totalNewSalary += salary[i] + bonus[i];
}

//displaying the result
System.out.println("Total bonus payout is " + totalBonus);
System.out.println("The total old salary " + totalOldSalary);
System.out.println("The total new salary " + totalNewSalary);

input.close();
    }
}
