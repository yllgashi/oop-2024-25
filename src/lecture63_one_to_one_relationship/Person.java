package lecture63_one_to_one_relationship;

public class Person {
    // attributes
    private String firstName;
    private String lastName;
    private Brain brain; // one to one relationship


    // constructors
    public Person(String firstName, String lastName, Brain brain) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBrain(brain);
    }


    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
}
