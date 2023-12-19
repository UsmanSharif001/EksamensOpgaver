

public class Team {

    private String name;
    private Statistics statistics;

    public Team(String name) {
        this.name = name;
        this.statistics = new Statistics();
    }

    public String getName() {
        return name;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getPoints() {
        return statistics.getPoints();
    }

    public int getGoalDifference() {
        return statistics.getGoalDifference();
    }

    public int getGoalsScored() {
        return statistics.getGoalsScored();
    }

    public void updateStatistics(int goalsScored, int goalsAgainst) {
        statistics.updateStatistics(goalsScored, goalsAgainst);
    }

}
