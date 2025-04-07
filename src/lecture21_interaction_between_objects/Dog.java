package lecture21_interaction_between_objects;

public class Dog {
    // attributes
    private String name;


    // properties
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // methods (behaviours)
    public void walk() {
        System.out.println("I am walking...");
    }

    public void step() {
        System.out.println("I am stepping...");
    }

    public void speak() {
        System.out.println("Woff woff...");
    }
}
