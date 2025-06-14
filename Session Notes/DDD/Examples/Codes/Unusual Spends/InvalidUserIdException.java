public class InvalidUserIdException extends RuntimeException {
    public InvalidUserIdException(String message) {
        super("Invalid UserId: " + message);
    }
}
