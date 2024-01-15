package CandidateØvelse;

import java.util.Comparator;

public class CandidatePartyComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate candidate1, Candidate candidate2) {
        return candidate1.getParty().compareTo(candidate2.getParty());
    }
}
