

public class Transaction {
    private final String id;
    private final double amount;
    private final String merchantId;
    private final String creditCardId;
    private final LocalDateTime timestamp;

    public Transaction(String id, double amount, String merchantId, String creditCardId, LocalDateTime timestamp) {
        this.id = id;
        this.amount = amount;
        this.merchantId = merchantId;
        this.creditCardId = creditCardId;
        this.timestamp = timestamp;
    }

    public int getMonth() {
        return timestamp.getMonthValue();
    }
}