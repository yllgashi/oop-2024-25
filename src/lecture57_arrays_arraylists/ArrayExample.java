package lecture57_arrays_arraylists;

public class ArrayExample {
    public static void main(String[] args) {
        // in array we NEED to specify length


        // 1st way of declaring an array
        int[] array1 = new int[10];  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        array1[0] = 99;              // [99, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        array1[1] = 98;              // [99, 98, 0, 0, 0, 0, 0, 0, 0, 0]

        // 2nd way of declaring an array
        int[] array2 = new int[] {99, 98, 0, 0, 0, 0, 0, 0, 0, 0}; // [99, 98, 0, 0, 0, 0, 0, 0, 0, 0]

        // 3rd way of declaring an array
        int[] array3;                // null
        array3 = new int[10];        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        array3[0] = 99;              // [99, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        array3[1] = 98;              // [99, 98, 0, 0, 0, 0, 0, 0, 0, 0]

        // read values from array
        int elementOne = array1[0];
        System.out.println(elementOne);

        int elementTwo = array1[1];
        System.out.println(elementTwo);



        // iterate through values
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // advantages:
        // is high performance

        // disavatages:
        // we have fixed number of elements
        // array1[11] = 1; -> this will throw an error
    }
}
