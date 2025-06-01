package lecture83_intro_polymorphism_birds_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Shqiponja Kosovare", "Black");
        Crow crow1 = new Crow("Sora Kosovare", "Black");
        Owl owl1 = new Owl("Huti Malor", "Brown");


        // print information (1)
//        System.out.println("Bird number: " + 0);
//        System.out.println(eagle1.getName());
//        System.out.println(eagle1.getColor());
//        eagle1.talk();
//
//        System.out.println("Bird number: " + 1);
//        System.out.println(crow1.getName());
//        System.out.println(crow1.getColor());
//        crow1.talk();
//
//        System.out.println("Bird number: " + 2);
//        System.out.println(owl1.getName());
//        System.out.println(owl1.getColor());
//        owl1.talk();









        // polymorphic call
        ArrayList<Bird> birds = new ArrayList<Bird>(); // arraylist of BIRD
        birds.add(eagle1); // eagle1 is object of Eagle and Bird
        birds.add(crow1); // crow1 is object of Crow and Bird
        birds.add(owl1); // owl1 is object of Owl and Bird

        for (int i = 0; i < birds.size(); i++) {
            System.out.println("Bird number: " + i);
            System.out.println(birds.get(i).getName());
            System.out.println(birds.get(i).getColor());
            birds.get(i).talk(); // polymorphic call
        }
    }
}
