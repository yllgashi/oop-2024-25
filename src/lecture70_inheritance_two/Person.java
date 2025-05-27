package lecture70_inheritance_two;

public class Person {
    // attributes of Person (which are inherited also to Student, Professor and Doctor)
    public int id;
    public String firstName;
    public String lastName;

    // methods of Person (which are inherited also to Student, Professor and Doctor)
    public void showPersonInformation() {
        System.out.println("ID: " + this.id);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
    }
}
