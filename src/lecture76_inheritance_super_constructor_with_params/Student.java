package lecture76_inheritance_super_constructor_with_params;

public class Student extends Person {
    public double averageGrade;
    public String actualCourse;

    public Student(int id, String firstName, String lastName, double averageGrade, String actualCourse) {
        super(id, firstName, lastName); // call parent constructor with parameters
        this.averageGrade = averageGrade; // initialize child attribute
        this.actualCourse = actualCourse; // initialize child attribute
    }
}
