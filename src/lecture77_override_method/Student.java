package lecture77_override_method;

public class Student extends Person {
    public double averageGrade;
    public String actualCourse;

    @Override
    public void introduce() {
        System.out.println("Hi there...");
        System.out.println("My first name is: " + firstName);
        System.out.println("My last name is: " + lastName);
        System.out.println("My average grade is: " + averageGrade);
        System.out.println("My actual course is: " + actualCourse);
    }
}
