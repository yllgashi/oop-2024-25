package lecture93_create_own_exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialNetworkExampleWithoutTryCatch {
    public static void main(String[] args) {

        ArrayList<String> accounts = new ArrayList<>();
        accounts.add("filan.fisteku@gmail.com");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("Invalid email");
        }
        else {
            System.out.println("Phone number: ");
            String phone = scanner.nextLine();
            if (phone.length() != 11) {
                System.out.println("Invalid phone number");
            }
            else {
                if (!accounts.contains(email)) {
                    System.out.println("User not found!");
                }

                System.out.println("You have logged in!");
            }
        }
    }
}
