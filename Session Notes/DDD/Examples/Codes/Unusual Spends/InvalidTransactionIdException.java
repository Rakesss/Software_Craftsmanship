public class InvalidTransactionIdException extends RuntimeException {
    public InvalidTransactionIdException(String message) {
        super("  Invalid Transaction Id :"+ message);
    }
}
