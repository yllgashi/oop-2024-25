package lecture14_before_properties_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String MY_ROLE_IN_SYSTEM = "BASIC_USER"; // not administrator

        String emailFromScanner = scanner.nextLine();
        String passwordFromScanner = scanner.nextLine();

        // email should contain '@' // when initializing (when setting value to variable) +
        // password should be at least 8 characters long (when setting value to variable) +
        // you should be administrator in order to read password once it is created (when getting value from variable) +

        Account account1 = new Account();

        if (emailFromScanner.contains("@")) {
            account1.email = emailFromScanner;
        } else {
            System.out.println("Email from user does not contain '@' symbol");
        }

        if (passwordFromScanner.length() >= 8) {
            account1.password = passwordFromScanner;
        } else {
            System.out.println("Password does not provide 8 characters");
        }


        if (MY_ROLE_IN_SYSTEM.equals("ADMINISTRATOR")) {
            System.out.println(account1.password);
        } else {
            System.out.println("You do not have access to read password of account1");
        }


        // we are not checking any validation from there why and how to manage it?? Properties?
        Account account2 = new Account();
        account2.email = "test";
        account2.password = "1";
        System.out.println(account2.password);
    }
}
