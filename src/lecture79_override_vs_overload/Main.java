package lecture79_override_vs_overload;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.talk(); // method overriding (same method with same attributes and return type)
        student.talk("Une jam Kosova"); // method overloading (it is another method with the same name but different parameters)
        student.talk("Une jam Kosova", "Une jam Shqiperia"); // method overloading (it is another method with the same name but different parameters)
    }
}
