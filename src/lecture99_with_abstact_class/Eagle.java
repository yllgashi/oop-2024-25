package lecture99_with_abstact_class;

public class Eagle extends Animal {
    @Override
    public void talk() {
        System.out.println("Skrr  skrrrrrr...");
    }

    @Override
    public void walk() {
        System.out.println("Flying and walking with two foots...");
    }
}
