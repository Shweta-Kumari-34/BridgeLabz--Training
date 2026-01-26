package feedbackgurutool;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class FeedbackGuru<T> {

    Map<String, List<T>> feedbackMap = new HashMap<>();

    FeedbackGuru() {
        feedbackMap.put("positive", new ArrayList<>());
        feedbackMap.put("neutral", new ArrayList<>());
        feedbackMap.put("negative", new ArrayList<>());
    }

    void readFeedbackFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            Pattern pattern = Pattern.compile("(\\d)/10");

            while ((line = br.readLine()) != null) {
          
            	try {
                    Matcher matcher = pattern.matcher(line);

                    if (matcher.find()) {
                        int rating = Integer.parseInt(matcher.group(1));
                        categorizeFeedback((T) line, rating);
                    }
                } catch (Exception e) {
                    System.out.println("invalid feedback skipped");
                }
            }

        } catch (IOException e) {
            System.out.println("file not found");
        }
    }

    void categorizeFeedback(T feedback, int rating) {
        if (rating >= 8)
            feedbackMap.get("positive").add(feedback);
        else if (rating >= 5)
            feedbackMap.get("neutral").add(feedback);
        else
            feedbackMap.get("negative").add(feedback);
    }

    void printSummary() {
        System.out.println("positive: " + feedbackMap.get("positive"));
        System.out.println("neutral: " + feedbackMap.get("neutral"));
        System.out.println("negative: " + feedbackMap.get("negative"));
    }

    public static void main(String[] args) {
        FeedbackGuru<String> fg = new FeedbackGuru<>();
        fg.readFeedbackFile("D:\\java file\\Feedback.txt");
        fg.printSummary();
    }
}

