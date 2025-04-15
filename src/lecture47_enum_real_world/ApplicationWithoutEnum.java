package lecture47_enum_real_world;

import lecture27_default_values.Person;
import lecture46_enum_methods.Color;

import java.util.Scanner;

public class ApplicationWithoutEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("#####Welcome to FindColor application#######");

        System.out.println("Color - RED");
        System.out.println("Color - GREEN");
        System.out.println("Color - BLUE");
        System.out.println("Color - YELLOW");
        System.out.println("Color - WHITE");
        System.out.println("Color - BLACK");

        System.out.print("Choose a color:");
        String color = scanner.nextLine().toUpperCase();

        switch (color) {
            case "RED":
                System.out.println("You have chosen RED");
                break;
            case "BLUE":
                System.out.println("You have chosen BLUE");
                break;
            case "GREEN":
                System.out.println("You have chosen GREEN");
                break;
            default:
                System.out.println("Not an option");
        }
    }
}