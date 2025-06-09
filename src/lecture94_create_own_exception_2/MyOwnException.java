package lecture94_create_own_exception_2;

public class MyOwnException extends Exception {
    public MyOwnException() {
        super();
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }
}
