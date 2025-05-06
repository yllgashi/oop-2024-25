package lecture60_social_application;

import java.util.ArrayList;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Signup");
        System.out.println("2. Login");
        System.out.println("3. Show all users");
        System.out.println("4. Show user by username");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                signup(accounts);
                break;
            case 2:
                login(accounts, "filan", "123");
                break;
            case 3:
                getAllAccounts(accounts);
                break;
            case 4:
                getAccountByUsername(accounts, "filan");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public static void signup(ArrayList<Account> accounts) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        int id = scanner.nextInt();

        Account account = new Account(id, username, password);

        accounts.add(account);
    }

    public static boolean login(ArrayList<Account> accounts, String username, String password) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username) && accounts.get(i).getPassword().equals(password))
                return true;
        }
        return false;
    }

    public static void getAllAccounts(ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getId());
            System.out.println(accounts.get(i).getUsername());
        }
    }


    public static void getAccountByUsername(ArrayList<Account> accounts, String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username)) {
                System.out.println(accounts.get(i).getId());
                System.out.println(accounts.get(i).getUsername());
            }
        }
    }
}
