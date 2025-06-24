package lecture98_without_abstact_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("Professor object");
        Professor professor = new Professor();
        professor.walk(); // walking as Person
        professor.talk(); // walking as Person

        System.out.println("Student object");
        Student student = new Student();
        student.walk(); // walking as Person
        student.talk(); // walking as Person


        // create a parent "Person" object
        System.out.println("Person object");
        Person person = new Person();
        person.talk();
        person.walk();
    }
}
