public class InvalidMobileNumberException extends RuntimeException {
    public InvalidMobileNumberException(String message) {
        super("Invalid Mobile Number :"+ message);
    }
}
