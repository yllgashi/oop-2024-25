package lecture82_override_object_methods_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "OOP", "Object Oriented Programming");

        ArrayList<Course> coursesOfStudent = new ArrayList<>();
        coursesOfStudent.add(course1);
        Student student1 = new Student(1, "Filan", "Fisteku", 9.8, coursesOfStudent);

        ArrayList<Course> coursesOfProfessor = new ArrayList<>();
        coursesOfProfessor.add(course1);
        Professor professor1 = new Professor(2, "Adem", "Jashari", 100, coursesOfProfessor);

        System.out.println(course1.toString());
        System.out.println(student1.toString());
        System.out.println(professor1); // same as System.out.println(professor1.toString());


        // show information without TOSTRING()
//        // show information of course1
//        System.out.println("ID: " + course1.getId());
//        System.out.println("Title: " + course1.getTitle());
//        System.out.println("Description: " + course1.getDescription());
//
//        // show information of student1
//        System.out.println("ID: " + student1.getId());
//        System.out.println("FirstName: " + student1.getFirstName());
//        System.out.println("LastName: " + student1.getLastName());
//        System.out.println("AverageGrade: " + student1.getAverageGrade());
//
//        // show information of professor1
//        System.out.println("ID: " + professor1.getId());
//        System.out.println("FirstName: " + professor1.getFirstName());
//        System.out.println("LastName: " + professor1.getLastName());
//        System.out.println("AverageGrade: " + professor1.getSalary());
    }
}
