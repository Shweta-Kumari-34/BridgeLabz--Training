import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//creating a class with name as MostFrequentCharacter
public class MostFrequentCharacter {

public static char findMostFrequentChar(String str) {
//map store the frequency of each character
Map<Character, Integer> frequencyMap = new HashMap<>();
        
// Count frequency of each character and store in map datastructure
for (char ch : str.toCharArray()) {
frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
}

char mostFrequent = str.charAt(0);
int maxCount = 0;

// Find character with maximum frequency
for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
if (entry.getValue() > maxCount) {
maxCount = entry.getValue();
mostFrequent = entry.getKey();
 }
}

return mostFrequent;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//reading user input
System.out.print("Enter a string: ");
String input = sc.nextLine();

//displaying the result
char result = findMostFrequentChar(input);
System.out.println("Most Frequent Character: '" + result + "'");

sc.close();
}
}
