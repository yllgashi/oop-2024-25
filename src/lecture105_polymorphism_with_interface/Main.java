package lecture105_polymorphism_with_interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(); // implements "Creation" interface

        Animal animal = new Animal(); // implements "Creation" interface


        ArrayList<Creation> creations = new ArrayList<>();
        creations.add(human);
        creations.add(animal);

        for (int i = 0; i < creations.size(); i++) {
            creations.get(i).sleep();
            creations.get(i).talk();
            creations.get(i).eat();
        }
    }
}
