package lecture95_using_exception_constructors;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divideNumbers(int a, int b) {
        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            throw new RuntimeException("Error message written by me", e);
        }
    }
}
