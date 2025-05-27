package lecture75_inheritance_super_constructor;

public class Student extends Person {
    public double averageGrade;
    public String actualCourse;

    public Student() {
        super(); // call in explicit way of parent constructor
        // ...
    }
}
