package lecture29_arrays_reference_types;

public class PrimitiveTypeAsMethodParameter {
    public static void main(String[] args) {
        int number = 10; // the complete space of variable also with value is stored in stack

        changePrimitiveTypeValue(number); // we are sending only the value, not the location in memory to re-assign the original variable
        System.out.println(number);
    }

    public static void changePrimitiveTypeValue(int number) {
        number = 20;
    }
}
