package lecture01_before_oop;

public class IfElseConditions {
    public static void main(String[] args) {
        String semaphoreColor = "green";

        if (semaphoreColor.equals("green")) {
            System.out.println("Walk...");
        }
        else if (semaphoreColor.equals("yellow")) {
            System.out.println("Wait...");
        }
        else if (semaphoreColor.equals("red")) {
            System.out.println("Stop...");
        }
        else {
            System.out.println("Out of service...");
        }
    }
}
