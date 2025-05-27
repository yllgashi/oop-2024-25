package lecture80_object_class;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 1;
        person.firstName = "Filan";
        person.lastName = "Fisteku";
        person.introduce();

        person.toString(); // this method is inherited from "Object" class
        person.equals(""); // this method is inherited from "Object" class
    }
}
