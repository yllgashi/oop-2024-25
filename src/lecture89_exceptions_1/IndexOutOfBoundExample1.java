package lecture89_exceptions_1;

public class IndexOutOfBoundExample1 {
    public static void main(String[] args) {

        try {
            int[] array = new int[2];
            array[0] = 1;
            array[1] = 2;
            System.out.println(array[99]);
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        System.out.println("Application ended...");
    }
}
