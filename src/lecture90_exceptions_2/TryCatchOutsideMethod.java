package lecture90_exceptions_2;

public class TryCatchOutsideMethod {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;

        try {
            divideNumbersAndPrint(numberOne, numberTwo);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Application ended...");
    }

    public static void divideNumbersAndPrint(int numberOne, int numberTwo) {
        int result = numberOne / numberTwo;
        System.out.println("Division: " + result);
    }
}
