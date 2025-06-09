package lecture91_exceptions_checked_unchecked;

public class Main {
    public static void main(String[] args) {
        // handle unchecked exception
        try {
            generateCheckedException();
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        // we can handle or not, if not this can terminate the application
        generateUncheckedException();
    }

    public static void generateCheckedException() throws ArithmeticException, Exception {
        int result = 10 / 0;
        System.out.println("Division is: " + result);
    }

    public static void generateUncheckedException() {
        int result = 10 / 0;
        System.out.println("Division is: " + result);
    }
}
