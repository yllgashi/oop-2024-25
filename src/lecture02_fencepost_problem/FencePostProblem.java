package lecture02_fencepost_problem;

public class FencePostProblem {
    public static void main(String[] args) {
        String text = "Cacttus Education";
        System.out.println("Fence post problem...");
        printEachCharacterWithCommaBefore(text);
        System.out.println();
        printEachCharacterWithCommaAfter(text);
        System.out.println();

        System.out.println("Fence post problem solved...");
        printEachCharacterWithCommaBeforeSolved(text);
        System.out.println();
        printEachCharacterWithCommaAfterSolved(text);
    }

    // problem
    public static void printEachCharacterWithCommaBefore(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(", " + text.charAt(i));
        }
    }

    public static void printEachCharacterWithCommaAfter(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + ", ");
        }
    }

    // problem solved
    public static void printEachCharacterWithCommaBeforeSolved(String text) {
        System.out.print(text.charAt(0));
        for (int i = 1; i < text.length(); i++) {
            System.out.print(", " + text.charAt(i));
        }
    }

    public static void printEachCharacterWithCommaAfterSolved(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            System.out.print(text.charAt(i) + ", ");
        }
        System.out.print(text.charAt(text.length() - 1));
    }
}
