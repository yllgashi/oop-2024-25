package lecture103_interfaces;

public class Attacker extends Person implements Player {

    @Override
    public void play() {
        System.out.println("I'm attacker");
    }

    @Override
    public void scoreGoal() {
        System.out.println("I'm scoring goal");
    }

    @Override
    public void kickBall() {
        System.out.println("I'm kicking ball");
    }
}
