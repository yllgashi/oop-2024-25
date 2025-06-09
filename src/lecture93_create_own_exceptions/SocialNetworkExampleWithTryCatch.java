package lecture93_create_own_exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialNetworkExampleWithTryCatch {
    public static void main(String[] args) {
        ArrayList<String> accounts = new ArrayList<>();
        accounts.add("filan.fisteku@gmail.com");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            if (!email.contains("@gmail.com")) {
                throw new InvalidEmailException();

            }

            System.out.println("Phone number: ");
            String phone = scanner.nextLine();
            if (phone.length() != 11) {
                throw new InvalidPhoneNumberException();
            }

            if (!accounts.contains(email)) {
                throw new UserNotFoundException();
            }

            System.out.println("You have logged in!");
        }
        catch (InvalidEmailException e) {
            System.out.println("Invalid email");
        }
        catch (InvalidPhoneNumberException e) {
            System.out.println("Invalid phone number");
        }
        catch (UserNotFoundException e) {
            System.out.println("User not found!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }
}
