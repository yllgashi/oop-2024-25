package lecture27_default_values;

public class DefaultValuesInObject {
    public static void main(String[] args) {
        Person person = new Person();

        // when we use primitive types inside one object, they are inside a reference-type
        // primitve types inside an object always HAVE a default value
        System.out.println("byte: " +  person.id); // 0
        System.out.println("short: " +  person.weight); // 0
        System.out.println("int: " +  person.age); // 0
        System.out.println("double: " +  person.height); // 0.0000000
        System.out.println("float: " +  person.footNumber); // 0.0
        System.out.println("boolean: " +  person.isAlive); // false
        System.out.println("char: " +  person.gender); // ' '
        System.out.println("String: " +  person.firstName); // null
        System.out.println("String[]: " +  person.nationalities);  // null


        Person b;// = new Person();
    }
}
