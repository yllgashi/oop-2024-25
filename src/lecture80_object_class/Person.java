package lecture80_object_class;


// even if we dont write "extends Object", this is true
// every class which doesnt have a parent it assings the "Object" class as parent of them
public class Person extends Object {
    public int id;
    public String firstName;
    public String lastName;

    public void introduce() {
        System.out.println("ID: " + this.id);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
    }
}
