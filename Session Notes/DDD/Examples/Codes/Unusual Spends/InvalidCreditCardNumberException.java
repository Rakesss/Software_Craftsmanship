public class InvalidCreditCardNumberException extends RuntimeException {
    public InvalidCreditCardNumberException(String message) {
        super(" Invalid Credit Card Number:" + message);
    }
}
