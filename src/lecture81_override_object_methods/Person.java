package lecture81_override_object_methods;

public class Person extends Object {
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "First Name: " + this.firstName + ", Last Name: " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Person anotherPerson = (Person) obj;
        boolean hasSameFirstName = this.firstName.equals(anotherPerson.firstName);
        boolean hasSameLastName = this.lastName.equals(anotherPerson.lastName);

        if (hasSameFirstName && hasSameLastName) return true;
        else return false;
    }
}
