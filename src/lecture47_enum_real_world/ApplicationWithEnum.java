package lecture47_enum_real_world;

import lecture46_enum_methods.Color;

import java.util.Scanner;

public class ApplicationWithEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("#####Welcome to FindColor application#######");

        for (Color c : Color.values()) {
            System.out.println("Color - " + c);
        }

        System.out.print("Choose a color:");
        Color color = Color.valueOf(scanner.nextLine().toUpperCase());

        switch (color) {
            case RED:
                System.out.println("You have chosen RED");
                break;
            case BLUE:
                System.out.println("You have chosen BLUE");
                break;
            case GREEN:
                System.out.println("You have chosen GREEN");
                break;
        }
    }
}
