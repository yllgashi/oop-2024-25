package lecture01_before_oop;

public class Methods {
    public static void main(String[] args) {
        int resultOfMethodOne = sum(1, 2);
        double averageOfMethodTwo = average(10, 8);
        sayHello();
    }

    // sum two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double average(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static void sayHello() {
        System.out.println("Hello world");
        return;
    }
}
