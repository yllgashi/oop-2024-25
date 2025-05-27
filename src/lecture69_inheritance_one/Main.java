package lecture69_inheritance_one;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 1;
        person.firstName = "Filan";
        person.lastName = "Fisteku";


        Student student = new Student();
        student.id = 2; // inherited from parent
        student.firstName = "Milaim"; // inherited from parent
        student.lastName = "Zeka"; // inherited from parent
        student.averageGrade = 8.2;
        student.actualCourse = "OOP";


        // print person information
//        System.out.println(person.id);
//        System.out.println(person.firstName);
//        System.out.println(person.lastName);

        // print student information
//        System.out.println(student.id);
//        System.out.println(student.firstName);
//        System.out.println(student.lastName);
//        System.out.println(student.averageGrade);
//        System.out.println(student.actualCourse);



        // print person information
        person.printPersonInformation();


        // print student information
        student.printPersonInformation();
        student.printStudentInformation();
    }
}
