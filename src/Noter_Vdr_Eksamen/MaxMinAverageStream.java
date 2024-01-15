

import Candidate.Candidate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TOTAL: int totalVotes = election.getCandidateList().stream().mapToInt(Candidate::getNumberOfVotes).sum();

//AVERAGE: double averageVotesCount = election.getCandidateList().stream().collect(Collectors.averagingInt(Candidate::getNumberOfVotes));

//MIN: Candidate minimumVotesToACandidate = election.getCandidateList().stream().min(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);

//MAX: Candidate maximumVotesToACandidate = election.getCandidateList().stream().max(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);



