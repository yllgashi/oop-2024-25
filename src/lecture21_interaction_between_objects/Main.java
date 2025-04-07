package lecture21_interaction_between_objects;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        owner1.setFullName("Filan Fisteku");


        Dog dog1 = new Dog();
        dog1.setName("Bandit");


        // interaction between objects
        // specifically owner1 ordering dog1 for something

        owner1.orderDogToSpeak(dog1);

        owner1.orderDogToWalk(dog1);
    }
}
