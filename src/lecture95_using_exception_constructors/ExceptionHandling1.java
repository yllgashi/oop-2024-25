package lecture95_using_exception_constructors;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divideNumbers(int a, int b) {
        throw new ArithmeticException(); // create ArithmeticException object with first constructor (without parameters)
    }
}
