package lecture70_inheritance_two;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1; // attribute from Person
        student1.firstName = "Filan"; // attribute from Person
        student1.lastName = "Fisteku"; // attribute from Person
        student1.averageGrade = 9.8; // ATTRIBUTE OF STUDENT
        student1.showPersonInformation(); // method from Person
        student1.showStudentInformation(); // METHOD OF STUDENT

        Professor professor1 = new Professor();
        professor1.id = 2; // attribute from Person
        professor1.firstName = "Milaim"; // attribute from Person
        professor1.lastName = "Zeka"; // attribute from Person
        professor1.salary = 500; // ATTRIBUTE OF PROFESSOR
        professor1.title = "Bachelor"; // ATTRIBUTE OF PROFESSOR
        professor1.showPersonInformation(); // method from Person

        Doctor doctor1 = new Doctor();
        doctor1.id = 3; // attribute from Person
        doctor1.firstName = "Naim"; // attribute from Person
        doctor1.lastName = "Sulejmani"; // attribute from Person
        doctor1.showPersonInformation(); // method from Person
    }
}
