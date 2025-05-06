package lecture57_arrays_arraylists;

import java.util.ArrayList;

public class ArrayListGenericExample {
    public static void main(String[] args) {
        // in ArrayList we DO NOT NEED to specify length


        // 1st way of declare an arraylist
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(99);
        arrayList1.add(98);
        // arrayList1.add("text"); // error because arraylist is marked that will contain only ints


        // read values from arraylist
        int elementOne = arrayList1.get(0);
        System.out.println(elementOne);

        int elementTwo = arrayList1.get(1);
        System.out.println(elementTwo);


        // iterate with loops
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
            int elementZero = arrayList1.get(i); // NOT ERROR
        }


        // other arraylists
        ArrayList<Double> arrayList2 = new ArrayList<Double>();
        ArrayList<String> arrayList3 = new ArrayList<String>();
        ArrayList<Long> arrayList4 = new ArrayList<Long>();
        ArrayList<Boolean> arrayList5 = new ArrayList<Boolean>();
    }
}
