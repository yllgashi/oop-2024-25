package lecture96_exceptions_logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingInFileExample {
    // we can store logs (shenime te exceptions qe ndodhin) in:
    // database
    // files (this one)
    // console
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("ExceptionsLogsExample", true);
        Logger logger = Logger.getLogger("ExceptionLoggingInFileExample");
        logger.addHandler(fileHandler);


        try {
            throw new ArithmeticException();
            // int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error happened, maybe it is a division by zero");


            // log an arithmetic exception
            logger.log(Level.SEVERE, "An arithmetic exception occurred", e); // create log
        } catch (Exception e) {
            System.out.println("Something went wrong happened");


            // log a general exception
            logger.log(Level.INFO, "An exception occurred", e); // create log
        }

        System.out.println("Application is still running");
    }
}
