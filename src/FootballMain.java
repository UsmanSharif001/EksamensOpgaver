public class FootballMain {
    public static void main(String[] args) {
        Team fck = new Team("FC København");
        Team Brøndby = new Team("Brøndby IF");

        fck.updateStatistics(2,0);
        System.out.println("FCK: " + fck.getPoints());
        Brøndby.updateStatistics(0,2);
        System.out.println("Brøndby: " + fck.getPoints());

        League league = new League();
        league.addMatchResult("FCK", "BrøndbyIF", 2, 0);

        league.printLeague();

    }
}
