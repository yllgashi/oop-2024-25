package lecture99_with_abstact_class;

public class Lion extends Animal {
    @Override
    public void talk() {
        System.out.println("Uaaauuuu");
    }

    @Override
    public void walk() {
        System.out.println("Walking with 4 foots...");
    }
}
