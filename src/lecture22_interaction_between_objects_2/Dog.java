package lecture22_interaction_between_objects_2;

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
        System.out.println(this.getName() + ": walking...");
    }

    public void step() {
        System.out.println(this.getName() + ": stepping...");
    }

    public void speak() {
        System.out.println(this.getName() + ": Woff woff...");
    }
}
