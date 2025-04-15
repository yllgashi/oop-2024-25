package lecture43_enums_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask the user to the options to show seasons with number:


//        With hard code (not recommended)
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("1 - Spring");
//        System.out.println("2 - Summer");
//        System.out.println("3 - Fall");
//        System.out.println("4 - Winter");
//        System.out.print("Write an option: ");
//        String option = scanner.nextLine();
//
//        switch (option) {
//            case "Spring":
//                System.out.println("Spring is the starting season");
//                break;
//            case "Summer":
//                System.out.println("Summer is the warmest season");
//                break;
//            case "Fall":
//                System.out.println("Fall is the season with a lot of rain");
//                break;
//            case "Winter":
//                System.out.println("Winter is the coldest");
//                break;
//            default:
//                System.out.println("Option not available...");
//        }


//        // Replace hard code with final variables
//        Scanner scanner = new Scanner(System.in);
//        final String SPRING = "Spring";
//        final String SUMMER = "Summer";
//        final String FALL = "Fall";
//        final String WINTER = "Winter";
//
//        System.out.println("1 - " + SPRING);
//        System.out.println("2 - " + SUMMER);
//        System.out.println("3 - " + FALL);
//        System.out.println("4 - " + WINTER);
//        System.out.print("Write an option: ");
//        String option = scanner.nextLine();
//
//        switch (option) {
//            case SPRING:
//                System.out.println("Spring is the starting season");
//                break;
//            case SUMMER:
//                System.out.println("Summer is the warmest season");
//                break;
//            case FALL:
//                System.out.println("Fall is the season with a lot of rain");
//                break;
//            case WINTER:
//                System.out.println("Winter is the coldest");
//                break;
//            default:
//                System.out.println("Option not available...");
//        }


        Season option = Season.SPRING;

        switch (option) {
            case Season.SPRING:
                System.out.println("Spring is the starting season");
                break;
            case Season.SUMMER:
                System.out.println("Summer is the warmest season");
                break;
            case Season.FALL:
                System.out.println("Fall is the season with a lot of rain");
                break;
            case Season.WINTER:
                System.out.println("Winter is the coldest");
                break;
            default:
                System.out.println("Option not available...");
        }
    }
}










