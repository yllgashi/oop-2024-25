package lecture28_reference_type;

public class ProveThatPrimitiveTypesAreStoredInStack {
    public static void main(String[] args) {
        int a = 100;
        int b = a;

        a = 110;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
