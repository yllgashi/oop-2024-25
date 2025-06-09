package lecture90_exceptions_2;

public class TryCatchInsideMethod {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;

        divideNumbersAndPrint(numberOne, numberTwo);

        System.out.println("Application ended...");
    }

    public static void divideNumbersAndPrint(int numberOne, int numberTwo) {
        try {
            int result = numberOne / numberTwo;
            System.out.println("Division: " + result);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
