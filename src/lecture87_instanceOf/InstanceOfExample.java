package lecture87_instanceOf;

public class InstanceOfExample {
    public static void main(String[] args) {
        Person object = new Person(1, "Filan", "Fisteku");


        // if the object is "Person" print "this object is a Person"
        // else if the object is "Animal" print "this object is an Animal"

        if (object instanceof Person) {
            System.out.println("This object is a person");
        }
        else {
            System.out.println("We don't know the type (class) of this object");
        }
    }
}
