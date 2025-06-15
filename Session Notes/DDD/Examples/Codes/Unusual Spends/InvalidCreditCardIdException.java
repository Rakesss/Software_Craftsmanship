public class InvalidCreditCardIdException extends RuntimeException {
  public InvalidCreditCardIdException(String message) {
    super(" Invalid Credit Card Id:" +message);
  }
}
