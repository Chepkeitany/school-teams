import java.util.ArrayList;
import java.util.List;

public class Main {
   
    public static void main(String[] args) {

        /* Players */
        Player p1 = new Player(1, "Harris","Tana");
        Player p2 = new Player(2, "Carol", "Athi");
        Player p3 = new Player(3, "Bob",   "Tana");
        Player p4 = new Player(4, "Alice", "Athi");

        /* Tana team players */
        List<Player> tana_players = new ArrayList<>();
        tana_players.add(p1);
        tana_players.add(p3);

        /* Athi team players */
        List<Player> athi_players = new ArrayList<>();
        athi_players.add(p2);
        athi_players.add(p4);

        /* Teams */
        Team tana = new Team("Tana", tana_players);
        Team athi = new Team("Athi", athi_players);

        List<Team> teams = new ArrayList<>();
        teams.add(tana);
        teams.add(athi);

        School mySchool = new School("KABA", teams);

        System.out.println("Total players in my school: " + mySchool.getTotalPlayersInSchool());

    }
}