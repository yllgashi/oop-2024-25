package lecture01_before_oop;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 0 to 5
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);


        // structure to repeat the same code with few changes
        System.out.println("WHILE LOOP");
        int counter = 0;
        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("FOR LOOP");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("DO WHILE");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
