package lecture74_inheritance_super_keyword;

public class Main {
    public static void main(String[] args) {
        // parent
        System.out.println("********* Parent class **********");
        Person person = new Person();
        person.id = 1;
        person.firstName = "Filan";
        person.lastName = "Fisteku";
        person.introduceAsPerson();

        // child
        System.out.println("********* Child class **********");
        Student student = new Student();
        student.id = 2; // attribute from parent
        student.firstName = "Milaim"; // attribute from parent
        student.lastName = "Gashi"; // attribute from parent
        student.introduceAsPerson(); // method from parent

        student.averageGrade = 9.8; // attribute of child
        student.actualCourse = "Object Oriented Programming"; // attribute of child
        student.introduceAsStudent(); // method of child
    }
}
