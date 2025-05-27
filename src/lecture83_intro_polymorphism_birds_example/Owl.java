package lecture83_intro_polymorphism_birds_example;

public class Owl extends Bird {

    public Owl(String name, String color) {
        super(name, color); // call parent constructor
    }


    @Override
    public void talk() {
        System.out.println("Huuu huuu...");
    }
}
