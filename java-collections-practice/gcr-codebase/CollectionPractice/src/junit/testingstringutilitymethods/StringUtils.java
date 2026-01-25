package junit.testingstringutilitymethods;

public class StringUtils {

	// Method to reverse a string
	public String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	// Method to check if a string is palindrome
	public boolean isPalindrome(String str) {
		String reversed = reverse(str);
		return str.equals(reversed);
	}

	// Method to convert string to uppercase
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
