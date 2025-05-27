package lecture79_override_vs_overload;

public class Student extends Person{
    @Override
    public void talk() {
        System.out.println("Hello I am talking as STUDENT...");
    }

    public void talk(String messageOne) {
        System.out.println(messageOne);
    }

    public void talk(String messageOne, String messageTwo) {
        System.out.println(messageOne);
        System.out.println(messageTwo);
    }
}
