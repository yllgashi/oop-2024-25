package lecture97_simple_exception_handling_app;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        // personal number should have specific 10 characters
        // password should contain min 12 characters

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Personal number: ");
            String personalNumber = scanner.nextLine();
            boolean isPersonalNumberValid = isPersonalNumberValid(personalNumber);
            if (!isPersonalNumberValid) throw new InvalidPersonalNumberException("Heeej nuk e ke shkru sakt");

            System.out.print("Password: ");
            String password = scanner.nextLine();
            boolean isPasswordValid = isPasswordValid(password);
            if (!isPasswordValid) throw new InvalidPasswordException("Heej passwordi osht i dopet");
        }
        catch (InvalidPersonalNumberException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean isPersonalNumberValid(String personalNumber) {
        if (personalNumber.length() == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPasswordValid(String password) {
        if (password.length() < 12) {
            return false;
        } else {
            return true;
        }
    }
}
