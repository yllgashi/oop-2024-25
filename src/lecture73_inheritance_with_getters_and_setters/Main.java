package lecture73_inheritance_with_getters_and_setters;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1); // from parent
        student1.setFirstName("Filan"); // from parent
        student1.setLastName("Fisteku"); // from parent
        student1.setAverageGrade(9.8); // from Student
    }
}
