package smarthospitalinventorytracker;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    // Answer key
    String[] answerKey = {"A", "B", "C", "D", "A", "B", "C"};

    // Store student scores
    Map<String, Integer> scoreMap = new HashMap<>();

    // Priority queue to sort descending
    PriorityQueue<Map.Entry<String, Integer>> rankQueue =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

    // Read CSV file
    void readFile(String fileName) {
        Pattern validLine = Pattern.compile("^[A-Za-z ]+,([A-D],){6}[A-D]$");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {

                if (!validLine.matcher(line).matches()) {
                    System.out.println("Invalid format: " + line);
                    continue;
                }

                String[] data = line.split(",");
                String name = data[0].trim();
                int score = 0;

                for (int i = 1; i < data.length; i++) {
                    if (data[i].equals(answerKey[i - 1])) {
                        score++;
                    }
                }

                scoreMap.put(name, score);
            }
        } catch (IOException e) {
            System.out.println("File error");
        }
    }

    // Sort scores
    void sortResults() {
        rankQueue.addAll(scoreMap.entrySet());
    }

    // Print results
    void printResult() {
        while (!rankQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = rankQueue.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Main
    public static void main(String[] args) {
        ExamScanner scanner = new ExamScanner();
        scanner.readFile("D:\\java file\\ExamScanner.csv");
        scanner.sortResults();
        scanner.printResult();
    }
}

