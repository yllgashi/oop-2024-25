package lecture36_constructor_3;

public class MainAdministration {
    public static void main(String[] args) {
        // make "mandatory" to get firstName and lastName of new student
        // DO NOT CREATE "Student object" WITHOUT THESE PRIMARY DATA
        Student student = new Student("Filan", "Fisteku");


        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }
}
