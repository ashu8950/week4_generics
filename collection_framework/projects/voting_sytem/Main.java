package collection_framework.projects.voting_sytem;

public class Main {
	public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.showSortedResults();
        votingSystem.showVoteOrder();

        System.out.println("Total votes for Bob: " + votingSystem.getVotes("Bob"));
    }
}
