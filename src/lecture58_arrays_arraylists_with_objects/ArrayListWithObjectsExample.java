package lecture58_arrays_arraylists_with_objects;

import java.util.ArrayList;

public class ArrayListWithObjectsExample {
    public static void main(String[] args) {
        ArrayList<Person> arraylist = new ArrayList<Person>(); // [null, null,null, null,null, null,null, null,null, null,]
        arraylist.add(new Person(1, "Filan", "Fisteku", 1.50)); // [person1, null,null, null,null, null,null, null,null, null,]
        arraylist.add(new Person(2, "Niman", "Demiri", 2.10));// [person1, person2, null, null,null, null,null, null,null, null,]
        arraylist.add(new Person(3, "Edona", "Veliu", 2.15));// [person1, person2 ,person3, null,null, null,null, null,null, null,]


        // read person 1
        Person person1 = arraylist.get(0);
        System.out.println("ID: " + person1.getId());
        System.out.println("FirstName: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Height: " + person1.getHeight());
        System.out.println();

        // read person 2
        Person person2 = arraylist.get(1);
        System.out.println("ID: " + person2.getId());
        System.out.println("FirstName: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Height: " + person2.getHeight());
        System.out.println();

        // read person 3
        Person person3 = arraylist.get(2);
        System.out.println("ID: " + person3.getId());
        System.out.println("FirstName: " + person3.getFirstName());
        System.out.println("LastName: " + person3.getLastName());
        System.out.println("Height: " + person3.getHeight());
        System.out.println("**********************");


        // read all people
        for (int i = 0; i < arraylist.size(); i++) {
            Person person = arraylist.get(i);
            if (person != null) {
                System.out.println("ID: " + person.getId());
                System.out.println("FirstName: " + person.getFirstName());
                System.out.println("LastName: " + person.getLastName());
                System.out.println("Height: " + person.getHeight());
                System.out.println();
            }
        }
    }
}
