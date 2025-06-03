package lecture89_exceptions_1;

public class Main {
    public static void main(String[] args) {
        int numberOne = 10;
        // int numberTwo = 2;
        int numberTwo = 0;

        // try the part in code which you think that can have exceptions (run-time errors)
        // if an error is thrown, you can catch with "catch" block and handle there
        try {
            int result = numberOne / numberTwo;
            System.out.println("Result is: " + result);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            System.out.println("Maybe this is a divide by 0");
        }

        System.out.println("Application ended...");
    }
}
