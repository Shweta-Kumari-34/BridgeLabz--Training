import java.util.Scanner;
//creating a class as ReverseNumber 
//find the digit of number in reversed manner
public class ReverseNumber{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Reading user input
System.out.println("Enter a number:");
int number = input.nextInt();

number = Math.abs(number); // handle negative numbers
int temp = number;
int count = 0;
//Find count of digits
if (temp == 0) {
count = 1;
} else {
while (temp != 0) {
count++;
temp = temp / 10;
}
}
//Store digits in array
int[] digits = new int[count];
temp = number;
int index = 0;
if (temp == 0) {
digits[index] = 0;
} else {
while (temp != 0) {
temp = temp / 10;
index++;
}
}
//Create reverse array
int[] reverse = new int[count];
for (int i = 0; i < count; i++) {
reverse[i] = digits[count - 1 - i];
}

//Displaying reversed number
System.out.print("Reversed number: ");
for (int i = 0; i < count; i++) {
System.out.print(reverse[i]);
}

input.close();
}
}
