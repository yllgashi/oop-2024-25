package lecture01_before_oop;

public class LoopsJumpStatements {
    public static void main(String[] args) {
        // break -> terminate the loop
        // continue -> go to the next iteration

        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("First loop ended");


        // continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Second loop ended");
    }
}
