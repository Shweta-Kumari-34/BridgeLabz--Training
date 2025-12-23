import java.util.Scanner;
import java.util.Arrays;
//creating a class with name as OTPGenerator
public class OTPGenerator {

// Method to generate a 6-digit OTP
public static int generateOTP() {
return (int)(Math.random() * 900000) + 100000; //digits lies (100000 to 999999)
}

// Method to check if array of OTPs is unique
public static boolean areOTPsUnique(int[] otps) {
for (int i = 0; i < otps.length; i++) {
for (int j = i + 1; j < otps.length; j++) {
if (otps[i] == otps[j]) return false;
}
}
return true;
}

// Main method
public static void main(String[] args) {

int[] otpArray = new int[10];

// Generate 10 OTP numbers
for (int i = 0; i < otpArray.length; i++) {
otpArray[i] = generateOTP();
}

// Displaying generated OTPs
System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

// Check uniqueness
boolean unique = areOTPsUnique(otpArray);
if (unique) {
System.out.println("All OTPs are unique.");
} else {
 System.out.println("Some OTPs are repeated. Regenerate OTPs.");
}
}
}
