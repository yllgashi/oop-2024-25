package lecture82_override_object_methods_example;

import java.util.ArrayList;

public class Student extends Person {
    // attributes
    private double averageGrade;
    private ArrayList<Course> coursesToFollow;


    public Student(int id, String firstName, String lastName, double averageGrade, ArrayList<Course> coursesToFollow) {
        super(id, firstName, lastName);
        this.setAverageGrade(averageGrade);
        this.setCoursesToFollow(coursesToFollow);
    }

    // getters and setters
    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public ArrayList<Course> getCoursesToFollow() {
        return coursesToFollow;
    }

    public void setCoursesToFollow(ArrayList<Course> coursesToFollow) {
        this.coursesToFollow = coursesToFollow;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() +
                ", FirstName: " + this.getFirstName()+
                ", LastName: " + this.getLastName() +
                ", Average Grade: " + this.getAverageGrade();
    }
}



