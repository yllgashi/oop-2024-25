package lecture01_before_oop;

import java.util.Scanner;

public class DefiniteVsIndefiniteLoops {
    public static void main(String[] args) {
        // definite loop - Java knows exactly how many times this code will be iterated
        createDefiniteLoop();

        // indefinite loop
        createIndefiniteLoop();
    }

    public static void createDefiniteLoop() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void createIndefiniteLoop() {
        Scanner scanner = new Scanner(System.in);
        String wordFromUser = "";

        while (!wordFromUser.equals("quit")) {
            System.out.println("Print options for user / type (quit) to terminate");
            wordFromUser = scanner.nextLine();
        }
    }
}
