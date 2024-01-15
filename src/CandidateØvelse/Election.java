package CandidateØvelse;



import java.util.ArrayList;

public class Election {

    private ArrayList<Candidate> candidates;

    public Election() {
        this.candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public ArrayList<Candidate> getCandidates() {
        return this.candidates;
    }

    public int getTotalVotes() {
        int totalVotes = 0;

        for (Candidate candidate : candidates) {
            totalVotes += candidate.getTotalVotes();
        }
        return totalVotes;
    }


}

