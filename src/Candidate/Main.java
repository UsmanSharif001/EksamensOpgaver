package Candidate;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Election election = new Election();


        Candidate candidate1 = new Candidate("Abraham", "The Free United", 1000);
        Candidate candidate2 = new Candidate("Fidel", "Bolts", 103002);
        Candidate candidate3 = new Candidate("Calton", "The Free United", 1200);
        Candidate candidate4 = new Candidate("Drew", "Bolts", 1000);
        Candidate candidate5 = new Candidate("Clark", "The Free United", 23200);
        Candidate candidate6 = new Candidate("Bunny", "Alternative", 12130);
        Candidate candidate7 = new Candidate("Fredrericko", "Alternative", 12130);

      election.addCandidate(candidate1);
      election.addCandidate(candidate2);
      election.addCandidate(candidate3);
      election.addCandidate(candidate4);
      election.addCandidate(candidate5);
      election.addCandidate(candidate6);
      election.addCandidate(candidate7);

        //Naming and party only without votes of candidates
        election.getCandidateList().forEach(candidate -> System.out.println("Name: " + candidate.getName() + " Party: " + candidate.getParty()));

        //Sorted candidates by votes
        List<Candidate> sortedCandidatesByVotes = election.getCandidateList().stream()
                .sorted(Comparator.comparingInt(Candidate::getNumberOfVotes).reversed().thenComparing(Candidate::getName))
                .toList();

        sortedCandidatesByVotes.forEach(candidate -> System.out.println("Total votes: " + candidate.getNumberOfVotes() + " Name: " + candidate.getName()));

        System.out.println("\nSorted candidates by votes: \n");
        
        sortedCandidatesByVotes.forEach(System.out::println);

        //Sorted candidates by party reversed

        List<Candidate> sortedCandidatesByParty = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getParty)).toList();

        System.out.println("\nSorted candidates by party: \n");

        sortedCandidatesByParty.forEach(System.out::println);

        //Sorted candidates by number of votes and then name

        List<Candidate> sortedCandidatesByVotesThenName = election.getCandidateList().stream().sorted(Comparator.comparingInt(Candidate::getNumberOfVotes).thenComparing(Candidate::getName).reversed()
                .thenComparing(Candidate::getParty)).toList();



        System.out.println("\nSorted candidates by number of votes and then name: \n");


        sortedCandidatesByVotesThenName.forEach(System.out::println);

        //Compare candidates by name


        List<Candidate> sortedX = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getName)).toList();

        System.out.println("\nSorting by name: \n");
        sortedX.forEach(System.out::println);

        //Metode til at få totalVotes
        int totalVotes = election.getCandidateList().stream().mapToInt(Candidate::getNumberOfVotes).sum();
        System.out.println(totalVotes);

        List<Candidate> names = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getName)).toList();
        List<Candidate> whatEvers = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getName).thenComparing(Candidate::getParty)).toList();
        OptionalDouble votes = election.getCandidateList().stream().mapToInt(Candidate::getNumberOfVotes).average();
        System.out.println("Test: ");
        System.out.println(votes);


       int totalPartyVotes = election.getCandidateList().stream().mapToInt(Candidate::getNumberOfVotes).sum();

       List<Candidate>WhatEvers = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getName)).toList();

       List<Candidate> practiceToUseCompare = election.getCandidateList().stream().sorted(Comparator.comparing(Candidate::getParty).thenComparing(Candidate::getName)).toList();

       Spliterator<Candidate> splitSamePartyOnly = election.getCandidateList().spliterator();

       splitSamePartyOnly.forEachRemaining(candidate -> System.out.println((candidate.getName() + ": " + candidate.getParty())));



        double averageVotesCount = election.getCandidateList().stream().collect(Collectors.averagingInt(Candidate::getNumberOfVotes));
        System.out.println(averageVotesCount);


        Candidate minimumVotesToACandidate = election.getCandidateList().stream().min(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);
        System.out.println(minimumVotesToACandidate);


        Candidate maximumVotesToACandidate = election.getCandidateList().stream().max(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);
        System.out.println(maximumVotesToACandidate);



    }
}
