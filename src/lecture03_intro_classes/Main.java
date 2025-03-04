package lecture03_intro_classes;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Road class
        Road highway = new Road();
        highway.id = 1;
        highway.name = "Ibrahim Rugova";
        highway.width = 1000;
        highway.length = 5000;
        highway.capacity = 1000;

        Road mainRoad = new Road();
        mainRoad.id = 2;
        mainRoad.name = "Rr. Agim Ramadani";
        mainRoad.width = 500;
        mainRoad.length = 2000;
        mainRoad.capacity = 150;



        // Creating objects of Player class
        Player player1 = new Player();
        player1.image = "https://static01.nyt.com/images/2020/11/03/obituaries/00Maradona/00Maradona-superJumbo-v2.jpg";
        player1.firstName = "Diego";
        player1.lastName = "Maradona";
        player1.nationality = "Argentine";
        player1.position = "SS";
        player1.club = "Napoli";

    }
}
