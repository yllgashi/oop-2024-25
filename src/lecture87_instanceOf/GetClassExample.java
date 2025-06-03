package lecture87_instanceOf;

public class GetClassExample {
    public static void main(String[] args) {
        Person obj = new Person(1, "Filan", "Fisteku");

        // example 1
        System.out.println(obj.getClass());
        System.out.println("Class (type) of this obj is: " + obj.getClass());

        // example 2
        String text = "abc";
        System.out.println(text.getClass());


        // we recommend to use "instaceof" instead because this is too hard coded
        if (obj.getClass().equals("Person")) {
            System.out.println("This obj its of type 'Person'");
        }
    }
}
