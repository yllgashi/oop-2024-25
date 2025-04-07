package lecture21_interaction_between_objects;

public class Owner {
    // attributes
    private String fullName;


    // properties
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    // methods (behaviours)
    public void walk() {
        System.out.println("Walking...");
    }


    public void orderDogToSpeak(Dog dog) {
        dog.speak();
    }

    public void orderDogToWalk(Dog dog) {
        dog.walk();
    }
}
