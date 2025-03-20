package lecture16_properties_football;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();

        // using getters
        player1.setId(1);
        player1.setFirstName("Filan");
        player1.setLastName("Fisteku");

        // using setters
        System.out.println(player1.getId());
        System.out.println(player1.getFirstName());
        System.out.println(player1.getLastName());

        Club club1 = new Club();

    }
}
