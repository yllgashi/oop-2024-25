package lecture83_intro_polymorphism_birds_example;

public class Eagle extends Bird {

    public Eagle(String name, String color) {
        super(name, color); // call parent constructor
    }

    @Override
    public void talk() {
        System.out.println("Skrrr...");
    }
}
