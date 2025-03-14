package lecture11_football_league;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // create a system for football league
        // where there will be two clubs and one match
        // later one maybe there will be more


        // Create players
        Player player1 = new Player();
        player1.id = 1;
        player1.firstName = "Leonel";
        player1.lastName = "Messi";
        player1.clubName = "FC Barcelona";
        player1.position = "Attacker";

        Player player2 = new Player();
        player2.id = 2;
        player2.firstName = "Cristiano";
        player2.lastName = "Ronaldo";
        player2.clubName = "Real Madrid";
        player2.position = "Attacker";

        // Create coaches
        Coach coach1 = new Coach();
        coach1.id = 1;
        coach1.fistName = "Joseph";
        coach1.lastName = "Morinjho";
        coach1.clubName = "Real Madrid";

        Coach coach2 = new Coach();
        coach2.id = 2;
        coach2.fistName = "Pep";
        coach2.lastName = "Guardiola";
        coach2.clubName = "FC Barcelona";


        // Create football clubs
        Club clubOne = new Club();
        clubOne.id = 1;
        clubOne.name = "FC Barcelona";
        clubOne.createYear = 2020;
        clubOne.players = new String[]{"Messi", "Xavi"};
        clubOne.coach = "Pep Guardiola";

        Club clubTwo = new Club();
        clubTwo.id = 2;
        clubTwo.name = "Real Madrid";
        clubTwo.createYear = 2021;
        clubTwo.players = new String[]{"Ronaldo", "Ramos"};
        clubTwo.coach = "Morinhjo";

        // Create first match
        Match m1 = new Match();
        m1.clubOne = clubOne.name;
        m1.clubTwo = clubTwo.name;
        m1.matchDateTime = LocalDateTime.now();

        // start match
        m1.clubOneScore = 5;
        m1.clubTwoScore = 0;
        m1.matchStartDateTime = LocalDateTime.now();
    }
}
