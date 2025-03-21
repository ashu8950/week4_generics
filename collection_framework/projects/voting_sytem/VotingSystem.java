package collection_framework.projects.voting_sytem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap (preserves order of *first* vote)
        voteOrderMap.putIfAbsent(candidate, 0);
        voteOrderMap.put(candidate, voteMap.get(candidate));
    }

    // Display results sorted by candidate name
    public void showSortedResults() {
        TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);
        System.out.println("Results (Alphabetical Order):");
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    // Display vote order (order in which candidates first received a vote)
    public void showVoteOrder() {
        System.out.println("Vote Order (First Appearances):");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    // Get total votes for a candidate
    public int getVotes(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }
}
