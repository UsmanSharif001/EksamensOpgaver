//TOTAL: int totalVotes = election.getCandidateList().stream().mapToInt(Candidate::getNumberOfVotes).sum();

//AVERAGE: double averageVotesCount = election.getCandidateList().stream().collect(Collectors.averagingInt(Candidate::getNumberOfVotes));

//MIN: Candidate minimumVotesToACandidate = election.getCandidateList().stream().min(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);

//MAX: Candidate maximumVotesToACandidate = election.getCandidateList().stream().max(Comparator.comparingInt(Candidate::getNumberOfVotes)).orElse(null);



