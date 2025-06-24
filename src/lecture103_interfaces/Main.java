package lecture103_interfaces;

public class Main {
    public static void main(String[] args) {
        Attacker leonelMessi = new Attacker();

        GoalKeeper neuer = new GoalKeeper();

        Midfield iniesta = new Midfield();

        Coach pepGuardiola = new Coach();

        leonelMessi.getFirstName();
        leonelMessi.getLastName();
        leonelMessi.scoreGoal();
        leonelMessi.play();
        leonelMessi.kickBall();

        neuer.getFirstName();
        neuer.getLastName();
        neuer.scoreGoal();
        neuer.play();
        neuer.kickBall();

        iniesta.getFirstName();
        iniesta.getLastName();
        iniesta.scoreGoal();
        iniesta.play();
        iniesta.kickBall();

        pepGuardiola.getFirstName();
        pepGuardiola.getLastName();
        // pepGuardiola.scoreGoal(); // Coach didnt implement "Player" interface
        // pepGuardiola.play(); // Coach didnt implement "Player" interface
        // pepGuardiola.kickBall(); // Coach didnt implement "Player" interface
    }
}
