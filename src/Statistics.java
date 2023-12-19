

public class Statistics {
    private int played;
    private int points;
    private int goalDifference;
    private int goalsScored;

    public Statistics() {
        this.played = 0;
        this.points = 0;
        this.goalDifference = 0;
        this.goalsScored = 0;
    }

    public int getPlayed() {
        return played;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void updateStatistics(int goalsScored, int goalsAgainst) {
        this.played++;
        this.goalsScored += goalsScored;
        this.goalDifference += goalsScored - goalsAgainst;
        if (goalsScored > goalsAgainst) {
            this.points += 3;
        } else if (goalsScored == goalsAgainst) {
            this.points += 1;
        }
    }
}
