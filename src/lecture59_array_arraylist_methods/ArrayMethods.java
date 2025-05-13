package lecture59_array_arraylist_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 7, 1, 8, 5, 3, 1};

        // length => count how many elements does array contain
        System.out.println(array.length);


        // Array methods

        // sort array
        Arrays.sort(array);
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }


        // binary search
        int indexOfElement8 = Arrays.binarySearch(array, 8);
        System.out.println(indexOfElement8);
        System.out.println("####");

        //
        int[] array2 = Arrays.copyOf(array, 20);
    }
}
