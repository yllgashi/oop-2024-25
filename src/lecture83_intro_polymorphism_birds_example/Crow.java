package lecture83_intro_polymorphism_birds_example;

public class Crow extends Bird {

    public Crow(String name, String color) {
        super(name, color);
    }


    @Override
    public void talk() {
        System.out.println("Uaak Uaaak...");
    }
}
