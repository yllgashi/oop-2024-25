package lecture23_objects_know_things;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Bandit");


        Dog dog2 = new Dog();
        dog2.setName("Pit");


        Dog dog3 = new Dog();
        dog3.setName("Ace");


        // same method, different names
        dog1.introduce();
        dog2.introduce();
        dog3.introduce();
    }
}
