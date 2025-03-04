package lecture01_before_oop;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] studentsInRoom = new String[2][2];
        addStudentsInClass(studentsInRoom);
        showStudentsInClass(studentsInRoom);
    }

    public static void addStudentsInClass(String[][] students) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[0].length; col++) {
                System.out.print("Full name: ");
                students[row][col] = scanner.nextLine();
            }
        }
    }

    public static void showStudentsInClass(String[][] students) {
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[0].length; col++) {
                System.out.print(students[row][col] + "   ");
            }
            System.out.println();
        }
    }

    public static void showElementsInDiagonal(String[][] students) {
        for (int row = 0; row < students.length; row++) {
            for (int col = 0; col < students[0].length; col++) {
                if (row == col) {
                    System.out.println(students[row][col] + "  ");
                }
            }
            System.out.println();
        }
    }
}
