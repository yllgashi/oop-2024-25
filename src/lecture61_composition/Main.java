package lecture61_composition;

public class Main {
    public static void main(String[] args) {
        // A person cannot live without brain. So they are have dependency in each other

        Brain brain1 = new Brain();
        brain1.iqScore = 150;
        brain1.color = "red";

        Person person1 = new Person();
        person1.firstName = "Filan";
        person1.lastName = "Fisteku";
        person1.brain = brain1; // composition

        // call data
        System.out.println("Person 1 information:");
        System.out.println("FirstName: " + person1.firstName);
        System.out.println("FirstName: " + person1.lastName);
        System.out.println("Person 1 brain information:");
        System.out.println("Brain Color: " + person1.brain.color); // object of object
        System.out.println("Brain IQ Score: " + person1.brain.iqScore); // object of object
    }
}
