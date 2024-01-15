package Candidate;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Election {

    private ArrayList<Candidate> candidateList;

    public Election() {
        this.candidateList = new ArrayList<>();
    }


    public ArrayList<Candidate> getCandidateList() {
        return this.candidateList;
    }
    public void addCandidate(Candidate candidate) {
        this.candidateList.add(candidate);
    }



  public int getTotalVotes() {
      int totalVotes = candidateList.stream()
              .mapToInt(Candidate::getNumberOfVotes)
              .sum();

      return totalVotes;

     }



    @Override
    public String toString() {
        return "Election{" +
                "candidateList=" + candidateList +
                '}';
    }
}
