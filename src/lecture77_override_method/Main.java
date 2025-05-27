package lecture77_override_method;

public class Main {
    public static void main(String[] args) {
        System.out.println("########### Parent class ############");
        Person person = new Person();
        person.firstName = "Filan";
        person.lastName = "Fisteku";
        person.introduce();

        System.out.println();
        System.out.println("########### Child class ############");

        Student student = new Student();
        student.firstName = "Edona";
        student.lastName = "Veliu";
        student.averageGrade = 9.9;
        student.actualCourse = "Programming in Java";
        student.introduce();


        StudenetVititPare s = new StudenetVititPare();
        s.introduce();
    }
}
