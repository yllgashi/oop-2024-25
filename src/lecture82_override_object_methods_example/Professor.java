package lecture82_override_object_methods_example;

import java.util.ArrayList;

public class Professor extends Person {
    // attributes
    private double salary;
    private ArrayList<Course> coursesToLecture;

    public Professor(int id, String firstName, String lastName, double salary, ArrayList<Course> coursesToLecture) {
        super(id, firstName, lastName);
        this.setSalary(salary);
        this.setCoursesToLecture(coursesToLecture);
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Course> getCoursesToLecture() {
        return coursesToLecture;
    }

    public void setCoursesToLecture(ArrayList<Course> coursesToLecture) {
        this.coursesToLecture = coursesToLecture;
    }


    @Override
    public String toString() {
        return "ID: " + this.getId() +
                ", FirstName: " + this.getFirstName()+
                ", LastName: " + this.getLastName() +
                ", Salary: " + this.getSalary();
    }
}
