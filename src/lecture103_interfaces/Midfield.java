package lecture103_interfaces;

public class Midfield extends Person implements Player {
    @Override
    public void play() {
        System.out.println("I'm midfield");
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
