package Candidate;

import java.util.ArrayList;

public class Candidate {

    private String name;
    private String party;

    private int numberOfVotes;


    public Candidate(String name, String party, int numberOfVotes) {

        this.name = name;

        this. party = party;

        this.numberOfVotes = numberOfVotes;
    }


    public int getNumberOfVotes() {
        return numberOfVotes;
    }

   public String getParty() {
        return this.party;

   }

   public String getName()  {
        return this.name;
   }


//Irrelevant metode. Bruger Stream til at sorterer og compare.
   public ArrayList<Candidate> getCandidatesFromParty(ArrayList<Candidate> candidates) {
        ArrayList<Candidate> candidatesFromSameParty = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromSameParty.add(candidate);
            }
        } return candidatesFromSameParty;
   }


    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
