package app.exceptions;

public class ArrayDataException extends RuntimeException {
    public ArrayDataException(String message) {
        super(message);
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
