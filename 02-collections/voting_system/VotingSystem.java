package voting_system;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount;
    private LinkedHashMap<String, Integer> voteOrder;
    
    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }
    
    // Cast a vote
    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }
    
    // Display votes in order they were cast
    public void displayVoteOrder() {
        System.out.println("Votes in order of casting: " + voteOrder);
    }
    
    // Display sorted results
    public void displayResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);
        System.out.println("Sorted Voting Results: " + sortedResults);
    }
    
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");
        
        system.displayVoteOrder();
        system.displayResults();
    }
}
