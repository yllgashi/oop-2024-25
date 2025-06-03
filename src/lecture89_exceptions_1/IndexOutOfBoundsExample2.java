package lecture89_exceptions_1;

public class IndexOutOfBoundsExample2 {
    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            array[0] = 1;
            array[1] = 2;
            System.out.println(array[99]);
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error, maybe you tried to divide by zero");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("The correct error is that where you tried to access an index which does not exists");
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
    }
}
