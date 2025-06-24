package lecture110_university_workshop_example;

// 1.
// Create a university application which will manage:
// departments
// students (registration, results, etc)
// professors (registration, salary, etc)
// courses
// reports (view all students, view all professors, view all courses
// save all of them into arraylists

// 2.
// Create a console UI where user can:
//      1. Add student
//      2. Add professor
//      3. Add course
//      4. Show students
//      5. Show professors
//      6. Show courses
//      7. Add student to course (ask for id of course, iterate through arraylist of courses to check if exists, if exists ask student ID and add it into course students)
//      8. Add professor to course (same)
//      9. Show course details (show course information with its professors and students)
//      10. Exit

import java.util.ArrayList;
import java.util.Scanner;

// 3.
// Manage to use: exception handling, objects, inheritance and composition concepts of OOP
public class UniversityUI {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Professor> professors = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();


    public static void main(String[] args) {
        boolean isApplicationGoing = true;
        while (isApplicationGoing) {
            System.out.println("1. Add student");
            System.out.println("2. Add professor");
            System.out.println("3. Add course");
            System.out.println("4. Show students");
            System.out.println("5. Show professors");
            System.out.println("6. Show courses");
            System.out.println("7. Add student to course (ask for id of course, iterate through arraylist of courses to check if exists, if exists ask student ID and add it into course students)");
            System.out.println("8. Add professor to course (same)");
            System.out.println("9. Show course details (show course information with its professors and students)");
            System.out.println("10. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Write option");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addProfessor();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    showStudents();
                    break;
                case 5:
                    showProfessors();
                    break;
                case 6:
                    showCourses();
                    break;
                case 10:
                    isApplicationGoing = false;
                    break;
            }

        }
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student firstName: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter student lastName: ");
        String lastName = scanner.nextLine();

        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);

        students.add(student);
    }

    public static void addProfessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student firstName: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter student lastName: ");
        String lastName = scanner.nextLine();

        Professor professor = new Professor();
        professor.setFirstName(firstName);
        professor.setLastName(lastName);

        professors.add(professor);
    }

    public static void addCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Course course = new Course();
        course.setName(courseName);

        courses.add(course);
    }

    public static void showStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    public static void showProfessors() {
        for (int i = 0; i < professors.size(); i++) {
            Professor professor = professors.get(i);
            System.out.println(professor.getFirstName() + " " + professor.getLastName());
        }
    }

    public static void showCourses() {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            System.out.println(course.getName());
        }
    }
}