package lecture01_before_oop;

import java.util.Scanner;

public class ArraysWithMethods {
    public static void main(String[] args) {
        String[] users = new String[5];

        createUsers(users);

        getAllUsers(users);
    }

    // method for creating users
    public static void createUsers(String[] users) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.length; i++) {
            System.out.print("User " + i + ": ");
            users[i] = scanner.nextLine();
        }
    }

    // method for showing users
    public static void getAllUsers(String[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println("User " + i + ": " + users[i]);
        }
    }
}
