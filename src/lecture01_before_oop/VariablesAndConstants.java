package lecture01_before_oop;

public class VariablesAndConstants {
    public static void main(String[] args) {
        // variable (the value there can be changed)
        int numberOne = 10;
        System.out.println(numberOne);
        numberOne = 20;
        System.out.println(numberOne);
        numberOne = 30;
        System.out.println(numberOne);

        // constants (the value there CANNOT be changed)
        final int NUMBER_TWO = 10;
        System.out.println(NUMBER_TWO);
        // NUMBER_TWO = 20; // (cannot assign new value)

    }
}
