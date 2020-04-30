public class Team {

    String name;
    private List<Player> players; // a Team has players

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}