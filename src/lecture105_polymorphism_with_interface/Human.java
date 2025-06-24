package lecture105_polymorphism_with_interface;

public class Human implements Creation {
    private String firstName;
    private String lastName;

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

    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }

    @Override
    public void talk() {
        System.out.println("Human talk");
    }
}
