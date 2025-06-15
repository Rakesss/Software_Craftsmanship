public class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(String message) {
        super("Invalid User Name:" + message);
    }
}
