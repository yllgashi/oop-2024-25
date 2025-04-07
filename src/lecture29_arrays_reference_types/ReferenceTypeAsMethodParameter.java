package lecture29_arrays_reference_types;

public class ReferenceTypeAsMethodParameter {
    public static void main(String[] args) {
        // int[] array => it holds the address of object (in stack)
        // new int[5] => it is the actual object (in heap)
        int[] array = new int[5];


        fillArray(array); // we are sending as parameter the "address" of object inside heap
        printArray(array); // check result
    }

    public static void fillArray(int[] array) {
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
