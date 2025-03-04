package lecture01_before_oop;

import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        // ask options from user
        Scanner scanner = new Scanner(System.in);

        final String SENTINEL_TO_STOP = "stop";

        String answer = "";

        while (!answer.equals(SENTINEL_TO_STOP)) {
            System.out.print("Write option: ");
            answer = scanner.nextLine();

            switch (answer) {
                case "shfaqDetaje":
                    System.out.println("Detajet e produkteve jane kerkuar");
                    break;
                case "shtoProdukt":
                    System.out.println("Produkti eshte shtuar");
                    break;
                default:
                    System.out.println("Pergjegjia eshte gabim...");
                    break;
            }
        }

        System.out.println("Application ended");
    }
}
