import java.util.Scanner;
//creating a class with name as CountVowelAndConsonant
public class CountVowelAndConsonant {

    // Method to check whether a character is vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    // array index 0 store vowel count, index 1 store consonant count
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Counting vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("\nVowel count: " + result[0]);
        System.out.println("Consonant count: " + result[1]);

        sc.close();
    }
}
