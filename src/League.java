import java.util.Arrays;

public class League {
    private Team[] teams;

    public League() {
        addTeams();
    }
    public void addMatchResult (String homeTeam, String awayTeam,
                                int homeGoals, int awayGoals) {
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(homeTeam)) {
                team.updateStatistics(homeGoals,awayGoals);
            } else if (team.getName().equalsIgnoreCase(awayTeam)) {
                team.updateStatistics(awayGoals, homeGoals);
                League league = new League();
                league.addMatchResult("FC København", "BrøndbyIF", 2,0);

            }
        }
    }
    public void printLeague() {
        for (Team team: teams) {
            System.out.println(team.getName() + " " + team.getPoints());

        }
    }

    private void addTeams() {
        teams = new Team[12];
        teams[0] = new Team("AGF");
        teams[1] = new Team("Silkeborg");
        teams[2] = new Team("Taarnby");
        teams[3] = new Team("FCK");
        teams[4] = new Team("Brøndby");
        teams[5] = new Team("AaB");
        teams[6] = new Team("Lyngby");
        teams[7] = new Team("Esbjerg");
        teams[8] = new Team("AGF");
        teams[9] = new Team("");
        teams[10] = new Team("AGF");
        teams[11] = new Team("AGF");
    }
}
