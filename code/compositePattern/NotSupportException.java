package compositePattern;

public class NotSupportException extends RuntimeException {
    public NotSupportException() {
        super();
    }

    public NotSupportException(String message) {
        super(message);
    }
}
