package lecture46_enum_methods;

import java.util.Scanner;

public class EnumInitalization {
    public static void main(String[] args) {
        // initialize enum
        // 1. direct initialization
        Color color1 = Color.RED;

        // 2. initialize from String (convert String to enum)
        Color color2 = Color.valueOf("RED");

        // 3. initialize from Scanner (as String)  (convert String to enum)
        Scanner scanner = new Scanner(System.in);
        String valueFromUser = scanner.nextLine().toUpperCase();
        Color color3 = Color.valueOf(valueFromUser);
    }
}
