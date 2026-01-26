package examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * ExamResultUploader – Bulk Marks Processing
 */
public class ExamResultUploader<T> {

    // Map to store subject -> list of marks
    private Map<String, List<Integer>> subjectMarks = new HashMap<>();

    // Regex pattern: RollNo,Name,Subject,Marks (Marks: 0-100)
    private Pattern csvPattern = Pattern.compile("^(\\d+),([A-Za-z ]+),([A-Za-z ]+),(\\d{1,3})$");

    /**
     * Reads CSV file and stores marks
     */
    public void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                Matcher matcher = csvPattern.matcher(line);
                if (!matcher.matches()) {
                    throw new InvalidExamFormatException("Invalid format: " + line);
                }

                String rollNo = matcher.group(1);
                String name = matcher.group(2).trim();
                String subject = matcher.group(3).trim();
                int marks = Integer.parseInt(matcher.group(4));

                // store marks in map
                subjectMarks.putIfAbsent(subject, new ArrayList<>());
                subjectMarks.get(subject).add(marks);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("File reading error");
        } catch (InvalidExamFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Display all subject-wise marks
     */
    public void printMarks() {
        for (String subject : subjectMarks.keySet()) {
            System.out.println("Subject: " + subject);
            System.out.println("Marks: " + subjectMarks.get(subject));
        }
    }

    /**
     * Top scorer per subject using PriorityQueue
     */
    public void printTopScorers() {
        System.out.println("\nTop Scorers per Subject:");
        for (String subject : subjectMarks.keySet()) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(subjectMarks.get(subject));
            System.out.println(subject + " -> Top Marks: " + pq.peek());
        }
    }

    // Main
    public static void main(String[] args) {
        ExamResultUploader<String> uploader = new ExamResultUploader<>();
        uploader.readFile("marks.csv");  // CSV file
        uploader.printMarks();
        uploader.printTopScorers();
    }
}
