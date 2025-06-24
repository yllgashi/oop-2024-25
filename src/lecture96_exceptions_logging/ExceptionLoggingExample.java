package lecture96_exceptions_logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingExample {
    // we can store logs (shenime te exceptions qe ndodhin) in:
    // database
    // files
    // console (this one)

    private static Logger logger = Logger.getLogger("ExceptionLoggingExample");

    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
            // int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error happened, maybe it is a division by zero");


            // log an arithmetic exception
            logger.log(Level.SEVERE, "An arithmetic exception occurred", e); // create log
        }
        catch (Exception e) {
            System.out.println("Something went wrong happened");


            // log a general exception
            logger.log(Level.INFO, "An exception occurred", e); // create log
        }

        System.out.println("Application is still running");
    }
}
