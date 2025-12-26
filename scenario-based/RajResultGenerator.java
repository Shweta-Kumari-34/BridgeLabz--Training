import java.util.Scanner;
//creating a class with name as RajResultGenerator
public class RajResultGenerator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int total = 0;
int marks;

// reading mark using for loop
for (int i = 1; i <= 5; i++) {
System.out.print("Enter marks for subject " + i + ": ");
marks = input.nextInt();
total += marks;
}

double average = total / 5.0;
System.out.println("\nAverage Marks: " + average);

// Assign grade using switch
char grade;

switch ((int) average / 10) {
case 10:
case 9: grade = 'A'; break;
case 8: grade = 'B'; break;
case 7: grade = 'C'; break;
case 6: grade = 'D'; break;
default: grade = 'F';
}

System.out.println("Grade: " + grade);
input.close();
}
}
