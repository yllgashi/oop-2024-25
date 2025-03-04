package lecture02_fencepost_problem;

import java.util.Scanner;

public class FencePostProblemTwo {
//    Write a program that prompts the user for text until the user types "quit", then output the total number of characters typed.
//            (In this case, "quit" is the sentinel value.)
//            “quit” letters (4 of them) should not count in total number of characters typed


    public static void main(String[] args) {
        // in this part also "quit" is counting as a word
//        Scanner scanner = new Scanner(System.in);
//        int countCharacters = 0;
//        String word = "";
//
//        while (!word.equals("quit")) {
//            System.out.println("Type a word (or \"quit\" to exit):");
//            word = scanner.nextLine();
//            countCharacters += word.length();
//        }
//
//        System.out.println("You typed a total of " + countCharacters + " characters");


        //
        // in this part also "quit" is counting as a word
        final String SENTINEL_TO_STOP_APPLICATION = "quit";

        Scanner scanner = new Scanner(System.in);
        int countCharacters = 0;

        System.out.println("Type a word (or " + SENTINEL_TO_STOP_APPLICATION + " to exit):");
        String word = scanner.nextLine();

        while (!word.equals(SENTINEL_TO_STOP_APPLICATION)) {
            countCharacters += word.length();
            System.out.println("Type a word (or " + SENTINEL_TO_STOP_APPLICATION + " to exit):");
            word = scanner.nextLine();
        }

        System.out.println("You typed a total of " + countCharacters + " characters");
    }

}
