package lecture78_override_vs_final;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.talk();

        Cat cat = new Cat();
        cat.talk();


        Dog dog = new Dog();
        dog.talk();
    }
}
