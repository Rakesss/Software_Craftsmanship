public class InvalidMerchantIdException extends RuntimeException {
    public InvalidMerchantIdException(String message) {
        super("Invalid Merchant Id :"  +  message);
    }
}
