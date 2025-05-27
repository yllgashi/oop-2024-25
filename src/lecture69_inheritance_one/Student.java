package lecture69_inheritance_one;



// Student is the child
// Person is the parent
// when we define this inheritance (with Student extends Person)
// automatically Student gets all the attributes and methods of parent (Person)

public class Student extends Person {
    // public int id;
    // public String firstName;
    // public String lastName;
    public double averageGrade;
    public String actualCourse;

    public void printStudentInformation() {
        System.out.println(this.lastName);


        System.out.println(this.id);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.averageGrade);
        System.out.println(this.actualCourse);
    }
}
