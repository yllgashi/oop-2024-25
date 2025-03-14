package lecture13_before_properties_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String MY_ROLE_IN_SYSTEM = "BASIC_USER";

        String emailFromScanner = scanner.nextLine();
        String passwordFromScanner = scanner.nextLine();

        // email should contain '@' // when initializing (when setting value to variable)
        // password should be at least 8 characters long (when setting value to variable)
        // you should be administrator in order to read password once it is created (when getting value from variable)

        Account account1 = new Account();
        account1.email = emailFromScanner;
        account1.password = passwordFromScanner;
    }
}
