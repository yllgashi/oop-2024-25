package lecture15_after_properties_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        // account1.email = emailFromScanner; // error - because we can access variable only through properties (guard)
        // account1.password = passwordFromScanner; // error - because we can access variable only through properties (guard)
        // System.out.println(account1.email); // error - because we can access variable only through properties (guard)
        // System.out.println(account1.password); // error - because we can access variable only through properties (guard)


        account1.setEmail("test"); // it does not set value due to validation
        account1.setEmail("test@test.com"); // value is set

        System.out.println(account1.getEmail());

        account1.setPassword("123456789");
        System.out.println(account1.getPassword());

    }
}
