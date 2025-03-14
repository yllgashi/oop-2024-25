package lecture12_data_and_functional_members;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();

        // sign up
        account1.email = "filanfisteku@gmail.com";
        account1.password = "123456789";

        // login
        boolean isLoggedIn = account1.login("filanfisteku@gmail.com", "123456789");

        // go to home page
        System.out.println(account1.email + " has logged in...");

        System.out.println(account1.email);
        System.out.println(account1.password);
    }
}
