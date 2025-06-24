package lecture97_simple_exception_handling_app;

public class InvalidPersonalNumberException extends Exception {
    public InvalidPersonalNumberException() {
        super();
    }

    public InvalidPersonalNumberException(String message) {
        super(message);
    }

    public InvalidPersonalNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
