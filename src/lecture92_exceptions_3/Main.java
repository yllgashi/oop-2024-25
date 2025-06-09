package lecture92_exceptions_3;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10/0; // arithmetic exception (divide by zero)

            int[] array = new int[2]; // we are accessing non-existing elemnt of array
            array[3] = 1;

            Person person = new Person();
            System.out.println(person.fullName.length()); // we are accessing null attribute (which is error)

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException (maybe it was divide by zero)");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Index was not valid in array");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException (you accessed null variable)");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
