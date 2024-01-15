package CandidateØvelse;

import java.util.ArrayList;

public class Candidate {

    private String name;
    private String party;
    private int numberOfVotes;



    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    public int getTotalVotes() {
        return numberOfVotes;
    }

    public ArrayList<Candidate> getCandidateFromParty(ArrayList<Candidate> candidates) {
        ArrayList<Candidate>candidatesFromSameParty = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromSameParty.add(candidate);
            }
        } return candidatesFromSameParty;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CandidateØvelse.Candidate: " +
                "name: " + name + '\'' +
                ", partyName: " + party + '\'' +
                ", numberOfVotes: " + numberOfVotes;
    }
}
