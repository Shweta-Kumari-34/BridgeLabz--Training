import java.util.Arrays;
//creating a class with name as NumberChecker1
public class NumberChecker1 {

// Method to count digits in a number
public static int countDigits(int num) {
int count = 0, temp = num;
while (temp > 0) {
count++;
temp /= 10;    //remove last digit
}
return count;
}

//Store digits of number in array
public static int[] storeDigits(int num) {
int count = countDigits(num);
int[] digits = new int[count];
int index = count - 1;

while (num > 0) {
digits[index--] = num % 10;
num /= 10;
}
return digits;
}

//Check Duck number (contains zero but not starting with zero)
public static boolean isDuckNumber(int[] digits) {
for (int i = 1; i < digits.length; i++) { // skip first digit
if (digits[i] == 0)
return true;
}
return false;
}

// Check Armstrong number
public static boolean isArmstrong(int[] digits) {
int power = digits.length;
int sum = 0;

for (int d : digits) {
sum += Math.pow(d, power);
}

int number = 0;
for (int d : digits) number = number * 10 + d;

return sum == number;
}

// Largest and second largest
public static void findLargestAndSecondLargest(int[] digits) {
int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

for (int d : digits) {
if (d > max1) {
max2 = max1;
max1 = d;
} else if (d > max2 && d != max1) {
max2 = d;
}
}

System.out.println("Largest is : " + max1 + ", Second Largest is : " + max2);
}

// Smallest and second smallest
public static void findSmallestAndSecondSmallest(int[] digits) {
int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

for (int d : digits) {
if (d < min1) {
min2 = min1;
min1 = d;
} else if (d < min2 && d != min1) {
min2 = d;
}
}

System.out.println("Smallest is : " + min1 + ", Second Smallest is : " + min2);
}


public static void main(String[] args) {

int num = 153;  //initializing the number

System.out.println("Number: " + num);

int count = countDigits(num);
System.out.println("Digit Count is : " + count);
int[] digits = storeDigits(num);
System.out.println("Digits Array: " + Arrays.toString(digits));
System.out.println(" Is a Duck Number: " + (isDuckNumber(digits) ? "Yes" : "No"));
System.out.println(" Is an Armstrong Number: " + (isArmstrong(digits) ? "Yes" : "No"));

findLargestAndSecondLargest(digits);
findSmallestAndSecondSmallest(digits);
}
}
