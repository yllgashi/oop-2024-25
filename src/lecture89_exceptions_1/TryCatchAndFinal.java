package lecture89_exceptions_1;

public class TryCatchAndFinal {
    public static void main(String[] args) {
        // try => try a piece of code where there can be erorrs
        // catch => after an error is thrown, this block will handle it
        // finally => the part of code which will be executed in the end if there is or there isn't an exception

        try {
            System.out.println(1 / 0);
            // System.out.println("Application ended...");
        }
        catch(Exception e) {
            System.out.println("Something went wrong....");
            // System.out.println("Application ended...");
        }
        finally {
            System.out.println("Application ended...");
        }
    }
}
