package lecture74_inheritance_super_keyword;

public class Person {
    public int id;
    public String firstName;
    public String lastName;

    public void introduceAsPerson() {
        System.out.println("ID (of Person): " + this.id);
        System.out.println("First Name (of Person): " + this.firstName);
        System.out.println("Last Name (of Person): " + this.lastName);
    }
}
