package lecture28_reference_type;

public class StackOverflow {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("Printing something");
        print();
    }
}
