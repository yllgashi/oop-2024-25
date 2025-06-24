package lecture99_with_abstact_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eagle object");
        Eagle eagle = new Eagle();
        eagle.talk();
        eagle.walk();

        System.out.println("Luan object");
        Lion lion = new Lion();
        lion.talk();
        lion.walk();

        // create a parent "Animal" object
        // System.out.println("Animal object");
        // Animal animal = new Animal();
        // animal.talk();
        // animal.walk();
    }
}
