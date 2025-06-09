package lecture93_create_own_exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException() {
        super(); // we are calling the constructor of parent (of Exception class)
    }

    public UserNotFoundException(String message) {
        super(message); // we are calling the constructor of parent (of Exception class)
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause); // we are calling the constructor of parent (of Exception class)
    }
}
