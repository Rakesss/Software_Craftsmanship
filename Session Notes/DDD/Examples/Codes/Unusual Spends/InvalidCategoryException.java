public class InvalidCategoryException extends RuntimeException {
    public InvalidCategoryException(SpendingCategory message) {
        super("Invalid Category:" + message);
    }
}
