package lecture23_objects_know_things;

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


    // behaviours (methods)
    public void introduce() {
        System.out.println("I am " + this.getName());
    }

}
