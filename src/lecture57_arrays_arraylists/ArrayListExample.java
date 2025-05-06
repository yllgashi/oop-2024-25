package lecture57_arrays_arraylists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // in ArrayList we DO NOT NEED to specify length


        // 1st way of declare an arraylist
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(99);
        arrayList1.add(98);

        // 2nd way to declare an arraylist
        ArrayList arrayList2 = new ArrayList(100);
        arrayList2.add(99);
        arrayList2.add(98);

        // 3rd way to declare an arraylist
        ArrayList arrayList3;
        arrayList3 = new ArrayList();
        arrayList3.add(99);
        arrayList3.add(98);

        // add different data in the same arraylist
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(99);
        arrayList4.add("text");
        arrayList4.add(false);
        arrayList4.add(3.14);


        // read values from arraylist
        int elementOne = (int) arrayList4.get(0);
        System.out.println(elementOne);

        String elementTwo = (String) arrayList4.get(1);
        System.out.println(elementTwo);

        boolean elementThree = (boolean) arrayList4.get(2);
        System.out.println(elementThree);

        double elementFour = (double) arrayList4.get(3);
        System.out.println(elementFour);


        // iterate with loops
        for (int i = 0; i < arrayList4.size(); i++) {
            System.out.println(arrayList4.get(i));
            // int elementZero = (int) arrayList4.get(i); // error
        }
    }
}
