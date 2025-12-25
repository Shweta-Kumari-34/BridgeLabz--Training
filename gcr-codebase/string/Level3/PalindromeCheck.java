import java.util.Scanner;
//creating a class with name as PalindromeCheck
public class PalindromeCheck {

    // Logic 1: Check using loop (start and end comparison)
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using Recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;                      // reached middle
        if (text.charAt(start) != text.charAt(end)) return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text) {
        char[] rev = new char[text.length()];
        int j = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[j++] = text.charAt(i);
        }
        return rev;
    }

    // Logic 3: Compare using character arrays
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i])
                return false;
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); 
        // removes spaces and ignores case (optional, you may remove if teacher expects exact match)

        System.out.println("\nChecking Palindrome...\n");

        System.out.println("Logic 1 (Loop): " + (isPalindromeLoop(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursion): " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Array Compare): " + (isPalindromeCharArray(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
