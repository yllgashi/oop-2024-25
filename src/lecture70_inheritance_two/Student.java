package lecture70_inheritance_two;

public class Student extends Person {
    public double averageGrade;

    public void showStudentInformation() {
        this.showPersonInformation();
        System.out.println("Average grade: " + this.averageGrade);
    }
}
