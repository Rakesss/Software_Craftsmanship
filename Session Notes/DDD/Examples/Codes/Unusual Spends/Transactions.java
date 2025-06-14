import java.*;

public class Transaction  {
    private final String id;
    private final double amount;
    private final String merchantId;
    private final String creditCardId;
    private final String timestamp;

    public Transaction(String id, double amount, String merchantId, String creditCardId, String timestamp) {
        this.id = id;
        this.amount = amount;
        this.merchantId = merchantId;
        this.creditCardId = creditCardId;
        this.timestamp = timestamp;
    }

}