public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super("Invalid Email :" + message);
    }
}
