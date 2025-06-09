package lecture93_create_own_exceptions;

public class InvalidEmailException extends Exception {

    public InvalidEmailException() {
        super(); // we are calling the constructor of parent (of Exception class)
    }

    public InvalidEmailException(String message) {
        super(message); // we are calling the constructor of parent (of Exception class)
    }

    public InvalidEmailException(String message, Throwable cause) {
        super(message, cause); // we are calling the constructor of parent (of Exception class)
    }
}
