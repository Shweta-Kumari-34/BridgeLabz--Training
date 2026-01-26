package messagingpatternanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * ChatLogParser – reads logs, extracts messages, filters idle chat
 */
public class ChatLogParser {

    // Map user → list of messages
    private Map<String, List<String>> chatMap = new TreeMap<>(); // TreeMap = sorted users

    // Keywords to filter out "idle chat"
    private List<String> idleKeywords = Arrays.asList("lol", "brb", "ttyl");

    // Regex to extract timestamp, user, message
    private Pattern logPattern = Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    // Reads chat log file
    public void readLogs(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {

                Matcher matcher = logPattern.matcher(line);
                if (matcher.matches()) {
                    String timestamp = matcher.group(1); // not used, but could be
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                    // filter idle messages
                    if (isIdleMessage(message)) continue;

                    chatMap.putIfAbsent(user, new ArrayList<>());
                    chatMap.get(user).add(message);
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    // Checks for idle chat
    private boolean isIdleMessage(String msg) {
        for (String keyword : idleKeywords) {
            if (msg.toLowerCase().contains(keyword)) return true;
        }
        return false;
    }

    // Generic filter method
    public <T> void filterMessages(MessageFilter<T> filter) {
        for (Map.Entry<String, List<String>> entry : chatMap.entrySet()) {
            List<String> filtered = new ArrayList<>();
            for (String msg : entry.getValue()) {
                if (filter.filter((T) msg)) { // unchecked cast for simplicity
                    filtered.add(msg);
                }
            }
            entry.setValue(filtered);
        }
    }

    // Print messages per user
    public void printChats() {
        for (String user : chatMap.keySet()) {
            System.out.println("User: " + user);
            for (String msg : chatMap.get(user)) {
                System.out.println("  " + msg);
            }
        }
    }

    // Main
    public static void main(String[] args) {
        ChatLogParser parser = new ChatLogParser();
        parser.readLogs("D:\\java file\\MeethingChat.txt");

        // Example: filter messages containing "build"
        parser.filterMessages(msg -> ((String) msg).toLowerCase().contains("build"));

        parser.printChats();
    }
}

