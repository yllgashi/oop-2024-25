package lecture74_inheritance_super_keyword;

import java.util.ArrayList;

public class Student extends Person {
    public double averageGrade;
    public String actualCourse;

    public void introduceAsStudent() {
        // super. => it refers to parent attributes & methods
        // this. => it referes to attributes & methods inside this class
        System.out.println("ID (of Person): " + super.id); // id exists at parent class
        System.out.println("First Name (of Person): " + super.firstName); // firstName exists at parent class
        System.out.println("Last Name (of Person): " + super.lastName); // lastName exists at parent class
        System.out.println("Average Grade (of Student): " + this.averageGrade); // averageGrade exists inside this class
        System.out.println("Actual Course (of Student): " + this.actualCourse); // actualCourse exists inside this class
    }
}
