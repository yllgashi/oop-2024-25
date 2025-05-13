package lecture59_array_arraylist_methods;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(150);
        arrayList.add(0, 1);
        arrayList.add(5);
       // arrayList.add(3);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(3);

        // size => count how many elements are inside
        System.out.println(arrayList.size());

        // add() => add another element in arraylist
        arrayList.add(10);
        arrayList.add(20, 3); // add at specific index

        // get() => read element at specific index
        System.out.println(arrayList.get(1));

        // contains() => does arraylist contain a specific element
        boolean does3Exists = arrayList.contains(3);

        // isEmpty() => check if arraylist contains any element
        System.out.println(arrayList.isEmpty());

        // lastIndexOf() => will return index of this element in the last place which is inserted
        arrayList.lastIndexOf(3);

        // remove() => this will remove element at specific index AND WILL RE-ORGANIZE ARRAYLISt
        arrayList.remove(1);

        //
        int indexOf7 = arrayList.indexOf(7);
        System.out.println(arrayList.get(indexOf7));

        // clear() => remove all elements from arraylist
    }
}
