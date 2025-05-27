package lecture72_inheritance_with_access_modifiers;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // student.id = 1;   // (private attribute)
        student.firstName = "Filan"; // (protected attribute)
        student.lastName = "Fisteku"; // (public attribute)


        // private => attribute or method can be accessed only inside class
        // protected => attribute or method can be accessed only inside class, classes which has child (and in JAVA it can be accessed in inside that package)
        // public => attribute or method can be accessed everywhere
    }
}
