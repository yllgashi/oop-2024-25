package lecture65_many_with_many_relationship;

import java.util.ArrayList;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Course> courses;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
