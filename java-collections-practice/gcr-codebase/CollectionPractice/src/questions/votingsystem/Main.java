package questions.votingsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        // Simulate votes
        voting.castVote("Alice");
        voting.castVote("Bob");
        voting.castVote("Alice");
        voting.castVote("Charlie");
        voting.castVote("Bob");
        voting.castVote("Alice");

        // Display votes
        voting.displayVotesHashMap();
        System.out.println();
        voting.displayVotesLinkedHashMap();
        System.out.println();
        voting.displayVotesTreeMap();
        System.out.println();

        // Display winner
        voting.displayWinner();
    }
}

