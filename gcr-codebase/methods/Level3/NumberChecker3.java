import java.util.Arrays;
//creating a class  with name as NumberChecker3
public class NumberChecker3 {

//Method to find count of digits
public static int countDigits(int num) {
int count = 0;
while (num > 0) {
count++;
num /= 10;  //remove last digit from number
}
return count;
}

//Method to store digits in array
public static int[] storeDigits(int num) {
int size = countDigits(num);
int[] digits = new int[size];

for (int i = size - 1; i >= 0; i--) {
digits[i] = num % 10;  //store last digit of number
num /= 10;
}
return digits;
}

// Method to reverse digits array
public static int[] reverseArray(int[] arr) {
int[] rev = new int[arr.length];
int j = 0;
for (int i = arr.length - 1; i >= 0; i--) {
rev[j++] = arr[i];
}
return rev;
}

//Compare two arrays
public static boolean areArraysEqual(int[] a, int[] b) {
if (a.length != b.length) return false;

for (int i = 0; i < a.length; i++) {
if (a[i] != b[i]) return false;
}
return true;
}

//Check Palindrome Number
public static boolean isPalindrome(int[] digits) {
int[] rev = reverseArray(digits);
return areArraysEqual(digits, rev);
}

//Check Duck Number ( contains zero but not at start)
public static boolean isDuckNumber(int[] digits) {
for (int i = 1; i < digits.length; i++) { // first digit cannot be zero
if (digits[i] == 0) return true;
}
return false;
    
}

public static void main(String[] args) {

int number = 1210; //declaring a number variable and initializing

System.out.println("Number: " + number);

int[] digits = storeDigits(number);
System.out.println("Digits are " + Arrays.toString(digits));
int[] reversed = reverseArray(digits);
System.out.println("Reversed Digits are " + Arrays.toString(reversed));
System.out.println("Is Palindrome: " + (isPalindrome(digits) ? "Yes" : "No"));
System.out.println("Is Duck Number: " + (isDuckNumber(digits) ? "Yes" : "No"));
}
}
