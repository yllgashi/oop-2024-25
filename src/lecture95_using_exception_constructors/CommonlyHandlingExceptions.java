package lecture95_using_exception_constructors;

public class CommonlyHandlingExceptions {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Error message written by me", e);
        } catch (Exception e) {
            throw new RuntimeException("Error message written by me", e);
        }
    }
}
