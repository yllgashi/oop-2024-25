package lecture81_override_object_methods;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Filan";
        person.lastName = "Fisteku";

        // toString()
        System.out.println(person.toString());



        // equals()
        Person person2 = new Person();
        person.firstName = "Filan";
        person.lastName = "Fisteku";

        boolean isPerson1EqualWithPerson2 = person.equals(person2);
        System.out.println(isPerson1EqualWithPerson2);



//        if (person.firstName == person2.firstName && person.lastName == person2.lastName) {
//            System.out.println("Person 1 and Person 2 are equal");
//        }
//        else {
//            System.out.println("Person 1 and Person 2 are NOT equal");
//        }

    }
}
