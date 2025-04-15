package lecture46_enum_methods;

public class GetEnumElements {
    public static void main(String[] args) {
        // 1. get (print) one element directly
        System.out.println(Color.BLUE);

        // 2. get (print) all elements of enum
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
