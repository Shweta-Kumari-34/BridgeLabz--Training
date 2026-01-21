package questions.votingsystem;

import java.util.*;

public class VotingSystem {

    Map<String, Integer> voteMap = new HashMap<>();           // Store votes quickly
    Map<String, Integer> linkedVoteMap = new LinkedHashMap<>(); // Maintain insertion order

    // Cast a vote
    public void castVote(String candidate) {
        // Update HashMap
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap
        linkedVoteMap.put(candidate, linkedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    // Display results from HashMap unordered
    public void displayVotesHashMap() {
        System.out.println("Votes (HashMap - unordered):");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display votes in order of casting LinkedHashMap
    public void displayVotesLinkedHashMap() {
        System.out.println("Votes (LinkedHashMap - insertion order):");
        for (Map.Entry<String, Integer> entry : linkedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display votes in sorted order TreeMap
    public void displayVotesTreeMap() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        System.out.println("Votes (TreeMap - sorted by candidate):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display winner
    public void displayWinner() {
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}

