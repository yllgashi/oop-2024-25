package lecture93_create_own_exceptions;

public class InvalidPhoneNumberException extends Exception{

    public InvalidPhoneNumberException() {
        super(); // we are calling the constructor of parent (of Exception class)
    }

    public InvalidPhoneNumberException(String message) {
        super(message); // we are calling the constructor of parent (of Exception class)
    }

    public InvalidPhoneNumberException(String message, Throwable cause) {
        super(message, cause); // we are calling the constructor of parent (of Exception class)
    }
}
