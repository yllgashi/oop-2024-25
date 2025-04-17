package lecture53_pass_by_value_vs_pass_by_ref;

public class Main {
    public static void main(String[] args) {
        // pass by value
        int number = 100;
        changePrimitiveTypeValue(number);
        System.out.println(number); // value of primitive variable "number" didn't change - because we are sending only value "100" not the location in memory where this variable exists


        // pass by reference
        Person person = new Person();
        person.firstName = "Filan";
        changeReferenceTypeValue(person);
        System.out.println(person.firstName);


        // try to change the reference of object
        changeReferenceOfObject(person);
        System.out.println(person.firstName); // X -> we cannot change the reference
    }

    public static void changePrimitiveTypeValue(int num) {
        num = 200;
    }

    public static void changeReferenceTypeValue(Person person) {
        person.firstName = "Kosova";
    }

    public static void changeReferenceOfObject(Person person) {
        person = new Person();
        person.firstName = "Changed";
    }
}
