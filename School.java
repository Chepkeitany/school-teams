public class School {

    private String schoolName;
    private List<Team> teams;

    public School(String schoolName, List<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }


    public int getTotalPlayersInSchool() {
        int noOfPlayers = 0;
        List<Player> players;

        for (Team team; teams) {
            players = team.getPlayers();
            noOfPlayers += players.size();
        }

        return noOfPlayers;
    }
}