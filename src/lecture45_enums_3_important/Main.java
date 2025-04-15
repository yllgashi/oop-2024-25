package lecture45_enums_3_important;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // without enum:
        String seasonFromUserAsString = "SPRINGa";

        switch (seasonFromUserAsString) {
            case "SPRING":
                System.out.println("User has chosen Spring");
                break;
            case "SUMMER":
                System.out.println("User has chosen SUMMER");
                break;
            case "FALL":
                System.out.println("User has chosen FALL");
                break;
            case "WINTER":
                System.out.println("User has chosen WINTER");
                break;
            default:
                System.out.println("Not valid input");
                break;
        }


        // with enum:
        Season seasonFromUserAsEnum = Season.SPRING;

        switch (seasonFromUserAsEnum) {
            case SPRING:
                System.out.println("User has chosen Spring");
                break;
            case SUMMER:
                System.out.println("User has chosen SUMMER");
                break;
            case FALL:
                System.out.println("User has chosen FALL");
                break;
            case WINTER:
                System.out.println("User has chosen WINTER");
                break;
        }
    }
}
