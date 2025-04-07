package lecture28_reference_type;

public class ProveThatObjectsAreStoredInHeap {
    public static void main(String[] args) {
        // new SimpleClass() => we create an object in heap
        // SimpleClass pointer => we create a pointer in stack which hold address of object which is in heap
        SimpleClass pointer = new SimpleClass();
        pointer.id = 10;

        SimpleClass pointer2 = pointer; // assign address of object in heap
        pointer.id = 20; // there is a single "new" so there is a single vlaue of ID which changed


        System.out.println(pointer.id); // 20
        System.out.println(pointer2.id); // 20
    }
}
