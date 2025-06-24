package lecture103_interfaces;

public class GoalKeeper extends Person implements Player {
    @Override
    public void play() {
        System.out.println("I'm goalkeeper");
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
