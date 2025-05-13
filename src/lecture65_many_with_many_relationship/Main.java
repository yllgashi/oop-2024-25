package lecture65_many_with_many_relationship;

public class Main {
    public static void main(String[] args) {
        // one student can have many courses
        // one course can have many students

        Student student1 = new Student("Filan", "Fisteku");
        Student student2 = new Student("Edona", "Veliu");

        Course course1 = new Course("OOP", "Object Oriented Programming");
        Course course2 = new Course("Database", "Database with SQL Server");

        student1.addCourse(course1);
        student1.addCourse(course2);

        student2.addCourse(course1);
        student2.addCourse(course2);


        // print information
        System.out.println("Student1 information");
        System.out.println(student1.firstName);
        System.out.println(student1.lastName);
        for (int i = 0; i < student1.courses.size(); i++) {
            System.out.println(student1.courses.get(i).name);
            System.out.println(student1.courses.get(i).description);
        }

        System.out.println("Student2 information");
        System.out.println(student2.firstName);
        System.out.println(student2.lastName);
        for (int i = 0; i < student2.courses.size(); i++) {
            System.out.println(student2.courses.get(i).name);
            System.out.println(student2.courses.get(i).description);
        }


        System.out.println("Course1 information");
        System.out.println(course1.name);
        System.out.println(course1.description);
        for (int i = 0; i < course1.students.size(); i++) {
            System.out.println(course1.students.get(i).firstName);
            System.out.println(course1.students.get(i).lastName);
        }

        System.out.println("Course2 information");
        System.out.println(course2.name);
        System.out.println(course2.description);
        for (int i = 0; i < course2.students.size(); i++) {
            System.out.println(course2.students.get(i).firstName);
            System.out.println(course2.students.get(i).lastName);
        }
    }
}
