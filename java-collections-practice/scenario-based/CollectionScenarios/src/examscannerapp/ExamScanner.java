package examscannerapp;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class ExamScanner<T> {

    Map<String, Integer> scoreMap = new HashMap<>();
    PriorityQueue<Map.Entry<String, Integer>> rankQueue =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

    // Answer key
    String[] answerKey = {"A", "B", "C", "D", "A", "B", "C"};

    void readFile(String fileName) {
        // Regex to validate line: name with letters & spaces, exactly 7 answers A-D
        Pattern validLine = Pattern.compile("^[A-Za-z ]+,(?:[A-D],){6}[A-D]$");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Trim whitespace at start/end
                line = line.trim();

                if (!validLine.matcher(line).matches()) {
                    System.out.println("invalid format: " + line);
                    continue;
                }

                String[] data = line.split(",");
                String studentName = data[0];
                int score = 0;

                for (int i = 1; i < data.length; i++) {
                    if (data[i].equals(answerKey[i - 1])) {
                        score++;
                    }
                }

                scoreMap.put(studentName, score);
            }

        } catch (Exception e) {
            System.out.println("file error: " + e.getMessage());
        }
    }

    void sortResults() {
        rankQueue.addAll(scoreMap.entrySet());
    }

    void printResult() {
        System.out.println("\n--- Exam Results ---");
        while (!rankQueue.isEmpty()) {
            Map.Entry<String, Integer> entry = rankQueue.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ExamScanner<String> scanner = new ExamScanner<>();
        scanner.readFile("D:\\java file\\file.csv");
        scanner.sortResults();
        scanner.printResult();
    }
}


