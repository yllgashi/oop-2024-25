package lecture08_data_and_functional_members;

public class Main {
    public static void main(String[] args) {
        // create object (from new Person data-type which we created)
        Person person1 = new Person();

        // initialize data members
        person1.personalId = "12345";
        person1.firstName = "Filan";
        person1.lastName = "Fisteku";
        person1.gender = 'M';
        person1.age = 30;

        // show data members
        System.out.println(person1.personalId);
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.gender);
        System.out.println(person1.age);

        // call behaviours
        person1.walk();
        person1.work();
    }
}
