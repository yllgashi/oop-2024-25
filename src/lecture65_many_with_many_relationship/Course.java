package lecture65_many_with_many_relationship;

import java.util.ArrayList;

public class Course {
    public String name;
    public String description;
    public ArrayList<Student> students;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
