import java.util.Scanner;

// Creating NumberChecker2 utility class
public class NumberChecker2 {

// Method to count digits in a number
public static int countDigits(int number) {
if (number == 0) return 1;
int count = 0;
int temp = Math.abs(number);
while (temp != 0) {
count++;
temp /= 10;
}
return count;
}

// Method to store digits of a number in an array
public static int[] storeDigits(int number) {
int n = countDigits(number);
int[] digits = new int[n];
int temp = Math.abs(number);
for (int i = n - 1; i >= 0; i--) {
digits[i] = temp % 10;
temp /= 10;
}
return digits;
}

// Method to find sum of digits
public static int sumOfDigits(int[] digits) {
int sum = 0;
for (int d : digits) sum += d;
return sum;
}

// Method to find sum of squares of digits
public static int sumOfSquares(int[] digits) {
int sum = 0;
for (int d : digits) sum += Math.pow(d, 2);
return sum;
}

// Method to check if number is Harshad number
public static boolean isHarshad(int number, int[] digits) {
int sum = sumOfDigits(digits);
if (sum == 0) return false; // prevent division by zero
return number % sum == 0;
}

// Method to find frequency of each digit
// Returns a 2D array: first column digit, second column frequency
public static int[][] digitFrequency(int[] digits) {
int[][] freq = new int[10][2];
for (int i = 0; i < 10; i++) {
freq[i][0] = i; // store digit
freq[i][1] = 0; // initialize frequency
}

for (int d : digits) {
freq[d][1]++;
}
 return freq;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

// Count digits
int count = countDigits(number);
System.out.println("Number of digits: " + count);

// Store digits in array
int[] digits = storeDigits(number);
System.out.print("Digits array: ");
for (int d : digits) System.out.print(d + " ");
System.out.println();

//calling and displaying the result
int sum = sumOfDigits(digits);
System.out.println("Sum of digits: " + sum);
int sumSquares = sumOfSquares(digits);
System.out.println("Sum of squares of digits: " + sumSquares);

// Check Harshad number
boolean harshad = isHarshad(number, digits);
System.out.println("Is Harshad number: " + harshad);

// Digit frequency
int[][] freq = digitFrequency(digits);
System.out.println("Digit\tFrequency");
for (int i = 0; i < freq.length; i++) {
if (freq[i][1] > 0) { // display only digits that appear
System.out.println(freq[i][0] + "\t" + freq[i][1]);
}
}

input.close();
}
}
