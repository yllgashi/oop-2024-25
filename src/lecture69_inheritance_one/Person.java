package lecture69_inheritance_one;

public class Person {
    public int id;
    public String firstName;
    public String lastName;

    public void printPersonInformation() {
        System.out.println(this.id);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
    }
}
