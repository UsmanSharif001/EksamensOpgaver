import java.util.Comparator;


public class StatisticsComparator implements Comparator<Team> {

    @Override
    public int compare(Team team1, Team team2) {
        if (team1.getPoints() == team2.getPoints()) {
            if (team1.getGoalDifference() == team2.getGoalDifference()) {

                return Integer.compare(team1.getGoalsScored(), team2.getGoalsScored());
            } else {
                return Integer.compare(team1.getPoints(), team2.getPoints());
            }
        }     else{
                return Integer.compare(team1.getPoints(), team2.getPoints());
            }
        }
    }




