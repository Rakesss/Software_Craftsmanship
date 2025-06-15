public class InvalidMerchantNameException extends RuntimeException {
    public InvalidMerchantNameException(String message) {
        super("Invalid Merchant Name:" + message);
    }
}
