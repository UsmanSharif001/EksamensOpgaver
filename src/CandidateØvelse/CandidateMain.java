package CandidateØvelse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
//TODO MANGLER AT LAVE  3. TILFØJ EN METODE I GETCANDIDATESFROMPARTY DER RETURNERER EN LISTE AF
// ALLE KANDIDATER FRA ET BESTEMT PARTI


public class CandidateMain {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("John","Rams", 1000);
        Candidate candidate2 = new Candidate("Hans","Jaguars", 2000);
        Candidate candidate3 = new Candidate("Ali","Eagles", 5000);
        Candidate candidate4 = new Candidate("Kristie","Eagles", 6000);
        Candidate candidate5 = new Candidate("Christie","Rams", 6000);
        Candidate candidate6 = new Candidate("Nab","Rams", 2222);
        Election election = new Election();


        election.addCandidate(candidate1);
        election.addCandidate(candidate2);
        election.addCandidate(candidate3);
        election.addCandidate(candidate4);

        election.addCandidate(candidate5);
        election.addCandidate(candidate6);

        System.out.println(election.getTotalVotes());

        election.getCandidates();


        ArrayList<Candidate>filteredCandidatesFromSameParty = new ArrayList<>();

        filteredCandidatesFromSameParty.addAll(candidate1.getCandidateFromParty(election.getCandidates()));
        filteredCandidatesFromSameParty.addAll(candidate2.getCandidateFromParty(election.getCandidates()));
        filteredCandidatesFromSameParty.addAll(candidate3.getCandidateFromParty(election.getCandidates()));
        filteredCandidatesFromSameParty.addAll(candidate4.getCandidateFromParty(election.getCandidates()));
        filteredCandidatesFromSameParty.addAll(candidate5.getCandidateFromParty(election.getCandidates()));
        filteredCandidatesFromSameParty.addAll(candidate6.getCandidateFromParty(election.getCandidates()));

        Collections.sort(filteredCandidatesFromSameParty, new CandidatePartyComparator());
        //Printer det to gange pga. getCandidateFromParty metoden returenere candidatedFromParty-listen

        filteredCandidatesFromSameParty.forEach(candidate -> System.out.println("Name: " + candidate.getName() + " Party: " + candidate.getParty() + " Votes: " + candidate.getTotalVotes()));



        List<Candidate> comparePartyMembers = election.getCandidates().stream().sorted(Comparator.comparing(Candidate::getParty).thenComparing(Candidate::getName).thenComparing(Candidate::getTotalVotes)).collect(Collectors.toList());
        System.out.println("Test");
        //Grimt print:
        comparePartyMembers.forEach(System.out::println);
        //Pænt print: Gør det samme
        comparePartyMembers.forEach(candidate -> System.out.println("Name: " + candidate.getName() + " Party: " + candidate.getParty() + " Votes: " + candidate.getTotalVotes()));



    }
}
