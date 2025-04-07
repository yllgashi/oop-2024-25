package lecture22_interaction_between_objects_2;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        owner1.setFullName("Filan Fisteku");

        Dog dog1 = new Dog();
        dog1.setName("Bandit");
        // dog1.speak(); // example where each object is behaving with its own name
        // dog1.walk(); // example where each object is behaving with its own name

        Dog dog2 = new Dog();
        dog2.setName("Benji");
        // dog2.speak(); // example where each object is behaving with its own name
        // dog2.walk(); // example where each object is behaving with its own name


        owner1.orderDogToSpeak(dog1); // the owner will command first dog to speak
        owner1.orderDogToWalk(dog1); // the owner will command first dog to walk

        owner1.orderDogToSpeak(dog2); // the owner will command second dog to speak
        owner1.orderDogToWalk(dog2); // the owner will command second dog to walk
    }
}
