package lecture77_override_method;

public class Person {
    public String firstName;
    public String lastName;

    public void introduce() {
        System.out.println("Hi there...");
        System.out.println("My first name is: " + firstName);
        System.out.println("My last name is: " + lastName);
    }
}
