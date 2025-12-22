import java.util.Scanner;
//creating the class as DigitFrequency 
public class DigitFrequency {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//reading user input
System.out.println("Enter number  ");
int num = input.nextInt();
int temp = num;
int count = 0;

// Count number of digits
while (temp > 0) {
count++;
temp = temp / 10;
}

int[] digits = new int[count];
temp = num;
int index = 0;
// Store digits
while (temp > 0) {
digits[index] = temp % 10;
temp = temp / 10;
index++;
}
int[] freq = new int[10];
// Calculate frequency
for (int i = 0; i < digits.length; i++) {
freq[digits[i]]++;
}

 System.out.println("Frequency of each digit is ");
// Printing frequency of digit  of number
for (int i = 0; i < freq.length; i++) {
if (freq[i] != 0) {
System.out.println("Digit " + i + " occurs " + freq[i] + " times");
}
}

input.close();
}
}
